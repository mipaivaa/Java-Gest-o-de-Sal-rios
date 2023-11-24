
public class EmpregadoTeste {
	// aplicativo de teste chamado EmpregadoTeste 
   
        public static void main(String[] args) {
            // Criação de dois objetos Empregado
            Empregado empregado1 = new Empregado("Michelle", "111.111.111-11", 10000.0);
            Empregado empregado2 = new Empregado("Jonathan", "222.222.222-22", 50000.0);

            // Exibição do salário anual de cada objeto
            System.out.println("Salário Anual de " + empregado1.nome + ": R$" + empregado1.salarioAnual());
            System.out.println("Salário Anual de " + empregado2.nome + ": R$" + empregado2.salarioAnual());
       
            // Acréscimo de 10% ao salário e exibição novamente do salário anual
            empregado1.aumento(10);
            empregado2.aumento(10);

            System.out.println("Após o acréscimo de 10%:");
            System.out.println("Salário Anual de " + empregado1.nome + ": R$" + empregado1.salarioAnual());
            System.out.println("Salário Anual de " + empregado2.nome + ": R$" + empregado2.salarioAnual());
        
        
        }
}
