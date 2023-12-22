import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
   
int N=Integer.parseInt(nyuA);
String S=sc.nextLine();
int ans=0;
for(int i=0;i<=N;i++){
int temp=func(S.substring(0,i),S.substring(i));
ans=Math.max(ans,temp);
}

System.out.println(ans);
}

static int func(String s,String t){
int ans=0;
for(char c='a';c<='z';c++){
boolean founds=false,foundt=false;
for(int i=0;i<s.length();i++){
if(s.toCharArray()[i]==c){
founds=true;
}//if
}//f
for(int i=0;i<t.length();i++){
if(t.toCharArray()[i]==c){
foundt=true;
}//if
}//f

if(founds && foundt)ans++;
}//f
return ans;
}

}

