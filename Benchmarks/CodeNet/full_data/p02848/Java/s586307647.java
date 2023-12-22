import java.util.*;
public class Main {
    public static void main(String[] args) {
      	Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	String s=sc.next();
      	int l=s.length();
      	String o="";
      	byte[] b=s.getBytes();
      	for(int i=0;i<l;i++){
          	b[i]+=n;
          	if(b[i]>90)b[i]-=26;
        }
      o=new String(b);
      	System.out.println(o);
    }
}