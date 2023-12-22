    import java.util.*;
    public class Main {// Main
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            long mod = 1000000007L;
            long ans = 1;
            int[] a = new int[m];
            int[] path = new int[n+1];
            
            int cool = 0;

            for(int i=0;i<m;i++) { a[i] = sc.nextInt(); path[a[i]]=1; 
               path[a[i]-1]=1;
                 path[a[i]-1]=1; 
            }   
            
            for(int i=0;i<m-1;i++) { if(a[i+1]-a[i]==1) { cool=1; break;}  }
           
            if(cool == 1 ) System.out.println(0);
            else{
                int count = 0;
                for(int i=0;i<=n;i++) { if(path[i]==0) count++; }
                if(path[1]==0) count--;
                if(path[n]==0) count--;
                int x = count/2;
                for(int i=1;i<=x;i++){
                    long val = 1;
                    for(int f=count-i+1;f<=count;f++){ val *= f; val %= mod; }
                    long me = 0;
                 //if(count-i+1>0)  me =  ((count-i+1)*(count-i+1))%mod; 
                    ans = (ans + val -me)%mod ;
                }
                System.out.println(ans);
            }
        }
    }							