package add_two_numbers_2;

import java.util.Arrays;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return createList(reverseAndSum(reverseNum(sumOf(l1)), reverseNum(sumOf(l2))));
    }

    public String sumOf(ListNode list) {
        String stringSum = "";

        while (list != null) {
            stringSum += list.val;
            list = list.next;
        }
        return stringSum;
    }

    public String reverseNum(String number) {
        return new StringBuffer(number).reverse().toString();
    }

    public int[] reverseAndSum(String number1, String number2) {
        if (number1.length() > number2.length()) {
            number2 = String.format("%" + number1.length() + "s", number2).replace(' ', '0');
        } else {
            number1 = String.format("%" + number2.length() + "s", number1).replace(' ', '0');
        }
        int[] reverse = new int[number1.length()];
        int buffer = 0;
        for (int i = number1.length() - 1; i >= 0; --i) {
            int num1 = Character.getNumericValue(number1.charAt(i));
            int num2 = Character.getNumericValue(number2.charAt(i));
            if (num1 + num2 + buffer > 9) {
                reverse[-1*(i - number1.length() + 1 )] = (num1 + num2 + buffer) % 10;
                buffer =  (num1 + num2 + buffer) / 10;
            } else {
                reverse[-1*(i - number1.length() + 1)] = num1 + num2 + buffer;
                buffer = 0;
            }
        }
        if (buffer > 0) {
            int[] reverseWithOverflow = Arrays.copyOf(reverse, reverse.length + 1);
            reverseWithOverflow[reverse.length] = buffer;
            return reverseWithOverflow;
        }
        return reverse;
    }

    public ListNode createList(int... values) {
        ListNode head = null;
        ListNode current = null;

        for (int val : values) {
            if (head == null) {
                head = new ListNode(val);
                current = head;
            } else {
                current.next = new ListNode(val);
                current = current.next;
            }
        }

        return head;
    }
}