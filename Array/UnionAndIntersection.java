//Find the Union and Intersection of the two sorted arrays.

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 6, 7, 8, 9, 12, 15, 17 };
        int arr2[] = { 2, 4, 6, 8, 10, 12 };
        int unionarr[] = union(arr1, arr2);
        int intersectarr[] = intersection(arr1, arr2);
        System.out.println("\nUnion of array is:\n");
        printarr(unionarr);
        System.out.println("\n\nIntersection of array is:\n");
        printarr(intersectarr);
    }

    private static int[] union(int arr1[], int arr2[]) {
        int[] unionarr = new int[20];
        int i1 = 0;
        int i2 = 0;
        int unionarrCounter = 0;

        while (i1 < arr1.length && i2 < arr2.length) {
            if (arr1[i1] == arr2[i2]) {
                // append arr1[i1] in unionarr
                unionarr[unionarrCounter] = arr1[i1];
                unionarrCounter++;
                i1++;
                i2++;
            } else if (arr1[i1] < arr2[i2]) {
                // append arr1[i1] in unionarr
                unionarr[unionarrCounter] = arr1[i1];
                unionarrCounter++;
                i1++;
            } else if (arr1[i1] > arr2[i2]) {
                // append arr2[i2] in unionarr
                unionarr[unionarrCounter] = arr2[i2];
                unionarrCounter++;
                i2++;
            }
        }
        if (i1 < arr1.length) {
            while (i1 < arr1.length) {
                unionarr[unionarrCounter] = arr1[i1];
                unionarrCounter++;
                i1++;
            }
        } else if (i2 < arr2.length) {
            while (i2 < arr2.length) {
                unionarr[unionarrCounter] = arr2[i2];
                unionarrCounter++;
                i2++;
            }
        }
        return unionarr;
    }

    private static int[] intersection(int arr1[], int arr2[]) {
        int[] interarr = new int[20];
        int i1 = 0;
        int i2 = 0;
        int InterarrCounter = 0;

        while (i1 < arr1.length && i2 < arr2.length) {
            if (arr1[i1] == arr2[i2]) {
                interarr[InterarrCounter] = arr1[i1];
                InterarrCounter++;
                i1++;
                i2++;
            } else if (arr1[i1] < arr2[i2]) {
                i1++;
            } else if (arr1[i1] > arr2[i2]) {
                i2++;
            }
        }

        return interarr;
    }

    private static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}