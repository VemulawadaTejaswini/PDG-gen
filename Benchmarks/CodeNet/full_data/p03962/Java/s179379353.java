import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;

        if(a == b && b== c && a==c) {
            count = 1;
        }

        else if(a != b && b!= c && a!=c){
            count = 3;

            }
        else{
            count = 2;
        }
        System.out.println(count);


        }
    }