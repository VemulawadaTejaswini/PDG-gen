import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alice  = 0;
        int bob = 0;
        int n = sc.nextInt();
        Integer[] data = new Integer[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
      
        Arrays.sort(data,Collections.reverseOrder());
        for(int i=0; i<data.length; i+=2){
            alice += data[i];
        }
        for(int i=1; i<data.length; i+=2){
            bob += data[i];
        }
        System.out.println(alice-bob);
    }
}