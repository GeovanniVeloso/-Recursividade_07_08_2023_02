package view;

import controller.RecursivaVetor;

public class Main {

	public static void main(String[] args) {
		RecursivaVetor rv = new RecursivaVetor();
		
		int VT = 5;
		int MV = 9;
		int vetor[] = new int [5];
		
		vetor[0] = 7;
		vetor[1] = 4;
		vetor[2] = 1;
		vetor[3] = 6;
		vetor[4] = 9;
		
		int res = rv.vet(VT, MV, vetor);
		
		System.out.println(res);
	}

}
