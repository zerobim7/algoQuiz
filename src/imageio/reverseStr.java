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

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		System.out.println( reverseStr("Zbcdefg") );
	}

}
