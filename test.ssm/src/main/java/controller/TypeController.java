package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.Type_Dao;
import model.Type;
import model.Type;
import service.Type_Service;
import service.Type_Service;
import service.Impl.Type_Service_Impl;

@Controller
@RequestMapping("Type")
public class TypeController {
	@Autowired
	Type_Service service;

	
@RequestMapping("index")
	public String index(ModelMap m) {
	m.put("list", service.select());
	return "Type/index";
	}	
	@RequestMapping("add")
	public String add(ModelMap m) {
	return "Type/edit";
	}
	@RequestMapping("edit")
	public String edit(int id,ModelMap m) {
	m.put("info", service.selectById(id));
	return add(m);
}
	@RequestMapping("insert")
	public String insert(Type b,ModelMap m) {
	service.insert(b);
	return index(m);
}
	@RequestMapping("update")
	public String update(Type b,ModelMap m) {
	service.update(b);
	return index(m);
}
	@RequestMapping("delete")
	public String delete(int id,ModelMap m) {
	service.delete(id);
	return index(m);
}
}
