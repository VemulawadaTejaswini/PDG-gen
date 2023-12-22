import java.util.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	String ans = "Yes";
		String[] w = new String[n];
		for(int i=0; i<w.length; ++i){
			w[i] = scn.next();
		}
      	String[] ww = new String[n];
      	for(int i=0; i<w.length; ++i){
			ww[i] = w[i];
		}
      	Arrays.sort(ww);
      	for(int i=1; i<w.length; ++i){
			if(ww[i].equals(ww[i-1])){
              ans = "No";
            }
		}
      	for(int i=1; i<w.length; ++i){
          char[] last = w[i-1].toCharArray();
          char[] first = w[i].toCharArray();
          if(last[last.length-1] != first[0]){
            ans = "No";
          }
        }
      	System.out.println(ans);
	}
}
