import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int sum = 0;
        for(int x = 0; x <= k; x++){
            for(int y = 0; y <= k; y++){
                for(int z = 0; z <= k; z++){
                    if(x+y+z==s)sum++;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}