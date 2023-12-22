import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int blackCnt = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++) {
            int a = sc.nextInt();
            if(1<=a&&a<=399) set.add(0);
            else if(400<=a&&a<=799) set.add(1);
            else if(800<=a&&a<=1199) set.add(2);
            else if(1200<=a&&a<=1599) set.add(3);
            else if(1600<=a&&a<=1999) set.add(4);
            else if(2000<=a&&a<=2399) set.add(5);
            else if(2400<=a&&a<=2799) set.add(6);
            else if(2800<=a&&a<=3199) set.add(7);
            else blackCnt++;
        }
        int min = (set.size() == 0 && blackCnt >= 1)? 1: set.size();
        System.out.println( min+" "+(set.size()+blackCnt));
    }
}