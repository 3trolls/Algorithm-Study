package yhs;

public class Week5 {
    public static void main(String[] args) {
        int answer1 = solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        int answer2 = solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}});
        int answer3 = solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}});

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.print(answer3);
    }

    public static int solution(int[][] sizes) {
        int currW = sizes[0][0];
        int currH = sizes[0][1];

        for(int i = 1; i < sizes.length; i++) {
            int nextW = sizes[i][0];
            int nextH = sizes[i][1];

            int caseW1 = Math.max(currW, nextW);
            int caseH1 = Math.max(currH, nextH);
            int caseW2 = Math.max(currW, nextH);
            int caseH2 = Math.max(currH, nextW);
            int firstCardSize = caseW1 * caseH1;
            int secondCardSize = caseW2 * caseH2;

            if(firstCardSize < secondCardSize) {
                currW = caseW1;
                currH = caseH1;
            } else {
                currW = caseW2;
                currH = caseH2;
            }
        }

        return currW * currH;
    }
}
