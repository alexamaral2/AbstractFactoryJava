package abstractfactory;

public class FabricaConcreta2 implements FabricaAbstrata {

    @Override
    public ProdutoCertificado createProdutoCertificado() {
        return new CertificadoConcreto2();
    }

    @Override
    public ProdutoRegistro createProdutoRegistro() {
        return new RegistroConcreto2();
    }
}
