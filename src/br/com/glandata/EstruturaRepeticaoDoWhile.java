package br.com.glandata;

public class EstruturaRepeticaoDoWhile {

	public static void main(String[] args) {
		int idade = 20;

		do {
			System.out.println("Voc� tem " + idade + " anos, ent�o ainda n�o pode dirigir!");
			idade++;
		} while (idade < 18);

		System.out.println("Agora voc� pode dirigir!");
	}

}
