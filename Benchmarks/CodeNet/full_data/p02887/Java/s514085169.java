import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b=sc.next();
      	char tmp='\0',tmp1='\0';

		int total=1;
		for(int i=0;i<a;i++)
        {  
          tmp1=tmp;
          tmp=b.charAt(i);          
          if(i>0)
          {
            if(tmp1!=tmp)
            {
            	total+=1;
            }
          }          
        }
		System.out.println(total);
	}
}