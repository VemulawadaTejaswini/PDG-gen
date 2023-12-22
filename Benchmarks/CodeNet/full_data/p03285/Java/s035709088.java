import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = num;
        int sum = 0;
        boolean jdg = false;
        for(int i = 0;sum < num;i++){
            sum = 0;
            for(int j = 1;sum < num;j++){
                sum = 7*i*4*j;
                if(sum == num)
                jdg = true;
            }
            if(jdg == true)
                break;
        }
        System.out.println(jdg?"Yes":"No");
    }
}