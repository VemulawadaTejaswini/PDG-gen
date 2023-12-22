import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = num +1;
        int l = sc.nextInt();
        int ans = 0;
        int taste[] = new int[num];
        int eat;
        int eat2 = l;
        if(l > 0){
            eat = l;
        }else{
            eat = l * -1;
        }
         for(int i = 1; i < num; i++){
            taste[i] = l + i - 1;
            ans = ans + taste[i];
            if(taste[i] < 0){
                taste[i] = taste[i]* -1;
                if(taste[i] < eat){
                    eat = taste[i];
                    eat2 = taste[i]*-1;
                    //System.out.println(eat2);
                }
            }else{
                if(taste[i] < eat){
                    eat = taste[i];
                    eat2 = taste[i];
                    //System.out.println(eat2);
                }
            }
        }
        ans = ans - eat2;
        System.out.println(ans);
    }
}