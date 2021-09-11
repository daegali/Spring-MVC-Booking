<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
</head>
<body>
<div class="tabui-wrap">
      <header>
        <span id="ig"><img src="${pageContext.request.contextPath}/slideimg/favicon.ico" /></span>
        <span id="ft1">예약</span>
        <span id="ft2">로그인</span>
      </header>
      <section class="tabui-promotion">
        <ul>
          <li></li>
          <li></li>
          <li></li>
          <li></li>
        </ul>
      </section>
      <section class="tabui-category">
        <div>
          <input type="button" value="전체리스트" />
          <input type="button" value="뮤지컬" />
          <input type="button" value="콘서트" />
          <input type="button" value="클래식" />
          <input type="button" value="연극" />
        </div>
      </section>
      <hr />
      <div class="tabui-count">
        <p>바로 예매 가능한 행사가 8개 있습니다.</p>
      </div>
      <div class="tabui-content">content</div>
      <div class="tabui-more">
        <input type="button" value="더보기" />
      </div>
      <div class="tabui-top">&#8607; 위로</div>
    </div>
</body>
</html>