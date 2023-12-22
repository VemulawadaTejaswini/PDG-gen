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
        int N=sc.nextInt();
        long M=sc.nextLong();
        List datalist=new ArrayList();
        long A=0;
        long B=0;
        for(int i=0;i<N;i++){
            A=sc.nextLong();
            B=sc.nextLong();
            Main main=new Main(A,B);
            datalist.add(main);
        }
        long sum=0;
        Collections.sort(datalist, new Comparator<Main>() {
            public int compare(Main student1, Main student2) {
                if(student1.getA() -  student2.getA()<0){
                    return -1;
                }
                return 0;
            }
        });
        for(int i=0;i<datalist.size();i++){
            Main m=(Main)datalist.get(i);
            M-=m.getB();
            if(M<=0){
                sum+=m.getA()*(m.getB()+M);
                break;

            }else{
                sum+=m.getA()*m.getB();

            }
        }
        System.out.println(sum);
    }
}
