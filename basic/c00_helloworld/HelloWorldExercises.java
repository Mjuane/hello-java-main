package basic.c00_helloworld;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/

// Crear una clase publica
public class HelloWorldExercises {

    // Crear el metodo main de la clase
    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Miguel");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.

        // 4. Crea un comentario en varias líneas.
        /*
        Comentario
        en
        varias
        líneas.
        */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Edad:23     Color Favorito: Rosa    Isla: Mallorca");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("Error 404");
        System.out.println("Print Normal");
        
        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Utiliza varios printl");
        System.out.println("para escribir una frase");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.err.println(":)");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        System.err.println("Error: no se ha encontrado el método principal en la clase basic.c00_helloworld.HelloWorldExercises, defina el método principal del siguiente modo:\\n   public static void main(String[] args)\\nde lo contrario, se deberá ampliar una clase de aplicación JavaFX javafx.application.Application");

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

    }
}