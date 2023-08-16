/*
Check if all digits of the given integer are even.
*/

boolean solution(int n) {
    
    int temp=n;
    
    while (temp>0) {
        int digit=temp%10;
        if(digit%2!=0){
            return false;
        }
        temp/=10;
    }
    return true;

}
