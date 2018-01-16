package imageio;

import java.util.Arrays;

public class divisor {
	
	public static int[] divisible(int[] array, int divisor) {
		//ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
		
		int count = 0;
		for(int i = 0; i < array.length; i ++){
			if(array[i] % divisor == 0){
				count += 1;
			}
		}
		
		int cnt = 0;
		int[] ret = new int[count];
		for(int i = 0; i < array.length; i ++){
			if(array[i] % divisor == 0){
				ret[cnt] = array[i];
				cnt += 1;
			}
		}
		
		//ret = Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
		return ret;
	}
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( divisible(array, 5) ));
	}

}
