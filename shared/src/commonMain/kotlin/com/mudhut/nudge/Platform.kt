package com.mudhut.nudge

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform