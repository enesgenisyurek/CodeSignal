/*
Given array of integers, remove each kth element from it.
*/

int[] solution(int[] inputArray, int k) {
    
    LinkedList<Integer> liste = new LinkedList<>();
    
    for (int i = 0; i < inputArray.length; i++) {
        if ((i + 1) % k != 0){
            liste.add(inputArray[i]);
        }
    }
    int[] intDizi = new int[liste.size()];
    for (int i = 0; i < liste.size(); i++) {
        intDizi[i] = liste.get(i);
    }
    return intDizi;
}
