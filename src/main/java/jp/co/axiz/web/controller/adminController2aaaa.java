package jp.co.axiz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController2aaaa {
	@RequestMapping("/adminTop")
	public String index1(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminTop";
	}
	@RequestMapping("/adminLogin")
	public String index2(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminLogin";
	}

	@RequestMapping("/adminMenu")
	public String index3(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminMenu";
	}


	@RequestMapping("/adminUpdateInput")
	public String index4(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminUpdateInput";
	}

	@RequestMapping("/adminUpdateConfirm")
	public String index5(Model model){
		model.addAttribute("msg", "Hello MVC!");
		System.out.print(8);
		return "Mazaki_adminUpdateConfirm";
	}
	@RequestMapping("/adminUpdateResult")
public String index6(Model model){
model.addAttribute("msg", "Hello MVC!");
	return "Mazaki_adminUpdateResult";
}


	@RequestMapping("/adminMemberSelectInput")
	public String index7(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminMemberSelectInput";
	}

	@RequestMapping("/adminMemberSelectResult")
	public String index8(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminMemberSelectResult";
	}
	@RequestMapping("/adminMemberDeleteConfirm")
	public String index9(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminMemberDeleteConfirm";
	}
	@RequestMapping("/adminMemberDeleteResult")
	public String index10(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminMemberDeleteResult";
	}
	@RequestMapping("/adminShopMenu")
	public String index11(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminShopMenu";
	}
	@RequestMapping("/adminLogout")
	public String index12(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminLogout";
	}
}

