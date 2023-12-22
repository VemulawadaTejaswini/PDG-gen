import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
	if(N == 0) {
            System.out.println(0);
            return;
        }
        while(N!=0) {
            System.out.println(Math.abs(N%(2)));
            list.add(Math.abs(N%(2)));
            N = N/(-2);
        }
        for(int i = 0; i<list.size(); i++) {
            System.out.print(list.get(list.size()-1-i));
        }

        System.out.println();
    }
}