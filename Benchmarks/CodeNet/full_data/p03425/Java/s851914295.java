import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int M=0,A=0,R=0,C=0,H=0;
        ArrayList<Integer> numlist = new ArrayList<>();
        N = sc.nextInt();
        for (int a = 0; a < N; a++) {
            String name = sc.next();
            if(name.indexOf('M')==0){
                M++;
            }
            else if(name.indexOf('A')==0){
                A++;
            }
            else if(name.indexOf('R')==0){
                R++;
            }
            else if(name.indexOf('C')==0){
                C++;
            }
            else if(name.indexOf('H')==0){
                H++;
            }
        }
        numlist.add(M);
        numlist.add(A);
        numlist.add(R);
        numlist.add(C);
        numlist.add(H);
        long num =0;
        for(int a=0;a<3;a++){
            for(int b=a+1;b<4;b++){
                for(int c=b+1;c<5;c++){
                    if(numlist.get(a)!=0&&numlist.get(b)!=0&&numlist.get(c)!=0)
                    num =+(numlist.get(a)*numlist.get(b)*numlist.get(c));
                }
            }
        }
        System.out.println(num);
    }
}
