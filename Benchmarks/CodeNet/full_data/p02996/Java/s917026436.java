import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
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
public class Main {    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        int [] in2 = new int [a];
        int t = 0;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                             in2[i] = sc.nextInt()-in[i];
                            }
        Data [] d = new Data [a];
         for(int i=0;i<a;i++){d[i] = new Data(in[i],in2[i]);                            
                             }
        Arrays.sort(d, new Comparator<Data>() {
            public int compare(Data d1, Data d2) {
                return d1.getB() - d2.getB();
            }
        });
		String s = "Yes";        
        for(int i=0;i<a;i++){if(d[i].getB()<t){s="No";break;
                                         }
                             else{t+=d[i].getA();}
                            }        
		System.out.println(s);
	}
}
