import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long ans=(((n+k)/2)/k)*(((n+k)/2)/k)*(((n+k)/2)/k);
        if(k%2==0)ans+=(n/k)*(n/k)*(n/k);
        System.out.println(ans);
        }
  }