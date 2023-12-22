import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean flag = true;
        while(flag){
            int time = 0;
            int num = a;
            int denomionator = 2;
            while(denomionator<=a){
                if(num%denomionator==0){
                    time++;
                    num = num/denomionator;
                }else{
                    denomionator++;
                }
            }
            if(time==1)
                flag=false;
            a++;
        }
        System.out.println(a-1);
    }}