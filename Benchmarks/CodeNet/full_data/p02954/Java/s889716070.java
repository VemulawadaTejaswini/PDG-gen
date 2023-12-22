import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String _S = sc.nextLine();
        char S[] = new char[_S.length()];
        for (int i = 0; i<_S.length(); i++){
            S[i] = _S.charAt(i);
        }
        track(S);
    }

    static void track(char[] LR){
        int tmp[] = new int[LR.length];
        int numbers[]=new int[LR.length];
        for (int i = 0; i<tmp.length; i++){
            numbers[i] = 1;
            tmp[i]=1;
        }
        System.out.println("start");
        for (int j = 0; j<Math.pow(10,5);j++){
            for (int i  = 0; i< LR.length; i++){
                if (numbers[i] != 0){
                    if (LR[i] =='R'){
                        tmp[i+1] += numbers[i];
                        tmp[i] -= numbers[i];

                    }else {
                        tmp[i-1] += numbers[i];
                        tmp[i] -= numbers[i];

                    }
                }
            }
            System.arraycopy(tmp,0,numbers,0,tmp.length);

        }

        for (int s:numbers){
            System.out.print(s+" ");
        }
    }
}
