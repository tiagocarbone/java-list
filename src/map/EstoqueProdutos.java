package map;

import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    private void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    private void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    private double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;

        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values() ){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
    return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1l, "Produto a", 10, 5.0);
        estoque.adicionarProduto(2l, "Produto b", 5, 10.0);
        estoque.adicionarProduto(5l, "Produto c", 2, 15.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
    }

}
