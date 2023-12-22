import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = num;
        int sum = 0;
        boolean jdg = false;
        while(num > 0){
            num -= 7;
            if(num % 4 == 0){
                jdg = true;
                break;
            }
        }
        System.out.println(jdg?"Yes":"No");
    }
}