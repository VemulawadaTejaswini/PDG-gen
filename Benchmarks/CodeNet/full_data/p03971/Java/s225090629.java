import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int A =sc.nextInt();
        int B =sc.nextInt();

        String S = sc.next();

        int countA=0;
        int countB=0;
        for(int i=0;i<N;i++)
            if (S.charAt(i) == 'a') {
                if(countA<A+B){
                    countA++;
                    System.out.println("Yes");
                    }
                else{
                    System.out.println("No");
                }
            }
            else if(S.charAt(i)=='b'){
                if(countA <A+B){
                    if(countB<B){
                        countA++;
                        countB++;
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("No");
            }
    }
}
