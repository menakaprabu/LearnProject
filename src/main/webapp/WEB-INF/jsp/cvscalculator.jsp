<html>
<body onload='document.cvscalculator.capacity.focus();'>
    <h1>Cvs Calculator </h1>

    <c:if test="${not empty errorMessge}"><div style="color:red; font-weight: bold; margin: 30px 0px;">${errorMessge}</div></c:if>

   <form name="cvscalculator" action="cvscalculator" method="Post">
    <label for = "capacityLabel">Enter Capacity in Gib :
              <input name="capacity" type="text"/><br/>
<br/>
<br/>
      <input type="submit"/>
    </form>
</body>
</html>