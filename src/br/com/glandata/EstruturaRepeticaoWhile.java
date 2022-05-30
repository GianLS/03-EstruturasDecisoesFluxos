package br.com.glandata;

public class EstruturaRepeticaoWhile {

	public static void main(String[] args) {
		int idade = 10;

		while (idade < 18) {
			System.out.println("Você tem " + idade + " anos, então ainda não pode dirigir!");
			idade++;
		}

		System.out.println("Agora você pode dirigir!");
	}

}
