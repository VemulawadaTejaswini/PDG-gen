import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn= new Scanner(System.in);
        int x = stdIn.nextInt();
        int a,b,c;
        long y=0;
        for(a=1;a<=x;a++){
            for(b=1;b<=x;b++){
                for(c=1;c<=x;c++){
                    int min=a;
                    if(min>b)min=b;
                    if(min>c)min=c;
                    for(;;min--){
                        if(a%min==0&&b%min==0&&c%min==0){
                            y=y+min;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(y);
    }
}