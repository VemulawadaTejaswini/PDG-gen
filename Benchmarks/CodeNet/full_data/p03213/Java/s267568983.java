import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> prime = new ArrayList<>();
        int n = Integer.parseInt(sc.next());
        sc.close();
        boolean[] isPrime = new boolean[101];
        for(int i=2;i<=n;i++){
            if(!isPrime[i]){
                prime.add(i);
                for(int j=2*i;j<=n;j+=i){
                    isPrime[j] = true;
                }
            }
        }
        int[] count = new int[prime.size()];
        int[] l = new int[5];
        for(int i=0;i<prime.size();i++){
            int num = n;
            int base = prime.get(i);
            int divide = base;
            while(num/divide>0){
                count[i]+=num/divide;
                divide*=base;
            }
            if(count[i]>=74){
                l[0]++;
                l[1]++;
                l[2]++;
                l[3]++;
                l[4]++;
            }else if(count[i]>=24){
                l[0]++;
                l[1]++;
                l[2]++;
                l[3]++;
            }else if(count[i]>=14){
                l[0]++;
                l[1]++;
                l[2]++;
            }else if(count[i]>=4){
                l[0]++;
                l[1]++;
            }else if(count[i]>=2){
                l[0]++;
            }
        }

        long sum = 0;
        sum+=l[4];
        sum+=(l[0]-1)*l[3];
        sum+=(l[1]-1)*l[2];
        sum+=(l[0]-2)*l[1]*(l[1]-1)/2;
        System.out.println(sum);




    }

    
}