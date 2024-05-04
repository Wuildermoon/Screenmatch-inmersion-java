import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java");
//        System.out.println("Pelicula Matrix");

        // Declaracion de variables
        int fechaDeLanzamiento = 1999;
        double puntuacion = 4.3;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                Un experto en computadoras descubre que su mundo es
                una simulación total creada con maliciosas intenciones
                por parte de la ciberinteligencia.
                """;
        double promedioPuntuacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Año: " + fechaDeLanzamiento);
        System.out.println("Puntuación: " + puntuacion);
        System.out.println(incluidoEnElPlanBasico);
        System.out.println(sinopsis);

        double promedioEvaluacion = (4.5 + 4.8 +3) / 3;
        System.out.println("Evaluación promedio de Matrix: " + promedioEvaluacion);

        if (fechaDeLanzamiento >= 2020) {
            System.out.println("Pelicula moderna que vale la pena ver");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la puntuación que le darías a Matrix: ");
            double puntuacionMatrix = teclado.nextDouble();
            promedioPuntuacionUsuario = promedioPuntuacionUsuario + puntuacionMatrix;
        }
        System.out.println("Promedio de la película " +
                "Matrix calculada por el usuario es: " + promedioPuntuacionUsuario / 3);
    }
}