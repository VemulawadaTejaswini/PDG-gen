
import java.util.Scanner;
import java.util.Arrays;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int N=scanner.nextInt();

                int[] a=new int[N+1];
                for(int i=0;i<N;i++){
                        a[i]=scanner.nextInt();
                }
                a[N]=Integer.MAX_VALUE;
                Arrays.sort(a);
                a[N]=-1;

                int[][] num=new int[a.length][2];
                int n=1;
                int indexNum=0;
                for(int i=0;i<a.length-1;i++){
                        if(a[i+1]==-1){
                                num[indexNum]=new int[]{a[i],n};
                        }else{
                                if(a[i]==a[i+1]){
                                        n++;
                                }else{
                                        num[indexNum++]=new int[]{a[i],n};
                                        n=1;
                                }
                        }
                }

                int max=0;
                int sum=0;
                for(int i=0;i<num.length-2;i++){
                        if(num[i][0]==num[i+1][0]-1 && num[i+1][0]==num[i+2][0]-1){
                                sum=num[i][1]+num[i+1][1]+num[i+2][1];
                                if(max<sum){
                                        max=sum;
                                }
                        }
                }
                if(max==0){
                        for(int i=0;i<num.length-2;i++){
                                if(num[i][0]==num[i+1][0]-1){
                                        sum=num[i][1]+num[i+1][1];
                                        if(max<sum){
                                                max=sum;
                                        }
                                }
                        }
                }
                if(max==0){
                        for(int i=0;i<num.length-2;i++){
                                sum=num[i][1];
                                if(max<sum){
                                        max=sum;
                                }
                        }
                }

                System.out.println(max);
        }
}