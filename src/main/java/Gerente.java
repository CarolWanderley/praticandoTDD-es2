/**
 * Created by carolws on 11/06/17.
 */
public class Gerente extends Funcionario {
    public Gerente(String nome, String email, double salarioBase) throws Exception {
        super(nome,email,salarioBase);
    }

    public double getSalarioLiquido() {
        return 0;
    }
}
