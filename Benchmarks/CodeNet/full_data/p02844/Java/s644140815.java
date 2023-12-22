import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int count = 0;
        int[] a = new int[3];
        for(int i = 0; i < 1000; i++){
            a[0] = i/100;
            a[1] = (i - a[0] * 100)/10;
            a[2] = i%10;
            int index = 0;
            for(int j = 0; j < n; j++){
                if(a[index] == (s.charAt(j)-'0')){index++;}
                if(index == 3){count++;break;}
            }
        }
        System.out.println(count);
    }
}

