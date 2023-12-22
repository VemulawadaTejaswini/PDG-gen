import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        
        for(int i=0; i<n;i++){
            int count1=1,count2=1;
            int A=sc.nextInt();
            int B=sc.nextInt();
            if(A==0 || B==0) count=count+0; 
            else{
                if(A>B)  count=(A-B)+count;
                else if(B>A)  count=count+(B-A);
                else if(A==B) count=count+0;
            }
        }
        System.out.println(count);
    }
}