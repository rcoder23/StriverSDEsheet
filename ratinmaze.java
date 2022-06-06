import java.util.*;
public class Solution {
    static void solve(int[][] maze, ArrayList<ArrayList<Integer>> ans, int[][] vis, int[][] move, int n, int i, int j) {
        if (i == n-1 && j == n - 1) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int k = 0 ; k < n ; k++) {
                for (int l = 0 ; l < n ; l++) {
                    temp.add(vis[k][l]);
                }
            }
            ans.add(temp);
            return;
        }
        for (int k = 0 ; k < 4 ; k++) {
            int nexti = i + move[k][0];
            int nextj = j + move[k][1];
            if (isSafe(nexti, nextj, maze, vis, n)) {
                vis[nexti][nextj] = 1;
                solve(maze, ans, vis, move, n, nexti, nextj);
                vis[nexti][nextj] = 0;
            }
        }
    }
    static boolean isSafe(int nexti, int nextj, int[][] maze, int[][] vis, int n) {
        if (nexti >= 0 && nexti < n && nextj >= 0 && nextj < n && maze[nexti][nextj] == 1 && vis[nexti][nextj] == 0) {
            return true;
        }
        return false;
    }
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        if (n == 0) {
            return ans;
        }
        
        int[][] vis = new int[n][n];
        int[][] move = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        
        if (maze[0][0] == 1) {
            vis[0][0] = 1;
            solve(maze, ans, vis, move, n, 0, 0);
        }
        
        return ans;
    }
}