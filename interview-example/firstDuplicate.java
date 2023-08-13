/*

Given an array a that contains only numbers in the range from 1 to a.length, 
find the first duplicate number for which the second occurrence has the minimal index. 
In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a 
smaller index than the second occurrence of the other number does. If there are no such elements, return -1.

*/

int solution(int[] a) {
    if(a.length==1)
        return -1;
    for (int i = 0; i < a.length; i++) {
        int absValue = Math.abs(a[i]);
        
        if (a[absValue - 1] < 0) {
            return absValue;
        }
        
        a[absValue - 1] = -a[absValue - 1];
    }
        
        return -1;

}
