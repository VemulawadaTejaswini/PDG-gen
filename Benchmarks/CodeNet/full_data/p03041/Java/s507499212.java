import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        char ar[]= new char[n];
        int k=in.nextInt();
        ar=in.next().toCharArray();
        char ch=Character.toLowerCase(ar[k-1]);
        ar[k-1]=ch;
        for(char x:ar)
        {
            System.out.print(x);
        }    
    }
}
