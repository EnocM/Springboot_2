/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.ejercicio.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author alumno
 */
@Controller
public class ControllerIndex {
    
    @Autowired
    //private IPersonaService personaService;
    
    @GetMapping("/")
    public String ViewIndex(){
        return "index";
    }
    
    @GetMapping("home2")
    public String ViewIndex(Model model){
        model.addAttribute("mensaje","Bienvenido");
        return "index2";
    }
    
}
