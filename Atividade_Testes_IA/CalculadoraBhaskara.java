public class CalculadoraBhaskara {

    /**
     * Calcula as raízes de uma equação de segundo grau: ax^2 + bx + c = 0
     * @return double[] contendo as raízes. Retorna array vazio se não houver raízes reais.
     * @throws IllegalArgumentException se 'a' for zero.
     */
    public double[] calcularRaizes(double a, double b, double c) {
        // Cenário de Borda 1: 'a' não pode ser zero em equação quadrática
        if (a == 0) {
            throw new IllegalArgumentException("O coeficiente 'a' não pode ser zero.");
        }

        double delta = (b * b) - (4 * a * c);

        // Cenário 2: Delta negativo (sem raízes reais)
        if (delta < 0) {
            return new double[]{};
        }

        // Cenário 3: Delta zero (uma raiz real)
        if (delta == 0) {
            double raiz = -b / (2 * a);
            return new double[]{raiz};
        }

        // Cenário 4: Delta positivo (duas raízes reais)
        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        return new double[]{raiz1, raiz2};
    }
}