 import java.util.*;
public class Main {    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        long [] in2 = new long [a];
        long t = 0;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                             in2[i] = sc.nextLong()-in[i];
                            }
        Data [] d = new Data [a];
         for(int i=0;i<a;i++){d[i] = new Data(in[i],in2[i]);                            
                             }
        Arrays.sort(d, new Comparator<Data>() {
            public long compare(Data d1, Data d2) {
                return d1.getB() - d2.getB();
            }
		String s = "Yes";        
        for(int i=0;i<a;i++){if(in2[i]<t){s="No";break;
                                         }
                             else{t+=in2[i];}
                            }        
		System.out.println(s);
	}
}
class Data{
    private long a;
    private long b;
    public Data(long a, long b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }