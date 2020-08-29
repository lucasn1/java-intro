
public class Arrays1 {
	
	

    public static void main(String[] args) {
		
		int[] arr = new int[]{1, 4, 5, 10, 20, 30, 40, 50}; //Tipo do vetor[]nomedovetor = new tipo_do_vetor [tamanho do vetor] --
		
		int total = somar(arr);
		System.out.println("Total " + total);
		
		int indice = buscar(arr, 20);
		System.out.println("Buscar(20) " + indice);

		int[] grandeArray = gerarArray(100000000);
		// Mostra o tempo decorrido do inicio ao fim do código.--
		long start = System.nanoTime();
		int indiceNaoEncontrado = buscar(arr, -20);
		long end = System.nanoTime();
		long tempo = end - start;
		
		System.out.println("Buscar(-20) " + indiceNaoEncontrado + ", tempo " + tempo);
		
		start = System.nanoTime();
		indiceNaoEncontrado = buscar2(arr, -20);
		end = System.nanoTime();
		tempo = end - start;
		
		System.out.println("Buscar(-20) " + indiceNaoEncontrado + ", tempo " + tempo);
	}
	
	static int somar(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
	// Percorre o array  --
	static int buscar(int[] a, int b) {
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b){
				return i;
			}
		}

		return -1; 
		
		//complexidade n, O(n)

	}	
	
	static int buscar2(int[] a, int b) {
		
		int menor = 0;
		int maior = a.length - 1;
		
		while(menor <= maior) {
			
			int meio = menor + (maior - menor) / 2;
			
			if (a[meio] == b) {
				return meio;
			}
			
			if (a[meio] < b) {
				menor = meio + 1;
			} else {
				maior = meio - 1;
			}
			
		}
		
		return -1;
		
		//complexidade log(n), O(log n), binarySearch
	}

	static int[] gerarArray(int tamanho) {
		int[] arr = new int[tamanho];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}

}