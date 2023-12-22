import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[]s=sc.next().toCharArray();
        int n=s.length;
        int c[]=new int[n];
        char a='R';
        ArrayList<Integer>aaa=new ArrayList<Integer>();
        aaa.add(0);
        int ind=0;
        for(int i=0;i<n;i++){
            if(a==s[i]){
                ind++;
            }
            else{
                a=(a=='R')?'L':'R';
                aaa.add(ind);
                ind++;
            }
        }
        if(aaa.size()%2==0)aaa.add(ind);
        for(int i=0;i<aaa.size()/2;i++){
            int x2=aaa.get(2*i+1);
            int y=aaa.get(2*i+2)-x2;
            int x=x2-aaa.get(2*i);
            if(x%2==0){
                if(y%2==0){
                    c[x2-1]=(x+y)/2;
                    c[x2]=(x+y)/2;
                }else{
                    c[x2-1]=(x+y)/2;
                    c[x2]=(x+y)/2+1;
                }
            }
            else{
                if(y%2==0){
                    
                    c[x2-1]=(x+y)/2+1;
                    c[x2]=(x+y)/2;
                }else{
                    c[x2-1]=(x+y)/2;
                    c[x2]=(x+y)/2;
                }
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(c[i]+" ");
    }
}