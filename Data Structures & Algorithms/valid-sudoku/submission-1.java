class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Map<Integer, Set<Character>> rowSeen = new HashMap<>();
        Map<Integer, Set<Character>> colSeen = new HashMap<>();
        Map<Integer, Set<Character>> subGridSeen = new HashMap<>();

        // 1. Row check
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char val = board[row][col];
                if (val == '.') continue;
                if (!rowSeen.computeIfAbsent(row, k -> new HashSet<>()).add(val)) return false;
            }
        } 

        // 2. Col check
        for (int col = 0; col < 9; col++) {
            for (int row = 0; row < 9; row++) {
                char val = board[row][col];
                if (val == '.') continue;
                if (!colSeen.computeIfAbsent(col, k -> new HashSet<>()).add(val)) return false;
            }
        } 

        // 3. Grid check
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char val = board[row][col];
                if (val == '.') continue;
                
                int gridIndex = (row / 3) * 3 + (col / 3); 
                if (!subGridSeen.computeIfAbsent(gridIndex, k -> new HashSet<>()).add(val)) return false;
            }
        }

        return true;
    }
}
