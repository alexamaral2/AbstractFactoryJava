package abstractfactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FabricaAbstrataTest {

    @Test
    public void testFabricaConcreta1() {
        FabricaAbstrata fabrica = new FabricaConcreta1();

        ProdutoCertificado certificado = fabrica.createProdutoCertificado();
        ProdutoRegistro registro = fabrica.createProdutoRegistro();

        assertNotNull(certificado);
        assertNotNull(registro);

        assertEquals("Certificado da Fábrica 1", certificado.emitirCertificado());
        assertEquals("Registro da Fábrica 1", registro.emitirRegistro());
    }

    @Test
    public void testFabricaConcreta2() {
        FabricaAbstrata fabrica = new FabricaConcreta2();

        ProdutoCertificado certificado = fabrica.createProdutoCertificado();
        ProdutoRegistro registro = fabrica.createProdutoRegistro();

        assertNotNull(certificado);
        assertNotNull(registro);

        assertEquals("Certificado da Fábrica 2", certificado.emitirCertificado());
        assertEquals("Registro da Fábrica 2", registro.emitirRegistro());
    }
}
