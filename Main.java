import add_two_numbers_2.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = solution.createList(2, 4, 9);

        ListNode l2 = solution.createList(5, 6, 4, 9);

        ListNode result = solution.addTwoNumbers(l1, l2);
        result.printList();
    }
}
