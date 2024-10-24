public class Carro {
    String marca;
    String modelo;
    String cor;

    public Carro(String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public void imprimir(){
        System.out.println("A marca é: "+marca);
    }
}
