package add_two_numbers_2;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void printList() {
        ListNode current = this; // Start from the current node

        while (current != null) {
            System.out.print(current.val + " "); // Print the value of the current node
            current = current.next; // Move to the next node
        }

        System.out.println(); // Move to the next line after printing all values
    }
}
