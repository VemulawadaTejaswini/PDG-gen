import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   String[] words = new String[N];
   String ss = "";
   boolean flg = false;
   for(int i =0;i<N;i++) 
   {
     ss = sc.next();
     if(Arrays.asList(words).contains(ss))
     {
       flg = true;
       break;
     }
     words[i] = ss;
   }
   char start = words[0].charAt(words[0].length()-1);
   if(!flg)
   {
   		for(int i =1;i<N;i++) 
  		{
			if(start!=words[i].charAt(0))
            {
            	flg=true;
              	break;
            }
           	start = words[i].charAt(words[i].length()-1);
	  	}
   }
   if(flg) System.out.println("No");
   else System.out.println("Yes");
 }
}