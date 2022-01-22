import java.util.Random;

/**
 *Programa que implementa el m�todo de ordenamiento bubblesort a un arreglo
 *de 100,000 elementos
 *Clase Main
 *@author Julio Maximiliano Ru�z Gonz�lez
 *@version 1.0  22/01/21
 *@see Random
 *@see array
 *@see System.out.println
 */
public class bubbleSort{
    /**
     *M�todo Main
     *@param args Argumentos a utilizar en el m�todo main
     */
    public static void main(String args[]){

	//Boolean para mantener activo el ciclo de bubblesort
	boolean activo = true;
	//N�mero m�ximo a seleccionar de n�mero random
	int max = 100000;
	//Contador que ayuda a ir limitando el arreglo para no desordenar los elementos arreglados
	int contador = 1;
	//Variable para guardar el valor a cambiar de posici�n
	int contenedor;
	//Arreglo de elementos
	int [] arreglo = new int [100000];
	//Objeto de la clase random para seleccionar n�meros aleatorios 
	Random random = new Random();

	//Llenamos el arreglo de n�meros aleatorios
	for(int m = 0; m < arreglo.length; m++){
	    arreglo[m] = random.nextInt(max);
	}

	//Mostramos el arreglo sin ordenar
	System.out.println("Arreglo sin ordenar, bubblesort");
	for(int i = 0; i < arreglo.length; i++){
	    System.out.print(arreglo[i]+" ");
	}

	//Implementamos el bubblesort y se ordena el arreglo
	while(activo){
	    activo = false;
	    for(int j = 0; j < (arreglo.length - contador); j++){
		if(arreglo[j]>arreglo[j+1]){
		    activo = true;
		    contenedor = arreglo[j];
		    arreglo[j] = arreglo[j+1];
		    arreglo[j+1] = contenedor;
		}
	    }
	    contador++;
	}

	//Mostramos el arreglo ordenado
	System.out.println("\n \nArreglo ordenado, bubblesort");
	for(int k = 0; k < arreglo.length; k++){
	    System.out.print(arreglo[k]+" ");
	}
    }
}
