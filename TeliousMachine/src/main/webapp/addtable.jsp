    <%@page import="test.DAO"%>  
    <jsp:useBean id="u" class="test.AddTable"></jsp:useBean>  
    <jsp:setProperty property="*" name="u"/>  
      
    <%  
    int i=DAO.save(u);  
    if(i>0){  

    out.print("Success");
    }else{  
        out.print("Error");
    }  
    %>  