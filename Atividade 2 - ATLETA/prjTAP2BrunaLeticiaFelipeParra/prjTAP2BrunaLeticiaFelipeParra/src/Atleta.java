/**
 *
 * @author Bruna Leticia Felipe Parra
 */
public class Atleta {
    private String cpf;
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Atleta(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = 0;  
        this.altura = 0.0;  
        this.peso = 0.0;  
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCPF() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double calcIMC() {
        return peso / (altura * altura);
    }
}