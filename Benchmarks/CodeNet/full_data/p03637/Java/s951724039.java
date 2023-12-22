import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        int co4 = 0;
        int co2 = 0;
        int co1 = 0;
        int[] num = new int[N];

        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(input[i]);
        }
        for(int i=0; i<N; i++){
            if(num[i] % 4 == 0){
                co4++;
            }
            else if(num[i] % 2 == 0){
                co2++;
            }
            else{
                co1++;
            }
        }
        if(co2 == 0){
            if(co4 + 1 >= co1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else{
            if(co4 >= co1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
