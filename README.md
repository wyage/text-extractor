# TextExtractor 是一个使用Java编写的HTML页面正文提取工具 #

TextExtractor 可以帮助您快速将一个网页中的杂质文本剔除，只保留与正文相关的主题内容。

它的原理是判断文本段落中链接文本的密度，只使用非常少的软件包依赖，因而能够提供快速且智能的提取效果，帮助你建立质量较高的网页索引。

工程使用Maven管理，可以很方便地导入Eclipse中。当您获取工程文件之后，在工程根目录执行：

    mvn compile package appassembler:assemble

成功之后，请将target目录下生成的TextExtractor-x.x-SNAPSHOT.jar复制到目录target\appassembler\repo下。

运行生成的以下文件来执行自带的Demo程序：

    target\appassembler\bin\run_demo.bat
