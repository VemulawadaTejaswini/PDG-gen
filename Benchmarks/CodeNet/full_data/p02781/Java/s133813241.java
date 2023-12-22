import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        int keta = str.length();
        
        // int[] array = new int[k];
        // int idx = 0;
        // for (int i = 0; i < keta; i++) {
        //     int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            
        //     if (num != 0) {
        //         array[idx] = num;
        //         idx++;
        //     }
        //     if (idx == k) break;
        // }
        
        // String str2 = "";
        // for (int i = 0; i)
        // for (int i = 0; i < keta; i++) {
        //     str2 
        // }
        
        int tmp = 0;
        int a = 0;
        switch (k) {
            case 1:
                tmp = 9*(keta - 1);
                a = Integer.parseInt(String.valueOf(str.charAt(0)));
                System.out.println(tmp + a);
                break;
            case 2:
                // 7080000 6通り
                for (int i = keta-2; i >= 0; i--) {
                    tmp += 9*9*(i);
                }
                System.out.println(tmp);
                a = Integer.parseInt(String.valueOf(str.charAt(0)));
                tmp += 9*(keta - 1)*(a-1);
                System.out.println(tmp);
                for (int i = 0; i < keta; i++) {
                    
                    a = Integer.parseInt(String.valueOf(str.charAt(i)));
                    if (i != 0) {
                        tmp += 9*(keta - i - 1);
                        tmp += a;
                        break;
                    }
                }
                System.out.println(tmp);
                break;
            case 3:
                // 7082000 6通り
                for (int i = keta-1; i >= 3; i--) {
                    tmp += 9*9*9*((i-1)*(i-2)/2);
                }
                System.out.println(tmp);
                a = Integer.parseInt(String.valueOf(str.charAt(0)));
                tmp += 9*9*(keta - 1)*(keta - 2) / 2 *(a-1);
                System.out.println(tmp);
                int count = 2;
                for (int i = 0; i < keta; i++) {
                    
                    a = Integer.parseInt(String.valueOf(str.charAt(i)));
                    if (i != 0) {
                        if (count == 2) {
                            tmp += 9*(keta - i - 1) * (a - i);
                            count--;
                        }
                        if (count == 1) {
                            tmp += 9*(keta - i - 1);
                            tmp += a;
                            count--;
                        }
                    }
                    
                    if (count == 0) break;
                }
                System.out.println(tmp);
                break;
        }
    }
}
