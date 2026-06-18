class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rowWiseFrequency = new HashSet[9];
        HashSet<Character>[] colWiseFrequency = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];

        for(int i=0;i<9;i++){
            rowWiseFrequency[i] = new HashSet<>();
            colWiseFrequency[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i=0;i<9;i++){ //row loop
            for(int j=0;j<9;j++){ //column loop
                if(board[i][j]!='.'){
                    if(!colWiseFrequency[j].add(board[i][j])) return false;
                    if(!rowWiseFrequency[i].add(board[i][j])) return false;
                    int boxIndex = ( i / 3 )*  3 +( j / 3 );
                    if(!box[boxIndex].add(board[i][j])) return false;
                }
            }
        }
        return true;
    }

}
