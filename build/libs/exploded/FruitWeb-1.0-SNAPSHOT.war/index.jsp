<%--
  Created by IntelliJ IDEA.
  User: 快乐的小菌菌
  Date: 2017/6/27
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="script/plug/jquery-3.1.1.min.js"></script>
    <script>
        window.onload = function () {
            $("#btn1").click(function () {
                var json = {name: "jifujun", password: "password", email: "email", phone: "18614028352"};
                $.ajax({
                    type: "post",
                    url: '/register',
                    data: JSON.stringify(json),
                    contentType: "application/json;charset=UTF-8",
                    success: function (data) {
                        console.log(data)
                    }
                })
            });
            $("#btn2").click(function () {
                var json = {password: "password", phone: "18614028352"};
                $.ajax({
                    type: "post",
                    url: '/login',
                    data: JSON.stringify(json),
                    contentType: "application/json;charset=UTF-8",
                    success: function (data) {
                        console.log(data)
                    }
                })
            })
        }
    </script>
</head>
<body>
<button id="btn1">注册</button>
<button id="btn2">登录</button>
</body>
</html>
