import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
      int flag=0;
      while(n>0){
        if(n%10==7){
          flag=1;break
        }
        n/=10;
      }
      System.out.println(flag==1?"Yes":"NO");		
	}

}
