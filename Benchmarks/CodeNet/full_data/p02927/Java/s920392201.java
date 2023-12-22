import java.util.*;

public class Main{
	public static void main(String args[]){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int d1 = d / 10;
        int d2 = d % 10;
        for(int i = 1; i <= m; i++){
            for(int dc1 = 2; dc1 <= d1; dc1++){
                if(dc1 == d1){
                    for(int dc2 = 2; dc2 <= d2; dc2++){
                        if(i == dc1*dc2){
                            count++;
                        }
                    }
                }else{
                    for(int dc2 = 2; dc2 <= 9; dc2++){
                        if(i == dc1*dc2){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.print(count);
    }
}