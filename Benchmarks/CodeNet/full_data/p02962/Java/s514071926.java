import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String s= inp.nextLine();
        String t= inp.nextLine();
        String temp = s.replace(t, "");
        int k=(s.length()-temp.length()) ;
        k=k/t.length();

        System.out.println(k);
    }
}