package com.github.matsui_h18.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
	// 最初の画面
	@GetMapping("/")
	public String main() {
		// 電卓の画面
		return "main";
	}
	
	// 数字が押されたとき
	@PostMapping(value = "/", params="btn")
	public String numPress(@RequestParam("btn") int num, Model model) {
		// 画面の数字が出力されるところに数字を返す
		model.addAttribute("display", num);
		return "main";
	}
	
	// 符号が押されたとき
	@PostMapping(value = "/", params="sign")
	public String signPress(@RequestParam("sign") String sign, Model model) {
		// 画面の数字が出力されるところに数字を返す
		if("+".equals(sign)) {
			model.addAttribute("display", sign);
		}else if("-".equals(sign)) {
			model.addAttribute("display", sign);
		}
		
		return "main";
	}
	
	// 計算用
	/*
	public String calc(int num1, int num2, String sign) {
		int result;
		if("+".equals(sign)) {
			result = (num1 + num2);
			model.addAttribute("display", result);
		}else if("-".equals(sign)) {
			result = (num1 - num2);
			model.addAttribute("display", result);
		}
				
		return "main";
	}
	*/
}
