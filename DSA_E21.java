import java.util.*;
//HEAP sort
public class DSA_E21 {
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int max = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        if (leftChild < n && arr[leftChild] > arr[max])
            max = leftChild;
        if (rightChild < n && arr[rightChild] > arr[max])
            max = rightChild;
        if (max != i) {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;
            heapify(arr, n, max);
        }
    }

    static void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements to be sorted:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " integer elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        DSA_E21 ds = new DSA_E21();
        System.out.println("Original array: ");
        display(arr);
        ds.sort(arr);
        System.out.println("Array after Heap Sort :");
        display(arr);
    }
}