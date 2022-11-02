<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="/WEB-INF/views/jsp/includes/header.jsp"%>
<div class="row">
   <div class="col-lg-12">
      <h1 class="page-header">Tables</h1>
   </div>
   <!-- /.col-lg-12 -->
</div>
<!-- /.row -->

<div class="row">
   <div class="col-lg-12">
      <div class="panel panel-default">
         <div class="panel-heading">
            Board List Page
            <button id='regBtn' type="button" class="btn btn-xs pull-right"> 새글등록</button>
         </div>

         <!-- /.panel-heading -->
         <div class="panel-body">
            <table class="table table-striped table-bordered table-hover">
               <thead>
                  <tr>
                     <th>#번호</th>
                     <th>제목</th>
                     <th>작성자</th>
                     <th>작성일</th>
                     <th>수정일</th>
                  </tr>
               </thead>

               <c:forEach items="${boardVOList}" var="boardVO">
                  <tr>
                     <td><c:out value="${boardVO.bno}" /></td>
                     <td>
                     	<a class='selectLink' bno="${boardVO.bno}" 
                     		pagenum="${!empty pageCalc.criteria.pageNum 
                     		? pageCalc.criteria.pageNum : '1'}">
                           <c:out value="${boardVO.title}" />
                     	</a>
                     </td>

                     <td><c:out value="${boardVO.writer}" /></td>
                     <td><fmt:formatDate pattern="yyyy-MM-dd"
                           value="${boardVO.regdate}" /></td>
                     <td><fmt:formatDate pattern="yyyy-MM-dd"
                           value="${boardVO.updateDate}" /></td>
                  </tr>
               </c:forEach>
            </table>

		<div class='row'>
			<div class="col-lg-12">
                     <select name='type'>
                        <option value=""
                           <c:out value="${pageCalc.criteria.type == null?'selected':''}"/>>--</option>
                        <option value="T"
                           <c:out value="${pageCalc.criteria.type eq 'T'?'selected':''}"/>>제목</option>
                        <option value="C"
                           <c:out value="${pageCalc.criteria.type eq 'C'?'selected':''}"/>>내용</option>
                        <option value="W"
                           <c:out value="${pageCalc.criteria.type eq 'W'?'selected':''}"/>>작성자</option>
                        <option value="TC"
                           <c:out value="${pageCalc.criteria.type eq 'TC'?'selected':''}"/>>제목
                           or 내용</option>
                        <option value="TW"
                           <c:out value="${pageCalc.criteria.type eq 'TW'?'selected':''}"/>>제목
                           or 작성자</option>
                        <option value="TWC"
                           <c:out value="${pageCalc.criteria.type eq 'TWC'?'selected':''}"/>>제목
                           or 내용 or 작성자</option>
                     </select>
                     <input type='text' name='keyword'
                        value="${pageCalc.criteria.keyword}" />
                     <input type="hidden" name="pn" value="${pageCalc.criteria.pageNum}" />
                     <button id="searchBtn" class='btn btn-default'>Search</button>
               </div>
            </div>


            <div class='pull-right'>
               <!--             페이지 번호 보여주는 것 -->
               <ul class="pagination">
                  <c:if test="${pageCalc.prev}">
                     <li class="paginate_button previous">
                     	<a href="${pageCalc.startPage -1}">Previous</a>
                     </li>
                  </c:if>
                  <c:forEach var="num" begin="${pageCalc.startPage}" end="${pageCalc.endPage}">
                     <li class="paginate_button  ${pageCalc.criteria.pageNum == num ? 'active':''} ">
                        <a class="pageNumLink" pagenum="${num}">${num}</a>
                     </li>
                  </c:forEach>
                  <c:if test="${pageCalc.next}">
                     <li class="paginate_button next">
                     	<a href="${pageCalc.endPage +1 }">Next</a>
                   	</li>
                  </c:if>
               </ul>
            </div>
         </div>
      
         <div class="modal fade" id="myModal" tabindex="-1" role="dialog"
            aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
               <div class="modal-content">
                  <div class="modal-header">
                     <button type="button" class="close" data-dismiss="modal"
                        aria-hidden="true">&times;</button>
                     <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                  </div>
                  <div class="modal-body">처리가 완료되었습니다.</div>
                  <div class="modal-footer">
                     <button type="button" class="btn btn-default"
                        data-dismiss="modal">Close</button>
                     <button type="button" class="btn btn-primary">Save
                        changes</button>
                  </div>
               </div>
            </div>
         </div>
	</div>
   </div>
</div>
<%@include file="../jsp/includes/footer.jsp"%>