package com.springmvc.first.Controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/home")
public class FirstSpringMVCController {
@RequestMapping("/hello")
public String sayHello()
{
	return "hello";
}
@RequestMapping("/message")
public String sendmessage(Model m)
{
m.addAttribute("myMessage", "Hello from SpringMVC");
m.addAttribute("myMessages", "hi");
return "hai";
}
@RequestMapping("/supermessage")
public ModelAndView sendsupermessage(ModelAndView  mv)
{
	mv.addObject("food", "hello");
	mv.setViewName("canteen");
	
	return mv;
	
}
@RequestMapping("/empform")  
public ModelAndView showform(){  
    
    return new ModelAndView("empform","command",new Emp());  
}  
@RequestMapping(value="/save",method = RequestMethod.POST)  
public ModelAndView save(@ModelAttribute("emp") Emp emp){  
     
    System.out.println(emp.getName()+" "+emp.getId()+" "+emp.getLocation());  
      
    
    return new ModelAndView("redirect:/viewemp");
}
  
@RequestMapping("/viewemp")  
public ModelAndView viewemp(){  
   
    List<Emp> list=new ArrayList<Emp>();  
    list.add(new Emp(1,"rahul","sdh"));  
    list.add(new Emp(2,"aditya","jfa"));  
    list.add(new Emp(3,"sachin","dsuh"));  
      
    return new ModelAndView("viewemp","list",list);  
}  

}
