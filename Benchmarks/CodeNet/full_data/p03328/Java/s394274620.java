import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 1;
        int sa = i+a;
        
        while(sa != sa+b-a){
            i += i+1;
            i++;
        }
        System.out.println(i);
    } 
}