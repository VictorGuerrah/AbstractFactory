public class Design {

    private Forma forma;
    private Cor cor;

    public Design (FabricaAbstrata fabrica) {
        this.forma = fabrica.construirForma("Retangulo");
        this.cor = fabrica.construirCor("Azul");
    }

    public String imprimirCor() {
        return this.cor.construir();
    }

    public String imprimirForma() { return this.forma.construir(); }
}
