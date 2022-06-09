public class Carro {
    //atributos
    private String marca;
    private String cor;
    private String placa;

    //metodo Construtor
    public Carro(String marca, String cor, String placa) {
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }

    //metodos especificos
    public void imprimirCarro() {
        System.out.println("a marca é: \na cor é: \na placa é: ");
    }

    //metodos de acesso
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
