package algo;

public class Fibonacci {
	
	public static long fibonacci(int num) {
		long answer = 0;
		
		long[] fibo = new long[num+1];
		
		if(num == 0){
			answer = 0;
		} else if(num == 1){
			answer = 1;
		} else {
			fibo[0] = 0;
			fibo[1] = 1;
		
			for(int i = 2; i < num+1; i++){
				fibo[i] = fibo[i-2] + fibo[i-1];
			}		
			answer = fibo[num];			
		}
		
		/*if(num<2){
		      answer=num;
		    }else{
		      answer=fibonacci(num-1)+fibonacci(num-2);
		    }*/

		return answer;
	}

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		int testCase = 70;
		System.out.println(fibonacci(testCase));
	}

}
