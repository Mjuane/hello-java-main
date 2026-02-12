package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Miguel";
        System.out.println(name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 23;
        System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.80;
        System.out.println(height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean programing = true;
        System.out.println(programing);

        // 5. Declara una constante con tu email.
        final String EMAIL = "miguel@gmail.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char firstLetter = 'M';
        System.out.println(firstLetter);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Baleares";
        System.out.println(localidad);

        localidad = "Suiza";
        System.out.println(localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 5;
        int b = 10;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("Localidad es de tipo " + localidad.getClass().getSimpleName());
        System.out.println("FirstLetter es de tipo char pero no se puede hacer el .getSimpleName");

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
    }
}
