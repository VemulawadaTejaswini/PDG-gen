import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int max,min;
        max=a;
        min=b;
        if(max<min){
            max=b;
            min=a;
        }
        int [] num1 = new int[max];
        for(int i=0;i<num1.length;i++){
            num1[i]=min;
            System.out.print(num1[i]);
        }
		

    }
}