
public class Comentarios {
	public static void main(String[] args) {
		// Olá, eu sou um comentário em uma única linha (One Line)

		/*
		 * Olá, Eu sou um comentario que posso ser mais
		 * detalhado quando necessário
		 */
		
	}
	
	/** 
	 * Estas duas estrelinhas acima
	 * é para identificar que você
	 * pretende elaborar um comentário
	 * a nível de documentação.
	 * Que incrível !!!
	 */
	public void metodo() {
		System.out.println("teste");
	}

	
// gerador de documentação do java:
//	javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java	
	
}
