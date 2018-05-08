package algo;

import java.util.stream.IntStream;

public class JumpCase {

	 public int jumpCase(int num) {
	      
		 int answer = 0;
		 
		 /* 
	     int fir = 1;
	     int sec = 2;
	        
	     switch (num) {
			case 1:
				answer = 1;
				break;
			case 2:
				answer = 2;
				break;

			default:
				
				for(int i = 3; i <= num; i++){
					answer = fir + sec;
		        	fir = sec;
		        	sec = answer;
				}
				
				break;
			}	   */             
	        
		 
		 if(num <= 2) return num;
		 	answer = jumpCase(num-1) + jumpCase(num-2);
		 return answer;
		 
		 
		 
	    }

	    public static void main(String[] args) {
	        JumpCase c = new JumpCase();
	        int testCase = 4;
	        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	        System.out.println(c.jumpCase(testCase));
	    }
	    
}
