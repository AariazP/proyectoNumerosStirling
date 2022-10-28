import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //el usuario ingresa un valor de n
        String n = JOptionPane.showInputDialog("Ingrese un valor de m");
        //el usuario ingresa un valor de m
        String m = JOptionPane.showInputDialog("Ingrese un valor de n");
        //se convierten los valores de n y m a enteros
        int n1 = Integer.parseInt(n);
        int m1 = Integer.parseInt(m);

        if(n1 < m1){
            JOptionPane.showMessageDialog(null, "El valor de n debe ser menor que el valor de m");
        }else{
            JOptionPane.showMessageDialog(null,"El valor del numero de stirling con los numeros ("+n1+","+m1+") es: "+stirling(n1,m1));
        }

    }

    /**
     * Metodo que recibe dos números y calcula su combinación
     * @param n numero de elementos
     * @param k numero de elementos a escoger
     * @return número de combinaciones
     */

    public static int combinaciones(int n, int k) {
        int resultado = 0;
        if(n<k) {
            return -1;
        }
        if (k == 0 || k == n) {
            resultado = 1;
        } else {
            resultado = combinaciones(n - 1, k - 1) + combinaciones(n - 1, k);
        }
        return resultado;
    }


    /**
     * Metodo que recibe un entero y calcula su factorial de forma recursiva
     * @param n numero entero
     * @return factorial del numero
     */

    public static double factorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Metodo que calcula los numeros de stirling de forma recursiva
     */

    public static double stirling(int n, int k) {
        double resultado = 0;
        if (n == 0 && k == 0) {
            resultado = 1;
        } else if (n == 0) {
            resultado = 0;
        } else if (k == 0) {
            resultado = 0;
        } else {
            resultado = stirling(n - 1, k - 1) + k * stirling(n - 1, k);
        }
        return resultado;
    }

}