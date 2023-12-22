import java.util.*;

public class Main{
        public  static void main(String[] args){
                calc();
        }
        static int calc(){
                Scanner sc = new Scanner(System.in);
                int N=sc.nextInt();
                int i =0;
                int array[] = new int[N];
                for(i=0;i<N;i++){
                array[i]=sc.nextInt();
                }
                int c=0;
                for(i=0;i<N-1;i++){
                        if(array[i]>array[i+1]){
                                c++;
                        }
                }
                if(c==2){
                        System.out.println("YES");
                }else if(c==0){
                        System.out.println("YES");
                }else{
                        System.out.println("NO");
                }
                return 0;
        }
}