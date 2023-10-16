package pesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;


    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }


    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();

        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }

        }
        return livroPorTitulo;

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("livro 1", "autor 1", 1970);
        catalogoLivros.adicionarLivro("livro 1", "autor 2", 1980);
        catalogoLivros.adicionarLivro("livro 2", "autor 2", 1990);
        catalogoLivros.adicionarLivro("livro 3", "autor 3", 2000);
        catalogoLivros.adicionarLivro("livro 4", "autor 4", 2010);


        System.out.println(catalogoLivros.pesquisarPorAutor("autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1965, 1995));
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));

    }

}
