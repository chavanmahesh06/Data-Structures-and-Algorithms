package Array;

public class MaxMin
{
    static void getMinMax(int arr[], int size)
    {
        int max=arr[0];
        int min=arr[0];

        for(int i=1;i<size;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
            else if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.printf("Minimum Element is %d", min);
        System.out.println();
        System.out.printf("Maximum Element is %d ", max);
        System.out.println();


    }

    public static void main(String args[])
    {
        int arr[]= {1,2,3,4,5,6,7};
        int size= 7;

        getMinMax(arr, size);

    }

}