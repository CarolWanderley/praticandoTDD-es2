/**
 * Created by carolws on 11/06/17.
 */
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, String email, double salarioBase) throws Exception {
        super(nome, email, salarioBase);
    }

    public double getSalarioLiquido() {
            if (getSalarioBase() >= 3000){
                return getSalarioBase() * 0.8;
            }
            else{
                return getSalarioBase() * 0.9;
            }
    }
}
