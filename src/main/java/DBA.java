/**
 * Created by carolws on 11/06/17.
 */
public class DBA extends Funcionario {

    public DBA(String nome, String email, double salarioBase) throws Exception {
        super(nome, email, salarioBase);
    }

    public double getSalarioLiquido() {
            if (getSalarioBase() >= 2000){
                return getSalarioBase() * 0.75;
            }
            else{
                return getSalarioBase() * 0.85;
            }
    }
}
