package yhs;

import java.util.Arrays;
import java.util.Stack;

public class Week2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        Stack<Integer> stack = new Stack();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = stack.stream()
                .mapToInt(i -> i)
                .toArray();

        System.out.print(Arrays.toString(answer));
    }
}
