public class Disco {
    private String nome;
    private String artista;
    private String genero;
    private int anoLancamento;
    private int quantidadeEstoque;
    private double preco;

    public Disco(String nome, String artista, String genero, int anoLancamento, int quantidadeEstoque, double preco) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}