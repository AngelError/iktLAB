package juniors.lessons;

import java.util.Scanner;

public class QuickSort {
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        int t = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = t;

        return i+1;
    }


    void sort(int arr[], int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
//        int arr[] = {4,2,6,22,4};
//        int n = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for(int i=0; i< array.length; i++) {
            array[i]=sc.nextInt();
        }

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, n-1);

        printArray(array);
    }
}
