import java.util.*;

 
public class Main {
	public static void main(String[] args) {
 
	Scanner sc  = new Scanner(System.in);
        
    int cnt = 0;

	StringBuilder str = new StringBuilder();
		

    String s1 = sc.next();
    char[] c1 = s1.toCharArray();
    int c=0;

    for(int i = s1.length()-1; i>=0 ; i-- ){
       
       System.out.println("str = "+str);
       
       if(c1[i]!='B'&&c==0)
       {
           str.append(c1[i]);
       }
       else if(c1[i]=='B')
       {
            ++c;
       }else{
           c--;
       }
    }
       
       

        System.out.print(str);
        System.out.println();
	}
        
}