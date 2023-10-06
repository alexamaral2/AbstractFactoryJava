package abstractfactory;

public class CertificadoConcreto1 implements ProdutoCertificado {

    @Override
    public String emitirCertificado() {
        return "Certificado da Fábrica 1";
    }
}
