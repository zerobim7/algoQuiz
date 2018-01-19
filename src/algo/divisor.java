package imageio;

import java.util.Arrays;
import java.util.List;

public class divisor {
	
	public static int[] divisible(int[] array, int divisor) {
		//ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.
		
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
		
		ret = Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
		
		
		List<String> nums = Arrays.asList("1", "2", "3");
		int sum = nums.stream().mapToInt(Integer::parseInt).filter(i -> 1 % 2 == 1).sum();
		
		
		return ret;
	}
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( divisible(array, 5) ));
	}

}