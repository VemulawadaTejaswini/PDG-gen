import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> tops = new ArrayList<>();

        int prev = -1;
        int len = sc.nextInt();
        int color = 1;
        for(int i = 0; i < len; i++){
            int num = sc.nextInt();
            if(num <= prev){
                int maxMin = -1;
                int index = -1;
                for(int top : tops){
                    if(top < num && top > maxMin){
                        index = tops.indexOf(top);
                        maxMin = top;
                    }
                }
                if(maxMin != -1){
                    tops.set(index, num);
                }else{
                    tops.add(num);
                    color++;
                }
            }
            prev = num;
        }

        System.out.println(color);
    }
}