package com.peak.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware;

public class GroovyPeakPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getExtensions().create("ExtraExtension",ExtraExtension)
        project.task("testPeak")<<{
            println project["ExtraExtension"] instanceof ExtensionAware
            println project["ExtraExtension"].versionName
        }
    }
}
