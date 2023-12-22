import java.util.*;
import java.math.*;

class Main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] count = new int[200005];
   for(int i=0;i<count.length;i++){
     count[i] = 0;
   }
   int[] a = new int[n];
   for(int i=0;i<n;i++) {     
   int t = sc.nextInt();
   a[i] = t;
   count[t] += 1;
            }
   long ret = 0;
   for(int i=0;i<count.length;i++){
     ret += count[i]*(count[i]-1);
   }
   ret /= 2;
   for(int i=0;i<n;i++) { 
   int t = a[i];
   long remove = count[t]*(count[t]-1) - (count[t]-1)*(count[t]-2);
   remove /= 2;
   System.out.println(ret-remove);
   }
}
  static boolean isPalindrome (String s) {
	int n = s.length();
	for (int i=0; i<n/2; i++) {
		if (s.charAt(i)!=s.charAt(n-i-1)) {return false;}
	}
	return true;
}
}
