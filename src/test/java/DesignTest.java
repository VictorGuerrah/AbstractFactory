import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignTest {

    @Test
    void deveConstruirCor() {
        FabricaAbstrata fabrica = new FabricaCor();
        Design design = new Design(fabrica);
        assertEquals("Azul construído.", design.imprimirCor());
    }

    @Test
    void deveConstruirForma() {
        FabricaAbstrata fabrica = new FabricaForma();
        Design design = new Design(fabrica);
        assertEquals("Retângulo construído.", design.imprimirForma());
    }
}