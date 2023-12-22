import java.util.Scanner;

class Calc{

    private Integer n;
    private String s;
    Calc(Integer N, String S){
        this.n = N;
        this.s = S;
    }
    
    public String calc() {
        if (n % 2 != 0) {
            return "No";
        }
        int harf = n / 2;
        if (s.substring(0, harf).equals(s.substring(harf, s.length()))) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = Integer.parseInt(sc.next());
        String S = sc.next();
        Calc calc = new Calc(N, S);
        String result = calc.calc();
        System.out.println(result);
    }
}