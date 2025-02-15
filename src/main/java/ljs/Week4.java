package ljs;


import java.util.*;

public class Week4 {
	
	public static void main(String[] args) {
		int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(solution(array, commands)); 
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<commands.length; i++){
            int find = commands[i][2];
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                arr.add(array[j]);
                Collections.sort(arr);
            }
            answer[i] = arr.get(find-1);
            arr.clear();
        }
        
        return answer;        

    }
}
