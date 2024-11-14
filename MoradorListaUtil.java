import java.util.ArrayList;  // importação da bilbioteca
import java.util.List;  // importação da bilbioteca
import java.util.Scanner;

public class MoradorListaUtil {

static final int QTD = 4;

    static List<Morador> candidatos = new ArrayList<Morador>(); //  <------------------------------
        
    static Scanner scanner = new Scanner(System.in);
        
        public static void lerDadosCAndidatos() {
            for (int i = 0; i < QTD; i++) {
                System.out.println("Candidato " + (i + 1));
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Idade: ");
                int numIdade = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Numero de residentes: ");
                int quantidResidentes = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Numero para votação: ");
                int numVotacao = scanner.nextInt();
                scanner.nextLine();

                System.out.println();

                Morador m = new Morador(nome, numIdade, quantidResidentes, numVotacao); //  <------------------------------ Cria objeto da classe Morador
                candidatos.add(m); //  <------------------------------ Armazena no Array 

            }
        }
    
        public static void menu() {
            System.out.println("OPERAÇÕES ");
            System.out.println("1 - Listar Candidatos Solitários");
            System.out.println("2 - Listar Candidatos Não Solitários");
            System.out.println("3 - Listar Votos Recebidos");
            System.out.println("4 - Registrar Voto");
            System.out.println("5 - Encerrar Programa");
        }

        public static void candidatosSolitarios() {
            System.out.println("");
            System.out.println("CANDIDATOS SOLITÁRIOS");
            for (int i = 0; i < QTD; i++){
                String cara = candidatos.get(i).getNome();  // <------------------------------ .get(i)
                int residentes = candidatos.get(i).getQuantidResidentes(); // <------------------------------ .get(i)
                if (residentes == 1) {
                    System.out.println("Candidato(a) [" + cara + "] com " + residentes + " residentes"); 
                }
            }
            System.out.println("");
        }
        
        public static void candidatosNaoSolitarios() {
            System.out.println("");
            System.out.println("CANDIDATOS NÃO SOLITÁRIOS");
            for (int i = 0; i < QTD; i++){
                String cara = candidatos.get(i).getNome();  // <------------------------------ .get(i)
                int residentes = candidatos.get(i).getQuantidResidentes(); // <------------------------------ .get(i)
                if (residentes >= 2) {
                    System.out.println("Candidato(a) [" + cara + "] com " + residentes + " residentes"); 
                }
            }
            System.out.println("");
        }

    
        public static void registrarVotos() {
            System.out.println();
            System.out.print("Número do(a) morador(a) candidato(a): ");
            int voto = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < QTD; i++){
        
                int numeroMorador = candidatos.get(i).getNumVotacao(); // <------------------------------ .get(i)

                if (numeroMorador == voto) {
                    candidatos.get(i).adicionarVoto();
                    System.out.println("Voto registrado com sucesso!!!"); // <------------------------------ .get(i)
                }
            }
            System.out.println();

        }
    
        public static void mostrarCandidatos() {
        System.out.println();
        System.out.println("APURAÇÃO DOS VOTOS");
        for (int i = 0; i < QTD; i++){

            String cara = candidatos.get(i).getNome();  // <------------------------------ .get(i)
            //Morador morador = candidatos.get(i);  // Método alternativo
            //String cara = morador.getNome(); 

            int votos = candidatos.get(i).getVotos();  // <------------------------------ .get(i)
            System.out.println("Candidato(a) [" + cara + "] com " + votos + " votos"); 
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {

        lerDadosCAndidatos();

        int opcao = 0;
        do {
            menu();
            System.out.print("Selecione uma opçao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
            case 1:
                candidatosSolitarios();
            break;
            case 2:
                candidatosNaoSolitarios();
            break;
            case 3: 
                mostrarCandidatos();
            break;
            case 4:
                registrarVotos(); 
            break;
            default:
            System.out.println("Saindo...");
            opcao = 5;
            }
    
        }   while (opcao != 5);
    
    }



}

