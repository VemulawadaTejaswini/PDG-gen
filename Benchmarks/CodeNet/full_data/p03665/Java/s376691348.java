
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int p=scanner.nextInt();

                int[] a=new int[n];
                for(int i=0;i<n;i++){
                        a[i]=scanner.nextInt();
                }

                int odd=0;
                for(int i=0;i<n;i++){
                        if(a[i]%2==0){
                                odd++;
                        }
                }
                int even=n-odd;

                if(p==0){
                        odd=odd%2;
                }else{
                        odd=odd-1+odd%2;
                }
                int e=0;
                int o=0;
                int q=odd;
                while(q>0){
                        e+=combi(odd,q);
                        q-=2;
                }
                if(q==0){
                        e++;
                }
                q=even;
                while(q>0){
                        o+=combi(odd,q);
                        q--;
                }
                o++;

                System.out.println(e*o);
        }

        private static int kaijo(int i){
                int j=1;
                while(i>0){
                        j*=i--;
                }
                return j;
        }

        private static int combi(int i,int j){
                return kaijo(i)/(kaijo(i-j)*kaijo(j));
        }
}