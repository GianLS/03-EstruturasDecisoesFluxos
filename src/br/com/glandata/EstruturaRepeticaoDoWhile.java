package br.com.glandata;

public class EstruturaRepeticaoDoWhile {

	public static void main(String[] args) {
		int idade = 20;

		do {
			System.out.println("Você tem " + idade + " anos, então ainda não pode dirigir!");
			idade++;
		} while (idade < 18);

		System.out.println("Agora você pode dirigir!");
	}

}
