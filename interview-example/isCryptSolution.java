/*
A cryptarithm is a mathematical puzzle for which the goal is to find the correspondence between letters and digits, such that the given arithmetic 
equation consisting of letters holds true when the letters are converted to digits.
You have an array of strings crypt, the cryptarithm, and an array containing the mapping of letters and digits, solution. 
The array crypt will contain three non-empty strings that follow the structure: [word1, word2, word3], which should be interpreted as the word1 + word2 = word3 
cryptarithm. If crypt, when it is decoded by replacing all of the letters in the cryptarithm with digits using the mapping in solution, 
becomes a valid arithmetic equation containing no numbers with leading zeroes, the answer is true. If it does not become a valid arithmetic solution, 
the answer is false.
Note that number 0 doesn't contain leading zeroes (while for example 00 or 0123 do)
*/


boolean solution(String[] crypt, char[][] solution) {
    long first = 0;
    long second = 0;
    long third = 0;
    boolean flag = false;
    for(int i = 0; i < crypt.length; i++){
        String temp = "";
        for(int j = 0; j < crypt[i].length(); j++){
            for(int t = 0; t < solution.length; t++){
                if(crypt[i].charAt(j) == solution[t][0]){
                    if(solution[t][1] == '0' && j == 0 && crypt[i].length() > 1){
                        return false;
                    }
                    temp += solution[t][1];
                }
            }
        }
        if(i == 0){
            first = Long.parseLong(temp);
            temp = "";
        }
        if(i == 1){
            second = Long.parseLong(temp);
            temp = "";
        }
        if(i == 2){
            third = Long.parseLong(temp);
            temp = "";
        }
    }
    if(first + second == third){
        flag = true;
    }
    return flag;   
}
       
