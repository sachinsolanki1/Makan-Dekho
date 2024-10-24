package com.univ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.univ.bean.Customer;
import com.univ.service.CustService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class IndexController {
	@Autowired
	CustService custServ;
  @RequestMapping("/")
	public String index()
	{
		return "index";
	}
  @RequestMapping("/index")
 	public String index1()
 	{
 		return "index";
 	} 
 @RequestMapping("/about")
	public String about()
	{
		return "about";
	}
  @RequestMapping("/login")
	public String login()
	{
		return "login";
	}
  @RequestMapping(path="/login",method=RequestMethod.POST)
	public String userLogin(@ModelAttribute("cust")  Customer cust,HttpServletRequest req)
	{
	  HttpSession hs=req.getSession(false);
	  if(hs!=null)
	  {
		 hs.invalidate(); 
	  }
	  Customer ct= custServ.loginCust(cust);
	 if(ct!=null)
	 {
	 hs=req.getSession(true);
	 hs.setAttribute("cust", ct);
	 return "index";
	 }else {
		 return "login";	 
	 }
	}
  @RequestMapping("/reg")
	public String reg()
	{
		return "reg";
	}
  @RequestMapping(path = "/regData", method = RequestMethod.POST)
	public String reg(@ModelAttribute("cust")  Customer cust)
	{
	  custServ.addCust(cust);
	  return "login";
	}
  
  @RequestMapping("/property-list")
	public String property_list()
	{
		return "property-list";
	}
  @RequestMapping("/property-type")
	public String property_type()
	{
		return "property-type";
	}
  @RequestMapping("/property-agent")
	public String property_agent()
	{
		return "property-agent";
	}
  @RequestMapping("/testimonial")
	public String testimonial()
	{
		return "testimonial";
	}
  @RequestMapping("/404")
	public String err404()
	{
		return "404";
	}
  @RequestMapping("/contact")
 	public String contact()
 	{
 		return "contact";
 	}
 
}
