public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Carro carro1 = new Carro();

        carro1.nome = "Celta";


        pessoa1.nome = "João";
        pessoa1.idade = 30;

        carro1.apresentar();
        pessoa1.apresentar();
    }
}