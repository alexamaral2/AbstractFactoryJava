package abstractfactory;

public class FabricaConcreta1 implements FabricaAbstrata {

    @Override
    public ProdutoCertificado createProdutoCertificado() {
        return new CertificadoConcreto1();
    }

    @Override
    public ProdutoRegistro createProdutoRegistro() {
        return new RegistroConcreto1();
    }
}