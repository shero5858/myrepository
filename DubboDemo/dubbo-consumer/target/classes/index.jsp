<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jquery1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="jquery-1.11.1.min.js"></script>
	<script type="text/javascript">
	$(document).ready(
			function(){
				$("#sender").click(function(){
					//get_jsonstr();
					get_jsonobj();
				 });  
			}
	);
	
	function get_jsonstr() {
		var url="findAllDevices"; 
		 $.post(
		   url,
		   function(data) {
		  var devices = $.parseJSON(data);
		for(i in devices){
			 var old = $("#messageDiv").html();
			 var device = devices[i];
			 $("#messageDiv").html(old + "<br>"+device.name+"   -----   "+device.desr); 
		 	}
		 });  
	}
	
	function get_jsonobj() {
		var url="findAllDevObjs"; 
		 $.post(
		   url,
		   function(data) {
		if(data.length > 0){
			for(i in data){
				 var old = $("#messageDiv").html();
				 var device = data[i];
				 $("#messageDiv").html(old + "<br>"+device.name+"   -----   "+device.desr); 
			 	}
			}
		  });  
	}
	</script>
  </head>
  
  <body>
    <input type="button" value="getdevice" id="sender" />  
 	<div id="messageDiv"></div> 
  </body>
</html>
