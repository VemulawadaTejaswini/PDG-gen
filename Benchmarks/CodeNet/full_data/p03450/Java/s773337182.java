import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> hs=new HashMap<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean f=true;
        int l=0,r=0,d=0;
        for(int i=0;i<m;i++){
            l=sc.nextInt();
            r=sc.nextInt();
            d=sc.nextInt();
            if(i==0){
                hs.put(l,0);
                hs.put(r,d);
            }
            else if((hs.containsKey(l) && !hs.containsKey(r))||(hs.containsKey(r) && !hs.containsKey(l))){
                int known=(hs.containsKey(l))?l:r;
                int unknown=(!hs.containsKey(l))?l:r;
                if(r==known) hs.put(l,hs.get(r)-d);
                else hs.put(r,hs.get(l)+d);
            }
            else if(hs.containsKey(l) && hs.containsKey(r)){
                if(d!=hs.get(r)-hs.get(l))
                    f=false;
            }
        }//end of for
        if(f)
            System.out.println("Yes");
        else System.out.println("No");
    }
}