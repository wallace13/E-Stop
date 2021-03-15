import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import model.DAO.*;

public class TesteFuncionario
{

	@Test
	public void testeCadastro() {
		assertTrue(FuncionarioDAO.inserir("Jo�o dos Alfaces", "Jo�o da Madrugada", "123", 1) != null);
		assertEquals(FuncionarioDAO.buscarPorIdFuncionario(1).getNomeFuncionario(),"Jo�o dos Alfaces");
	}
	@Test
	public void testeAlterarNivelDePermissao() {
		assertTrue(FuncionarioDAO.atualizarNivelDePermissao(2, 1));
		assertEquals(FuncionarioDAO.buscarPorIdFuncionario(1).getNivelPermissao(),2);
	}
	@Test
	public void testeAlterarUsuarioESenha() {
		assertTrue(FuncionarioDAO.atualizarUsuarioESenha("Jo�oDaMadrugada", "12378913", 1));
		assertEquals(FuncionarioDAO.buscarPorIdFuncionario(1).getNomeUsuario(),"Jo�oDaMadrugada");
	}
}