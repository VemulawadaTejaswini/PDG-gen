import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                if(n==i*j){
                    cnt++;
                }
            }
        }
        if(cnt!=0){
            System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
}
