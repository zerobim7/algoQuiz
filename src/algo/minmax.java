package algo;

public class minmax {

	public static class GetMinMaxString {
	    public String getMinMaxString(String str) {
	      String num[] = str.split(" ");
	      int min = Integer.parseInt(num[0]);
	      int max = Integer.parseInt(num[0]);
	      String result = "";
	      for(int i = 1; i < num.length; i++){
	    	  int aa = Integer.parseInt(num[i]);
	       	 if(min > aa){
	          	 min = aa;
	         }
	        if(max < aa){
	         	max = aa; 
	        }
	      }
	      
	      result = min + " " + max;
	        return result;
	    }

	    public static void main(String[] args) {
	        String str = "1 2 3 4";
	        GetMinMaxString minMax = new GetMinMaxString();
	        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	        System.out.println("�ִ밪�� �ּҰ���?" + minMax.getMinMaxString(str));
	    }
	}
	
}
