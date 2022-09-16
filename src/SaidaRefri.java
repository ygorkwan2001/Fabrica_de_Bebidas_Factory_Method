public class SaidaRefri extends Refrigerante{

    @Override
    public void notaFiscal() {
        nome = "Coca-Cola";
        volume = 1;
        acucares = 21;
        System.out.println("\n[Refrigerante]" + "\nnome: "+nome + "\nvolume: "+volume+"L" +"\nacucares: "+acucares+"g" );
        super.notaFiscal();
    }
}
