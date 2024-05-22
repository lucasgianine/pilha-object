package org.example;

public class JogadorFutebol {
    private Integer id;
    private String nome;
    private String posicao;
    private String clube;
    private String nacionalidade;
    private Integer idade;
    private Double altura;
    private Double valorDeMercado;

    public JogadorFutebol() {}

    public JogadorFutebol(
            Integer id,
            String nome,
            String posicao,
            String clube,
            String nacionalidade,
            Integer idade,
            Double altura,
            Double valorDeMercado
    ) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
        this.clube = clube;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.valorDeMercado = valorDeMercado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getValorDeMercado() {
        return valorDeMercado;
    }

    public void setValorDeMercado(Double valorDeMercado) {
        this.valorDeMercado = valorDeMercado;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", clube='" + clube + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", valorDeMercado=" + valorDeMercado +
                '}';
    }
}
