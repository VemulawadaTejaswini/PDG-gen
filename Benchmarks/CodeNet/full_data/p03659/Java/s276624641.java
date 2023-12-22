
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                short n=scanner.nextShort();
                short[] l=new short[n];
                short[] snuke=new short[n];
                for(short i=0;i<n;i++){
                        l[i]=scanner.nextShort();
                }

                short sum=0;
                for(short i=0;i<n;i++){
                        sum+=l[i];
                        snuke[i]=sum;
                }

                short sub=0;
                short min=0;
                sub=(short)Math.abs(2*snuke[0]-sum);
                min=sub;
                for(short i=0;i<n-1;i++){
                        sub=(short)Math.abs(2*snuke[i]-sum);
                        if(sub<min){
                                min=sub;
                        }
                }
                System.out.println(min);
        }
}