/**
 *Clase Directivo, hereda de Empleado, le da el puesto de directivo a un empleado
 *@author Julio Maximiliano Ru�z Gonz�lez
 *@version 1.0 22/01/21
 *@see String
 *@see super
 */
public class Directivo extends Empleado{
    /**
     *M�todo constructor que hereda Nombre de Empleado
     *@param nombre -Nombre del directivo
     */
    //M�todos constructores
    public Directivo(String nombre){
	super(nombre);
    }

    /**
     *M�todo toString de la clase directivo, sobreescrito de empleado, 
     *transforma el objeto en texto legible
     *@Override
     *@return String s -Devuelve el mensaje Directivo: Nombre, soy un directivo
     */
    //M�todo toString
    public String toString(){
	String s = "Directivo: "+this.nombre+", soy un directivo";
	return s;
    }

    /**
     *M�todo equals, que compara dos objetos de la clase Directivo para
     *decir si dos objetos de la clase directivo son iguales en contenido
     *@Override
     *@param directivo -Recibe un objeto de la clase directivo
     *@return String -Devuelve un mensaje, dependiendo si son iguales los objetos, si son iguales manda mensaje que son el mismo directivo,
     *si no son iguales manda mensaje que no son el mismo directivo
     */
    //M�todo equals
    public String equals(Directivo directivo){
	String nombre = directivo.getNombre();
	if(this.nombre == nombre){
	    return "Son el mismo directivo, tienen el mismo nombre";
	}
	else{
	    return "No son el mismo directivo, no tienen el mismo nombre";
	}
    }
}
