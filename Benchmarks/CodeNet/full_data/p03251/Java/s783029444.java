import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        ArrayList <Integer> arr = new ArrayList<>();
        ArrayList <Integer> brr = new ArrayList<>();
        while (m-- !=0)
        {
            int s = in.nextInt();
            arr.add(s);
        }
        while (n-- !=0)
        {
            int v = in.nextInt();
            brr.add(v);
        }
        boolean flag =false;// x=-48 y =-1
        for(int q : arr)// -20 -35 -91 -23 //-22 66
        {
            if(y>=q && q>x)// x< p<=y
                flag=true;
        }
        boolean slag = false;
        for(int p : brr)// 100 6 14
        {
            if(y>=p && p>x) // 100 <=8 Z≤Y // -1>-22
                slag=true;
        }
        if(flag==true && slag==true)
            System.out.println("No War");
        else
            System.out.println("War");
        arr.clear();
        brr.clear();
    }
}
