package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Producto;

@Controller
public class MainController {
	
	//Controlador por defecto
		@RequestMapping("/")
		public ModelAndView initMain() {
			ModelAndView mav = new ModelAndView();
			Producto usuario=new Producto();
			mav.addObject("message", "Bienvenidos a MVC");
			mav.addObject("user",usuario);
			mav.setViewName("main");
			return mav;

		}
		
		/*@RequestMapping("/formData")
		@ResponseBody
		public User form(@ModelAttribute User user) {
			
			return user;
		}*/
		
		@RequestMapping("/formData")
		public ModelAndView form(@Valid @ModelAttribute Producto user,BindingResult result) {
			ModelAndView mav= new ModelAndView();
			if(result.hasErrors()) {
				mav.addObject("message","Errores al enviar formulario");
				mav.setViewName("main");
			}
			else {
				mav.addObject("message","Producto agregada con exito");
				mav.setViewName("form");
			}
			
			return mav;
		}

}
