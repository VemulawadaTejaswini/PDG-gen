import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
public class Main {    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
		int m = sc.nextInt();       
        Data [] d = new Data [m];
        for(int i=0;i<m;i++){int A = sc.nextInt();
                             int B = sc.nextInt();
                             d[i] = new Data(A,B);                            
                            }
        Arrays.sort(d, new Comparator<Data>() {
            public int compare(Data d1, Data d2) {
                return d1.getA() - d2.getA();
            }
        }); 
        long ans = 0;
        int count = 0;
        for(int i=0;i<n;i++){if(d[i].getB()<m-count){ans+=d[i].getA()*d[i].getB();
                                                    count+=d[i].getB();}
                             else{ans+=d[i].getA()*m-count;break;}
                            }
        System.out.println(ans);
	}
}
class Data{
    private int a;
    private int b;
    public Data(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
}
