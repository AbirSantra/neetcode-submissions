class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                char ch = board[r][c];
                if(ch != '.'){
                    if(!seen.add("R" + r + ch)){
                        return false;
                    }
                    if(!seen.add("C" + c + ch)){
                        return false;
                    }
                    if(!seen.add("B" + ((r / 3) * 3 + (c / 3)) + ch)){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
