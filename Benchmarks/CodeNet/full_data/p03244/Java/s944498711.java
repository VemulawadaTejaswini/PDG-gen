import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]o=new int[100001];
        int[]e=new int[100001];
        for(int i=0;i<n;i+=2){
            o[sc.nextInt()]++;
            e[sc.nextInt()]++;
        }
        int maxe=0;
        int max2e=0;
        int maxo=0;
        int max2o=0;
        int eind=0;
        int oind=0;
        boolean b=false,b1=false;
        for(int i=0;i<100001;i++){
            if(maxe<=e[i]){
                max2e=maxe;
                maxe=e[i];
                eind=i;
            }
        }
        for(int i=0;i<100001;i++){
            if(maxo<=o[i]){
                max2o=maxo;
                maxo=o[i];
                oind=i;
            }
        }if(oind==eind){
            Arrays.sort(e);
            Arrays.sort(o);
            
        System.out.println(Math.min(n-o[100000]-e[99999],n-o[99999]-e[100000]));
        }
        else{
            System.out.println(n-maxo-maxe);
        }
    }
}