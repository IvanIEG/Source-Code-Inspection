package br.calebe.ticketmachine.core;




import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Ivan
 */
public class PapelMoedaTest {
    
        @Test
    public void getValortest(){
        int valor = 40;
        int quantidade = 33;

        PapelMoeda papelMoeda = new PapelMoeda(valor, quantidade);
        assertEquals(valor, papelMoeda.getValor());
    }
	@Test
    public void setValortest(){
        int valor = 40;
        int quantidade = 33;

        PapelMoeda papelMoeda = new PapelMoeda(valor, quantidade);
        valor = 123;

        papelMoeda.setValor(valor);
        assertEquals(valor, papelMoeda.getValor());
    }
       @Test
    public void getQuantidadetest(){
        int valor = 40;
        int quantidade = 33;

        PapelMoeda papelMoeda = new PapelMoeda(valor, quantidade);
        assertEquals(quantidade, papelMoeda.getQuantidade());
    }

      @Test
    public void setQuantidade(){
        int valor = 40;
        int quantidade = 33;

        PapelMoeda papelMoeda = new PapelMoeda(valor, quantidade);
        quantidade = 123;

        papelMoeda.setQuantidade(quantidade);
        assertEquals(quantidade, papelMoeda.getQuantidade());
    }
    

            
    
}