
rt java.util.Scanner;

public class Desafio {
	    Scanner scan = new Scanner(System.in);
	        public static void main(String[] args) {
			        menu();
				    }

		    public static void menu() {
			            System.out.println("Bem-vindo(a) ao repositório Alessandra Ribeiro");
				        }
		        public int ler_numero(String mensagem) {
				        System.out.println(mensagem);
					        int numero = Integer.parseInt(scan.nextLine());
						        return numero;
							    }
}
