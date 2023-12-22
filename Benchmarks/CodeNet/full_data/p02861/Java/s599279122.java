import java.util.*;

public class Main {
    static int[] x,y;
    static int n;
    static double ans=0;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        x = new int[n];
        y=new int[n];

        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        int[] town = new int[n];
        for(int i=0;i<n;i++)town[i]=-1;

        perm(town);
        System.out.println(ans/fact(n));




    }

    private static double fact(double n){
        if(n==0)return 1;
        return n*fact(n-1);
    }
    private static void perm(int[] town){
        boolean flag = true;
        for(int i=0;i<n;i++)if(town[i]==-1)flag=false;

        if(flag){
            double sum=0;
            for(int i=0;i<n-1;i++){
                sum += sqD(town[i],town[i+1]);
            }
            ans += sum;
        }

        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++)h.add(town[i]);
        for(int i=0;i<n;i++){
            if(!h.contains(i)){
                //System.out.println(i);
                int[] temp = town.clone();
                for(int j=0;;j++){
                    if(temp[j]==-1){
                        temp[j]=i;
                        perm(temp);
                        break;
                    }
                }
            }

        }
    }

    private static double sqD(int n1,int n2){
        int dx = x[n1]-x[n2];
        int dy = y[n1]-y[n2];
        return Math.sqrt(dx*dx+dy*dy);
    }

}
