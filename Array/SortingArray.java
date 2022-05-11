//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

class SortingArray
{
    public static void main(String[] args) 
    {
        //  System.out.println("learncoding");
        int arr[]={1,2,0,0,0,2,2,1,1,1,0};
        int i=0,j=0,k=arr.length-1;
        System.out.println("Before sorting: ");
        printarr(arr);
        while(j<=k)
        {
            if(arr[j]==0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[j]==1){
                j++;
            }
            else if(arr[j]==2){
                swap(arr,k,j);
                j++;
                k--;
            }
        }
        System.out.println("\nAfter sorting: ");
        printarr(arr);
    }

    private static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}