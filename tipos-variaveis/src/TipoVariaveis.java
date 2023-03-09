
public class TipoVariaveis {

	public static void main(String[] args) {
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		// um número short não comporta um número inteiro
		//short numeroCurto2 = numeroNormal;
		// temos então que usar o casting:
		short numeroCurto2 = (short) numeroNormal;
		
		// uma variável pode mudar ao longo do código
		int numero = 5;
		numero = 10;
		System.out.println(numero);
		
		// uma constante é imutável, não pode mudar
		// por convenção a constante deve ser definida em letras maiúsculas e
		// por regra deve vir antes a palavra reservada 'final'
		final double VALOR_DE_PI = 3.14;
		// se tentar mudar a constante a ide dá erro:
		VALOR_DE_PI = 10.75;
		
		
	}

}
