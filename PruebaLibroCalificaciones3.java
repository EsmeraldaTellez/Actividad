//Crea y manipula un objeto LibroCalificaciones
import java.util.Scanner;//el programa usa la clase Scanner

public class PruebaLibroCalificaciones3{
    //el método main empieza la ejecucion del programa

    public static void main (String [] args ){
        //Crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner (System.in);

        //Crea un objeto LibroCalificaciones3 y lo asigna a miLibroCalificaciones3
        LibroCalificaciones3 miLibroCalificaciones3 = new LibroCalificaciones3();

        LibroCalificaciones3 miLibroCalificaciones3Iniciado = new LibroCalificaciones3
        ("Programacion ll", "Ana Luisa", 4);

        //muestra el valor inicial de nombreDelCurso
        System.out.printf("El nombre incial del curso: %s\n" + "El profesor es: %s\n" + "Las horas a la semana son: %d\n\n", 
        miLibroCalificaciones3Iniciado.obtenerNombreDelCurso(), miLibroCalificaciones3Iniciado.obtenerNombreDelProfesor(), miLibroCalificaciones3Iniciado.obtenerHorasDelCurso());

        //Pide y lee el nombre del curso
        System.out.println("Escriba el nombre del curso: ");
        String elNombre = entrada.nextLine();//lee una linea del texto

        //Pide y lee el nombre del profesor
        System.out.println("Escriba el nombre del profesor: ");
        String elProfe = entrada.nextLine();//lee una linea de texto

        //Pide y lee las horas del curso
        System.out.println("Escriba las horas por semana del curso: ");
        int horasSemana = Integer.parseInt(entrada.nextLine());//lee una linea de texto

        //Establece el nombre del curso
        System.out.println();//imprime una linea en blanco

        miLibroCalificaciones3.establecerParametrosDelCurso(elNombre, elProfe,horasSemana);
        //Muestra el mensaje de bienvenida despues de especificar el nombre del curso 
        miLibroCalificaciones3.mostrarMensaje();

        System.out.println("Vamos a cambiar los valores del objeto miLibroCalificaciones3");

        System.out.println("Escriba el nuevo nombre del curso para el objeto miLibroCalificaciones3Iniciado: ");
        elNombre = entrada.nextLine();//lee una linea de texto

        //Pide y lee el nombre del profesor
        System.out.println("Escriba el nuevo nombre del profesor para el objeto miLibroCalificaciones3Iniciado: ");
        elProfe = entrada.nextLine();//lee una linea de texto

        //Pide y lee las horas del curso
        System.out.println("Escriba las nuevas cantidades de horas por semana del curso para el objeto miLibroCalificaciones3Iniciado: ");
        horasSemana = Integer.parseInt(entrada.nextLine());//lee una linea de texto

        miLibroCalificaciones3Iniciado.establecerParametrosDelCurso(elNombre, elProfe, horasSemana);

        miLibroCalificaciones3Iniciado.mostrarMensaje();

        entrada.close();

    }//fin del main
}//fin de la clase PruebaLibroCalificaciones3