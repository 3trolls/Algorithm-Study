package yhs;

import java.util.Stack;

public class Week2 {
    public static void main(String[] args) {
        solution(new int[]{1, 1, 3, 0, 1});
        solution(new int[]{4, 4, 4, 3, 3});
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = stack.stream()
                .mapToInt(i -> i)
                .toArray();

        return answer;
    }
}
