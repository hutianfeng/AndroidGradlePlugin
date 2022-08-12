package com.peak.pluginlib;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.plugins.ExtensionAware;

public class PeakPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {

        System.out.println("PeakPlugin ---> apply");

        project.getExtensions().create("PeakExtraExtension", PeakExtraExtension.class);

        project.task("testPeak").doLast(new Action<Task>() {
            @Override
            public void execute(Task task) {
                System.out.printf(String.valueOf(project.getExtensions().getByName("PeakExtraExtension") instanceof ExtensionAware));
                System.out.printf("PeakPlugin version:" + project.getExtensions().getByType(PeakExtraExtension.class).versionName);
            }
        });
    }
}
