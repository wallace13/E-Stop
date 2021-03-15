import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.PessoaJuridica;

public class TestePessoaJuridica
{
    PessoaJuridica[] arrayPessoasJuridicas;;
    PessoaJuridica pessoaJuridica;

    @Before
    public void instancia()
    {
        arrayPessoasJuridicas = new PessoaJuridica[1];
        pessoaJuridica = new PessoaJuridica();
    }

    @Test
    public void cadastra()
    {
        pessoaJuridica.setRazaoSocial("J�lio Augusto LTDA.");
        pessoaJuridica.setCnpj("44.404.123/3339-43");
        
        inserir(pessoaJuridica);
        
        assertEquals("J�lio Augusto LTDA." , arrayPessoasJuridicas[0].getRazaoSocial());
    }

    @Test
    public void alteraNome()
    {
        cadastra();
        
        assertEquals("J�lio Augusto LTDA." , arrayPessoasJuridicas[0].getRazaoSocial());
        
        arrayPessoasJuridicas[0].setRazaoSocial("J�lio Agostino LTDA.");
        
        assertEquals("J�lio Agostino LTDA." , arrayPessoasJuridicas[0].getRazaoSocial());
    }
    
    public void inserir(PessoaJuridica pessoaJuridica)
    {
        arrayPessoasJuridicas[0] = pessoaJuridica;
    }
}