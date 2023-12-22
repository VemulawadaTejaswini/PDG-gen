import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        char[] c;
        String temp = sc.next();
        c = temp.toCharArray();
        LinkedList<Integer> necessary = new LinkedList<>();

        if(countDays(c, R) < K) {
            return;
        }
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'o'){
                c[i] = 'x';
                if( K > countDays(c, R)){
                    necessary.add(i+1);
                }
                c[i] = 'o';
            }
        }
        for (Integer integer : necessary) {
            System.out.println(integer);
        }
    }
    public static int countDays(char[] arr, int C){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'o'){
                count++;
                i += C;
            }
        }
        return count;
    }

}