/**
 *Clase Oficial, que hereda de operador, le asigna el puesto de oficial al operador
 *@author Julio Maximiliano Ruíz González
 *@version 1.0 22/01/21
 *@see String
 *@see super
 */
public class Oficial extends Operador{
    /**
     *Método constructor que hereda Nombre desde Empleado
     *@param nombre -Nombre del oficial
     */
    //Métodos constructores
    public Oficial(String nombre){
	super(nombre);
    }

    /**
     *Método toString de la clas oficial, sobreescrito desde empleado, 
     *transforma el objeto en texto legible
     *@Override
     *@return String s -Devuelve el mensaje Oficial: Nombre, soy un oficial
     */
    //Método toString
    public String toString(){
	String s = "Oficial: "+this.nombre+", soy un oficial";
	return s;
    }

    /**
     *Método equals, que compara dos objetos de la clase Oficial para
     *decir si dos objetos de la clase oficial son iguales en contenido
     *@Override
     *@param oficial -Recibe un objeto de la clase oficial
     *@return String -Devuelve un mensaje, dependiendo si son iguales los objetos, si son iguales manda mensaje que son el mismo oficial
     *si no son iguales manda mensaje que no son el mismo oficial
     */
    //Método equals
    public String equals(Oficial oficial){
	String nombre = oficial.getNombre();
	if(this.nombre == nombre){
	    return "Son el mismo oficial, tienen el mismo nombre";
	}
	else{
	    return "No son el mismo oficial, no tienen el mismo nombre";
	}
    }

    /**
     *Método trabaja, que indica que el oficial esta trabajando
     *@return String -Regresa el mensaje hola soy el oficial nombre y estoy trabajando
     */
    //Método trabaja
    public String trabaja(){
	return "Hola soy el oficial "+this.nombre+" y estoy trabajando";
    }
}
