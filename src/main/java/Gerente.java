/**
 * Created by carolws on 11/06/17.
 */
public class Gerente extends Funcionario {
    public Gerente(String nome, String email, double salarioBase) throws Exception {
        super(nome,email,salarioBase);
    }

    public double getSalarioLiquido() {
        if (getSalarioBase() >= 5000){
            return getSalarioBase() * 0.7;
        }
        else{
            return getSalarioBase() * 0.8;
        }
    }
}
