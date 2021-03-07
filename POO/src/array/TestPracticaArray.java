package array;

import java.util.Scanner;

public class TestPracticaArray {

	public static void main(String[] args) 
	{
		PracticaArray array1 = new PracticaArray();
		array1.rellenarArray();
		array1.verArray1();
		array1.ordenarArray();
		array1.verArray1();
		array1.eliminar();
		array1.verArray1();
		PracticaArray arra2 = new PracticaArray();
		
		
		System.out.println("Busqueda secuencial, introduce el elemento a buscar.");
		Scanner reader = new Scanner(System.in);
		int buscado = reader.nextInt();
		int posicion = array1.busquedaSecuencial(buscado);
		boolean existe = posicion != -1;
		if(existe) 
		{
			System.out.println(buscado + " está en la posición " + posicion);
		}
		else
		{
			System.out.println(buscado + " no existe en la lista");
		}
			
	}

}
