package com.csr.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/customer")
public class CustomerService {

	
	@RequestMapping(value = "/getCustomerDetails", method = RequestMethod.GET)
	@ResponseBody
	String uploadImage(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws JSONException {

		JSONObject js = new JSONObject();
		js.put("Name", "Chandra Sekhar");
		js.put("Calling Name", "Chandrasekhar");
		js.put("DOB", "08-Nov-1990");
		js.put("Hobbies", "Reading Technical Blogs,web hosting, Blogging..");
		js.put("Places he like", "His native place");

		return js.toString();
}
}
