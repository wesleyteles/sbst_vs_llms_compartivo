import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraBhaskaraTest {

    private CalculadoraBhaskara calculadora = new CalculadoraBhaskara();

    // Cenário 1: Duas raízes reais (Delta > 0)
    // Equação: x² - 5x + 6 = 0 (Raízes esperadas: 3.0 e 2.0)
    // Delta = 25 - 24 = 1
    @Test
    public void deveRetornarDuasRaizesQuandoDeltaPositivo() {
        double[] resultado = calculadora.calcularRaizes(1, -5, 6);
        
        assertEquals("Deve retornar 2 raízes", 2, resultado.length);
        // Verifica os valores (com tolerância delta para double)
        assertArrayEquals(new double[]{3.0, 2.0}, resultado, 0.001);
    }

    // Cenário 2: Uma raiz real (Delta == 0)
    // Equação: x² - 4x + 4 = 0 (Raiz esperada: 2.0)
    // Delta = 16 - 16 = 0
    @Test
    public void deveRetornarUmaRaizQuandoDeltaZero() {
        double[] resultado = calculadora.calcularRaizes(1, -4, 4);
        
        assertEquals("Deve retornar 1 raiz", 1, resultado.length);
        assertEquals("A raiz deve ser 2.0", 2.0, resultado, 0.001);
    }

    // Cenário 3: Nenhuma raiz real (Delta < 0)
    // Equação: x² + x + 1 = 0 
    // Delta = 1 - 4 = -3
    @Test
    public void deveRetornarArrayVazioQuandoDeltaNegativo() {
        double[] resultado = calculadora.calcularRaizes(1, 1, 1);
        
        assertEquals("Deve retornar array vazio", 0, resultado.length);
    }

    // Cenário 4: Exceção (a == 0)
    @Test(expected = IllegalArgumentException.class)
    public void deveLancarExcecaoQuandoAForZero() {
        calculadora.calcularRaizes(0, 5, 2);
    }
}
