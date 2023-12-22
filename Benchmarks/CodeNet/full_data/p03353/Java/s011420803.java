import java.util.Arrays;
import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  String s = sc.next();
  int k = sc.nextInt();
  int k1 = 0;
  int k2 = 0;
  int k3;
  char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  int[] ex = new int[26];
  Arrays.fill(ex,0);
  for(int i = 0;i < s.length();i++){
    for(int j = 0;j < 26;j++){
  if(s.charAt(i) == alp[j] && ex[j] == 0){
    ex[j] = 1;
    break;
  }
    }
  }
  int first = -1;
  int second = -1;
  int third = 25;
  for(int i = 0;i < 26;i++){
    if(first == -1 && ex[i] == 1){
      first = i;
    }
    else if(first != -1 && second == -1 && ex[i] == 1){
      second = i;
    }
    else if(first != -1 && second != -1 && third == -1 && ex[i] == 1){
      third = i;
      break;
    }
  }
  String ans = "zzzzz";
  for(int i = 0;i < s.length();i++){
    if(s.charAt(i) == alp[first]){
      int till = s.length()  -i;
      k1 = k - till;
      if(k1 <= 0){
        if(s.substring(i,i+k).compareTo(ans) <= 0) {
        	ans = s.substring(i,i+k);
        }
      }
      else{for(int j = 0;j < s.length();j++){
    	    if(s.charAt(j) == alp[second]){
    	         till = s.length()  -j;
    	        k2 = k1 - till;
    	        if(k2 <= 0){
    	        	if(s.substring(j,j+k1).compareTo(ans) <= -1) {
    	            	ans = s.substring(j,j+k1);
    	            }
    	        }
    	        
    	      }
    	    }
    	    
    }
  }
  }
  System.out.println(ans);
}}