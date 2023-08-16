/*
Given two cells on the standard chess board, determine whether they have the same color or not.
*/

boolean solution(String cell1, String cell2) {
    int x1 = cell1.charAt(0) - 'A'; 
    int x2 = cell1.charAt(1) - '1';
    int y1 = cell2.charAt(0) - 'A';
    int y2 = cell2.charAt(1) - '1';
    return (x1 + y1) % 2 == (x2 + y2) % 2;
}
