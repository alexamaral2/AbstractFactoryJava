package abstractfactory;
public class RegistroConcreto1 implements ProdutoRegistro {

    @Override
    public String emitirRegistro() {
        return "Registro da Fábrica 1";
    }
}