package Streams;

public class Produto {
    
    private String nome;
    private double preco;
    private double desconto;
    private double valorFrete;


    public Produto(String nome, double preco, double desconto, double valorFrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
    }

    public String getNome() {
        return this.nome;
    }


    public double getPreco() {
        return this.preco;
    }


    public double getDesconto() {
        return this.desconto;
    }


    public double getValorFrete() {
        return this.valorFrete;
    }



}
