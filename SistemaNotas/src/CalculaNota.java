import java.util.Scanner;

public class CalculaNota {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1,nota2,media;
		System.out.println("Nota 01: ");
		nota1 = input.nextDouble();
		System.out.println("Nota 02: ");
		nota2 = input.nextDouble();
		media = (nota1+nota2)/2;
		System.out.println(media);
		
		//Criando um critério para notas
		if(media > 5) {
			System.out.println("Aprovado!");
		}else if(media >= 4 && media <=5) {
			System.out.println("Recuperação!");
		}else{
			System.out.println("Reprovado!");
		}

		
	}
}
