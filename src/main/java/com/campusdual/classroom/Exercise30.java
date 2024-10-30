package com.campusdual.classroom;


public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("No se puede dividir entre cero.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            int result = divisionWithCustomException(dividend, divisor);
            System.out.println("El resultado de la división es: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("El programa ha finalizado");

        }
        
    }
}
