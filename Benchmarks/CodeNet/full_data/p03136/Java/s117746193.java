import java.io.*;
import java.util.*;
class Program{

}
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int temp,max = Integer.MIN_VALUE, sum = 0;
        while(N-->0){
            temp = in.nextInt();
            max = Math.max(temp, max);
            sum += temp;
        }
        if (sum-max>max) System.out.println("Yes");
        else System.out.println("No");
    }
}