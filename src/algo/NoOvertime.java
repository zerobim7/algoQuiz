package algo;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NoOvertime {
	
	/*public int noOvertime(int no, int[] works) {
		int result = 0;		
		// 야근 지수를 최소화 하였을 때의 야근 지수는 몇일까요?
		
		int la = works.length;
		int sum = 0;
		for(int i = 0; i < no; i++){
			Arrays.sort(works);
			works[la -1] = works[la -1] - 1;	
		}
		
		System.out.println(Arrays.toString(works));
		
		for(int i = 0; i < la; i++){
			System.out.println(works[i]);
			sum = sum + (works[i] * works[i]);
		}
		
		result = sum;

		return result;
	}*/
	
	public static void main(String[] args) {
		NoOvertime c = new NoOvertime();
		int []test = {4,3,3};
		System.out.println(c.noOvertime(4,test));
	}
	
	
	public int noOvertime(int no, int[] works){
		int result = 0;		
		// 야근 지수를 최소화 하였을 때의 야근 지수는 몇일까요?
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> (b - a));
		priorityQueue.addAll(Arrays.stream(works).boxed().collect(Collectors.toList()));
		
		IntStream.range(0, no).forEach(i -> {
											int k = priorityQueue.remove() - 1;
											priorityQueue.add(k);
		});
		
		
		return priorityQueue.stream().mapToInt(i -> i * i).sum();
		
	}

}






