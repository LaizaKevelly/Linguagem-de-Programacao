package Morador;

import java.util.Scanner;

public class MoradorUtil {

static int QTD = 2;
    static Morador[] candidatos = new Morador[QTD];
        
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
                
                candidatos[i] = new Morador(nome, numIdade, quantidResidentes, numVotacao);
            }
        }
    
        public static void menu() {
            System.out.println("1. Listar Votos");
            System.out.println("2. Registrar Voto");
            System.out.println("3. Sair");
        }
    
        public static void registrarVotos() {
            System.out.println();
            System.out.print("Número do(a) morador(a) candidato(a): ");
            int voto = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < QTD; i++){
        
                int numeroMorador = candidatos[i].getNumVotacao();

                if (numeroMorador == voto) {
                    candidatos[i].adicionarVoto();
                    System.out.println("Voto registrado com sucesso!!!");
                }
            }
            System.out.println();

        }
    
        public static void mostrarCandidatos() {
        System.out.println();
        System.out.println("APURAÇÃO DOS VOTOS");
        for (int i = 0; i < QTD; i++){
            String cara = candidatos[i].getNome();
            int votos = candidatos[i].getVotos();
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
                mostrarCandidatos();
            break;
            case 2:
                registrarVotos(); 
            break;
            }
    
        }   while (opcao != 3);
    
    }



}

