import java.util.Scanner;

class TaskA {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        char[] a = in.next().toCharArray();
        if(a[0] == a[2])
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
