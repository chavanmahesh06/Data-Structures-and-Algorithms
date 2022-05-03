package Array;

public class Sort012
{
    static void sort(int a[], int size)
    {
        int l0=0;
        int hi=size-1;
        int mid=0;
        int temp=0;

        while(mid<=hi)
        {
            switch(a[mid])
            {
                case 0:
                {
                    temp=a[l0];
                    a[l0]=a[mid];
                    a[mid]=temp;
                    l0++;
                    mid++;
                    break;
                }

                case 1:
                {
                    mid++;
                    break;
                }

                case 2:
                {
                    temp= a[mid];
                    a[mid]=a[hi];
                    a[hi]=temp;
                    hi--;
                    break;
                }
            }
        }
    }

    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void main(String args[])
    {
        int arr[]={1,0,2,0,1,1,0,0,2,2};
        int size=10;
        sort(arr, size);
        System.out.println("Array after seggregation ");
        printArray(arr, size);

    }
}
