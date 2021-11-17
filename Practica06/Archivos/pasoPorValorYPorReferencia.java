/**
 *Programa que sirve para demostrar el paso
 *de par�metros por valor y por referencia.
 *Clase Main
 *@author Maximiliano Ru�z
 *@version 1.0 21/11/17
 *@see String
 *@see System.out.println
 *@see array
 */
public class pasoPorValorYPorReferencia{
    /**
     *M�todo Main
     *@param args argumentos a utilizar en el m�todo main
     */
    public static void main(String args[]){
	String p = "Hola";
	String q = "Mundo";
	//Aqu� s�lo est� realizando el m�todo pero no le est� asignando el valor a nada
	unionPorValores(p,q);
	//Aqu� ya le est� el valor a una variable, por lo que el valor de esa variable
	//pasar� a ser lo que regrese el m�todo, en este caso Hola Mundo
	p = unionPorValores(p,q);
	System.out.println(p);
	int[] arreglo = new int [5];
	for(int i = 0; i < arreglo.length; i++){
	    arreglo [i] = i;
	}
	//Aqu� la diferencia es de que no ponemos una variable a la cual asignarle el valor que regrese
	//el m�todo porque ya estamos modificando el valor del arreglo mediante la referencia de su
	//memoria, por lo que sus elementos alteran su valor y no es necesario ir asignandolo uno por uno
	multiplicacionPorReferencia(arreglo);
	for(int i = 0; i < arreglo.length; i++){
	    System.out.println(arreglo[i]);
	}
    }

    /**
     *M�todo para unir dos Strings en un s�lo String con un espacio entre ellos
     *@param p -String uno 
     *@param q -String dos
     *@return String -Regresa el String resultante de unir a los strings p y q
     */
    //M�todo que recibe dos par�metro por valor, en este caso dos strings
    public static String unionPorValores(String p, String q){
	//String vac�o al que se le va a asignar el valor de los strings unidos
	String fraseUnida;
	//Aqu� une a los dos Strings en el string vac�o
	fraseUnida = p+" "+q;
	//Regresa el String que contiene a los dos strings unidos porque va a ser para asignado el valor a otra variable
	return fraseUnida;
    }

    /**
     *M�todo que multiplica por 5 todos los elementos de un arreglo de n�meros enteros
     *@param arreglo -Arreglo de n�meros enteros
     */
    //M�todo que recibe la referencia de un arreglo de enteros
    public static void multiplicacionPorReferencia(int[] arreglo){
	//Recorre el arreglo
	for(int i = 0; i < arreglo.length; i++){
	    //Va a sacar la multiplicaci�n por 5 de cada elemento del arreglo
	    //Le asigna el resultado de la multiplicaci�n al elemento que le corresponde
	    arreglo[i] = arreglo[i]*5;

	    /*No es necesario un return porque ya estamos
	     *modificando el valor de los elementos del arreglo
	     *mediante su referencia en la memoria
	     */		
	}
    }
}
