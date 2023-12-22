import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main{

    static int N;
    static int K;

    static int b[];
    static int [] num;
    static TreeSet<Num> solution;
    public static void main(String args[]) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        K= sc.nextInt();
        num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        solution=  new TreeSet<>(new sortN());
        seachNum(num, 0, 0, K);

        System.out.println(solution.iterator().next().n);

    }
    public static void seachNum(int a[], int count, int count2, int except) {
        if (count2 == except) {
            jisuan(b);
        } else {
            if (count2 == 0) {
                b = new int[except];
            }
            for (int i = count; i < a.length; i++) {
                b[count2] = a[i];
                seachNum(a, i + 1, count2 + 1, except);
            }
        }
    }
    public static void jisuan(int [] num){
        int sum=0;
        int start = Math.abs(num[0]);
        int end = Math.abs(num[num.length-1]);
        if(num[0] >0 && num[num.length-1] > 0){
            sum = end;
        }else if(num[0] <0 && num[num.length-1] < 0){
            sum = start;
        }else if(start == 0){
            sum = end;
        }else if(end == 0){
            sum = start;
        }else{
            if (start>end){
                sum=end*2+start;
            }else{
                sum=start*2 +end;
            }
        }

        solution.add(new Num(sum));
    }
    static class Num{
        public int n;

        public Num(int n) {
            this.n = n;
        }
    }

    static class sortN implements Comparator<Num> {


        @Override
        public int compare(Num o1, Num o2) {
            return o1.n - o2.n;
        }
    }
}