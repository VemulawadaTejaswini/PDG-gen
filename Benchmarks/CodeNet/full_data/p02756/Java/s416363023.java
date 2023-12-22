import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder s=new StringBuilder(sc.next());
    int q=sc.nextInt(),t=0,f=0;
    String c="";
    for(int i=0;i<q;i++) {
    	t=sc.nextInt();
    	if(t==1) {
    		//s.reverse();
    	}else {
    		f=sc.nextInt();
    		c=sc.next();
    		if(f==1) {
    			s.insert(0, c);
    		}else {
    			s.append(c);
    		}
    	}
    	//System.out.println(s);
    }
    System.out.println(s);
  }
}
