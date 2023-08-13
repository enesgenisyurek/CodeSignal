/*
Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. 
If there is no such character, return '_'.

*/

char solution(String s) {
    int[] arr = new int[26];
    for (int i = 0; i < s.length(); i++) {
        arr[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < s.length(); i++) {
        if (arr[s.charAt(i) - 'a'] == 1) {
            return s.charAt(i);
            
        }
    }
    return '_';
    
}
