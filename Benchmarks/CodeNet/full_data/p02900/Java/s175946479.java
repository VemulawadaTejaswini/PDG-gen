import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long gcd = GCD(A,B);
        int num=0;
        ArrayList<Long> A_List = DIV(gcd);
        for(int i=0;i<A_List.size();i++) if(B%A_List.get(i)==0) num++;
        System.out.println(num+1);
    }
    public static long GCD(long num1,long num2){
        if(num1%num2==0) return num2;
        return GCD(num2,num1%num2);
    }
    public static ArrayList<Long> DIV(long A){
        ArrayList<Long> List = new ArrayList<>();
        if(A%2==0) List.add((long)2);
        for(long i=3;i<=A;i+=2){
            if(A%i==0){
                boolean check = true;
                for(int j=0;j<List.size();j++){
                    if(i%List.get(j)==0) {
                        check = false;
                        break;
                    }
                }
                if(check) List.add(i);
            }
        }
        return List;
    }
}