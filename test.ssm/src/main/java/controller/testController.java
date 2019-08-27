package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Type;

@Controller
@RequestMapping("Book")
public class testController {
	@RequestMapping("aaa")
	public @ResponseBody Type index1(HttpSession s) {
//	m.put("info", new Type(2,"dddfff"));
		return new Type(2,"dddfff");
	}
}
