import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sa = 0;
       
        int[] num = {a,b,c};
        Arrays.sort(num);

        sa = num[2]-num[0];

        if(sa<=(d*2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
