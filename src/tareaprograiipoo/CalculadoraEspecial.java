package tareaprograiipoo;

public class CalculadoraEspecial {
    public String tipoCalculadoraEspecial;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;

    public CalculadoraEspecial(String propietario) {
        this.tipoCalculadoraEspecial = "Calculadora Especial";
        this.dimensionPantalla = 20;
        this.numeroDeSerie = "M1Q2M3C4C5C6";
        this.color = "Negro";
        this.nombrePropietario = propietario;
    }

    public CalculadoraEspecial() {}

    public int calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            int factorial = 1;
            for (int i = 2; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public double calcularRadio(double diametro) {
        double radio = diametro / 2;
        return radio;
    }

    public double calcularSeno(double angulo) {
        double radianes = Math.toRadians(angulo);
        double seno = Math.sin(radianes);
        return seno;
    }

    public double calcularHipotenusa(double cateto1, double cateto2) {
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return hipotenusa;
    }

    public double calcularRaizCubica(double numero) {
        double raizCubica = Math.cbrt(numero);
        return raizCubica;
    }
    
    public double calcularPotencia(double base, double exponente) {
        double potencia = Math.pow(base, exponente);
        return potencia;
    }
}