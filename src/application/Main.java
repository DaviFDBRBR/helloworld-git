package application;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		if (Locale.getDefault().getLanguage().equals("pt")) {
			System.out.println("Olá, mundo!");
		} else {
			System.out.println("Hello, world!");
		}
		
	}

}
