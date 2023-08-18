/*
Given a sorted array of integers a, your task is to determine which element of a is closest to all other values of a. In other words, find the element x in a, which minimizes the following sum:

> abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)

(where abs denotes the absolute value)

If there are several possible answers, output the smallest one.
*/


int solution(int[] a) {
    int sonuc=Integer.MAX_VALUE;
    int index=0;
    for (int i = 0; i < a.length; i++) {
        int sum=0;
        for (int j = 0; j < a.length; j++) {
            sum+=Math.abs(a[j]-a[i]);
            
        }
        if(sum<sonuc){
            sonuc=sum;
            index=i;
        }
    }
    return a[index];
}
