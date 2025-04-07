package ejercicios;

public class Diagnostico {
	public static void rotar90(int[][] imagen) {
		int n = imagen[0].length;
		
		for(int k=0;k<n/2;k++)	//1. Invertir las filas
		{
			int[] bufferLinea = imagen[k];
			imagen[k] = imagen[n-1-k];
			imagen[n-1-k] = bufferLinea;
		}
		
		for(int i=0;i<n;i++)		//2. Transponer la matriz (intercambiar filas por columnas)
		{
			for(int j=i+1;j<n;j++) // Comienza el indice desde i+1, para solamente recorrer la diagonal superior
			{
				int buffer = imagen[i][j];
				imagen[i][j] = imagen[j][i];
				imagen[j][i] = buffer;
			}
		}	
	}
	
	public static void mostrarMatriz(int[][] imagen) {
		for(int i=0;i<imagen[0].length;i++)
		{
			for(int j=0;j<imagen.length;j++)
			{
				System.out.print(imagen[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		int[][] img = {{1,2,3},
					   {4,5,6},
					   {7,8,9}};
		
		int[][] img2 = {{1,2,3,4},
				  		{5,6,7,8},
				  		{9,10,11,12},
				  		{13,14,15,16}};
		
		mostrarMatriz(img);
		rotar90(img);
		System.out.println("");
		mostrarMatriz(img);
	}

}
