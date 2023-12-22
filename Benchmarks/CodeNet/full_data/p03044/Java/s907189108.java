import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n+1];
        Map<Integer,Po>po=new HashMap<>();
        for(int i=0;i<n;i++){
             Po p=new Po();
             po.put(i+1,p);
        }
        for(int i=0;i<n-1;i++){
            int a=sc.nextInt();
            po.get(a).put(sc.nextInt(),sc.nextInt());
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<po.get(i+1).a.size();j++){
                int xx=po.get(i+1).a.get(j);
                int yy=po.get(i+1).b.get(j);
                ar[xx]+=ar[i+1]+yy;
            }
        }
        for(int i=1;i<=n;i++){
            System.out.println(ar[i]%2);
        }
    }
    static class Po{
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        public Po(){
        a=new ArrayList<>();
        b=new ArrayList<>();
            
        }
        public Po(int y,int z){
            a.add(y);
            b.add(z);
        }
        public void put(int a,int b){
            this.a.add(a);
            this.b.add(b);
        }
        public void print(){
            //System.out.println(a+" "+b+" "+value);
        }
    }
    
}
