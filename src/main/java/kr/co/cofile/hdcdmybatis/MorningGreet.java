package kr.co.cofile.hdcdmybatis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MorningGreet implements Greet {

	@GetMapping("/morning")
	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("모닝 모닝 모닝");
	}

}
