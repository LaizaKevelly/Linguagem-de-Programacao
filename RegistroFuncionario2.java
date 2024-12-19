import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Leitura de caracteres a partir de arquivo
public class RegistroFuncionario2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int op;
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		
		do {
			System.out.println("********* OPERAÇÕES *********");
			System.out.println("* 1 - CADASTRAR FUNCIONÁRIO *");
			System.out.println("* 2 - GRAVAR FUNCIONÁRIOS   *");
			System.out.println("* 3 - ENCERRAR              *");
			System.out.println("*****************************");

			System.out.println();
			System.out.print("Digite Operação (1-3): ");
			op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Cadastrando novo funcionário---------------------------");

                        System.out.println("Dados de Funcionário");
                        System.out.print("Nome...: ");
                        String nome = scanner.next();
                        scanner.nextLine();
                        System.out.print("Salário: ");
                        double salario = scanner.nextDouble();

                        Funcionario func = new Funcionario(nome, salario);
				
				        lista.add(func);


                    System.out.println("");
                    
                    break;
                case 2:
                        for (int i = 0; i < lista.size(); i++) {
                            func = lista.get(i);    
                            try {
                                // abertura de fluxo de saída de arquivo
                                FileWriter fluxoArquivo = new FileWriter("funcionario.txt", true);
                                
                                // escrita de dados fornecidos de funcionário em arquivo
                                fluxoArquivo.write(func.getNome() + '|' + func.getSalario() + System.lineSeparator());
                                
                                
                                System.out.println("Gravação de dados em arquivo concluída!");
                                fluxoArquivo.close();			// fechamento de fluxo
                            }
                            // captura de exceção
                            catch (IOException e) {
                                e.printStackTrace();
                            }
                            
                            
                        }
                        break;
                case 3:
                System.out.println("Encerrando :c");
                    break;
            }
		} while (op != 3);
		
		scanner.close();
	}

}