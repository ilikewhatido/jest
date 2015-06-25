<#ftl encoding='UTF-8'>
<#-- @ftlvariable name="" type="com.songhan.jest.views.FreeFormView" -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style>
  #rcorners1 {
    border-radius: 5px;
    background: #F8E6E0;
    padding: 20px; 
    width: 100% - 10;
    height: 120px;    
  }
</style>
</head>
<body>
  <div id="rcorners1">
  <!-- calls getPerson().getName() and sanitizes it -->
  <h1>${what?html} ${to?html}</h1>
  <h4><i>-${from?html}</i></h4>
  </div>
</body>
</html>