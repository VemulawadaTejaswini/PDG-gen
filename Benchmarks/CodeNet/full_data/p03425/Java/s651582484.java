import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int M=0,A=0,R=0,C=0,H=0;
        N = sc.nextInt();
        ArrayList<String> List = new ArrayList<String>();
        for (int a = 0; a < N; a++) {
            String name = sc.next();
            if(name.indexOf("M")==0){
                List.add(name);
                M++;
            }
            else if(name.indexOf("A")==0){
                List.add(name);
                A++;
            }
            else if(name.indexOf("R")==0){
                List.add(name);
                R++;
            }
            else if(name.indexOf("C")==0){
                List.add(name);
                C++;
            }
            else if(name.indexOf("H")==0){
                List.add(name);
                H++;
            }
        }
        int num = List.size()*(List.size()-1)*(List.size()-2);
        int num2 = num/M;
        num2 = num/A;
        num2 = num/R;
        num2 = num/C;
        num2 = num/H;
        System.out.println(num2);
    }
}
