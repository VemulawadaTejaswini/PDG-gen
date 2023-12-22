import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String s = stdIn.next();

        char [] cs = s.toCharArray();

        int max = 0;
        int temp = 0;
        for(int i=0; i<cs.length; i++){
            if(isACGT(cs[i])){
                temp++;
                if(temp > max){
                    max = temp;
                }
            }else{
                temp = 0;
            }
        }

        System.out.println(max);
    }

    static boolean isACGT(char c){
        if(c == 'A' || c == 'C' || c == 'G' || c == 'T'){
            return true;
        }
        return false;
    }
}