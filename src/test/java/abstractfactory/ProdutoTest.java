package abstractfactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void testEmitirCertificado() {
        FabricaAbstrata fabrica = new FabricaConcreta1();
        Produto produto = new Produto(fabrica);

        String certificado = produto.emitirCertificado();

        assertEquals("Certificado da Fábrica 1", certificado);
    }

    @Test
    public void testEmitirRegistro() {
        FabricaAbstrata fabrica = new FabricaConcreta2();
        Produto produto = new Produto(fabrica);

        String registro = produto.emitirRegistro();

        assertEquals("Registro da Fábrica 2", registro);
    }
}

