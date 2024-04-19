package br.unip.trabalhop;

import java.util.Scanner;

public class TrabalhoP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int N = scanner.nextInt();
        int[] vetor = new int[N];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < N; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Escolha o método de ordenação:");
        System.out.println("1. Ordenação por inserção");
        System.out.println("2. Ordenação por seleção");
        System.out.println("3. Ordenação bolha");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                insertionSort(vetor);
                break;
            case 2:
                selectionSort(vetor);
                break;
            case 3:
                bubbleSort(vetor);
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        System.out.println("Vetor original:");
        printArray(vetor);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println("Vetor ordenado por inserção:");
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                }
            }

        }

        System.out.println("Vetor ordenado por seleção:");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado por bolha:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
