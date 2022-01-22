//Se importa la biblioteca Random de util Java
import java.util.Random;

/**
 *Programa que implementa el tipo de ordenamiento
 *quicksort para arreglar arreglos del menor al
 *mayor valor
 *@author Julio Maximiliano Ruíz González
 *@version 1.0  22/01/21
 *@see Random
 *@see System.out.println
 *@see array
 */
public class quickSort{

    /**
     *Método que utiliza quicksort para ordenar los arreglos
     *
     *@param arreglo -Arreglo de tipo int
     *@param primero -Indice de donde inicia el arreglo
     *@param ultimo -Indice donde termina el arreglo
     */
    public static void quicksort(int[] arreglo, int primero, int ultimo){
	//Pivote que tomara el quicksort para ordenar los elementos, toma la mitad
	int pivote = arreglo[(ultimo+primero)/2];
	int i = primero;
	int j = ultimo;
	//Variable que se usa para cambiar valores
	int contenedor;
	//Ordena los valores menores al pivote del lado izquierdo y mayores al pivote del lado derecho
	do{
	    
	    //Llega hasta un valor que sea mayor al pivote
	    while(arreglo[i]<pivote){
		i++;
	    }
	    //Llega hasta un valor que sea menor al pivote
	    while(arreglo[j]>pivote){
		j--;
	    }
	    //Cambia los valores para que queden del lado que les corresponde
	    if(i<=j){
		contenedor=arreglo[i];
		arreglo[i]=arreglo[j];
		arreglo[j]=contenedor;
		i++;
		j--;
	    }
	}while(i<=j);
	//Analiza ahora las sublistas que se crearon al ordenar los elementos
	//Lista que se hace a la izquierda, elementos menores
	if(primero<j){
	    quicksort(arreglo, primero, j);
	}
	//Lista que se hace a la derecha, elementos mayores
	if(i<ultimo){
	    quicksort(arreglo, i, ultimo);
	}
    }

    /**
     *Método main de la clase main
     *
     *@param args -Argumentos que recibe el método main
     */
    public static void main(String args[]){

	//Límite del cual se pueden tomar números random
	int max = 100000;
	//Índice del arreglo de inicio
	int k = 0;
	//Arreglo
	int [] arreglo = new int [100000];
	//Índice del arreglo del final
	int h = arreglo.length -1;
	//Objeto random de la clase Random para obtener números random
	Random random = new Random();

	//Llenamos el arreglo
	for(int o = 0; o < arreglo.length; o++){
	    arreglo[o]=random.nextInt(max);
	}

	//Mostramos el arreglo sin ordenar
	System.out.println("El arreglo sin ordenar, quicksort");
	for(int m = 0; m < arreglo.length; m++){
	    System.out.print(arreglo[m]+" ");
	}
	
	//Implementamos quicksort
	quicksort(arreglo,k,h);

	//Mostramos el arreglo ordenado
	System.out.println("\nEl arreglo ordenado, quicksort");
	for(int n = 0; n < arreglo.length; n++){
	    System.out.print(arreglo[n]+" ");
	}
	
    }
}
