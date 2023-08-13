package controller;

public class RecursivaVetor {
	public RecursivaVetor() {
		super();
	}
	// Quando a função chega 0, ela volta fazendo a comparação entre o valor atual ( armazenado em MV ) e o valor da posição do vetor, fazendo a troca quando necessário.
	//Como a ultima posição do vetor sempre será 0, a condição de parada é definida com o tamanho do vetor VT, quando ele se torna igual a 0.
	// MV recebe a chamada da função, como uma variável temporária.
	public int vet(int VT, int MV, int vetor[]) {
	    if (VT == 0) {
	        return MV;
	    } else {
	        MV = vet(VT - 1, MV, vetor); 
	        if (MV > vetor[VT - 1]) {
	            MV = vetor[VT - 1];
	        }
	        return MV;
	    }
	}
}
