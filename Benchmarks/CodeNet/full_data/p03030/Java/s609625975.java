import java.util.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] s = new String[n];
      	int[] p = new int[n];
      	int[] num1 = new int[n];
		for(int i=0; i<s.length; ++i){
			s[i] = scn.next();
          	p[i] = scn.nextInt();
          	num1[i] = i;
		}
      	String[] ss = new String[n];
      	for(int i=0; i<s.length; ++i){
          ss[i] = s[i];
        }
      	Arrays.sort(ss);
      	int[] pp = new int[n];
      	int[] num2 = new int[n];
      	for(int i=0; i<s.length; ++i){
        	for(int j=0; j<s.length; ++j){
             	if(ss[i].equals(s[j])){
                  pp[i] = p[j];
                  num2[i] = num1[j];
                }
            }
        }
      	for(int i=0; i<s.length; ++i){
          System.out.println(num2[i]);
        }
	}
}