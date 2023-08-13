boolean solution(char[][] grid) {
    boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] subgrids = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] != '.') {
                    int numIndex = grid[i][j] - '1';
                    int subgridIndex = (i / 3) * 3 + j / 3;

                    if (rows[i][numIndex] || columns[j][numIndex] || subgrids[subgridIndex][numIndex]) {
                        return false;
                    }
                    rows[i][numIndex] = columns[j][numIndex] = subgrids[subgridIndex][numIndex] = true;
                }
            }
        }

        return true;
}
