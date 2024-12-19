import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LeituraFuncionarios {
    public static void main(String[] args) {
		Scanner scanner = null;
		
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		
		try {
			FileReader leitor = new FileReader("funcionario.txt");
			scanner = new Scanner(leitor);
				
			while (scanner.hasNext()) {
				String linha = scanner.nextLine();
				
				StringTokenizer separador = new StringTokenizer(linha);
				
				String nome = separador.nextToken();
				double salario = Double.parseDouble(separador.nextToken());
				
				Funcionario func = new Funcionario(nome, salario);
				
				lista.add(func);
			}

            int total = 0;
            for (int i = 0; i < lista.size(); i++) {

				Funcionario func = lista.get(i);
				System.out.println(func.getNome() + " - " + func.getSalario());
                total += func.getSalario();
			}
            System.out.println("Média dos salários: " + total/lista.size());
			
			scanner.close();
            //leitor.close(); -------------------------------------------------------------------
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo inexistente");
        } catch (IOException e) {
            System.out.println("Erro de entrada/saída");
        }
	}
}
