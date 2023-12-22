import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a;
        int count;
        count=0;
        a=sc.nextInt();
        int num1[]=new int[a];
        for(int i=0;i<num1.length;i++){
            num1[i]=sc.nextInt();
        }
        int t=0;
        for( t=a-1;t>=0;t--){
            for(int p=0;p<t+1;p++){
                if(num1[t]>num1[p])
                break;
                    
                if(num1[t]==num1[p])
                count+=1;
            }
            
    }
    System.out.println(count);
}
}