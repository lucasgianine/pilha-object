package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();

        Scanner leitorNum = new Scanner(System.in);
        Scanner leitorTxt = new Scanner(System.in);

        System.out.println("Bem-Vindo ao Football Manager!!!");
        System.out.println("O melhor lugar para gerenciar os seus jogadores!\n");

        int opcao;
        boolean sair = false;
        do {
            System.out.println("""
                    Escolha a opção desejada: (Digite o nº da opção)
                    1 - Registrar jogador
                    2 - Deletar jogador
                    3 - Exibir jogadores
                    4 - Desfazer última adição
                    5 - Sair
                    """);
            opcao = leitorNum.nextInt();

            switch (opcao){
                case 1:
                    JogadorFutebol novoJogador = new JogadorFutebol();
                    novoJogador.setId(100 + repositorio.getTamanho());

                    System.out.println("Digite o nome do jogador:");
                    novoJogador.setNome(leitorTxt.nextLine());

                    System.out.println("Digite a posição:");
                    novoJogador.setPosicao(leitorTxt.nextLine());

                    System.out.println("Digite o clube atual:");
                    novoJogador.setClube(leitorTxt.nextLine());

                    System.out.println("Digite a nacionalidade:");
                    novoJogador.setNacionalidade(leitorTxt.nextLine());

                    System.out.println("Digite a idade:");
                    novoJogador.setIdade(leitorNum.nextInt());

                    System.out.println("Digite a altura (em metros):");
                    novoJogador.setAltura(leitorNum.nextDouble());

                    System.out.println("Digite o valor de mercado (em milhões de euros):");
                    novoJogador.setValorDeMercado(leitorNum.nextDouble());

                    repositorio.salvar(novoJogador);
                    break;

                case 2:
                    System.out.println("Digite o ID do jogador que deseja deletar:");
                    repositorio.deletar(leitorNum.nextInt());
                    break;

                case 3:
                    repositorio.exibir();
                    break;

                case 4:
                    repositorio.desfazer();
                    break;

                case 5:
                    sair = true;
                    System.out.println("Saindo do sistema...\nObrigado por utilizar...\nAté a próxima... ;)");
                    break;

                default:
                    System.out.println("Opção inválida! Digite uma das opções disponíveis.");
                    break;
            }

        } while (!sair);

        leitorNum.close();
        leitorTxt.close();
    }
}
