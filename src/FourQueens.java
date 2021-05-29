public class FourQueens {
    static final int N = 4;

    static void InGiaiPhap(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    // Kiem tra vi tri
    static boolean ViTriAnToan(int board[][], int row, int col) {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // ham dieu kien
    public static boolean Try(int board[][], int col) {
        if (col >= N)
            return true;

        for (int i = 0; i < N; i++) {
            //Dat vao vi tri an toan
            if (ViTriAnToan((board), i, col)) {
                board[i][col] = 1;

                if (Try(board, col + 1))
                    return true;


                board[i][col] = 0;
            }
        }
        return false;
    }

    // Tao ban co 4x4
    public static void main(String args[]) {
        int board[][] = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};

        if (!Try(board, 0)) {
            System.out.print("Khong co phuong phap");
            return;
        }
        InGiaiPhap(board);

    }
}
