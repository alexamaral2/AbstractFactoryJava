package abstractfactory;

public class Produto {

    private ProdutoCertificado produtoCertificado;
    private ProdutoRegistro produtoRegistro;

    public Produto(FabricaAbstrata fabrica) {
        this.produtoCertificado = fabrica.createProdutoCertificado();
        this.produtoRegistro = fabrica.createProdutoRegistro();
    }

    public String emitirCertificado() {
        return this.produtoCertificado.emitirCertificado();
    }

    public String emitirRegistro() {
        return this.produtoRegistro.emitirRegistro();
    }
}