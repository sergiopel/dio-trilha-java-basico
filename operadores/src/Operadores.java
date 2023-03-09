import java.util.Date;

public class Operadores {

	public static void main(String[] args) {
		// OPERADORES DE ATRIBUICAO
		
		// tipo char só permite 1 caractere e o valor da variável deve
		//ser definido entre aspas simples
		char sexo = 'M';
		// tipo String, valor da variável deve ser definido entre aspas duplas
		String nome = "Sergio";
		// tipo boolean, o valor deverá ser false ou true, sem aspas
		boolean doadorOrgao = false;
		//classes que representarão tipo
		Date dataNascimento = new Date();

		//OPERADORES ARITMÉTICOS
		// para fazer cálculos: +, -, /, *, %
		// o operador aritmético de adição quando for usado para
		// textos, irá concatenar:
		String nomeCompleto = "Sergio " + "Pelegrini";
		System.out.println(nomeCompleto);
		
		String concatenacao = "?";
		concatenacao = "1"+1+1+1;
		// na variável acima, quando começa com uma string 
		// irá concatenar tudo, mesmo sendo uma conta na sequência
		System.out.println(concatenacao);
		// mas quando tem uma expressão em evidência
		// (entre parênteses) e uma concatenação, irá concatenar
		// a string com o resultado da expressão matemática:
		concatenacao = "1"+(1+1+1);
		System.out.println(concatenacao);
		
		// OPERADOR UNÁRIO
		//para inverter o sinal de uma variável:
		System.out.println("Operador unário e exemplo para inverter o sinal");
		int numero = 5;
		numero = - numero;
		System.out.println(numero);
		// para passar para positivo novamente, a instrução abaixo não funciona:
		numero = + numero;
		System.out.println(numero);
		// é preciso multiplicar por -1 pra funcionar:
		numero = numero * -1;
		System.out.println(numero);
		
		//OPERADOR DE INCREMENTO
		System.out.println("Operador de incremento - imprime antes e só depois incrementa");
		numero = 10;
		// imprime o o número e só depois incrementa 1
		System.out.println(numero++);
		System.out.println(numero);
		// incrementa antes e depois imprime
		System.out.println("Operador de incremento - incrementa antes e depois imprime");
		numero = 10;
		System.out.println(++numero);
		System.out.println(numero);

		// NEGAR VALOR BOOLEANO
		System.out.println("Negar valor booleano, invertendo");
		boolean variavel = true;
		System.out.println(!variavel);
		System.out.println(variavel);
		
		// OPERADOR TERNÁRIO
		// É a simplificação de um IF
		System.out.println("Operador ternário");
		int a, b;
		a= 6;
		b = 6;
		String resultado = "";
		// método tradicional:
		if(a==b)
			resultado = "verdadeiro";
		else
			resultado = "falso";
		
		// com o operador ternário
		//lê-se: se a é igual a b, é verdadeiro, senão é falso
		resultado = a==b ? "verdadeiro" : "falso";
		System.out.println(resultado);
		
		//operadores relacionais
		System.out.println("Operadores relacionais, detalhe da comparação do strings");
		String nomeUm = "Sergio";
		String nomeDois = "Sergio";
		System.out.println(nomeUm == nomeDois);
		nomeDois = new String("Sergio");
		// aqui deu falso, pq tá comparando objetos
		System.out.println(nomeUm == nomeDois);
		// aqui compara conteúdos de 2 objetos, aí é recomendado usdar o equals
		System.out.println(nomeUm.equals(nomeDois));
		
		//operadores lógicos
		// && - operador lógicos "E"
		// || - operador lógico "OU"
		
		
		
		
		
	}

}
