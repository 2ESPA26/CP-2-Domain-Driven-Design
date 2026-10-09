package Inventario;

public class Produto {
    private int num_item;
    private String nome;
    private int qtd;
    private float preco;
    private boolean Ativo = true;

    public Produto(){
    }
    public Produto(int num_item, String nome, int qtd, float preco){
        this.num_item = num_item;
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;

    }
    public int getItem(){
        return num_item;
    }
    public String getNome(){
        return nome;
    }
    public int getQtd(){
        return qtd;
    }
    public float getPreco(){
        return preco;
    }
    public boolean getAtivo(){
        return Ativo;
    }
    public void setItem(int num_item){
        this.num_item = num_item;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public void setAtivo(boolean Ativo){
        this.Ativo = Ativo;
    }
    public String getStatus() {
        if (Ativo) {
            return "Ativo";
        } else {
            return "Descontinuado";
        }
    }
    @Override
    public String toString(){
        return "Nome do produto: " + nome
                + "\nNúmero do produto: " + num_item
                + "\nQuantidade disponível: " + qtd
                + "\nPreço do produto: " + preco
                + "\nStatus do Produto: " + getStatus()
                + "\nValor do estoque:" + valorEstoque();
    }
    public float valorEstoque() {
        return preco * qtd;
    }
}
