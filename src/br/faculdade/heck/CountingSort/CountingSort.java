package br.faculdade.heck.CountingSort;

public class CountingSort {
    void countSort1(int[] array){
        int size = array.length;

        int [] output = new int[size + 1];

        //acha o maior elemento do array
        int max = array[0];
        for (int i = 1; i < size; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        int[] count = new int[max + 1];

        //inicializa o vetor inteiro com 0
        for (int i = 0; i < max; i++){
            count[i] = 0;
        }

        //guarda o numero de repetições de cada elemento
        for (int i = 0; i < size; i++){
            count[array[i]]++;
        }

        //guarda o numero acumulativo de cada array
        for (int i = 1; i <= max; i++){
            count[i] += count[i - 1];
        }

        //acha o indice de cada elemento do array original no array contador
        //e coloca os elementos no array de saída
        for (int i = size - 1; i >= 0; i--){
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        //copia os elementos ordenados para o array original
        for (int i = 0; i < size; i++){
            array[i] = output[i];
        }
    }

    public void countSort2(int[] arr){
        int size = arr.length;
        int max = arr[0];

        //pega o maior valor do vetor
        for (int i=1; i<size; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        //vetor de saída que que tera o vetor arr ordenado
        int[] output = new int[size];

        //cria um vetor contador para armazenar o contador de cada
        //elemento individualmente e inicializar o vetor com 0
        int[] count = new int[max+1];
        for (int i = 0; i < max; i++){
            count[i] = 0;
        }

        //guarda o contador de cada elemento
        for (int i = 0; i < size; i++){
            ++count[arr[i]];
        }

        //troca count[i] para que ele possua agora a posição atual
        //do elemento no array de saída
        for (int i = 1; i <= max; i++){
            count[i] += count[i-1];
        }

        //constroi o vetor de saida
        //para que ele seja estável, se trabalha na ordem inversa
        for (int i = size-1; i >= 0; i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        //copia o vetor de saida para o vetor original
        //agora o vetor original contem os elementos ordenados
        for (int i = 0; i < size; i++){
            arr[i] = output[i];
        }
    }
}
