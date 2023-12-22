class Main {
 
  public static String StringPeriods(String str) {
    boolean flag = false;
    String ans = "";
    for(int i=0;i<str.length();i++){
      String temp = str;
      String substr = str.substring(0,i);
      temp = temp.replaceAll(substr, "");
      if(temp.equals("")) {
    	  flag = true;
    	  ans = substr;
    	  break;
      }
    }
    if(flag) {
    	str = ans;
    }else {
    	str = "-1";
    }
    // code goes here  
    return str;
  }
 
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner sc = new Scanner(System.in);
   int N=sc.nextInt();
   Map<Integer,Integer> map = new HashMap<Integer,Integer>();
   int[] A= new int[N];
   for(int i=0;i<N;i++) {
	   A[i]=sc.nextInt();
	   if(!map.containsKey(A[i])) {
		   map.put(A[i],1);
	   }else {
		   map.put(A[i],map.get(A[i])+1);
	   }
   }
   long anstemp = 0;
   for(Integer key:map.keySet()) {
	   long v = map.get(key);
	   anstemp+=(v*(v-1)/2);
	}
   for(int i=0;i<N;i++) {
	   long ans = anstemp;
	   long v = map.get(A[i]);
	   ans -= (v*(v-1)/2);
	   ans += ((v-1)*(v-2)/2);
	   System.out.println(ans);
   }
   
  }
}
import java.util.*; 
import java.io.*;

class Main {

  public static String StringPeriods(String str) {
    boolean flag = false;
    String ans = "";
    for(int i=0;i<str.length();i++){
      String temp = str;
      String substr = str.substring(0,i);
      temp = temp.replaceAll(substr, "");
      if(temp.equals("")) {
    	  flag = true;
    	  ans = substr;
    	  break;
      }
    }
    if(flag) {
    	str = ans;
    }else {
    	str = "-1";
    }
    // code goes here  
    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner sc = new Scanner(System.in);
   int N=sc.nextInt();
   Map<Integer,Integer> map = new HashMap<Integer,Integer>();
   int[] A= new int[N];
   for(int i=0;i<N;i++) {
	   A[i]=sc.nextInt();
	   if(!map.containsKey(A[i])) {
		   map.put(A[i],1);
	   }else {
		   map.put(A[i],map.get(A[i])+1);
	   }
   }
   long anstemp = 0;
   for(Integer key:map.keySet()) {
	   long v = map.get(key);
	   anstemp+=(v*(v-1)/2);
	}
   for(int i=0;i<N;i++) {
	   long ans = anstemp;
	   long v = map.get(A[i]);
	   ans -= (v*(v-1)/2);
	   ans += ((v-1)*(v-2)/2);
	   System.out.println(ans);
   }
   
  }
}
