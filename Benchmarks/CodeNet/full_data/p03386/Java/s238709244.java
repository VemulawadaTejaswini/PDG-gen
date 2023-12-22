import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        if(b - a > k * 2){
            for(int i=a; i<=a+k; i++){
                System.out.println(i);
            }
            for(int i=b-k; i<=b; i++){
                System.out.println(i);
            }
        }
        else{
            for(int i=0; i<=b-a; i++){
                System.out.println(a+i);
            }
        }
    }
}