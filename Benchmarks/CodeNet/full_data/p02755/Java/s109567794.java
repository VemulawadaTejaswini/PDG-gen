import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        double amin = a/0.08;
        //System.out.println(amin);

        double bmin = b/0.1;
        //System.out.println(bmin);

        double bmax = (b+1)/0.1;
        //System.out.println(bmax);

        if(amin < bmax && amin >= bmin){
            //System.out.println((int)Math.floor(bmax -1));
            System.out.println((int)Math.floor(amin));
        }else{
            System.out.println("-1");

        }




    }
}
