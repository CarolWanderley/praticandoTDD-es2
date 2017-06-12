import org.junit.Assert;
import org.junit.Test;

import static sun.misc.Version.println;

/**
 * Created by carolws on 11/06/17.
 */
public class TestaCalculadoraDeSalarios {

    private String nome = "carol wanderley";
    private String email = "carolacws@gmail.com";
    private double delta = 0.0001;


    @Test
    public void testaSalarioDeDesenvolvedor() throws Exception {

        double salarioBase1 = 3000;
        double salarioBase2 = 2500;

        Funcionario desenvolvedor1 = new Desenvolvedor(nome, email, salarioBase1);
        Assert.assertEquals(salarioBase1 * 0.8, desenvolvedor1.getSalarioLiquido(), delta);

        Funcionario desenvolvedor2 = new Desenvolvedor(nome, email, salarioBase2);
        Assert.assertEquals(salarioBase2 * 0.9, desenvolvedor2.getSalarioLiquido(), delta);

        try{
            Funcionario desenvolvedor3 = new Desenvolvedor(nome, email, 0);
        }catch(Exception e){
            Assert.assertEquals("Salário deve ser maior que 0", e.getMessage());
        }

        try{
            Funcionario desenvolvedor4 = new Desenvolvedor(nome, email, -1);
        }catch(Exception e){
            Assert.assertEquals("Salário deve ser maior que 0", e.getMessage());
        }

    }

    @Test
    public void testaSalarioDeDBA() throws Exception {

        double salarioBase1 = 2000;
        double salarioBase2 = 1500;

        Funcionario dba1 = new DBA(nome, email, salarioBase1);
        Assert.assertEquals(salarioBase1 * 0.75, dba1.getSalarioLiquido(), delta);

        Funcionario dba2 = new DBA(nome, email, salarioBase2);
        Assert.assertEquals(salarioBase2 * 0.85, dba2.getSalarioLiquido(), delta);

        try{
            Funcionario dba3 = new DBA(nome, email, 0);
        }catch(Exception e){
            Assert.assertEquals("Salário deve ser maior que 0", e.getMessage());
        }

        try{
            Funcionario dba4 = new DBA(nome, email, -1);
        }catch(Exception e){
            Assert.assertEquals("Salário deve ser maior que 0", e.getMessage());
        }
    }

    @Test
    public void testaSalarioDeTestador() throws Exception {

        double salarioBase1 = 2000;
        double salarioBase2 = 1500;

        Funcionario testador1 = new Testador(nome, email, salarioBase1);
        Assert.assertEquals(salarioBase1 * 0.75, testador1.getSalarioLiquido(), delta);

        Funcionario testador2 = new Testador(nome, email, salarioBase2);
        Assert.assertEquals(salarioBase2 * 0.85, testador2.getSalarioLiquido(), delta);

        try{
            Funcionario testador3 = new Testador(nome, email, 0);
        }catch(Exception e){
            Assert.assertEquals("Salário deve ser maior que 0", e.getMessage());
        }

        try{
            Funcionario testador4 = new Testador(nome, email, -1);
        }catch(Exception e){
            Assert.assertEquals("Salário deve ser maior que 0", e.getMessage());
        }
    }

    @Test
    public void testaSalarioDeGerente() throws Exception {

        double salarioBase1 = 5000;
        double salarioBase2 = 4500;

        Funcionario gerente1 = new Gerente(nome, email, salarioBase1);
        Assert.assertEquals(salarioBase1 * 0.7, gerente1.getSalarioLiquido(), delta);

        Funcionario gerente2 = new Gerente(nome, email, salarioBase2);
        Assert.assertEquals(salarioBase2 * 0.8, gerente2.getSalarioLiquido(), delta);
        
        try{
            Funcionario gerente3 = new Gerente(nome, email, 0);
        }catch(Exception e){
            Assert.assertEquals("Salário deve ser maior que 0", e.getMessage());
        }

        try{
            Funcionario gerente4 = new Gerente(nome, email, -1);
        }catch(Exception e){
            Assert.assertEquals("Salário deve ser maior que 0", e.getMessage());
        }

    }

}
