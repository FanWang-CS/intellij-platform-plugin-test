package com.github.fanwangcs.intellijplatformplugintest.services

import com.github.fanwangcs.intellijplatformplugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
