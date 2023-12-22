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
                color++;
                tops.add(num);
                for(int j = num-1; j > 0; j--){
                    int index;
                    if((index = tops.indexOf(j)) != -1){
                        tops.set(index, num);
                        tops.remove(tops.size()-1);
                        color--;
                        break;
                    }
                }
            }
            prev = num;
        }

        System.out.println(color);
    }
}