package Model;

public class Prato extends Base{
    public String nome;
    public String cor;
    public double valor;

    @Override
    public String toString() {
        return super.toString() + "\nNome: " + this.nome + "\nCor: "+ this.cor + "\nValor: "+ this.valor + "\n";
    }
}