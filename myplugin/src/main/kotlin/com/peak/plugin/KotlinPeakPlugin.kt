package com.peak.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class KotlinPeakPlugin:Plugin<Project>{
    override fun apply(project: Project) {
        println("KotlinPeakPlugin(myplugin) ---> apply")
        project.task("testPeak").doLast { println("Hello from the com.peak.plugins.JavaGreetingPlugin(myplugin)") }
    }
}