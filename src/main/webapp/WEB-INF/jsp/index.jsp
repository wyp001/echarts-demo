<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2019/7/15
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示数据</title>
    <!-- 引入 echarts.js -->
    <script type="text/javascript" src="static/echarts/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="static/echarts/echarts.js"></script>
</head>
<body>
<h1>hello world</h1>
<%--<a href="getList.action">动态取数据报表显示</a>--%>

<script type="text/javascript">

    option = {
        title: {
            text: '某站点用户访问来源',
            subtext: '纯属虚构',
            x: 'center'
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['直接访问', '邮件营销', '联盟广告', '视频广告', '搜索引擎']
        },
        series: [
            {
                name: '访问来源',
                type: 'pie',
                radius: '55%',
                center: ['50%', '60%'],
                data: [
                    {value: 335, name: '直接访问'},
                    {value: 310, name: '邮件营销'},
                    {value: 234, name: '联盟广告'},
                    {value: 135, name: '视频广告'},
                    {value: 1548, name: '搜索引擎'}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };


    var sendInfoAjax = function () {
        // alert(12345);
        $.ajax({
            url: "http://localhost:8080/getList",
            tpye: "POST",
            dataType: 'json',
            success: function (list) {
                showData(list);
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert('ajax连接异常')
            }
        });
    }


    //展示数据
    function showData(list) {
        var str = "";//定义用于拼接的字符串
        for (var i = 0; i < list.length; i++) {
            //拼接表格的行和列
            str = "<tr><td>" + list[i].username + "</td><td>" + list[i].age + "</td></tr>";
            //追加到table中
            $("#tab").append(str);
        }
    }


</script>


</body>
</html>
