import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int w,e,n,k;
        for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='W')  w++;
              if(s.charAt(i)=='E')  e++;
              if(s.charAt(i)=='S')  k++;
              if(s.charAt(i)=='N')  n++;
}
if(w==0  && e!=0) System.out.println("No");
else if(e==0  && w!=0) System.out.println("No"); 

else if(k==0  && n!=0) System.out.println("No"); 

else if(n==0  && k!=0) System.out.println("No"); 

else System.out.println("Yes");
    }
}
