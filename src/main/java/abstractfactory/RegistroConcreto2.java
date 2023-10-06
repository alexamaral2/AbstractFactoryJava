package abstractfactory;

public class RegistroConcreto2 implements ProdutoRegistro {

    @Override
    public String emitirRegistro() {
        return "Registro da Fábrica 2";
    }
}