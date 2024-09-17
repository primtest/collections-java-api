package main.java.list.Pesquisa;

public class Livro {
    //atributps

    private String titulo;

    private String autor;

    private int anoPublicacao;

    public Livro (String autor, String titulo, int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "anoPublicacao=" + anoPublicacao +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
