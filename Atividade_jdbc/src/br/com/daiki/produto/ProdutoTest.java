package br.com.daiki.produto;

/**
 * @author Daniel
 */

public class ProdutoTest {

    private IProdutoDAO produtoDAO;

    @Test
    public void cadastrarTest() throws Exception {

        Produto produto = new Produto();
        produto.getCodigo("101");
        produto.setNome("Xbox 360");
        produto.getPreco("49,00");
        Integer countCad = produtoDAO.cadastrarProduto(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = ProdutoDAO.buscar("101");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(),produtoBD.getCodigo());
        assertEquals(produto.getNome(), produto.getNome());

        Integer countDel = produtoDAO.excluirProduto(produtoBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void buscarTest() throws
}
