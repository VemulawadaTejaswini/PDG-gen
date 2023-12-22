import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        List<Integer> F=new ArrayList<>();
        int n=in.nextInt();
        double av=0;
        for(int i=0;i<n;i++){
            int f=Integer.parseInt(in.next());
            F.add(f);
            av+=f;
        }

        av/=n;
        
        double d=Math.abs(F.get(0)-av);
        int res=0;
        for(int i=1;i<n;i++){
            double td=Math.abs(F.get(i)-av);
            if(td<d){
                d=td;
                res=i;
            }
        }

        System.out.println(res);
    }
}