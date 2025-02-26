package com.i.manual.popup.modal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PopupModalController {
	
	@GetMapping("/popup/modal/index")
	public String index() {

		return "popup/modal/index";
	}

}
