/**
 *Clase Operador, hereda de Empleado, le da el puesto de operador a un empleado
 *@author Julio Maximiliano Ruíz González
 *@version 1.0 22/01/21
 *@see String
 *@see super
 */
public class Operador extends Empleado{

    /**
     *Método constructor que hereda Nombre de Empleado
     *@param nombre -Nombre del operador
     */
    //Métodos constructores
    public Operador(String nombre){
	super(nombre);
    }

    /**
     *Método toString de la clas operador, sobreescrito de empleado, 
     *transforma el objeto en texto legible
     *@Override
     *@return String s -Devuelve el mensaje Operador: Nombre, soy un operador
     */
    //Método toString
    public String toString(){
	String s = "Operador: "+this.nombre+", soy un operador";
	return s;
    }

    /**
     *Método equals, que compara dos objetos de la clase Operador para
     *decir si dos objetos de la clase operador son iguales en contenido
     *@Override
     *@param operador -Recibe un objeto de la clase operador
     *@return String -Devuelve un mensaje, dependiendo si son iguales los objetos, si son iguales manda mensaje que son el mismo operador
     *si no son iguales manda mensaje que no son el mismo operador
     */
    //Método equals
    public String equals(Operador operador){
	String nombre = operador.getNombre();
	if(this.nombre == nombre){
	    return "Son el mismo operador, tienen el mismo nombre";
	}
	else{
	    return "No son el mismo operador, no tienen el mismo nombre";
	}
    }
}
