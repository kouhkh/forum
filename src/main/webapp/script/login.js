$(function(){
	$("#loginok").click(function(){
		var loginusername=$("#loginusername").val();
		var loginuserpwd=$("#loginuserpwd").val();
		if(!loginusername){
			alert("写用户名");
			return;
		}
		if(!loginuserpwd){
			alert("写密码");
			return;
		}
		$.post("/forum/login","username="+loginusername+"&userpassword="+loginuserpwd,function(data){
			if(data){
				//alert("您好");
				var time = 0;
				$.post("/forum/logintime", null, function(){alert(123);}, "text");
				alert("logintime函数完了");
				window.location.href="/forum/mainshow.html";

			}
			else{
				alert("密码错误");
			}
			
		},"text");
		
	});
	
	$("#registerok").click(function(){
		
		var registerusername=$("#registerusername").val();
		var registeruseremail=$("#registeruseremail").val();
		var registeruserbirthday=$("#registeruserbirthday").val();
		var registerFile=$("#exampleInputFile").val();
		var registersex="";
		var registersex =  $("input[name='gender']:checked").val();
		
		
		var registeruserpwd=$("#registeruserpwd").val();
		var registeragainuserpwd=$("#registeragainuserpwd").val();
		if(registeruserpwd!=registeragainuserpwd){
			alert("两次密码不一致");
			return;
		}
			$.post("/forum/register","username="+registerusername+"&userpassword="+registeruserpwd+"&user="+registeruseremail+"&useremail="+registeruserbirthday+"&usersex="+registersex+"&userimage="+registerFile,function(data){
				if(data.equalTo("true")){
					alert("注册成功");
				}
				else{
					alert("注册失败");
				}
				
			},"text");
		
	});
	
	$("#forgetok").click(function(){
		
		var forgetusername=$("#forgetusername").val();
		var forgetuserpwd=$("#forgetuserpwd").val();
		var forgetagainuserpwd=$("#forgetagainuserpwd").val();
		if(forgetuserpwd!=forgetagainuserpwd){
			alert("两次密码不一致");
			return;
		}
			$.post("/forum/modpwdbyusername", "username=" + $("#forgetusername").val() + "&userpwd=" + $("#forgetuserpwd").val(), function (data) {
                    if (true == data) {
                        alert("密码修改成功");
                        $("#cancel").click();
                    } else {
                        alert("修改失败，请重试");
                    }
                }, "json");
		
	});
	
	
	
	
	
});