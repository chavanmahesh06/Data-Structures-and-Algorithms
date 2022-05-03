#include<stdio.h>
#include<stdlib.h>
#include<limits.h>
#include"arrayheader.h"


void main()
{
    int arr[]={9,3,32,5,1,4,2,-64};
    int min = INT_MAX;
    int max = INT_MIN;
    int len = (&arr)[1] - arr;
    // printf("%d",arr);
    // int len = sizeof(arr)/sizeof(int);
    printf("%d\n",len);
    for(int i=0;i<len;i++){
        if(max < arr[i])
            max = arr[i];
        else if (min > arr[i])
            min = arr[i];
    }
    printf("max = %d\nmin = %d ",max,min);
}
