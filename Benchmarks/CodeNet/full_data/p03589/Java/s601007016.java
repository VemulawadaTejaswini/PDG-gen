import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    double N= cin.nextInt();
    double h ,n ,w;
    h=0;
    n=0;
    w=0;
        for(h=1;h<=3500;++h){
            for (n=1;n<=3500;++n)
            {
                w=(4/N)-(1/n)-(1/h);
                if( w>0 && (1/w)==(int)(1/w)){System.out.println((int)(1/w)+" "+(int)h+" "+(int)n);
                return;}
            }
    }
    }

}