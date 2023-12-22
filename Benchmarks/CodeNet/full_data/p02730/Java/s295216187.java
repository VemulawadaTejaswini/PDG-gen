import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int N = S.length();

        loop:for(int i=0; i<N/2; i++){
            if(S.charAt(i)!=S.charAt(N-1-i)){
                System.out.println("No");
                break;
            }
            if(i==N/2-1){
                String Ssub = S.substring(0, N / 2);
                int Nsub = Ssub.length();
                if(Nsub==1){
                    System.out.println("Yes");
                    return;
                }
                for(int j=0; j<Nsub/2; j++){
                    if(Ssub.charAt(j)!=Ssub.charAt(Nsub-1-j)){
                        System.out.println("No");
                        break loop;
                    }
                    if(j==Nsub/2-1){
                        String Sa = S.substring((N + 3) / 2 - 1);
                        int Na = Sa.length();
                        if(Na==1){
                            System.out.println("Yes");
                            return;
                        }
                        for(int k=0; k<Na/2; k++){
                            if(Sa.charAt(k)!=Sa.charAt(Na-1-j)){
                                System.out.println("No");
                                break loop;
                            }
                            if(k==Na/2-1){
                                System.out.println("Yes");
                            }
                        }
                    }
                }
            }
        }
    }
}
