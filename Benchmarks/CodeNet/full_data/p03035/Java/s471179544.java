import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int age = sc.nextInt();
        int fee = sc.nextInt();
        int ans =0;
        if(age <= 5){
            ans = 0;
        }else if(age > 5 && age <= 12){
            ans =  fee/2;
        }else{
            ans = fee;
        }
        System.out.println(ans);
    }
}
