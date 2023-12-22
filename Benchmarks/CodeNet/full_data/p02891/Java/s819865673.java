import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        long k=sc.nextLong();
        int max=1;
        int total=0;
        String ss=s+s;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                total+=max/2;
                max=1;
            }else{
                max++; 
                if(i+2==s.length()) total+=max/2;
            } 
        }
    

        int a=total;

        total=0;
        max=1;

        for(int i=0;i<ss.length()-1;i++){
            if(ss.charAt(i)!=ss.charAt(i+1)){
                total+=max/2;
                max=1;
            }else{
                max++;
                if(i+2==ss.length()){
                    total+=max/2;
                }
            }
        }
        

        int d=total;


       if(a*2==d){
            System.out.println(a+(d-a)*(k-1));
       }else{
           if(k%2==0){
            System.out.println(d*k/2);
           }else{
            System.out.println(a+d*(k-1)/2);
           }
       }
        
        


    }
}
