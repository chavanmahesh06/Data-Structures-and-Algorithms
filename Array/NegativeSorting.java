//Move all the negative elements to one side of the array 

public class NegativeSorting {
    public static void main(String[] args) {
        int arr[] = { -5, 2, -84, 26, 15, -7, -5, 4, 36, -4, -15, -75, 6 };
        int j = 0;
        System.out.println("Before Sorting: ");
        printarr(arr);


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    swap(arr,i,j);
                }
                j++;
            }
        }   
        
        
        // while (j <= k) {
        //     if(arr[j]<0)
        //     {
        //         while(arr[j]<0)
        //             j++;
        //     }
        //     else
        //     {
        //         if(arr[k]<0)
        //         {
        //             swap(arr,j,k);
        //             j++;
        //             k--;
        //         }
        //         else
        //         {
        //             while(arr[k]>0)
        //                 k--;
        //             swap(arr,j,k);
        //             j++;
        //             k--;
        //         }   
        //     }
        // }
        System.out.println("\n\nAfter Sorting: ");
        printarr(arr);
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
