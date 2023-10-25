/**
 *
 * @author Dimas
 */
public class Cliente {
    private String cpf;
    private String nome;
    private double limCred;
    private double limCredDisp;

    public Cliente(String c, String n, double lc) {
        cpf = c;
        nome = n;
        limCred = lc;
        limCredDisp = limCred;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getLimCred() {
        return limCred;
    }

    public double getLimCredDisp() {
        return limCredDisp;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLimCred(double limCred) {
        this.limCred = limCred;
    }
}
