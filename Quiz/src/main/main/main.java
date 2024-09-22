package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Pergunta {
    private String pergunta;
    private String[] opcoesResposta;
    private char respostaCorreta;

    public Pergunta(String pergunta, String[] opcoesResposta, char respostaCorreta) {
        this.pergunta = pergunta;
        this.opcoesResposta = opcoesResposta;
        this.respostaCorreta = respostaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String[] getOpcoesResposta() {
        return opcoesResposta;
    }

    public char getRespostaCorreta() {
        return respostaCorreta;
    }
}

class Quiz {
    private ArrayList<Pergunta> perguntas;
    private int pontuacao;

    public Quiz(ArrayList<Pergunta> perguntas) {
        this.perguntas = perguntas;
        this.pontuacao = 0;
    }

    public void iniciarQuiz() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Bem-vindo ao Quiz!");
            System.out.println("Aluno: Samuel Reges Costa");
            System.out.println("Professor: Brenno");
            System.out.println("CENTRO UNIVERSITÁRIO ALFREDO NASSER");

            for (Pergunta pergunta : perguntas) {
                System.out.println(pergunta.getPergunta());
                String[] opcoes = pergunta.getOpcoesResposta();
                for (int i = 0; i < opcoes.length; i++) {
                    System.out.println((char) ('A' + i) + ") " + opcoes[i]);
                }

                String respostaUsuario = scanner.nextLine().toUpperCase();

                if (respostaUsuario.length() == 1 && respostaUsuario.charAt(0) == pergunta.getRespostaCorreta()) {
                    System.out.println("Correto!\n");
                    pontuacao++;
                } else {
                    System.out.println("Errado. A resposta correta é: " + pergunta.getRespostaCorreta() + "\n");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Tente novamente.");
        } finally {
            scanner.close();
        }
        System.out.println("Quiz concluído!");
        System.out.println("Sua pontuação é: " + pontuacao + " de " + perguntas.size());
    }
}

public class main {
    public static void main(String[] args) {
        ArrayList<Pergunta> perguntas = new ArrayList<>();

        String[] opcoes1 = { "CPU", "GPU", "RAM", "SSD", "TECLADO" };
        String[] opcoes2 = { "Windows", "Linux", "Android", "iOS", "macOS" };
        String[] opcoes3 = { "Megabyte", "Gigabyte", "Kilobyte", "Byte", "Memória RAM" };
        String[] opcoes4 = { "Armazenar arquivos", "Executar o sistema operacional", "Renderizar gráficos e imagens",
                "Gerenciar a memória RAM", "Melhorar o FPS de jogos" };
        String[] opcoes5 = { "Fast Performance System", "Frames Per Size", "Full Pixel Screen", "First Person Shooter",
                "Frames Per Second" };
        String[] opcoes6 = { "Central Processing Unit - Responsável pelo armazenamento de arquivos",
                "Computer Personal Unit - Controla o teclado e o mouse",
                "Central Power Unit - Gerencia a energia elétrica do computador",
                "Central Processing Unit - Executa instruções e processa dados",
                "Central Processing Unit - Executa instruções para jogos" };
        String[] opcoes7 = { "Um programa que cria apresentações de slides", "Um conjunto de aplicativos de escritório",
                "Um software que gerencia recursos do computador e permite a execução de programas",
                "Um dispositivo de hardware responsável pela exibição de imagens na tela",
                "Um conjunto de notas para escritório" };
        String[] opcoes8 = { "Armazenar permanentemente todos os arquivos do sistema operacional",
                "Fornecer armazenamento de longo prazo para documentos importantes",
                "Armazenar temporariamente dados e programas em uso para acesso rápido pela CPU",
                "Controlar o funcionamento dos periféricos, como impressoras e mouses", "Melhorar o FPS" };
        String[] opcoes9 = { "Um dispositivo de entrada de dados", "Um sistema operacional para computadores pessoais",
                "Um software que permite a visualização de páginas da web na internet",
                "Um componente de hardware responsável pela saída de áudio", "Um dispositivo de saída" };
        String[] opcoes10 = { "Armazenar senhas e informações confidenciais", "Proteger contra vírus de computador",
                "Exibir anúncios na web", "Aumentar a velocidade da conexão com a internet", "Navegar pela internet" };
        String[] opcoes11 = { "Windows", "MacOS", "Linux", "Android", "iOS" };
        String[] opcoes12 = { "Universal Resource Locator", "Uniform Resource Link", "Universal Record Locator",
                "Uniform Retrieval Link", "Uniform Relative Link" };
        String[] opcoes13 = { "Editar documentos de texto", "Reproduzir músicas", "Visualizar páginas da web",
                "Editar imagens", "Fazer pesquisas" };
        String[] opcoes14 = { "Teclado", "Mouse", "Impressora", "Monitor", "CPU" };
        String[] opcoes15 = { "Windows", "iOS", "macOS", "Linux", "Android" };

        perguntas.add(new Pergunta("Qual o objeto mais importante de um computador?", opcoes1, 'A'));
        perguntas.add(new Pergunta("Qual o sistema operacional que tem um pinguim?", opcoes2, 'B'));
        perguntas.add(new Pergunta("Qual é a unidade básica de armazenamento em um computador?", opcoes3, 'D'));
        perguntas.add(
                new Pergunta("Qual é a função principal de uma placa de vídeo (GPU) em um computador?", opcoes4, 'C'));
        perguntas.add(new Pergunta("O que significa a sigla FPS?", opcoes5, 'E'));
        perguntas.add(new Pergunta("Qual é a sigla CPU em um computador e qual é sua função principal?", opcoes6, 'D'));
        perguntas.add(new Pergunta("O que é um sistema operacional?", opcoes7, 'C'));
        perguntas.add(new Pergunta("Qual é o propósito da memória RAM (Random Access Memory) em um computador?",
                opcoes8, 'C'));
        perguntas.add(new Pergunta("O que é um navegador da web?", opcoes9, 'C'));
        perguntas.add(new Pergunta("Qual é a função de um firewall em um computador?", opcoes10, 'B'));
        perguntas.add(new Pergunta("Qual é o sistema operacional mais comum em computadores pessoais?", opcoes11, 'A'));
        perguntas.add(new Pergunta("O que a sigla URL representa na internet?", opcoes12, 'A'));
        perguntas.add(new Pergunta("Qual é a função principal de um navegador da web?", opcoes13, 'C'));
        perguntas.add(new Pergunta(
                "Qual dispositivo é usado para apontar e selecionar objetos na tela de um computador?", opcoes14, 'B'));
        perguntas.add(
                new Pergunta("Qual destes é um sistema operacional de código aberto amplamente usado?", opcoes15, 'D'));

        Quiz quiz = new Quiz(perguntas);
        quiz.iniciarQuiz();
    }
}