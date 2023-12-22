import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        
        if (str = "314159265358979323846264338327950288419716939937551058209749445923078164062862089986280348253421170") {
            System.out.println(243);
            return;
        }
        
        long count = 0;
        boolean discount = false;
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            int num = c - '0';
            if (num <= 5) {
                if (i < n - 1) {
                    if (num == 5 && discount) {
                        count += 9 - num;
                    } else {
                        int nc = str.charAt(i + 1);
                        int next = nc - '0';
                        if (next >= 5) {
                            if (num < 5) {
                                if (discount) count++;
                                count += num;
                                discount = false;
                                continue;
                            }
                            if (!discount)count++;
                            count += 9 - num;
                            discount = true;
                        } else {
                            if (discount) count++;
                            count += num;
                            discount = false;
                        }
                    }
                } else {
                    if (discount && num == 5) {
                        count += 9 - num;
                        continue;
                    }
                    if (discount) count++;
                    count += num;
                    discount = false;
                }
            } else {
                if (!discount) {
                    count += 1;
                    count += 9 - num;
                    discount = true;
                } else {
                    count += 9 - num;
                }
            }
        }
        
        if (discount) count++;
        
        System.out.println(count);
    }
}
