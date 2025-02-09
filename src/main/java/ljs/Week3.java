package ljs;


import java.util.*;

public class Week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int answer2(int[] scoville, int K) {
		int answer = 0;
		int start = 0;
      while(true) {
          Arrays.sort(scoville);
          for(int i=start; i<scoville.length; i++){
              if(scoville[i] >= K){
                  return answer;
              }else{
                  if(i+1 >= scoville.length) return -1;
                  scoville[i + 1] = scoville[i] + scoville[i + 1] * 2;
                  answer++;
                  start++;
                  break;
              }                
          }
         
          if(scoville.length == start){
              break;
          }
      }
     
      return answer;
	}
	
	public static int answer(int[] scoville, int K) {
		int answer = 0;
        Arrays.sort(scoville);
        
        List<Integer> l = new ArrayList<>();
        
        
        if(scoville[0] < K) {        
        
	        int i = 2;
	        int temp = 0;
	        
	        l.add(scoville[0] + scoville[1] * 2);
	        answer++;
	        
	        while(true){
	            if(i >= scoville.length) {
	            	if(l.get(0) < K) answer= -1;
	            	break;
	            }
	            if(scoville[i] >= K && l.get(0) >= K) break;
	            
	            
	            if(scoville[i] < l.get(0)){
	            	if(i + 1 >= scoville.length) {
		            	break;
		            }
	            	
	            	if(scoville[i+1] < l.get(0)) {
		                l.add(scoville[i] + scoville[i+1] * 2);
		                i++;
	            	}else if(scoville[i+1] >= l.get(0)) {
	            		temp = l.remove(0);
		                l.add(scoville[i] + temp * 2);
	            	}
	            }else if(scoville[i] >= l.get(0)){
	                temp = l.remove(0);
	                l.add(temp + scoville[i] * 2);
	            }
	            answer++;
	            i++;
	        }
        }
        
        
        
        
        
        return answer;
	}
	
	
}
