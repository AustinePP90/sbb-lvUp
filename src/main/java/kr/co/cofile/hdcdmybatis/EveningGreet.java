package kr.co.cofile.hdcdmybatis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EveningGreet implements Greet {

	@GetMapping("/evening")
	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("이브닝 이브닝 이브닝");
	}

}
