package br.faculdade.heck.CountingSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] data = {4,2,2,8,3,3,1,9,2,4,6,5,7,1,3,20,15,3,14,16,15,4};

        CountingSort cs = new CountingSort();
        cs.countSort1(data);

        System.out.println("Array ordenado em ordem crescente: ");
        System.out.println(Arrays.toString(data));
    }
}
