package codechef;

import java.util.*;
public class Main{
	static int gcd(int a, int b) 
    { 
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
        if (a == b) 
            return a; 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    } 
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
  ArrayList<Integer> val = new ArrayList<Integer>();
  for (int i=1;i<=a;i++){
    if(a%i==0){
    val.add(i);
    }}
  long total=0;
  for(int i=0;i!=val.size();i++){
  for(int j=0;j!=val.size();j++){
  for(int k=0;k!=val.size();k++){
  total+=gcd(gcd(val.get(i),val.get(j)),val.get(k));
//  System.out.println(gcd(gcd(val.get(i),val.get(j)),val.get(k)));
  }
  }
  }
        System.out.println(total);
}
}
