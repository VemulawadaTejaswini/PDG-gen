
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int k=scanner.nextInt();
                int[] l=new int[n];
                for(int i=0;i<n;i++){
                        l[i]=scanner.nextInt();
                }
                int tmp=0;
                for(int i=1;i<n;i++){
                        for(int j=i;j>0;j--){
                                if(l[j-1]<l[j]){
                                        tmp=l[j-1];                                        l[j-1]=l[j];
                                        l[j]=tmp;
                                }else{
                                        break;
                                }
                        }
                }

                int sum=0;
                for(int i=0;i<k;i++){
                        sum+=l[i];
                }
                System.out.println(sum);
        }
}