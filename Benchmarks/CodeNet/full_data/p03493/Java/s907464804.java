import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int count = 0;

        if ( s1 == 1 ){
            count ++;
        }
        if ( s2 == 1 ){
            count ++;
        }
        if ( s3 == 1 ){
            count ++;
        }
        System.out.println(count);
    }
}