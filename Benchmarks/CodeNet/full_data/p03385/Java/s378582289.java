import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        String str = new io.next();

        int a = 0;
        int b = 0;
        int c = 0;
        int e = 0;

        for(int i = 0; i < str.length; i++){
            char c = str.charAt(i);

            switch(c){
            case 'a' : a++; break;
            case 'b' : b++; break;
            case 'c' : c++; break;
            default  : e++; break;
            }
        }

        if(a < 2 && b < 2 && c < 2 && e == 0 )
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}