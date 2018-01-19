package imageio;

public class triangle {

	public static String printTriangle(int num){
		String result = "";
		String star = "*";
		for(int i = 1; i < num + 1; i++){		    
		    for(int j = 1; j < i + 1; j++){
		    	result = result + star;
		    }
		    result = result + "\n";
		}
		
		return result;		
	}

			// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		
		System.out.println( printTriangle(3) );
	}
		
}
