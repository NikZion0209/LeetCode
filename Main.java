import two_sum_1.Solution;

public class Main {
    public static void main(String[] args) {
        int[] nums = {7,11,15,2};
        int target = 9;

        Solution solution = new Solution();
        int[] num = solution.twoSum(nums, target);
        System.out.println(num);
    }
}
