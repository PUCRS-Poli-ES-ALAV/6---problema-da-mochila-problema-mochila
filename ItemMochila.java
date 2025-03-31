public class ItemMochila {
    private double valor;
    private double peso;  

    public ItemMochila(double valor, double peso) {
        this.peso = peso;
        this.valor = valor;
    }      
    
    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "ItemMochila: " + valor + ", " + peso;
    }
}
