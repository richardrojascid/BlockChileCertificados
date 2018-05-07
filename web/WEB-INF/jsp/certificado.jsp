<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>                        
        <meta charset=UTF-8">
       <jsp:include page="common/bootstrap.jsp"/>
        <title>CertiBlockChile-DEMO</title>
    </head>
    <body>
        <div>
            <h1>Demo Certificados blockchile</h1>
        </div>
        <br>
            
        <div class="row">
                <div class="col-lg-12">                    
                    <div class="alert alert-primary" role="alert">
                        <p class="text-center">Carga de Certificados</p>                        
                        <hr>
                        <div class="container">
                            <form action="nosotros.htm" method="post">                           
                             <div class="form-group">
                                <table>
                                    <tr class="fixed-top"><label>Adjunte Certificado</label></tr>
                                    <tr><input type="file" class="form-control" id="fileID" name="fileName" placeholder="Escoja un certificado.."></tr>
                                </table>                                                                
                            </div> 
                            <div class="form-group">
                                <table>
                                    <tr class="fixed-top"><label>Escriba Información</label></tr>
                                    <tr><textarea id="textoId" name="textoName" placeholder="info..." rows="10" cols="120"></textarea></tr>
                                </table>                                                                
                            </div> 
                            <div class="form-group">
                                <label>SHA-256 Hash</label>
                                <input type="text" disabled="true" class="form-control" id="hashID" name="hashName" placeholder="hash calculado.." required>
                            </div>  
                            <br>                            
                            <button class="btn btn-dark">Enviar Hash</button>
                        </form>  
                            <br>
                            <button class="btn btn-success" onclick="calcular()">Calcular Hash</button>
                       </div>
                    </div>  
            </div>
        </div>
        <div>
            <a href="javascript:void(0);" onclick="saludo()"> haz click</a>
        </div>
    </body>
</html>
