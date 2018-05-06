/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blockchile.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author fimar
 */
@Controller
public class CertificadoController {
    
    //metodo de una vista
    @RequestMapping("certificado.htm")
    public ModelAndView certificado(){
     
        ModelAndView mav = new ModelAndView();
        mav.setViewName("certificado");        
        return mav;
    }
     //metodo de una vista
    @RequestMapping("calculo.htm")
    public ModelAndView calculo(HttpServletRequest request){
     
        ModelAndView mav = new ModelAndView();
        mav.setViewName("calculo");//archivo jsp
        String hash = request.getParameter("hashId");
        String archivo = request.getParameter("archivoID");
        
        mav.addObject("id",hash);
        mav.addObject("ide",archivo);
        return mav;
    }
}
