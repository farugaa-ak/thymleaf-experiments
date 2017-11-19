package pl.akademiakodu.thymeleafproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafProjectApplication.class, args);
	}
}


class Dziadek{
	private String madrosc;

	public String getMadrosc() {
		return madrosc;
	}
}

class Ojciec {
	private String sila;

	public String getSila() {
		return sila;
	}
}

class Wnuk {

	private Dziadek dziadek;
	private Ojciec ojciec;

	protected String lekkomyslnosc;

	void testThis(){
		dziadek.getMadrosc();
		ojciec.getSila();
	}
}


