import java.util.Scanner;

public class Program {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

			
		System.out.println("Digite o primeiro numero:");
		float numero1 = sc.nextFloat();
				
		System.out.println("Digite o segundo numero:");
		float numero2 = sc.nextFloat();
		
		System.out.println("Digite a operação desejada: \n"
				+ "1 - Adição \n"
				+ "2 - Subtração \n"
				+ "3 - Multiplicação \n"
				+ "4 - Divisão");

		
		int operacao = sc.nextInt();
		float result = 0;
		
		switch (operacao) {
        case 1:
            result = calculator.adicao(numero1, numero2);
            break;
        case 2:
            result = calculator.substracao(numero1, numero2);
            break;
        case 3:
            result = calculator.mult(numero1, numero2);
            break;
        case 4:
            result = calculator.divisao(numero1, numero2);
            break;
        default:
            System.out.println("Operação inválida");
            sc.close();
            return;
    }
		
		System.out.printf("%.2f%n", result);

		
		sc.close();
	}

}
