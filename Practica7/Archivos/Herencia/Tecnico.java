/**
 *Clase Tecnico, que hereda desde Empleado, le asigna el puesto de tecnico al operador
 *@author Julio Maximiliano Ru�z Gonz�lez
 *@version 1.0 22/01/21
 *@see String
 *@see super
 */
public class Tecnico extends Operador{
    /**
     *M�todo constructor que hereda Nombre desde Empleado
     *@param nombre -Nombre del tecnico
     */
    //M�todos constructores
    public Tecnico(String nombre){
	super(nombre);
    }

    /**
     *M�todo toString de la clase tecnico, sobreescrito desde empleado, 
     *transforma el objeto en texto legible
     *@Override
     *@return String s -Devuelve el mensaje Tecnico: Nombre, soy un tecnico
     */
    //M�todo toString
    public String toString(){
	String s = "Tecnico: "+this.nombre+", soy un tecnico";
	return s;
    }

    /**
     *M�todo equals, que compara dos objetos de la clase Tecnico para
     *decir si dos objetos de la clase tecnico son iguales en contenido
     *@Override
     *@param tecnico -Recibe un objeto de la clase tecnico
     *@return String -Devuelve un mensaje, dependiendo si son iguales los objetos, si son iguales manda mensaje que son el mismo tecnico
     *si no son iguales manda mensaje que no son el mismo tecnico
     */
    //M�todo equals
    public String equals(Tecnico tecnico){
	String nombre = tecnico.getNombre();
	if(this.nombre == nombre){
	    return "Son el mismo tecnico, tienen el mismo nombre";
	}
	else{
	    return "No son el mismo tecnico, no tienen el mismo nombre";
	}
    }

    /**
     *M�todo trabaja, que indica que el tecnico esta trabajando
     *@return String -Regresa el mensaje hola soy el tecnico nombre y estoy trabajando
     */
    //M�todo trabaja
    public String trabaja(){
	return "Hola soy el tecnico "+this.nombre+" y estoy trabajando";
    }

}
