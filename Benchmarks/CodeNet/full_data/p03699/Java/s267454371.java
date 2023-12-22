import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        long sum=0;
        for(int i=0;i<n;i++){int po=sc.nextInt();sum+=po;list.add(po);}
        Collections.sort(list);
        if(sum%10==0){
            long sumcpy=sum;
            int count=0;
            while(sumcpy%10==0&&count<n){
                sumcpy=sum;
                sumcpy-=list.get(count);
                count++;
            }
            sum=sumcpy;
        }
        System.out.println((sum%10==0)?0:sum);
    }
}
