package Array;

public class ReverseArray
{
    static void reverseArray(int arr[],int start, int end)
    {
        int temp;
        while(start < end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[],int size)
    {
        System.out.println("Array is :");
        for (int i=0; i<size; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7};
        printArray(arr, 7);
        reverseArray(arr, 0, 6);
        printArray(arr, 7);
    }
}