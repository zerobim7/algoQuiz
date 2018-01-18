package imageio;

import java.util.Arrays;

public class minmax2 {
	
	 public static int[] gcdlcm(int a, int b) {
	      int[] answer = new int[2];
	      int min = 1;
	      int max = 1;
	      
	      if( a > b){
	       	int save = a;
	        a = b;
	        b = save;
	      }
	      
	      for(int i = 1; i < a + 1; i++){
	       	 if(a%i==0 && b%i==0){
	           min *= i;
	         }
	      }
	      
	      int num = 0;
	      for(int i = 1; i < b + 1; i++){        
	       	 if(a%i==0 && b%i==0){
	        	if(i > num){
	             	num = i; 
	            } 
	         }
	      }
	      System.out.println(num);
	      max = num * (a/num) * (b/num);
	      
	      answer[0] = min;
	      answer[1] = max;

	        return answer;
	    }

	    // 아래는 테스트로 출력해 보기 위한 코드입니다.
	    public static void main(String[] args) {
	        //TryHelloWorld c = new TryHelloWorld();
	        System.out.println(Arrays.toString(gcdlcm(3, 12)));
	    }

}
