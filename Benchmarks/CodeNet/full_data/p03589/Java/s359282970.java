import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int N= 4/cin.nextInt();
    int h ,n ,w;
    h=0;
    n=0;
    w=0;
        for(h=1;h<=3500;h++){
            for (n=1;n<=3500;n++)
            {
                if((N-1/n-1/h)!=0)w=1/(N-1/n-1/h);
                if(w>0){System.out.println(w +" "+n+" "+h); return;}
            }
    }
    }

}