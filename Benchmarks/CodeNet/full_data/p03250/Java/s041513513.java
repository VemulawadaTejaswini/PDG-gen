import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Integer[] num = {a,b,c};
        Arrays.sort(num, Collections.reverseOrder());

        int sum = 0;

        sum = num[0]*10+(num[1]+num[2]);
        System.out.println(sum);
        
  
    }

}
