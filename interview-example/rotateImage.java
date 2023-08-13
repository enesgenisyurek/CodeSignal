/*
Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.

You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).
*/

int[][] solution(int[][] a) {
    
    for (int i = 0; i < a.length / 2; i++)
    {
        for (int j = i; j < a.length - i - 1; j++)
        {
 
            int temp = a[i][j];
            a[i][j] = a[a.length - 1 - j][i];
            a[a.length - 1 - j][i] = a[a.length - 1 - i][a.length - 1 - j];
            a[a.length - 1 - i][a.length - 1 - j] = a[j][a.length - 1 - i];
            a[j][a.length - 1 - i] = temp;
        }
    }
    return a;
    
}

