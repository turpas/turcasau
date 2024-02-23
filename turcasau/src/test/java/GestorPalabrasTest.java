/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sergio Turpin
 */
public class GestorPalabrasTest {
      @Test
    public void testEsPalindromo(){
        GestorPalabras prueba = new GestorPalabras();
        assertEquals(true, prueba.esPalindromo("allí, ves sevilla"));
    }
}

