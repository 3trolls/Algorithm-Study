package ljs;

public class Week6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] lost = new int[] {1, 2};
		int[] reserve= new int[] {1, 2};
		System.out.println(solution(n, lost, reserve));

	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
        int lost_idx = 0, reverse_idx = 0;
        int[] temp = new int[n];
        
        for(int i=0; i<n; i++){
            temp[i] =  1;
        }
        
        for(int i=0; i<lost.length; i++){
            temp[lost[i] - 1] -= 1;
        }
        
        for(int i=0; i<reserve.length; i++){
            temp[reserve[i] - 1] += 1;
        }
        
        for(int i=0; i<temp.length; i++){
            if(temp[i] == 0){
                if(i-1 >= 0 && temp[i-1] == 2){
                    temp[i] = 1;
                    temp[i-1] = 1;
                    answer ++;
                }else if(i+1 < temp.length && temp[i+1] == 2){
                    temp[i] = 1;
                    temp[i+1] = 1;
                    answer ++;                    
                }
                
            }else if(temp[i] >= 1){
                answer++;
            }
        }        
        
        
        return answer;      
	}

}
