package yhs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Week4 {
    public static void main(String[] args) {
        int[] answer = solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

        System.out.print(Arrays.toString(answer));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int l = 0; l < commands.length; l++) {
            int[] command = commands[l];
            int i = command[0];
            int j = command[1];
            int k = command[2];

            List<Integer> list = new ArrayList<>();
            // 1.array i번째부터 j번째까지 자르면
            for (int m = i - 1; m < j; m++) {
                list.add(array[m]);
            }
            // 2.1에서 나온 배열을 정렬하면
            Collections.sort(list);

            // 3.2에서 나온 배열의 k번째 숫자
            answer[l] = list.get(k - 1);
        }

        return answer;
    }
}
