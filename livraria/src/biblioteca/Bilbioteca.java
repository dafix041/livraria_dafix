package biblioteca;

import java.io.Serializable;
import java.util.List;

import livro.Livro;

public class Bilbioteca implements Serializable {
    protected List<Livro> livros;

    public Bilbioteca(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);

    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);

    }

    public Livro pesquisarLivro(int codigoLivro) {

        for (Livro livro : livros) {

            if (livro.getCodigoLivro() == codigoLivro) {
                return livro;
            }

        }

        return null;

    }

    public Livro pesquisarPorAutor(String autor) {

        for (Livro livro : livros) {
            if (livro.getAutor() == autor) {
                return livro;
            }
        }
        return null;

    }



    public Livro pesquisarPorTitulo(String titulo) {

        for (Livro livro : livros) {
            if (livro.getTitulo() == titulo) {
                return livro;
            }
        }
        return null;

    }

    public Livro pesquisarPorGenero(String genero) {

        for (Livro livro : livros) {
            if (livro.getGenero() == genero) {
                return livro;
            }
        }
        return null;

    }

    public int exibirEstoque(int estoqueLivro){
        Livro livro = pesquisarLivro(estoqueLivro);
        if(estoqueLivro>0){
            return estoqueLivro;
        }
        

        return 0;
    }

}
