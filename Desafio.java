
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
							    c static void menu() {
							            System.out.println("Bem-vindo(a) ao repositório Alessandra Ribeiro");
							            System.out.println("Escolha uma opção:\n 1 - para cadastrar seu nome\n2 - para sair\n");
							            escolha();
							        }c static int ler_numero(String mensagem) {
								        System.out.println(mensagem);
								        int numero = Integer.parseInt(scan.nextLine());
								        return numero;
								    }
			    public static String ler_texto(String mensagem) {
			            System.out.println(mensagem);
			            String texto = scan.nextLine();
			            return texto;
			        }
			}
}
