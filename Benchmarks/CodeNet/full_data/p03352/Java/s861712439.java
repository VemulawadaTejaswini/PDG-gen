import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Program obj = new Program();
        System.out.println(obj.find(n));
    }
}
class Program{
    int find(int n){
        return (int)Math.pow((int)Math.sqrt(n),2);
    }
}