import java.util.*;

public class Main {
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
            int[] h = new int[n];
            for(int i=0;i<n;i++){
                h[i] = sc.nextInt();
            }
            int max = h[0];
            int sum = 1;
            for(int j=1;j<n;j++){
                if(h[j]>=max){
                    sum++;
                    max=h[j];
                }
            }
            System.out.println(sum);
            for(double k = 0;k<10000000;k=k+0.5){
                sum=sum*2;
                double a = 10.2f;
                double b = 10.589f;
                double c = a*b;
                sum=sum/2;
            }
        }

        }