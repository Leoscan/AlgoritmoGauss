package procedimentos;

public class EliminacaoGauss {
	

	
	public static void Resolve(double [][] matriz, double resul[]) {
		
		for (int coluna = 0; coluna < (matriz.length - 1); coluna++) {	
			for (int linha = (coluna + 1); linha < matriz.length; linha++) {
					
				//Achar o Multiplicador e Zerar o triangulo inferior
					double m = matriz[linha][coluna] / matriz[coluna][coluna];
					matriz[linha][coluna] = 0;
				
				//Aplicar o Multiplicador na matriz
					for(int j = coluna + 1; j < matriz.length; j++) {
						matriz[linha][j] = 
								matriz[linha][j] - m * matriz[coluna][j];
					}
				//Aplicar o Multiplicador nos resultados
				resul[linha] = resul[linha] - m * resul[coluna]; 
						
			}		
		}
		System.out.println("-------------------------------------");
		System.out.println("Resultado Primeira Etapa - Eliminação");
		System.out.println("Matriz {");
			ImprimeMatriz(matriz);
		System.out.println("}");
		System.out.println("Y {");
			ImprimeY(resul);
		System.out.println("\n}");
		System.out.println("-------------------------------------");
		
		Resolucao(matriz, resul);
	}
	
	
	
	
	public static void Resolucao(double [][] matriz, double resul[]) {
		double x[] = new double[matriz.length];
		
		//Popula x
		for (int e = 0; e < x.length; e++) {	
			x[e] = resul[e] / matriz[e][e];
		}
		
		for (int coluna = (matriz.length - 1); coluna >= 0 ; coluna--) {	
			double s = 0;
			
			for(int j = coluna + 1; j < matriz.length; j++) {
				s = s + matriz[coluna][j] * x[j];
			}
			
			x[coluna] = (resul[coluna] - s) / matriz[coluna][coluna];
		}		
	
		
		System.out.println("Resultado Segunda Etapa - Resolução");
		System.out.println("Resolução {");
			ImprimeX(x);
		System.out.println("}");
		System.out.println("-------------------------------------");
	}
	
	
	
	
	public static void ImprimeMatriz(double [][] matriz) {
		for (int l = 0; l < matriz.length; l++)  {  
		       for (int c = 0; c < matriz[0].length; c++)     { 
		           System.out.print(matriz[l][c] + " "); 
		       }  
		       System.out.println(" ");
		}	
	}
	
	public static void ImprimeY(double resul[]) {
		for (int l = 0; l < resul.length; l++)  {  
	        System.out.print(resul[l] + " ");
		}
	}
	
	public static void ImprimeX(double x[]) {
		for (int l = 0; l < x.length; l++)  {  
	        System.out.print(x[l] + " ");
		}
	}
	
	
	
}
