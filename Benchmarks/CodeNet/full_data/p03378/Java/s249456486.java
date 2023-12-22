import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        //ますの数
        int n=sc.nextInt();
        //料金所の数
        int m=sc.nextInt();
        int x=sc.nextInt();
        int down=0;
        int up=0;
        for(int i=1;i<m+1;i++){
           if(sc.nextInt()>x) up++;
           else down++;
        }
        if(down<up) System.out.println(down);
        else System.out.println(up);

        
        

    }
}