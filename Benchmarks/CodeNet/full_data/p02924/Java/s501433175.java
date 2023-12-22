import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long count = 0;
        //Arraylist<Integer> a = new ArrayList<Integer>();
        //Arraylist<Integer> b = new ArrayList<Integer>();
        for(int i = 1;i<=n;i++) {
            if(i!=n) {
            count += i%(i+1);
            } else if(i==n) {
            }
        }
        System.out.println(count);

    }
}