public class SaidaCerveja extends Cerveja {
    @Override
    public void notaFiscal() {
        nome = "skol";
        volume = 5;
        System.out.println("\n[Cerveja]: " + "\nnome: "+ nome + "\nvolume: "+volume+"ml" );
        super.notaFiscal();
    }
}
