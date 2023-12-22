import java.util.*;
import java.util.Scanner;
class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(list.indexOf(A));
        list.remove(list.indexOf(B));
        System.out.println(list.get(0));
    }
} 