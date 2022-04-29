#include<stdio.h>
#include<stdlib.h>

void printArr(int arr[],int size)
{
    for(int i=0;i<size;i++)
    {
        printf("%d  ",arr[i]);
    }
}

void swap(int arr[],int i,int j)
{
    int temp;
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

void reversearr(int arr[],int size)
{
    for(int i=0;i<size/2;i++)
    {
        int j = size-i-1;
        swap(arr,i,j);
    }
}

int main()
{
    // printf("Hello World");
    int arr[]={1,2,3,4,5,6};
    int size = sizeof(arr)/sizeof(arr[0]);
    // printf("%d",size);
    printf("Before reversing\n");
    printArr(arr,size);
    reversearr(arr,size);
    printf("\nAfter reversing\n");
    printArr(arr,size);
    return 0;
}
