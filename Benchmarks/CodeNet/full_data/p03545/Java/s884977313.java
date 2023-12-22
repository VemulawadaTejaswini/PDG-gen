import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String s = sc.next();
		int n = s.length() - 1;
		char[] a = new char[s.length()];
        int[] A = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
          a[i] = s.charAt(i);
          A[i] = Character.getNumericValue(a[i]);
        }
		
		for (int i = 0; i < Math.pow(2,n); i++) {
		  int sum = A[0];
          String S = "";
          S += a[0];
          for(int j = 0; j < n; j++){
            if((i & (1 << j)) == 0){
              sum += A[j+1];
              S += '+';
              S += a[j+1];
            }else{
              sum -= A[j+1];
              S += '-';
              S += a[j+1];
            }
          }
          if(sum == 7){
            System.out.println(S + "=7");
            break;
          }
		}
      
	}
}