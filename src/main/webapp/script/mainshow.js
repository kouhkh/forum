$(function(){


	$("#logout").click(function(){
		$.post("/forum/logout");
		top.location="/forum/";
	});

	
	$("#fuserid").html("");
	$("#fusername").html("");
	 $.post("/forum/getnowuser",null, function (data) {
		 
		 if (null!=data) {
		     // 名字写在页面上
		     $("#fusername").html(data.username);
		     //            // 将当前用户的id藏在页面上(要求隐藏起来标签)
		     //            $("#curid").val(data.userid);
		     // 将当前用户的id写在页面上
		     $("#fuserid").html(data.userid);

			  //将当前用户的头像打在页面上
			  $("#head").attr("src",data.userimage);
			  
		 }
		 
	 }, "json");
	
	
	
});