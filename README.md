# idea-live-templates
hello work!
markdown
# Markdown常用语法
mark语法目录
目录
一.标题
二.字体
加粗
斜体
斜体加粗
删除线
文字居中以及字体格式,颜色,大小
三.引用
四.分割线
五.图片
六.超链接
七.列表
八.表格
九.代码
十.流程图
一.标题
标题的设置需要在标题名称前加上#，一个#代表一级标题，两个#号代表二级标题

示例：

# 这是一级标题
## 这是二级标题
### 这是三级标题
#### 这是四级标题
##### 这是五级标题
二.字体
加粗
在需要加粗的文字两边使用两个*号给包括起来

斜体
在需要倾斜的文字左右使用一个*号包括起来

斜体加粗
在需要斜体加粗的文字左右使用三个*号包括起来

删除线
要加删除线的文字左右分别使用两个~~号包起来

实例：

**这是需要加粗的字体**
*这是倾斜的字体*
*** 这是斜体加粗的文字 ***
~~这是加有删除线的文字~~
效果如下：

这是需要加粗的字体
这是倾斜的字体
这是斜体加粗的文字
这是加有删除线的文字

文字居中以及字体格式,颜色,大小
示例：

 <font  face="黑体" color=blue size=15 >  markdown </font>
 <font face="微软雅黑">我是微软雅黑</font>
<center><font  face="黑体" color=pink size=15 >  markdown </font></center>
效果如下：
markdown
我是微软雅黑

markdown
三.引用
在引用的文字前加 > 符号即可。

示例：

>这是引用内容
>>这是引用内容
>>>这是引用内容
效果如下：

这是引用内容

这是引用内容

这是引用内容

四.分割线
三个或者三个以上的 - 或者 * 都可以

示例：

---
----
***
****
效果都是一样的。

五.图片
语法：

![图片alt](图片地址 ''图片title'')
图片alt就是显示在图片下面的文字，相当于对图片内容的解释。
图片title是图片的标题，当鼠标移到图片上时显示的内容。title可加可不加
示例：

![画家](https://img2018.cnblogs.com/blog/1715857/202001/1715857-20200129142336192-1452798127.jpg '画家')
效果如下：

画家

（注：博客园Markdown添加图片可以直接把需要添加的图片拖到相应位置即可）

六.超链接
语法：

[超链接名](超链接地址 "超链接title")
title可加可不加
示例：

[博客园](https://cnblogs.com/)
[百度](http://baidu.com/)
[谷歌](http://google.com/)
效果如下：
博客园
百度
谷歌

注：Markdown本身语法不支持链接在新页面中打开，如果想要在新页面中打开的话可以用html语言的a标签代替。

示例：

<a href="超链接地址" target="_blank">超链接名</a>
例：<a href="https://www.cnblogs.com/" target="_blank">博客园</a>
效果如下：
博客园

七.列表
无序列表
语法：

- 列表内容
+ 列表内容
* 列表内容

注意：- + * 跟内容之间都要有一个空格

无序列表 - + *任何一种都可以

效果如下：

列表内容
列表内容
列表内容

有序列表

语法：

数字加点

1.列表内容
2.列表内容
3.列表内容

注意：序号跟内容之间要有空格
效果如下：

1.列表内容
2.列表内容
3.列表内容

列表嵌套

上一级和下一级之间敲三个空格即可

一级无序列表内容

二级无序列表内容
二级无序列表内容
二级无序列表内容
一级无序列表内容

​ 1.二级有序列表内容

​ 2.二级有序列表内容

​ 3.二级有序列表内容

1.一级有序列表内容

一级无序列表内容
二级无序列表内容
二级无序列表内容
2.一级有序列表内容

​ 1.二级有序列表内容

​ 2.二级有序列表内容

​ 3.二级有序列表内容

八.表格
语法：

表头|表头|表头
---|:--:|---:
内容|内容|内容
内容|内容|内容

第二行分割表头和内容。
- 有一个就行，为了对齐，多加了几个
  文字默认居左
  -两边加：表示文字居中
  -右边加：表示文字居右
  注：原生的语法两边都要用 | 包起来。此处省略
  示例：

ID|等级|昵称|
--|:--:|--:|--
1 | 16 |狼灭|千钧
2 | 21 |狠人|万胜
3 | 23 |始皇|飞天
效果如下：

ID	等级	昵称	攻防
1	16	狼灭	千钧
2	21	狠人	万胜
3	23	始皇	飞天
九.代码
语法：

单行代码：代码两边使用一个反引号包括起来

`代码内容`
代码块：代码块开头与结尾分别使用三个反引号包括起来，且反引号单独占一行

​```
代码...
代码...
代码...
​```
示例：

单行代码：

`my hexo bolg is "htttp://fcitx.top" `
代码块：

​```
Welcome my bolg！
My friend ！
Hello ！
​```
效果如下：

单行代码

my hexo bolg is "htttp://fcitx.top"

代码块

Welcome my bolg！
My friend ！
Hello ！
十.流程图
操作模块语法

操作模块	说明
start	开始
end	结束
opration	普通操作块
condition	判断块
subroutine	子任务块
inputoutput	输入输出模块
####流程控制
st->op1->e

# -> 作为控制流程的操作符，就是指向下一步要操作的。
# 每一条都算是一条流程

# 你也可以断开写，怎么方便怎么来，如：下面两个是一样的。

#分着写
st->op1
op1->e

#合着写
st->op1->e

####判断
cond(yes)->io->e    #yes的时候到io，再到e
#位置指定
cond(no)->sub1(right)->op1  #no的时候到到 sub1，再从sub1的右侧到op1
#还可以这样 cond1(no,right)
示例：

​```flow
st=>start: 开始
op=>operation: My Operation
cond=>condition: Yes or No?
e=>end
st->op->cond
cond(yes)->e
cond(no)->op
​```
效果如下：
流程图one
示例：

st=>start: Start:>http://www.google.com[blank]
e=>end:>http://www.google.com
op1=>operation: My Operation
sub1=>subroutine: My Subroutine
cond=>condition: Yes
or No?:>http://www.google.com
io=>inputoutput: catch something...

st->op1->cond
cond(yes)->io->e
cond(no)->sub1(right)->op1
效果如下：
流程图Two
