package br.com.glandata;

public class Decisao {
	/**
	 * Esta classe e responsavel por executar o programa principal e mostra as
	 * opcoes de condicoes IF
	 * 
	 * @param args recebe os arguemtentos de execucao
	 */
	public static void main(String[] args) {
		int primeiraNota = 0, segundaNota = 0;

		// Condicao SE menor que
		if (primeiraNota < segundaNota) {
			System.out.println("Segunda Nota é maior.");
		} else {
			System.out.println("Primeira Nota é maior.");
		}

		/*
		 * Condicao de IGUALDADE if (primeiraNota == segundaNota) {
		 * System.out.println("As notas são iguais."); } else {
		 * System.out.println("As notas são diferentes."); }
		 */

		// Condicao de
		if (primeiraNota > 0 && segundaNota > 0) {
			System.out.println("Valor Positivo");
		} else {
			System.out.println("Valor Negativo");
		}

		if (primeiraNota > 0 || segundaNota > 0) {
			System.out.println("Existe um valor positivo");
		} else {
			System.out.println("Não existe um valor positivo");
		}

		int hora = 9;

		// IF encadeado
		if (hora < 10) {
			System.out.println("Bom dia!");
		} else if (hora < 20) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}

		int idade = 65;

		// Operador ternario
		System.out.println(idade < 18 ? "Menor de Idade!" : "Maior de Idade!");

		// IF de retorno unico em uma linha
		if (idade >= 50)
			System.out.println("Você já faz parte da velha guarda!");
	}
}
