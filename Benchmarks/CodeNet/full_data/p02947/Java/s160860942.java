import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
      long result=0;
      String[] arr = new String[n];
      for(int i=0;i<n;i++){
        String s = scan.next();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        s = new String(c);
        arr[i] = s;
        for(int j=0;j<i;j++){
          if(s.equals(arr[j])){
            result++;
          }
        }
      }
      System.out.println(result);

	}      
}
