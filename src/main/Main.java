package main;

import procedimentos.EliminacaoGauss;

public class Main {

	public static void main(String[] args) {
		
		/*
		double [][] matriz = {
				{-5,2,-1},
				{2,-6,2},
				{-2,8,-3}
		};
		
		double resul[] = {
				8,
				-9,
				12
		};
		*/
		
		double [][] matriz = {
				{-3,2,-1},
				{0.5,6,2},
				{-4,2,-5}
		};
		
		double resul[] = {
				2,
				1,
				6
		};
		

		EliminacaoGauss.Resolve(matriz, resul);
			
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/** 
		 * for (int linha = 0; linha < (matriz.length - 1); linha++) {
			
			for (int coluna = linha + 1; coluna < (matriz[0].length - 1); coluna++) {
				double m = matriz[coluna][linha] / matriz[linha][linha];
				matriz[linha][coluna] = 0;
				
				for (int j = (linha + 1); j < matriz.length; j++) {
					matriz[coluna][j] =  
							matriz[coluna][j] - (m * matriz[linha][j]); 
				}
				
				resul[coluna] = resul[coluna] - m * resul[linha]; 
			}		
		}
		 */
		
		
		
		
		
		
	}

}
