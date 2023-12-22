import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();

        Long a[] = new Long[5];

        for(int i = 0; i < a.length(); i++){
          a[i] = sc.nextLong();
        }

        Arrays.sort(a);
        long s1 = a[0];

        long r = N/s1;

        if(s1 == 1) {
          System.out.println(r+4);
          return;
        }

        System.out.println(r + 5);

    }
}
