/**
 * Created by carolws on 11/06/17.
 */
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, String email, double salarioBase) throws Exception {
        super(nome, email, salarioBase);
    }

    public double getSalarioLiquido() {
            return 0;
    }
}
