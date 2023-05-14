package com.vsloong.apknurse.usecase

import com.vsloong.apknurse.utils.runCMD
import localJdGuiJarPath

/**
 * 使用JD-GUI的用例
 */
class JavaDecompilerUseCase {

    /**
     * 会直接启动jd-gui的UI工具
     */
    fun viewJar(jarFilePath: String) {
        runCMD(
            "java",
            "-jar",
            localJdGuiJarPath(),
            jarFilePath
        )
    }
}