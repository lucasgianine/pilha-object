package org.example;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<JogadorFutebol> lista;
    private PilhaObj<Integer> pilha;

    public Repositorio() {
        this.lista = new ArrayList<>();
        this.pilha = new PilhaObj<>(10);
    }

    public void salvar(JogadorFutebol jogador){
        lista.add(jogador);
        pilha.push(jogador.getId());
        System.out.println("\nJogador adicionado com sucesso!\n");
    }

    public void deletar(Integer id){
        Boolean idExiste = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(id)){
                lista.remove(i);
                idExiste = true;
            }
        }
        System.out.println(idExiste ? "O jogador foi apagado com sucesso!" : "ID não encontrado!");
    }

    public void exibir(){
        if (lista.isEmpty()){
            System.out.println("Repositório vazio");
        } else {
            System.out.println("""
                    +---------------------------------------------+
                              Exibindo Pilha de Jogadores
                    +---------------------------------------------+
                    """);
            for (JogadorFutebol jogador : lista) {
                System.out.println(jogador);
            }
            pilha.exibe();
        }
    }

    public void desfazer(){
        if (pilha.isEmpty()) {
            System.out.println("Pilha vazia, não há nada a desfazer.");
        } else {
            deletar(pilha.pop());
            System.out.println("Salvamento desfeito com sucesso.");
        }
    }

    public Integer getTamanho(){
        return lista.size();
    }
}
