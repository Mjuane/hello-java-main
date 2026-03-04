package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.

        var a = 5;

        System.out.println(a + a);
        System.out.println(a - a);
        System.out.println(a * a);
        System.out.println(a / a);
        System.out.println(a % a);

        // 2. Crea una variable para cada tipo de operación de asignación.

        var b = 5;

        System.out.println(b);

        b -= 5;

        System.out.println(b);

        b += 5;

        System.out.println(b);

        b *= 5;

        System.out.println(b);

        b /= 5;

        System.out.println(b);

        b %= 5;

        System.out.println(b);


        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a == a);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(a == b);
        System.out.println(a <= b);
        System.out.println(a != a);

        // 5. Utiliza el operador lógico and.

        System.out.println(a <= b && b != a);

        // 6. Utiliza el operador lógico or.

        System.out.println(a <= b || b != a);
        
        // 7. Combina ambos operadores lógicos.

        System.out.println(a >= b && (a == b || a != b));

        // 8. Añade alguna negación.

        System.out.println(a >= b && (a == b || !(a != b)));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        System.out.println("Noe se ha asustado " + ++a + " veces");
        System.out.println("Quedan " + a + " segundos, " + --a + " segundos...");
        System.out.println("Si a " + a++ + " le sumas 1, el resultado es " + a);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
    }
}
