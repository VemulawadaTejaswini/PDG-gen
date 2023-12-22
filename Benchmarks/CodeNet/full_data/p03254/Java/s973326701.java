
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        int c=s.nextInt();
        int d=0,max=0;
        int a[]= new int[b];
        for (int i = 0; i <b ; i++) {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i <b ; i++) {

            if (c > a[i]) {
                c = c - a[i];
                d++;
                max=max+a[i];
            }
            else {

                break;
            }
        }
        if(c==max)
        System.out.println(d);
        else
            System.out.println(d-1);
    }
}


