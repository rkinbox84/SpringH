package com.rk.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rk.mv.bean.AddBean;

@Controller
public class CalcController {


	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i+j;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		
		return mv; 
	}
	
	@RequestMapping("/add1")
	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
		
		int k = i+j;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		
		return mv; 
	}
	
	@RequestMapping("/add3")
	public ModelAndView add(@ModelAttribute AddBean addBean) {
		
		int k = addBean.getNum1() + addBean.getNum2();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		
		return mv; 
	}

}

