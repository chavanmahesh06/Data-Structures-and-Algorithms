package Array;

public class KMinMax 
{
    static void getMin(int arr[], int size, int k)
    {
        int temp;
        int i,j;
        for (i=0;i<size;i++)
        {
            for(j= i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        // for (i = 0; i < arr.length; i++) {     
        //     System.out.print(arr[i] + " ");    
        // }    

        System.out.printf("\n The %d th minimum element is %d \n", k,arr[k-1]);
    }

    static void getMax(int arr[], int size, int k)
    {
        int temp;
        int i,j;
        for (i=0;i<size;i++)
        {
            for(j= i+1;j<size;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        // for (i = 0; i < arr.length; i++) {     
        //     System.out.print(arr[i] + " ");    
        // }    
        System.out.printf("\n The %d th maximum element is %d \n", k,arr[k-1]);
    }

    public static void main(String args[])
    {
        int arr[]={3,4,1,2,6,5};
        int size= 6;
        getMax(arr, size, 3);
        getMin(arr, size, 2);
    }
}
