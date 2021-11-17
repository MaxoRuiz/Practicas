public class pasoPorValorYPorReferencia{
    public static void main(String args[]){
	String p = "Hola";
	String q = "Mundo";
	//Aquí sólo está realizando el método pero no le está asignando el valor a nada
	unionPorValores(p,q);
	//Aquí ya le está el valor a una variable, por lo que el valor de esa variable
	//pasará a ser lo que regrese el método, en este caso Hola Mundo
	p = unionPorValores(p,q);
	System.out.println(p);
	int[] arreglo = new int [5];
	for(int i = 0; i < arreglo.length; i++){
	    arreglo [i] = i;
	}
	//Aquí la diferencia es de que no ponemos una variable a la cual asignarle el valor que regrese
	//el método porque ya estamos modificando el valor del arreglo mediante la referencia de su
	//memoria, por lo que sus elementos alteran su valor y no es necesario ir asignandolo uno por uno
	multiplicacionPorReferencia(arreglo);
	for(int i = 0; i < arreglo.length; i++){
	    System.out.println(arreglo[i]);
	}
    }

    //Método que recibe dos parámetro por valor, en este caso dos strings
    public static String unionPorValores(String p, String q){
	//String vacío al que se le va a asignar el valor de los strings unidos
	String fraseUnida;
	//Aquí une a los dos Strings en el string vacío
	fraseUnida = p+" "+q;
	//Regresa el String que contiene a los dos strings unidos porque va a ser para asignado el valor a otra variable
	return fraseUnida;
    }

    //Método que recibe la referencia de un arreglo de enteros
    public static void multiplicacionPorReferencia(int[] arreglo){
	//Recorre el arreglo
	for(int i = 0; i < arreglo.length; i++){
	    //Va a sacar la multiplicación por 5 de cada elemento del arreglo
	    //Le asigna el resultado de la multiplicación al elemento que le corresponde
	    arreglo[i] = arreglo[i]*5;

	    /*No es necesario un return porque ya estamos
	     *modificando el valor de los elementos del arreglo
	     *mediante su referencia en la memoria
	     */		
	}
    }
}
