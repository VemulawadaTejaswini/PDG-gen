import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());

        int a = h*w;
        if(a%2==0){
            System.out.println(a/2);
        }else{
            System.out.println(a/2+1);
        }

    }
}

