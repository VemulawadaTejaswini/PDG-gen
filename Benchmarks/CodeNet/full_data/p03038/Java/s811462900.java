import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[2*n];
        ArrayList<Po>po=new ArrayList<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            po.add(new Po(sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(po, new Comparator<Po>() {
					public int compare(Po a, Po b) {
						return -(a.b - b.b);
					}
				});
        
        for(int i=0;i<n&&po.size()!=0;i++){
            a[n+i]=po.get(0).b;
            po.get(0).a--;
            if(po.get(0).a==0)po.remove(0);
        }
        Arrays.sort(a);
        long ans=0;
        for(int i=(2*n-1);i>=n;i--){
            ans+=a[i];
        }
        System.out.println(ans);
        
    }
}
class Po{
    int a,b;
    public Po(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void print(){
        System.out.println(a+" "+b);
    }
}
