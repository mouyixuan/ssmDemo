<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<script src="js/jquery.min.js"></script>

<script>
    // 页面加载，绑定单击事件
    $(function(){
        $("#btn").click(function(){
            // alert("hello btn");
            // 发送ajax请求
            $.ajax({
                // 编写json格式，设置属性和值
                url:"user/testAjax",
                contentType:"application/json;charset=UTF-8",
                data:'{"username":"hehe","password":"123","age":30}',
                dataType:"json",
                type:"post",
                success:function(data){
                    // data服务器端响应的json的数据，进行解析
                    alert(data);
                    alert(data.username);
                    alert(data.password);
                    alert(data.age);
                }
            });

        });
    });

</script>
<body>

    <form action="/employee" method="post">
        编号：<input type="text" name="id" /><br/>
        年龄：<input type="text" name="age" /><br/>
        姓名：<input type="text" name="name" /><br/>
        性别：<input type="text" name="sex" /><br/>
        地址：<input type="text" name="address" /><br/>
        <input type="submit" value="登录"/><br/>
    </form>

</body>
</html>
