import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.PessoaFisica;

public class TestePessoaFisica
{
    PessoaFisica[] arrayPessoasFisicas;;
    PessoaFisica pessoaFisica;

    @Before
    public void instancia()
    {
        arrayPessoasFisicas = new PessoaFisica[1];
        pessoaFisica = new PessoaFisica();
    }

    @Test
    public void cadastra()
    {
        pessoaFisica.setNome("J�lio Augusto");
        pessoaFisica.setCpf("144.138.288-39");
        
        inserir(pessoaFisica);
        
        assertEquals("J�lio Augusto" , arrayPessoasFisicas[0].getNome());
    }

    @Test
    public void alteraNome()
    {
        cadastra();
        
        assertEquals("J�lio Augusto" , arrayPessoasFisicas[0].getNome());
        
        arrayPessoasFisicas[0].setNome("J�lio Agostino");
        
        assertEquals("J�lio Agostino" , arrayPessoasFisicas[0].getNome());
    }
    
    public void inserir(PessoaFisica pessoaFisica)
    {
        arrayPessoasFisicas[0] = pessoaFisica;
    }
}