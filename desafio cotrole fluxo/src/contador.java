import java.util.Scanner;
public class contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois){
		throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
        for (int contando = 1; contando <= contagem ; contando++){
            System.out.println("Imprimindo o número " + contando);
        }
		
	}
}