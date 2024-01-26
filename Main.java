import out_of_bounds_path_576.Solution;

public class Main {
    public static void main(String[] args) {
        int m = 1;
        int n = 2;
        int maxMove = 50;
        int startRow = 0;
        int startColumn = 0;

        Solution solution = new Solution();
        int num = solution.findPaths(m, n, maxMove, startRow, startColumn);
        System.out.println(num);
    }
}
