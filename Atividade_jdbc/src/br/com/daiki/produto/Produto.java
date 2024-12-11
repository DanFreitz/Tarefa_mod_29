package br.com.daiki.produto;

/**
 * @author Daniel
 *
 */

public class Produto {

    private Long codigo;

    private String nome;

    private double preco;

    public Long getCodigo(String number) {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco(String s) {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
