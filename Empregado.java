import java.util.Scanner;

public class Empregado {  // Variáveis de instância

	String nome;
	String cpf;
	double salarioMensal;
	
	// Construtor  - cria uma nova instância (objeto) da classe. 
    public Empregado(String nome, String cpf, double salarioMensal) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioMensal = salarioMensal;
    }
	
    
 // Método para calcular o salário anual
    public double salarioAnual() {
        return salarioMensal * 12;
    }   
    
    
 // Método para aplicar aumento ao salário
    public void aumento(double percentualAumento) {
    	double aumento = percentualAumento / 100.0; // Converte o percentual para um fator
    	salarioMensal += salarioMensal * aumento; // Aplica o aumento ao salário mensal
        System.out.println("Aumento aplicado com sucesso! Novo salário mensal: R$" + salarioMensal);
    }   
}
    
 
  

    
//Crie uma classe em Java chamada Empregado que inclui três partes de informações como variáveis de instância – nome (String), cpf (String) e um salário mensal (double).

//Na classe Empregado, construa dois métodos - salário anual (double) e aumento (void).

//Escreva um aplicativo de teste chamado EmpregadoTeste que cria dois objetos Empregado e exibe o salário anual de cada objeto.

//Adicione um acréscimo de 10% ao salário e, em seguida, exiba novamente o salário anual do empregado.