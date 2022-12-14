<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../jsp/includes/header.jsp"%>

<div class="row">
  <div class="col-lg-12">
    <h1 class="page-header">Board Insert</h1>
  </div>
</div>
<div class="row">
  <div class="col-lg-12">
    <div class="panel panel-default">
      <div class="panel-heading">Board Insert</div>
      <!-- /.panel-heading -->
      <div class="panel-body">
        <form id="boardInsertForm" role="form" action="/board/boardInsertProc" method="post">
          <div class="form-group">
            <label>Title</label> <input class="form-control" name='title'>
          </div>
          <div class="form-group">
            <label>Text area</label>
            <textarea class="form-control" rows="3" name='content'></textarea>
          </div>
          <div class="form-group">
            <label>Writer</label> <input class="form-control" name='writer'>
          </div>
          <button id="boardInsertSubmitBtn" class="boardInsertBtns btn btn-default">Submit Button</button>
          <button id="boardInsertResetBtn"class="boardInsertBtns btn btn-default">Reset Button</button>
        </form>
      </div>
    </div>
  </div>
</div>
<%@include file="../jsp/includes/footer.jsp"%>