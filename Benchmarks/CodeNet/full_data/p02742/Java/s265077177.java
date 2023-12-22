import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int ans = 0;
        if(h%2==0){
            ans = (h/2 * w);
        }else{
            if(w%2==0){
                ans = (h/2+1) * (w/2) + (h/2) * (w/2);

            }else{
                ans = (h/2+1) * ((w/2)+1) + (h/2) * (w/2);
            }
        }
        System.out.println(ans);


    }
}