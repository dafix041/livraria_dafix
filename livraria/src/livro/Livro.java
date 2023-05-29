package livro;

import java.io.Serializable;

public abstract class Livro implements Serializable {

    protected String titulo, autor, genero;
    protected int anoLancamento, codigoLivro, estoqueLivro;
    protected boolean emprestado;

    public Livro(String titulo, String autor, String genero, int anoLancamento, int codigoLivro, int estoqueLivro,
            boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.codigoLivro = codigoLivro;
        this.estoqueLivro = estoqueLivro;
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public int getEstoqueLivro() {
        return estoqueLivro;
    }

    public void setEstoqueLivro(int estoqueLivro) {
        this.estoqueLivro = estoqueLivro;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", anoLancamento="
                + anoLancamento + ", codigoLivro=" + codigoLivro + ", estoqueLivro=" + estoqueLivro + ", emprestado="
                + emprestado + "]";
    }

}
