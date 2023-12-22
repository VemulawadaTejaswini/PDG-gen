import java . util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b =input.nextInt();
        int x = input.nextInt();
        int count =0;
        for (int  i = a;  i <=b;  i++) {
            if (i%x==0){
                count ++;}}
        System.out.println(count);
}
}
                