
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int[] l=new int[n];
                int[] snuke=new int[n];
                for(int i=0;i<n;i++){
                        l[i]=scanner.nextInt();
                }

                int sum=0;
                for(int i=0;i<n;i++){
                        sum+=l[i];
                        snuke[i]=sum;
                }

                int sub=0;
                for(int i=0;i<n-1;i++){
                        sub=Math.abs((snuke[i]-(sum-snuke[i])))-Math.abs((snuke[i+1]-(sum-snuke[i+1])));
                        if(sub<=0){
                                sub=Math.abs((snuke[i]-(sum-snuke[i])));
                                break;
                        }
                }
                System.out.println(sub);
        }
}