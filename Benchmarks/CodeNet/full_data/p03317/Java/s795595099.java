import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double n=s.nextDouble();
        double k=s.nextDouble();
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(s.nextInt());
        }
        double c=l.indexOf(1);
        double ans=0;
        ans=Math.ceil(c/(k-1))+Math.ceil((n-(c+1))/(k-1));
        int an=(int) ans;
        if(n%2==1&&c%2==1)
            an-=1;
        System.out.println(an);
    }
}