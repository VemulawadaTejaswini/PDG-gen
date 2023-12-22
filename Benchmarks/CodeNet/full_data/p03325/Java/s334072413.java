import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] in = sc.nextLine().split(" ");
        int num;
        int co = 0;
        for(int i =0 ; i<in.length ; i++){
            num = Integer.parseInt(in[i]);
            while(num % 2 == 0){
                co++;
                num/=2;
            }
        }
        System.out.println(co);
    }
}
