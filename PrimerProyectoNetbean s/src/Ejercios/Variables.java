/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercios;

import java.util.Scanner;

/**
 *
 * @author Usuario 01
 */
public class Variables {

    public static void main(String[] args) {
//            1)Probar realizar las operaciones que se citan a continuación en el IDE Netbeans, registrar
//los errores obtenidos y responder a las preguntas citadas.
//a. Declarar una variable de tipo entero, otra de tipo double y otra de tipo String.
//b. Asignar un valor a la variable de tipo entero y asignar esta última a la variable de tipo
//double. ¿Existe un error? ¿Se puede hacer esta operación?
//c. Asignar un valor a la variable de tipo double y asignar esta última a la variable de tipo
//entero. ¿Existe un error? ¿Se puede hacer esta operación?SE CAST CONVIERTE EN EL TIPO DE DATO DECLARADO
//d. Asignar el valor 35 a la variable de tipo String. ¿Existe un error? ¿Se puede hacer esta
//operación?
//e. Si quiero almacenar el número 48 en la variable String. ¿Cómo debo realizar la
//asignación? LE COLOCO COMILLAS
//
        int entero = (int) 1.9;
        double doble = 2;
        String palabra = "5";
//2) Realizar un programa que permita el intercambio de valores entre dos variables. Por ejemplo:
//Si una variable numero vale 35, y una variable numero2 vale 20, realizar las acciones
//necesarias para que numero pase a valer 20 y numero2 pase a valer 35. Una vez realizado el
//cambio mostrar el resultado por pantalla.
//        int num1 = 35;
//        int num2 = 20;
//        int copiaNum1 = 35;
//
//        num1 = num2;
//        num2 = copiaNum1;
//        System.out.println("el numero 1 es " + num1 + " Y el numero 2 es " + num2);

//Desarrollo Web Full Stack con Java – Ing. Luisina de Paula
//
//Ejercicio No 2: Condicionales
//Resolver los siguientes ejercicios con estructuras selectivas. Intentar ejecutarlos y probarlos con
//datos de prueba.
//1) Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los
//mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
//a) Los repositores cobran $15.890 + un bono de 10%.
//b) Los cajeros cobran $25.630,89 fijos.
//c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
//Se necesita una aplicación que, dependiendo el tipo de empleado del que se trate, calcule y
//muestre en pantalla el correspondiente sueldo.
//2) Una mercería vende canutillos y mostacillas al por mayor mediante su página web. Como se
//trata de una mercería mayorista, solicita la cantidad de paquetes en cada venta y dependiendo
//de esta realiza los siguientes controles:
//a) Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando que no se
//permiten compras inferiores a 5 productos.
//b) Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: Se debe emitir un
//mensaje que el costo de envío es de $200.
//c) Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: Se debe emitir un mensaje
//de que el envío es gratuito.
//Realizar el programa necesario para llevar a cabo los 3 controles citados.
//
//3) Un instituto de inglés desea informar a sus alumnos los días y horarios de sus clases. Para
//ello, decidió la creación de una aplicación que, a partir del ingreso de la edad del alumno, le
//informe en qué días y horarios los alumnos tienen clases. Como información, la academia
//proporciona los siguientes datos respecto a los grupos y los diferentes horarios.
//a) Kinder (de 4 a 6 años inclusive): Lunes y Miércoles de 16 a 17
//b) 1st year (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30
//c) 2nd year (de 9 a 10 años inclusive): Martes y Jueves de 17:30 a 19
//d) 3rd year (de 11 a 13 años inclusive): Lunes y Miércoles de 17 a 18:30
//Realizar el programa solicitado por el instituto, donde a partir del ingreso de la EDAD del
//alumno, el sistema informe por pantalla los días y horarios de cursada.
        System.out.println("Por favor ingrese la edad del niño:");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int edad = 0;
        String dias = "";
        int horarioEntrada = 0;
        int horarioSalida = 0;
        
        if (edad >= 4 || edad <= 6) {

//        if (edad >= 4) {
//            dias = "Lunes y Miércoles";
//            horarioEntrada = 16;
//            horarioSalida = 17;
            System.out.println(" los días y horarios de cursada son Lunes y Miércoles de 16 a 17hs");

        } else if (edad >= 7 && edad <= 8) {
//                dias = "Martes y Jueves";
//                horarioEntrada = 1630;
//                horarioSalida = 1730;
            System.out.println(" los días y horarios de cursada son ");
            System.out.println("Introduzca un numero valido");

        }

    }
}
