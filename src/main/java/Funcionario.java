/**
 * Created by carolws on 11/06/17.
 */
public abstract class Funcionario {
    private String nome, email;
    private double salarioBase;

    public Funcionario(String nome, String email, double salarioBase) throws Exception {
        this.nome = nome;
        this.email = email;
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws Exception {
        if (salarioBase > 0)
            this.salarioBase = salarioBase;
        else
            throw new Exception("Salário deve ser maior que 0");
    }

    public abstract double getSalarioLiquido();

}
