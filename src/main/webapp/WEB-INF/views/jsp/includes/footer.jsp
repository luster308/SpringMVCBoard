<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
</div>
</div>

<form id='actionForm' method='get'>
	<input type='hidden' name='pageNum' value="${!empty param.pageNum ? param.pageNum : '1'}">
	<input type="hidden" name="action" value="${param.action}" />
	<input type="hidden" name="bno" value="${param.bno}" />
	<input type='hidden' name='type' value='${pageCalc.criteria.type}' />
	<input type='hidden' name='keyword' value='${pageCalc.criteria.keyword}' />
</form>

<!-- 
<form id='actionForm' action="/board/list" method='get'>
	<input type='hidden' name='pageNum' value='${param.pageNum}'>
	<input type="hidden" name="action" value="${param.action}" />
	<input type="hidden" name="bno" value="${param.bno}" />
	<input type='hidden' name='type'
		value='<c:out value="${ pageMaker.criteria.type ==null?param.type: pageMaker.criteria.type}"/>'>
	<input type='hidden' name='keyword'
		value='<c:out value="${ pageMaker.criteria.keyword==null?param.keyword: pageMaker.criteria.keyword}"/>'>
</form>
 -->
</body>
</html>