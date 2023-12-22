import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      	String s=sc.next();
      	int o=0;
      	int l=s.length();
      	for(int i=0;i<l/2;i++){
        	char a=s.charAt(i);
          	char b=s.charAt(l-i-1);
          	if(a!=b)o++;
        }
     	 System.out.println(o);
    }
}