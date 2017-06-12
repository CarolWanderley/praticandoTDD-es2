/**
 * Created by carolws on 11/06/17.
 */
public class Testador extends Funcionario {
    public Testador(String nome, String email, double salarioBase) throws Exception {
        super(nome, email, salarioBase);
    }

    public double getSalarioLiquido() {
        return 0;
    }
}

