import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        if(x <=1){
            return;
        }else{
            int a = 1;
            while(a== 1){
                for(int i=2;i<x;i++){
                    if(x % i == 0){
                        //not 素数
                        x++;
                    }                
                }
                a = 0;
                System.out.println(x);   
            }
        }   
    }
}