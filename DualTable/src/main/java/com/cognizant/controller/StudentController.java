package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.model.Student;
import com.cognizant.service.ServiceDao;
import com.cognizant.service.ServiceDaoImpl;

@Controller
public class StudentController {
	   @Autowired
       private ServiceDao serviceDao=new ServiceDaoImpl();
	   
	   @RequestMapping(value="insert", method=RequestMethod.GET)
	   public ModelAndView insertpage()
	   {
		   ModelAndView mv=new ModelAndView("insert");
		   Student student=new Student();
		   mv.addObject("student",student);
		   return mv;
	   }
	   @RequestMapping(value = "insert", method = RequestMethod.POST)
		public ModelAndView insert(@ModelAttribute("student") Student student) {

			ModelAndView mv = new ModelAndView("insert");
			
			System.out.println(student);
			
			int res = serviceDao.insert(student);
			
			if (res > 0) {
				mv.addObject("msg", "Record Inserted");
			} else {
				mv.addObject("msg", "Record not Inserted");
			}
			return mv;
		}
	   @RequestMapping(value="findAll", method=RequestMethod.GET)
	   public ModelAndView displaypage()
	   {
		   ModelAndView mv=new ModelAndView("display");
		   List<Student> list=serviceDao.findAll();
		   mv.addObject("list",list);
		   return mv;
	   }
	   @RequestMapping(value="update", method=RequestMethod.GET)
	   public ModelAndView updatepage()
	   {
		   ModelAndView mv=new ModelAndView("update");
		   Student student=new Student();
		   mv.addObject("student",student);
		   return mv;
	   }
	   @RequestMapping(value = "update", method = RequestMethod.POST)
		public ModelAndView update(@ModelAttribute("student") Student student) {

			ModelAndView mv = new ModelAndView("update");
			
			System.out.println(student);
			
			int res = serviceDao.update(student);
			
			if (res > 0) {
				mv.addObject("msg", "Success");
			} else {
				mv.addObject("msg", "Fail");
			}
			return mv;
		}
	   @RequestMapping(value="delete", method=RequestMethod.GET)
	   public ModelAndView deletepage()
	   {
		   ModelAndView mv=new ModelAndView("delete");
		   Student student=new Student();
		   mv.addObject("student",student);
		   return mv;
	   }
	   @RequestMapping(value = "delete", method = RequestMethod.POST)
		public ModelAndView delete(@ModelAttribute("student") Student student) {

			ModelAndView mv = new ModelAndView("delete");
			
			System.out.println(student);
			
			int res = serviceDao.delete(student);
			
			if (res > 0) {
				mv.addObject("msg", "Success");
			} else {
				mv.addObject("msg", "Fail");
			}
			return mv;
		}
	   
}
