package comparacaodedata;
import java.util.Scanner;

public class ComparandoData {
	public static void main(String[] str) {
		  
		//declaração de variáveis
		String data1,data2;
		String[] dataNumerica;
		
		//criando a entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		//recebendo as datas
		System.out.println("Digite as datas no formato dd/mm/aaaa");
		System.out.println("Digite a primeira data:");
		data1 = entrada.nextLine();
		System.out.println("Digite a segunda data:");
		data2 = entrada.nextLine();
		

		//comparando as datas
		if(data1.substring(6).compareTo(data2.substring(6)) > 0) {
			//ano 1 é maior que o ano 2
			System.out.println("A data 1 é depois da data 2.");
		} else if(data1.substring(6).compareTo(data2.substring(6)) < 0) {
			//ano 2 é maior que o ano 1
			System.out.println("A data 1 é antes da data 2.");
		} else if(data1.substring(3,5).compareTo(data2.substring(3,5)) > 0) {
			//mes 1 é maior que o mes 2
			System.out.println("A data 1 é depois da data 2.");
		} else if(data1.substring(3,5).compareTo(data2.substring(3,5)) < 0) {
			//mes 2 é maior que o mes 1
			System.out.println("A data 1 é antes da data 2.");
		}else if(data1.substring(0,2).compareTo(data2.substring(0,2)) > 0) {
			//dia 1 é maior que a dia 2
			System.out.println("A data 1 é depois da data 2.");			
		}else if(data1.substring(0,2).compareTo(data2.substring(0,2)) < 0) {
			//dia 2 é maior que a dia 1
			System.out.println("A data 1 é antes da data 2.");			
		}else {
			System.out.println("As datas são iguais.");
		}
		entrada.close();
	}
}
