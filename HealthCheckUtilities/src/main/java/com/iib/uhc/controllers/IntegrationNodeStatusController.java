package com.iib.uhc.controllers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.broker.config.proxy.BrokerConnectionParameters;
import com.ibm.broker.config.proxy.BrokerProxy;
import com.ibm.broker.config.proxy.ConfigManagerProxyException;
import com.ibm.broker.config.proxy.IntegrationNodeConnectionParameters;

@Controller
@RequestMapping
public class IntegrationNodeStatusController {
	
	BrokerProxy b= null;
	
	@RequestMapping("/gettingStatus")
	public String displayUser(Model model) {
		//HashMap<String, Boolean> hmap = new HashMap<String, Boolean>();
		Map<String, Boolean> hmap = new HashMap<>();
		
		String name = null;
		//try {
			/*
			 * BrokerConnectionParameters bcp = new IntegrationNodeConnectionParameters(
			 * "desktop-jsi5kdn",4414);
			 * 
			 * b = BrokerProxy.getInstance(bcp); name = b.getName(); Boolean status =
			 * b.isRunning();
			 */
			name = "Khushboo";
			Boolean status = true;
			hmap.put(name, status);
			model.addAttribute("name", name);
			model.addAttribute("status", status);
			//model.mergeAttributes(hmap);
			//model.addAttribute("Records", hmap);
		   // model.addAttribute("Status", name);
			System.out.println(hmap);
			/*
			 * } catch (ConfigManagerProxyException cmpex) { String stx =
			 * "Error connecting: " + cmpex; System.out.println(stx);
			 * 
			 * }
			 */
		
		//return "User ID :" + abc;
		return "/main/display";

	}
}
