<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사용자입력</title>
<script type="text/javascript">
	function send(form){
		value = prompt("입력하신 내용이 맞나요", form.keyword.value);
		
		if(value == null){
			return false;
		}else{
			form.keyword.value = value;
			return true;
		}
	}
</script>
</head>
<body>
	<h3>연락처</h3>
	<form method="post" action="/servlet/Contact">
		이름 : <input type="text" name="name"/>
		메일 : <input type="text" name="email"/>
		<p/>
		<input type="submit" value="전송"/>	&nbsp; <input type="reset" value="취소"/>		
	</form>
</body>
</html>