package imageio;

import java.util.Arrays;
import java.util.Collections;

public class reverseStr {
	
	public static String reverseStr(String str){
		
		//char[] nlist = str.toCharArray();
		String[] nlist = str.split("");
		Arrays.sort(nlist, Collections.reverseOrder());		
		
		return String.join("", nlist);
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		System.out.println( reverseStr("Zbcdefg") );
	}

}
