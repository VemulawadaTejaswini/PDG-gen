import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        if(x <=1){
            return;
        }else{
            while(x<=99999){
                for(int i=2;i<x;i++){
                    if(x % i == 0){
                        //not 素数
                        x++;
                        break;
                    }else{
                        if(i == x-1){
                        //最後の判定
                        System.out.println(x);
                        return;      
                        }
                    }
                }
            } 
        }
    }
}
