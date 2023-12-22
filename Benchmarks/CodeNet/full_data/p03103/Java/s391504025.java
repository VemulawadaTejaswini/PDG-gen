import java.util.*;

public class Main {

    long A;
    long B;

    Main(long A,long B){
        this.A=A;
        this.B=B;
    }

    public long getA() {
        return A;
    }

    public long getB() {
        return B;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long N=sc.nextInt();
        long M=sc.nextLong();
        List<Main> datalist=new ArrayList<Main>();
        long A=0;
        long B=0;
        for(int i=0;i<N;i++){
            A=sc.nextLong();
            B=sc.nextLong();
            Main main2=new Main(A,B);
            datalist.add(main2);
        }
        long sum=0;
        Collections.sort(datalist, new Comparator<Main>() {
            public int compare(Main a, Main b) {
                return (int)(a.A-b.A);
            }
        });
        for(int i=0;i<datalist.size();i++){
            Main m=(Main)datalist.get(i);
            if(M-m.getB()<=0){
                sum+=m.getA()*M;
                break;

            }else{
                sum+=m.getA()*m.getB();
                M-=m.getB();
            }
        }
        System.out.println(sum);
    }
}
