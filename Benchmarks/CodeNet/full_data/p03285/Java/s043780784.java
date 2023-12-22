import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = num;
        boolean jdg = false;
        while(num > 0){
            num -= 7;
        }
        if(num % 4 == 0)
            jdg = true;

        num = tmp;
        while(num > 0){
            num -= 4;
        }
        if(num%7 == 0)
            jdg = true;

        System.out.println(jdg?"Yes":"No");
    }
}