package ljs;

import java.util.ArrayList;

public class PGS_Stack_1 {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 1, 3, 3, 0, 1, 1};
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
        int del = -1;        
        int[] answer ;
        for(int i = 0 ;i < arr.length ;i++){            
            if(arr[i] != del){
                list.add(arr[i]);
                del = arr[i];
            }
            
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();        
        
        for(int i=0 ; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
	}

}
