<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>
<html>
<body>
	<stripes:form beanclass="com.actionBean.MonActionBean">
	    <table>
	        <tr>
	            <td>Saisissez votre phrase en francais:</td>
	            <td><stripes:text name="textJava"/></td>
	        </tr>
	        
	        <tr>
	            <td colspan="2">
	                <stripes:submit name="transfoJava" value="Transformation"/>
	            </td>
	        </tr>
	        <tr>
	            <td>Phrase en javanais:</td>
	            <td>${actionBean.resultJavanais}</td>
	        </tr>
	        <tr>
	            <td>Saisissez votre phrase en javanais:</td>
	            <td><stripes:text name="textJavanais"/></td>
	        </tr>
	        <tr>
	            <td colspan="2">
	                <stripes:submit name="transfoJavanais" value="Transformation"/>
	            </td>
	        </tr>
	         <tr>
	            <td>Phrase en francais:</td>
	            <td>${actionBean.resultJava}</td>
	        </tr>
	    </table>
	</stripes:form>
</body>
</html>