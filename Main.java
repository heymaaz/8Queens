class Main {
    static int count = 0;
    public static void main(String[] args) {
        // 8 queens problem
        int n = 8;
        int[] board = new int[n];
        for (int i = 0; i < n; i++) {
            board[i] = -1;
        }
        solve(board, 0);
        System.out.println("Total solutions: " + count);
    }
    static void solve(int[] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isValid(board, row, i)) {
                board[row] = i;
                solve(board, row + 1);
                board[row] = -1;
            }
        }
    }
    static boolean isValid(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col) {// same column
                return false;
            }
            if (Math.abs(row - i) == Math.abs(col - board[i])) {// same diagonal calculated by slope: (y2-y1)/(x2-x1) = 1 or -1. So, |y2-y1| = |x2-x1|
                return false;
            }
        }
        return true;
    }
    static void printBoard(int[] board) {
        count++;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i] == j) {
                    System.out.print("Q ");
                } 
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}