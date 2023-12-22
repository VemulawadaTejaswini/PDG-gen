import java.util.Scanner;

class AtCoder_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String input = sc.next();
         int nagasa = input.length();
         int kekka = 0;
         for(int i = 0; i < nagasa; i++){
             Character c = input.charAt(i);
             switch(c) {
                 case '+':
                   kekka+=1;
                   break;
                 case '-':
                     kekka-=1;
                     break;
             }
         }
        System.out.println(kekka);
    }
}