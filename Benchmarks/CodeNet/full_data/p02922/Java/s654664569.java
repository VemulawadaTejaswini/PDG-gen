import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int t = 0;
        while(true){
            if(c <= 0){
                break;
            }
            c = b / a;
            if(0 <= c){
                c = b / a;
                s++;
            }
            s++;
        }    
    }
}