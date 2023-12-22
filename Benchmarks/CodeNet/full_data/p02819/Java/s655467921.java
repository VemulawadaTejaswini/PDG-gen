import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int flg = 1;
        
        while(true){
            for(int i=2; i<=x-1; i++){
                if(x%i==0){
                    flg = 0;
                    break;
                }
            }
            if(flg==0){
                x++;
            }
            else{
                System.out.println(x);
                break;
            }
        }
    }
}