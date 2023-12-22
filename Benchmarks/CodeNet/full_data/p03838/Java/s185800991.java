import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int goal = sc.nextInt();
        
        if (start == goal) {
            System.out.println(0);
            return;
        }
        if (start * -1 == goal) {
            System.out.println(1);
            return;
        }
        
        int count = 0;
        if (start < 0) {
            if (goal < 0) {
                if (start < goal) {
                    count = goal - start;
                } else {
                    count = start - goal + 2;
                }
            } else {
                start *= -1;
                if (start < goal) {
                    count++;
                    count += goal - start;
                } else {
                    start*= -1;
                    count = goal - start;
                }
            }
        } else {
            if (goal < 0) {
                goal *= -1;
                count++;
                if (start < goal) {
                    count += goal - start;
                } else {
                    count += start - goal;
                }
            } else {
                if (start < goal) {
                    count += goal - start;
                } else {
                    start *= -1;
                    count++;
                    count += goal - start;
                }
            }
        }
        System.out.println(count);
    }
}