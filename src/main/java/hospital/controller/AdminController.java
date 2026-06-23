package hospital.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hospital.entity.Doctor;
import hospital.entity.Specialist;
import hospital.entity.User;
import hospital.service.DoctorService;
import hospital.service.SpecialistService;

@Controller
public class AdminController {
	
	@Autowired
	private SpecialistService specialistService;
	
	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping("/admin_login")
	public String admin() {
		return "/admin_login";
	}
	
	@RequestMapping(value = "/adminLogin", method = RequestMethod.POST )
	public String adminLogin(@RequestParam ("email") String email, 
			@RequestParam("password") String password,HttpSession session) {
		
		System.out.println(email+" "+password);
		
		if(email.equals("admin@gmail.com") && password.equals("admin")) {
			session.setAttribute("adminObj", new User());
			return "redirect:/admin/index";
		}else {
			session.setAttribute("errorMsg", "Invalid email & password");
			return "redirect:/admin_login";
		}
		
	}
	
	@RequestMapping("admin/index")
	public String adminDashboard(HttpSession session) {
		
		if(session.getAttribute("adminObj") == null) {
			return "redirect:/admin_login";
		}
		return "admin/index";
	}

	@RequestMapping("/addSpecialist")
	public String addSpecialist(@RequestParam("specName") String specName,HttpSession session) {
		
		System.out.println(specName);
		
		Specialist s = new Specialist();
		s.setSpecName(specName);
		
		boolean f = specialistService.addSpecialist(s);
		
		if(f) {
			session.setAttribute("succMsg", "Specialist added Successfully");
		}else {
			session.setAttribute("errorMsg", "Something Went Wrong");
		}
		
		return ("redirect:/admin/index");
	}
	
	@RequestMapping("/admin/add_doctor")
	public String addDoctor(HttpSession session,Model m) {
		
		if(session.getAttribute("adminObj") == null) {
			return "redirect:/admin_login";
		}
		m.addAttribute("specList",specialistService.getAllSpecialist());
		return "admin/add_doctor";
	}
	
	@RequestMapping(value = "/addDoctor", method = RequestMethod.POST)
	public String addDoctor(@ModelAttribute Doctor d,HttpSession session) {
		
		
		boolean f = doctorService.addDoctor(d);
		
		if(f) {
			session.setAttribute("succMsg", "Doctor Added Successfully");
		}else {
			session.setAttribute("errorMsg", "Something Went Wrong");
		}
		return "redirect:/admin/add_doctor";
	}
	
	@RequestMapping("/admin/view_doctor")
	public String viewDoctor(HttpSession session, Model m) {
		if(session.getAttribute("adminObj") == null) {
			return "redirect:/admin_login";
	}
	
	
		m.addAttribute("doctorList", doctorService.getAllDoctor());
		
		return "admin/view_doctor";
	}
	
	@RequestMapping("/admin/edit_doctor")
	public String editDoctor(@RequestParam("id") int id, Model m,HttpSession session) {
		if(session.getAttribute("adminObj") == null) {
			return "redirect:/admin_login";
		}
		
		m.addAttribute("doctor", doctorService.getDoctorById(id));
		m.addAttribute("specialist",specialistService.getAllSpecialist());
		return "admin/edit_doctor";
	}
	
	@RequestMapping("/updateDoctor")
	public String updateDoctor(@ModelAttribute Doctor d, HttpSession session) {
		boolean f =	doctorService.updateDoctor(d);
		
		if (f) {
			session.setAttribute("succMsg", "Doctor update Successfully");
		}else {
			session.setAttribute("errorMsg", "Something Went Wrong");
		}
		
		return "redirect:/admin/view_doctor";
	}
	
	@RequestMapping("/delete_doctor")
	public String deleteDoctor(@RequestParam("id") int id,HttpSession session) {
		boolean f = doctorService.deleteDoctor(id);
		
		if(f) {
			session.setAttribute("succMsg", "Doctor delete successfully");
		}else {
			session.setAttribute("errorMsg", "Something Went Wrong");
		}
		return "redirect:/admin/view_doctor";
	}
	
	@RequestMapping("/adminLogout")
	public String adminLogout(HttpSession session) {
		session.removeAttribute("adminObj");
		session.setAttribute("succMsg","Admin Logout Successfully");
		
		return "redirect:/admi_login";
	}
}
