class Solution {
    public void solveSudoku(char[][] board) {
        backTracking(0,board);
    }

    public boolean backTracking(int index, char[][] board){
        if(index > 80){
            return true;
        }
        int h;
        int w;
        if(index == 0){
            h = 0;
            w = 0;
        }else{
            h = index/9;
            w = index%9;
        }
        if (board[h][w] == '.') {
            for(int i = 1; i <= 9; i++){
                board[h][w] = Character.forDigit(i,10);
                if(isValid(h,w,board)){
                    if(backTracking(index+1,board)){
                        return true;
                    }
                }
            }
            board[h][w] = '.';
            return false;
        }else{
            return backTracking(index + 1, board);
        }
    }

    public boolean isValid(int h, int w, char[][] board){
        char checkNumber = board[h][w];
        for(int i = 0; i < 9; i++){
            //가로체크
            if(i!=w && board[h][i] == checkNumber){
                return false;
            }
            //세로체크
            if(i!=h && board[i][w] == checkNumber){
                return false;
            }
            //3x3체크
            int checkHeight = i/3 + ((h/3)*3);
            int checkWidth = i%3 + ((w/3)*3);
            if(checkHeight != h && checkWidth != w && board[checkHeight][checkWidth] == checkNumber){
                return false;
            }
        }
        return true;
    }
}