package tareaprograiipoo;

import java.util.Scanner;

public class TareaPrograIIPOOPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       Calculadora calculadora = new Calculadora("JP");
       CalculadoraEspecial CalculadoraEspecial = new CalculadoraEspecial ("YAGG");
       
       boolean salir = false;
       int opcion; 
       int opcion2; 
       
       do{
           System.out.println("");
           System.out.println("=======================");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Raiz Cuadrada");
           System.out.println("6. Verificar numero Primo");
           System.out.println("=======================");
           System.out.println("7. Calculadora Especial");
           System.out.println("=======================");
           System.out.println("8. Salir");
           System.out.println("Selecciona una opcion");
           System.out.println("=======================");
           opcion = sn.nextInt();
            switch(opcion){
                case 1:
                   System.out.println("El resultado de la suma es = " + calculadora.sumar(10, 5));
                   break;
                case 2:
                   System.out.println("El resultado de la resta es = " +calculadora.restar(10, 5));
                   break;
                case 3:
                   System.out.println("El resultado de la multiplicacion es = " +calculadora.multiplicar(10, 5));
                   break;
                case 4:
                    System.out.println("El resultado de la division es = " +calculadora.dividir(10, 5));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " +calculadora.raizCuadrada(16));
                    break;
                case 6:
                    System.out.println("Es primo? = " +calculadora.esPrimo(11));
                    break;
                case 7:
                    System.out.println("");
                    System.out.println("=======================");
                    System.out.println("Calculadora Especial");
                    System.out.println("=======================");
                    System.out.println("Selecciona una opcion");
                    System.out.println("=======================");
                    System.out.println("1. Factorial");
                    System.out.println("2. Radio");
                    System.out.println("3. Par o Impar");
                    System.out.println("4. Hopotenusa");
                    System.out.println("5. Raiz Cubica");
                    System.out.println("6.Potencias");
                    System.out.println("7. Salir");
                    System.out.println("=======================");
                    opcion2 = sn.nextInt();
                    
                    switch(opcion2){
                        
                    case 1:
                    System.out.println(CalculadoraEspecial.calcularFactorial(5));
                    break;
                    
                    case 2:
                    System.out.println(CalculadoraEspecial.calcularRadio(5));
                    break;
                    
                     case 3:
                     System.out.println ( CalculadoraEspecial.calcularHipotenusa(5,5));
                   break;
                 
                   case 4:
                   System.out.println( CalculadoraEspecial.calcularSeno(45));
                   break;
                   
                             
                    case 5:
                   System.out.println ( CalculadoraEspecial.calcularRaizCubica(81));
                   break;
                   
                    case 6:
                   System.out.println ( CalculadoraEspecial.calcularPotencia(2,3));
                   break;
                   
                   case 7:
                   salir=true;
                   break;
                   
                   
                    }
                    
                case 8:
                    salir=true;
                   break;
                    
                   
                default:
                   System.out.println("Solo números entre 1 y 7");
            }
       }
        while(!salir);   
        
    }
}
//1
