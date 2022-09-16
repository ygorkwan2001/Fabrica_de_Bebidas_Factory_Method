public class Distribuidora implements Fabrica {

    @Override
    public Cerveja criaBebida() {
        System.out.println("(Bebida Alcoolica Criada)");
        return new SaidaCerveja();
    }

    @Override
    public Refrigerante criarRefri() {
        System.out.println("(Refrigerante Criado)");
        return new SaidaRefri();
    }
}
