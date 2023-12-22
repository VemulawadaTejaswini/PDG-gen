import java.util.Scanner;
public class Main{

  public static void main(String[] args){
  B146.task3();
  }
}
public class B146 {

    public static void task1(){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String[] day = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int[] l = {6,5,4,3,2,1,7};
        for (int i = 0; i < 7; i++){
            if (str.equals(day[i])) System.out.println(l[i]);

        }

    }

    public static void task2(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[] str = s.next().toCharArray();
        for (int i =0; i < str.length; i++){
            int ans = (((n + str[i]) - 'A') % 26) + 'A';
            str[i] = (char) ans;
        }
        System.out.println(new String(str));
    }

    public static void task3(){
        Scanner s = new Scanner((System.in));
        long a = s.nextLong(), b = s.nextLong(), x = s.nextLong();
        long MIN = 1;
        long MAX = (long) Math.pow(10, 9);
        long ans;
        //when u cant afford
        ans = (a + b > x) ? 0 : binarySearch(MIN,MAX,a,b,x);
        System.out.println((int) ans);


    }

    //split the range in half until the left is true and right is false
    public static long binarySearch(long left, long right, long a, long b, long x){

        if (right - left <= 1) return (predicate(a,b,right,x)?right : left);
        int mid = (int) Math.floor((left + right) / 2);
        //if the mid is affordable set left to mid
        if (predicate(a,b,mid,x)) {
            return binarySearch(mid,right,a,b,x);

        //otherwise set right to mid
        }else{
            return binarySearch(left,mid,a,b,x);
        }

    }

    public static Boolean predicate(long a, long b, long n, long x){
        //returns true if the integer is affordable
        return ( a * n + b * len(n) <=  x);
    }

    public static int len (long n){
        if (n == 0) return 0;
        return 1 + len(n/10);
    }
}
