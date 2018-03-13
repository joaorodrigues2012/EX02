package Test;


import static org.junit.Assert.assertEquals;
import pacote.Pais;
import org.junit.Before;
import org.junit.Test;




public class TestPais {
	Pais pais, copia;
	 int id = 0;

	

@Before
public void setUp() throws Exception {
	System.out.println("setup");
	pais = new Pais(id, "Argentina", (long)987654751, 1884567590 );
	copia = new Pais(id, "Canada", (long)464641641, 465464416 );
	System.out.println(pais);
	System.out.println(copia);
	System.out.println(id);
}
@Test
public void test00Carregar() {
	System.out.println("carregar");
	//para funcionar o pais 1 deve ter sido carregado no banco por fora
	Pais fixture = new Pais(1, "Uruguai", 987654321, 1234567890 );
	Pais novo = new Pais(1, null, -1, -1);
	novo.carregar();
	assertEquals("testa inclusao", novo, fixture);
}
@Test
public void test01Criar() {
	System.out.println("criar");
	pais.criar();
	id = pais.getId();
	System.out.println(id);
	copia.setId(id);
	
}

@Test
public void test02Atualizar() {
	System.out.println("atualizar");
	pais.setArea(999999454);
	copia.setArea(99999948);		
	pais.atualizar();
	pais.carregar();

}

@Test
public void test03Excluir() {
	System.out.println("excluir");
	copia.setId(-1);
	copia.setNome(null);
	copia.setArea(-1);
	copia.setPopulacao(-1);
	pais.excluir();
	pais.carregar();
	assertEquals("testa exclusao", pais, copia);
}
@Test
public void test04MaiorPopulacao() {
System.out.println("maiorpopulacao");
pais.maiorPopulacao();
}
@Test
public void test05vetorTresPaises() {
System.out.println("vetorTresPaises");
pais.vetorTresPaises();
}
@Test
public void test06menorArea() {
System.out.println("menorArea");
 pais.menorArea();


 
}

}