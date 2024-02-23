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

      @Test
    public void testContarVocales(){
        GestorPalabras prueba1 = new GestorPalabras();
        assertEquals(4, prueba1.contarVocales("piruletat"));
    }

    
    @Test
    public void testInvertirPalabras(){
        GestorPalabras prueba2 = new GestorPalabras();
        assertEquals("pal ó", prueba2.invertirPalabra("ó lap"));
    }
}

