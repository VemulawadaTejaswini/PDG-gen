import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long c = 0;
        for(int i=1;i<=n;i++){
                if(0!=i%3 && 0!=i%5){
                c = c + i;
            }
        }
        System.out.println(c);
    } 
 
}