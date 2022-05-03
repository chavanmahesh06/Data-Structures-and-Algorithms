//Find the "Kth" max and min element of an array 

#include<stdio.h>
#include<limits.h>

int max(int *arr,int len)
{
    int max = INT_MIN;
    for(int i=0;i<len;i++)
    {
        if(arr[i]>max)
            max=arr[i];
    }
    return max;
}

// int secMax(int *arr,int len)
// {
//     int max1=max(arr,len);
//     int max2=arr[0];
//     for(int i=0;i<len;i++){
//         if(arr[i]!=max1 && max2<arr[i])
//         {
//             max2 = arr[i];
//         }
//         printf("%d\n",max2);
//     }
//     return max2;
// }



int kthmaxhelper(int *arr,int len,int k,int MaxForThisIteration)
{
    if(k==1)
    {
        return MaxForThisIteration;
    }

    int max2 = arr[0];
    for(int i=0;i<len;i++)
    {
        if(arr[i]<MaxForThisIteration && max2<arr[i])
        {
            max2 = arr[i];
        }
    }
    return kthmaxhelper(arr,len,k-1,max2);
}

int kthmax(int *arr,int len,int k)
{
    int maxelem = max(arr,len);
    return kthmaxhelper(arr,len,k,maxelem);
}


//minimum
int min(int *arr,int len)
{
    int minelem = INT_MAX;
    for(int i=0;i<len;i++)
    {
        if(minelem>arr[i])
        {
            minelem = arr[i];
        }
    }
    return minelem;
}

int kthminhelper(int *arr,int len,int k,int MinForThisIteration)
{
    if(k==1)
    {
        return MinForThisIteration;
    }

    int min2 = INT_MAX;
    for (int i=0;i<len;i++)
    {
        if(arr[i]>MinForThisIteration && min2>arr[i])
        {
            min2 = arr[i];
        }
    }
    return kthminhelper(arr,len,k-1,min2);
}

int kthmin(int *arr,int len,int k)
{
    int minelem = min(arr,len);
    return kthminhelper(arr,len,k,minelem);
}

void main()
{
    int arr[]={12,65,-65,-23,46,8,2,-3,7,41};
    int len = (&arr)[1]-arr;
    printf("%d\n",kthmax(arr,len,3)); //finding 3rd max elem
    printf("%d",kthmin(arr,len,3));   //finding 3rd min elem
}