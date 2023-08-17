/*
You have deposited a specific amount of money into your bank account. Each year your balance increases at the same growth rate. With the assumption that you don't make any additional deposits, find out how long it would take for your balance to pass a specific threshold.
*/

int solution(int deposit, int rate, int threshold) {
    int count=0;
    double d = (double)deposit;
    if(1<=d && d<=100 && 1<=rate && rate<=100 && d<threshold && threshold<=200){
        while(threshold>d){
        d+=(double)d*rate/100;
        count++;
        
        }
    }
    
    return count;

}
