package com.peak.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JavaPeakPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("JavaGreetingPlugin(myplugin) ---> apply");
        project.task("testPeak").doLast(task -> System.out.println("Hello from the com.peak.plugins.JavaGreetingPlugin(myplugin)"));
    }
}
