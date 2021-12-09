public class FabricaForma implements FabricaAbstrata{

    @Override
    public Forma construirForma(String forma){

        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName(forma);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Forma inexistente.");
        }
        if (!(objeto instanceof Forma)) {
            throw new IllegalArgumentException("Forma inválida.");
        }
        return (Forma) objeto;
    }

    @Override
    public Cor construirCor(String color) {
        return null;
    }


}
