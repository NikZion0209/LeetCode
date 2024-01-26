import common_subsequence_1143.Solution;

public class Main {
    public static void main(String[] args) {
        String text1 = "mhunuzqrkzsnidwbun";
        String text2 = "szulspmhwpazoxijwbq";

        Solution solution = new Solution();
        int num = solution.longestCommonSubsequence(text1, text2);
        System.out.println(num);
    }
}
