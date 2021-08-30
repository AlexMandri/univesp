package pensamentoComputacional;

import java.util.Locale;
import java.util.Scanner;

public class Program_Imc {

	public static void main(String[] args) {
		double peso;
		double altura;
		double imc;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe a sua altura: ");
		altura = sc.nextDouble();
		System.out.println("informe a seu peso: ");
		peso = sc.nextDouble();
		imc = peso/(altura * altura);
		if(imc>40) {
			System.out.println("Obesidade grave grau III");
		}else if(imc>29.9) {
			System.out.println("Obesidade grave grau II");
		}else if(imc>24.9) {
			System.out.println("Sobre peso grau I");
		}else if(imc >18.4) {
			System.out.println("Normal grau 0");
		}else {
			System.out.println("Magreza");
		}

		sc.close();
	}

}
