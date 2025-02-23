package ljs;

import java.util.ArrayList;
import java.util.Collections;

public class Week5 {

	public static void main(String[] args) {		
		int[][] sizes = new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(solution(sizes)); 
	}
	
	public static int solution(int[][] sizes) {
        int bob = 0 , bos = 0;
        for(int i=0; i<sizes.length; i++){
            
            if(sizes[i][0] < sizes[i][1]){
                if(bob < sizes[i][1]){
                    bob = sizes[i][1];
                }
                if(bos < sizes[i][0]){
                    bos = sizes[i][0];
                }
            }else{
                if(bob < sizes[i][0]){
                    bob = sizes[i][0];
                }
                if(bos < sizes[i][1]){
                    bos = sizes[i][1];
                }
            }
            
        }
        int answer = bob * bos;
        return answer;
    }

}
