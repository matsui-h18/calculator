package com.github.matsui_h18.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {
	// 最初の画面
	@GetMapping("/")
	public String main() {
		// 電卓の画面
		return "main";
	}
	
	// 「0」が押されたとき
	@PostMapping("/")
	public String num0(Model model) {
		// 画面の数字が出力されるところに数字を返す
		model.addAttribute("display", "0");
		return "main";
	}
}
