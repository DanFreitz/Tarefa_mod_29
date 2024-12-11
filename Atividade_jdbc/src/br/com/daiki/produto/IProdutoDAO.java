package br.com.daiki.produto;

import java.util.List;

/**
 * @author Daniel
 *
 */

public interface IProdutoDAO {

    public Integer cadastrarProduto(Produto produto) throws Exception;

    public Integer alterarProduto(Produto produto) throws Exception;

    public Integer buscarProduto(String codigo) throws Exception;

    public List<Produto> buscarTodosProdutos() throws Exception;

    public Integer excluirProduto(Produto produto) throws Exception;
}
