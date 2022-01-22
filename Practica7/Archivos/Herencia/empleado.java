/**
 *Clase Empleado, que da nombre a los empleados
 *
 *@author Julio Maximiliano Ru�z Gonz�lez
 *@version 1.0 22/01/21
 *@see String
 */
public class Empleado{

    //Atributos de la clase
    //Nombre del empleado
    protected String nombre;

    //M�todos constructores
    /**
     *M�todo constructor sin par�metros, ya esta definido el nombre del empleado
     */
    public Empleado(){
	this.nombre = "Eduardo Gomez Garza de la Torres Paz Rosas";
    }

    /**
     *M�todo constrcutor que recibre un String de par�metro para el nombre
     *del empleado
     *@param nombre -Nombre del empleado
     */
    public Empleado(String nombre){
	this.nombre = nombre;
    }

    //M�todos Getters
    /**
     *M�todo Getter para obtener el nombre del empleado
     *@return String nombre -Devuelve el nombre del empleado
     */
    public String getNombre(){
	return this.nombre;
    }

    //M�todos Setters
    /**
     *M�todo Setter por si se quiere cambiar el nombre del empleado ya existente
     *@param nombre -Nuevo nombre del empleado
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    //M�todo toString
    /**
     *M�todo toString, m�todo que transforma el objeto a texto para que podamos leerlo 
     *f�cilmente
     *@return String s -Devuelve el mensaje Empleado: Nombre
     */
    public String toString(){
	String s = "Empleado: "+this.nombre;
	return s;
    }

    //M�todo equals
    /**
     *M�todo que compara los nombres de dos objetos de la clase empleado, para verificar
     *si tienen el mismo nombre por lo tanto son el mismo empleado
     *@param empleado -Objeto de la clase empleado
     *@return String -Si los nombres son iguales, devuelve un mensaje que los empleados son el mismo. Si
     *los nombre no son iguales, devuelve un mensaje que los empleados no son el mismo.
     */
    public String equals(Empleado empleado){
	String nombre = empleado.getNombre();
	if(this.nombre == nombre){
	    return "Son el mismo empleado, tienen el mismo nombre";
	}
	else{
	    return "No son el mismo empleado, no tienen el mismo nombre";
	}
    }
}
