## 个性工具及优化库

从自己的项目抽取出来的个性工具及优化库，以便以后的开发工作的进行。


## 关于我
[![github](https://img.shields.io/badge/GitHub-SilentHi-green.svg)](https://github.com/SilentHi)


## 最新版本
[ ![Download](https://api.bintray.com/packages/zevol/maven/ZevolLibrary/images/download.svg) ](https://bintray.com/zevol/maven/ZevolLibrary/_latestVersion)

## 查看所有版本
[![jcenter](https://img.shields.io/badge/Jcenter-Latest%20Release-orange.svg)](https://jcenter.bintray.com/zevol/maven/ZevolLibrary/)



## 权限说明

本库要求SDK最低版本为16，代码中配置如下
    ```
    android {
        ...
        defaultConfig {
            ...
            minSdkVersion 16
            targetSdkVersion 26
            ...
        }
        ...
    }
    ```

### build.gradle设置
```
dependencies {
    ...
    compile 'com.zevol.library:ZevolLibrary:1.0.3'
    ...
}
```