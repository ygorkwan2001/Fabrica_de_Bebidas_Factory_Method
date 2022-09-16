public class Main {
    public static void main(String[] args) {
        Fabrica fd = new Distribuidora();
        fd.criaBebida().notaFiscal();

        System.out.println("[--------------------------]");

        Fabrica fd1 = new Distribuidora();
        fd1.criarRefri().notaFiscal();

    }
}
