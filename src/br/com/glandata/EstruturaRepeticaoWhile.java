package br.com.glandata;

public class EstruturaRepeticaoWhile {

	public static void main(String[] args) {
		int idade = 10;

		while (idade < 18) {
			System.out.println("Voc� tem " + idade + " anos, ent�o ainda n�o pode dirigir!");
			idade++;
		}

		System.out.println("Agora voc� pode dirigir!");
	}

}
