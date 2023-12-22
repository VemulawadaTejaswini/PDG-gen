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
            for(long k = 0;k<100000000;k++){
                sum=sum*2;
                sum=sum/2;
            }
        }

        }

