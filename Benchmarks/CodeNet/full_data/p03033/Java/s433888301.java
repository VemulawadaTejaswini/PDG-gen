import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Po>po=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            po.add(new Po(a-c,b-c-1,c));
        }
        Collections.sort(po, new Comparator<Po>() {
					public int compare(Po a, Po b) {
						return a.n - b.n;
					}
        });
        int index=0;
        for(int i=0;i<m;i++){
            int k=sc.nextInt();
            boolean t=true;
            for(int j=0;j<po.size();j++){
                if(po.get(j).s<=k&&po.get(j).d>=k){
                    System.out.println(po.get(j).n);
                    t=false;
                    break;
                }
                else if(po.get(j).d<k){
                    po.remove(j);
                    j--;
                }
                
            }
            if(t)System.out.println(-1);
        }
        
    }

}
class Po{
    int s,d,n;
    public Po(int a,int b,int c){s=a;d=b;n=c;}
    public void print(){
        System.out.println("s"+s+"d"+d+"n"+n);
    }
}