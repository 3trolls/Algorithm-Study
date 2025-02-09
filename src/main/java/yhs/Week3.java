package yhs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Week3 {
    public static void main(String[] args) {
        int answer = solution(new int[]{1, 2, 3, 9, 10, 12}, 7);

        System.out.print("answer = " + answer);
    }

    public static int solution(int[] scoville, int K) {
        int answer = -1;

        List<Integer> scovilles = Arrays.stream(scoville)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; ; i++) {
            // 모든 음식의 스코빌 지수 확인
            if (hasHighScoville(scovilles, K)) {
                answer = i;
                break;
            }

            // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우
            if (scovilles.size() < 2) {
                break;
            }

            Collections.sort(scovilles);

            int firstScoville = scovilles.remove(0);
            int secondScoville = scovilles.remove(0);
            int mixedScroville = firstScoville + (secondScoville * 2);

            scovilles.add(mixedScroville);
        }

        return answer;
    }

    public static boolean hasHighScoville(List<Integer> scovilles, int K) {
        return scovilles.stream().allMatch(scoville -> scoville >= K);
    }
}
