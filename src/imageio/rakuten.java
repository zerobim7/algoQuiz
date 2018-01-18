package imageio;

import java.util.Scanner;

public class rakuten {

	public static void main(String[] args) {
		
		int A, B, C, D, E, F, G, H;		
		int result;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert 1st figure");
		System.out.println("1st Point (horizontal , vertical)");
		A = scan.nextInt();
		B = scan.nextInt();
		System.out.println("2nd Point (horizontal , vertical)");
		C = scan.nextInt();
		D = scan.nextInt();
		
		System.out.println("Insert 2nd figure");
		System.out.println("1st Point (horizontal , vertical)");
		E = scan.nextInt();
		F = scan.nextInt();
		System.out.println("2nd Point (horizontal , vertical)");
		G = scan.nextInt();
		H = scan.nextInt();
		
		int area1 = AREAWIDHEI(A, B, C, D);
		int area2 = AREAWIDHEI(E, F, G, H);

		int jungwid = JUNGBOK(A, C, E, G);
		int junghei = JUNGBOK(B, D, F, H);		
		
		result = area1 + area2 - (jungwid * junghei);
		
		System.out.println("Total Area = " + result);
		
	}

	
	
	
	public static int AREAWIDHEI(int A, int B, int C, int D){
		
		int result = 0;
		
		if(A > C){
			int save = A;
			A = C;
			C = save;
		}
		if(B > D){
			int save = B;
			B = D;
			D = save;
		}
		
		result = (C-A) * (D-B);
		
		if(A == C || B == D){
			result = 0;
		}
		
		return result;
		
	}
	

	public static int JUNGBOK(int A, int B, int C, int D){
		
		int result = 0;		
				
		if(A > B){
			int save = A;
			A = B;
			B = save;
		}
		if(C > D){
			int save = C;
			C = D;
			D = save;
		}
		
		int a1 = B - A + 1;
		int a2 = D - C + 1;
		
		int[] area1 = new int[a1];
		int[] area2 = new int[a2];
		
		area1[0] = A;
		for(int i = 1; i < a1; i++){
			A = A + 1;
			area1[i] = A;
		}
		area2[0] = C;
		for(int i = 1; i < a2; i++){
			C = C + 1;
			area2[i] = C;
		}
		
		for(int i = 0; i < area1.length; i++){
			for(int j = 0; j < area2.length; j++){
				if(area1[i] == area2[j]){
					result = result + 1;
				}
			}
		}
		
		if(result <= 1){
			result = 0;
		} else {
			result = result - 1;
		}
		
		return result;
	}
	
	
}
