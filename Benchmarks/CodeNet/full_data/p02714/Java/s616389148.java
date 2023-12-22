import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        ArrayList<Integer> R=new ArrayList<>();
        ArrayList<Integer> G=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')
                R.add(i);
            else if(s.charAt(i)=='G')
                G.add(i);
            else{
                B.add(i);
                set.add(i);
            }
        }
        long ans=R.size()*G.size()*B.size();
        for (int i=0;i<R.size();i++){
            for(int j=0;j<G.size();j++){
                    int a=R.get(i);
                    int b=G.get(j);
                    if(a<b){
                        int dis=b-a;
                        if(set.contains(a-dis))
                            ans--;
                        if(set.contains(b+dis))
                            ans--;
                        int mid=(a+b)/2;
                        if(set.contains(mid) && (mid-a==b-mid) )
                            ans--;
                    }else{
                        int dis=a-b;
                        if(set.contains(b-dis))
                            ans--;
                        if(set.contains(a+dis))
                            ans--;
                        int mid=(a+b)/2;
                        if(set.contains(mid)  && (mid-b==a-mid))
                            ans--;
                    }
            }
        }
        System.out.println(ans);
    }
}
