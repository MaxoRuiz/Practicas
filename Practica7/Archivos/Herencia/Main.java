/**
 *Clase main, donde se van a declarar y construir los objetos de los puestos de trabajo
 *para demostrar la herencia
 *@author Julio Maximiliano Ruíz González
 *@version 1.0 22/01/21
 *@see String
 *@see System.out.println
 */
public class Main{
    /**
     *Método Main de la clase Main
     *@param args Argumentos a utilizar en el método main
     */
    public static void main(String args[]){

	//Nombre que se va a utilizar para los empleados
	String nombre = "Juan Diego Luna Gonzalez";

	//Puestos de trabajo que se van a utilizar
	Empleado empleado = new Empleado();
	Operador operador = new Operador(nombre);
	Directivo directivo = new Directivo(nombre);
	Oficial oficial = new Oficial(nombre);
	Tecnico tecnico = new Tecnico(nombre);

	//Se imprimen los objetos de las clases de los empleados
	System.out.println("Empleado\n"+empleado.toString());
	System.out.println("Operador\n"+operador.toString());
	System.out.println("Directivo\n"+directivo.toString());
	System.out.println("Oficial\n"+oficial.toString()+"\n"+oficial.trabaja());
	System.out.println("Tecnico\n"+tecnico.toString()+"\n"+tecnico.trabaja());
    }
}
