
import modelo.Pelicula;
import modelo.Serie;


import java.util.Scanner;

public class Principal {
    private Pelicula peliculaUsuario = new Pelicula();
    private Serie serieUsuario = new Serie();
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienvenido(a) a Screenmatch
                    1) Registrar nueva pelicula
                    2) Registrar nueva serie
                    3) Calcular tiempo para maratonear
                    
                    9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la película");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la película");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa el numero de temporadas para esta serie");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la cantidad de episodios por cada temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la duración promedio en minutos de cada episodio");
                    int minutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(minutosPorEpisodio);
                    serieUsuario.muestraFichaTecnica();
                    break;
                case 3:
                    float tiempoDeMaratonEnMinutos = 0;
                    int contadorPeliculas = 1;
                    int contadorSeries = 1;
                    int contadorTemporadas = 1;
                    int cantidadPeliculas = 0;
                    int cantidadSeries = 0;
                    int temporadasSerie = 0;
                    int capitulosSerie = 0;
                    int duracionCapitulosEnMinutos = 0;

                    System.out.println("Ingrese la cantidad de peliculas que va a ver");
                    cantidadPeliculas = teclado.nextInt();
                    teclado.nextLine();
                    while (contadorPeliculas <= cantidadPeliculas){
                        System.out.println("Ingrese la duración de la pelicula " + contadorPeliculas + " en minutos");
                        tiempoDeMaratonEnMinutos = tiempoDeMaratonEnMinutos + teclado.nextInt();
                        teclado.nextLine();
                        contadorPeliculas++;
                    }
                    System.out.println("Ingrese la cantidad de series que va a ver");
                    cantidadSeries = teclado.nextInt();
                    teclado.nextLine();
                    while (contadorSeries <= cantidadSeries){
                        System.out.println("Ingrese la cantidad de temporadas que tiene la serie " + contadorSeries);
                        temporadasSerie = teclado.nextInt();
                        teclado.nextLine();
                        while (contadorTemporadas <= temporadasSerie) {
                            System.out.println("Ingrese la cantidad de capitulos de la temporada " + contadorTemporadas);
                            capitulosSerie = capitulosSerie + teclado.nextInt();
                            teclado.nextLine();
                            contadorTemporadas++;
                        }
                        contadorTemporadas = 1;
                        System.out.println("Ingrese la duración promedio en minutos de cada capitulo en general");
                        duracionCapitulosEnMinutos = duracionCapitulosEnMinutos + teclado.nextInt();
                        teclado.nextLine();
                        contadorSeries++;
                    }
                    tiempoDeMaratonEnMinutos = tiempoDeMaratonEnMinutos + (duracionCapitulosEnMinutos * capitulosSerie * temporadasSerie);
                    float tiempoDeMaratonEnHoras = tiempoDeMaratonEnMinutos / 60;
                    System.out.println("Preparate porque vas a necesitar " + tiempoDeMaratonEnHoras + " horas de tu preciosa vida para realizar toda esta maratón, buena suerte.");
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
