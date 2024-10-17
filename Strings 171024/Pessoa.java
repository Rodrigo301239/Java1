class Pessoa extends Registro {
    String nome;
    int idade;
    float altura;
    float peso;
    char sexo;
    String documento;

    public void apresentar(){
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos");
    }
}