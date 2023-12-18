package com.spring.mvc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class HomeController {
	@RequestMapping("/hello/{userid}")
	public String home(@PathVariable("userid") String userid) {
		System.out.println("This is home url..."+ userid);
		return "index";
	}
	@RequestMapping("/home")
	public String main(Model model) {
		List<String> list=new ArrayList<>();
		list.add("Kamal");
		list.add("Rohit");
		list.add("Vilas");
		list.add("Salman");
		model.addAttribute("listKey",list);
		return "home";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Kamal Bisen");
		LocalDate date=LocalDate.now();
		modelAndView.addObject("date",date);
		modelAndView.setViewName("help");
		return modelAndView;
	}
	@RequestMapping("/register")
	public String registration() {
		return "registration";
	}
/*	@RequestMapping("/login")
	public String login(@RequestParam("fname") String fname,@RequestParam("lname") String lname, Model model) {
		System.out.println(fname +" "+ lname);
		model.addAttribute("name1",fname);
		model.addAttribute("name2",lname);
		return "success";
	}
	*/
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String loginModelAttribute(@ModelAttribute("student") Student student) {
		System.out.println("My Details:" +student);
	//	model.addAttribute("fname", user.getFName());
	//	model.addAttribute("user",user);
		return "success";
	}
	
}
