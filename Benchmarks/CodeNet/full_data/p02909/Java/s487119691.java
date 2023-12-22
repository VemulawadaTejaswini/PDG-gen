import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s;
        s=scan.next();
        String[] arr = {"Sunny","Cloudy","Rainy"};
        if(s.equals("Sunny")) System.out.println(arr[1]);
        if(s.equals("Cloudy")) System.out.println(arr[2]);
        if(s.equals("Rainy")) System.out.println(arr[0]);
    }
}