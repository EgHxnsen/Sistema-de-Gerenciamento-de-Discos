public class DiscoEdicaoLimitada extends Disco {

    private String descricao;
    private int quantidadeDisponivel;

    public DiscoEdicaoLimitada(String nome, String artista, String genero, int anoLancamento, int quantidadeEstoque, double preco, String descricao, int quantidadeDisponivel){
        super(nome, artista, genero, anoLancamento, quantidadeEstoque, preco);
        this.descricao = descricao;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel){
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() +
                "\nArtista: " +
                getArtista() +
                "\nGenero: " +
                getGenero() +
                "\nAno de lançamento: "
                + getAnoLancamento() +
                "\nQuantidade em estoque: " +
                getQuantidadeEstoque() +
                "\nPreço: " +
                getPreco() +
                "\nDescrição: " +
                descricao +
                "\nQuantidade disponível: " +
                quantidadeDisponivel;
    }

    private String getPreco() {
        return null;
    }

    private String getQuantidadeEstoque() {
        return null;
    }

    private String getAnoLancamento() {
        return null;
    }

    private String getGenero() {
        return null;
    }

    private String getArtista() {
        return null;
    }
}
