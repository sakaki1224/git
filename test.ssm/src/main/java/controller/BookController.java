package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.Type_Dao;
import model.Book;
import model.Type;
import model.Type2;
import service.Book_Service;
import service.Type_Service;
import service.Impl.Type_Service_Impl;

@Controller
@RequestMapping("Book")
public class BookController {
	@Autowired
	Type_Service tservice;
	@Autowired
	Book_Service service;
	
@RequestMapping("index")
	public String index(String txt,ModelMap m) {
	if(txt!=null) txt=" where book.name like '%"+txt+"%' ";
	else txt="";
	m.put("list", service.select(txt));
	return "Book/index";
	}	
	@RequestMapping("add")
	public String add(ModelMap m) {
	m.put("sexs", Book.sexs);
	m.put("typelist", tservice.select());
	return "Book/edit";
	}
	@RequestMapping("edit")
	public String edit(int id,ModelMap m) {
	m.put("info", service.selectById(id));
	return add(m);
}
	@RequestMapping("insert")
	public String insert(Book b,ModelMap m) {
	service.insert(b);
	return index(null,m);
}
	@RequestMapping("update")
	public String update(Book b,ModelMap m) {
	service.update(b);
	return index(null,m);
}
	@RequestMapping("delete")
	public String delete(int id,ModelMap m) {
	service.delete(id);
	return index(null,m);
}
}
