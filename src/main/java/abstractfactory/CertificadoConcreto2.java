package abstractfactory;

public class CertificadoConcreto2 implements ProdutoCertificado {

    @Override
    public String emitirCertificado() {
        return "Certificado da Fábrica 2";
    }
}
