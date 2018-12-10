<html>
<body onload='document.cvscalculator.capacity.focus();'>
    <h1>Cvs Calculator Form</h1>

    <c:if test="${not empty errorMessge}"><div style="color:red; font-weight: bold; margin: 30px 0px;">${errorMessge}</div></c:if>

    <form name='cvscalculator' action="/cvscalculator" method='POST'>
        <table>
            <tr>
                <td>Enter Storage Capacity in GiB:</td>
                <td><input type='text' name='capacity' value=''></td>
            </tr>
            <tr>
                <td colspan='2'><input name="calculate" type="calculate" value="calculate" /></td>
            </tr>
        </table>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
</body>
</html>