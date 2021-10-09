package main;

public class Main {

	public static void main(String[] args) {
		
		double [][] matriz = {
				{-5,2,-1,8},
				{2,-6,2,-9},
				{-2,8,-3,12}
		};
		
		
		//alg1
		double y = 0;
		for (int linha = 0; linha < (matriz.length - 1); linha++) {
			for (int coluna = linha + 1; coluna < (matriz[0].length - 1); coluna++) {
				double m = matriz[linha][coluna] / matriz[linha][linha];
				matriz[linha][coluna] = 0;
				
				for (int j = (linha + 1); j < matriz.length; j++) {
					double var = matriz[linha][j];					
					double var2 = matriz[j][coluna];
					matriz[j][coluna] =  var2 - (m * var); 
				}
				
				y = (y + coluna) - m * linha; 
			}		
		}
		//alg1 - resultados
		for (int l = 0; l < matriz.length; l++)  {  
		       for (int c = 0; c < matriz[0].length; c++)     { 
		           System.out.print(matriz[l][c] + " "); 
		       }  
		       System.out.println(" ");
		}		
	}

}
