package carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public  CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }

        itemList.removeAll(itensParaRemover);

     }

     public double calcularValorTotal(){
        double total = 0;

        for (Item i : itemList){
            total += i.getPreco() * i.getQuantidade();
        }


        return total;

     }

     public void exibirItems(){

        for (Item item : itemList){
            System.out.println("Nome: " + item.getNome());
            System.out.println("Preço: R$" + item.getPreco());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("---------------");
        }



     }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Celular", 300.99, 2);
        carrinho.adicionarItem("Tablet", 500.99, 1);
        carrinho.adicionarItem("PC", 3000.99, 2);

        carrinho.exibirItems();
        System.out.println("-----------------------------------");
        System.out.println("--------------Novo sout-------------");
        System.out.println("-----------------------------------");
        carrinho.removerItem("Celular");
        carrinho.exibirItems();

        System.out.println("O valor total é : " + carrinho.calcularValorTotal());

    }

}
