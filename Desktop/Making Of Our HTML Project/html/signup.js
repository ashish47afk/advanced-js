function func(){
var b = document.getElementById('email');
if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(b.value)) 
{ 
alert('Message Sent Successfully !');
return true;
}
else

{
	alert('Email address is not valid');
	return false;
}

}