//Clase LibroCalificaciones3 que contiene  variable de instancia nombreDelCurso
//y métodos para establecer y obtener su valor 
public class LibroCalificaciones3{
    private String nombreDelCurso, nombreDelProfesor;
    private int horasDelCurso;

    public LibroCalificaciones3(){

    }

    public LibroCalificaciones3(String nombre, String profesor, int horas){
        this.nombreDelCurso = nombre;
        this.nombreDelProfesor = profesor;
        this.horasDelCurso = horas;
    }

    //método para establecer el nombre del curso
    public void establecerParametrosDelCurso(String nombre, String profesor, int horas)
    {
        nombreDelCurso = nombre;
        nombreDelProfesor = profesor;
        horasDelCurso = horas; //almacena el nombre del curso
    }//fin del método establecer nombre del curso

    public void establecerParametrosDelCurso(String nombre, String profesor)
    {
        nombreDelCurso = nombre;
        nombreDelProfesor = profesor;
}//fin del método establecer nombre del curso

//metodo para obtener el nombre del curso
public String obtenerNombreDelCurso()
{
    return nombreDelCurso;
}//fin del método obtenerNombreDelCurso

public String obtenerNombreDelProfesor()
{
    return nombreDelProfesor;
}//fin del metodo obtenerNombreDelProfesor

public int obtenerHorasDelCurso()
{
    return horasDelCurso;
}//fin del metodo obtenerHorasDelCurso

//muestra un mensaje de bienvenida al usuario del LibroCalificaciones3
public void mostrarMensaje()
{
    //esta instruccion llama obtenerNombreDelCurso para obtener el
    //nombre del curso que representa este LibroCalificaciones 3
    System.out.printf("Bienvenido al libro de calificaciones para\n%s\n",
    obtenerNombreDelCurso());
    System.out.printf("Tu profesor asignado es: %s\n", 
    obtenerNombreDelProfesor());
    System.out.printf("Tienes %d horas a la semana%n",
    obtenerHorasDelCurso());
}//fin del método mostrarMensaje

}//fin de la clase LibroCalificaciones3