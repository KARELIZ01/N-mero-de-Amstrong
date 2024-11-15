package numero_amstrong;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


 class AppTest {

    @Test
    public void testNumeroArmstrongPositivos() {
        assertEquals(true, App.esNumeroArmstrong(371));
        assertEquals(true, App.esNumeroArmstrong(1634));
    }

    @Test
    public void testNumeroArmstrongNegativos() {
        assertEquals(false, App.esNumeroArmstrong(351));
        assertEquals(false, App.esNumeroArmstrong(2015));
    }
}
