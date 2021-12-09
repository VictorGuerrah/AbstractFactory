public class FabricaCor implements FabricaAbstrata {
    @Override
    public Forma construirForma(String forma){
        return null;
    }

    @Override
    public Cor construirCor(String cor) {

        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName(cor);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Cor inexistente.");
        }
        if (!(objeto instanceof Cor)) {
            throw new IllegalArgumentException("Cor inválida.");
        }
        return (Cor) objeto;
    }
}
