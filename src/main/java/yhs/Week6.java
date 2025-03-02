package yhs;

import java.util.Arrays;

public class Week6 {
    public static void main(String[] args) {
        int answer1 = solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
        int answer2 = solution(5, new int[]{2, 4}, new int[]{3});
        int answer3 = solution(3, new int[]{3}, new int[]{1});

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.print(answer3);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] students = new int[n + 2];

        // 모든 학생이 체육복이 있다고 가정
        Arrays.fill(students, 1);

        // 여벌 체육복이 있는 학생
        for(int i = 0; i < reserve.length; i++) {
            students[reserve[i]]++;
        }

        // 일부 학생이 체육복을 도난
        for(int i = 0; i < lost.length; i++) {
            students[lost[i]]--;
        }

        for(int i = 1; i <= students.length - 2; i++) {
            // 체육복이 없는 경우
            if(students[i] == 0) {
                // 앞번호의 학생이 체육복 여벌이 있는 경우
                if(students[i - 1] > 1) {
                    students[i - 1]--;
                    students[i]++;
                }
                // 뒷번호의 학생이 체육복 여벌이 있는 경우
                else if(students[i + 1] > 1) {
                    students[i + 1]--;
                    students[i]++;
                }
                // 앞,뒷번호의 학생이 체육복 여벌이 없는 경우
                else {
                    answer--;
                }
            }
        }

        return answer;
    }
}
