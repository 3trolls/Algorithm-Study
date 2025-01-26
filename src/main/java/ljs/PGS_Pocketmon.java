package ljs;

public class PGS_Pocketmon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[] {3, 3, 3, 2, 2, 2};
		int answer = 0;
		int max = nums.length / 2;
        boolean[] a = new boolean[200000];
        
        for(int i=0; i < nums.length; i++){
            if(a[nums[i] - 1] == false){
                a[nums[i] - 1] = true;
                answer++;
            }
            
            if(answer >= max){
                break;
            }
        }
        
        System.out.println(answer);

	}

}
