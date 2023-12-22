import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        List<Integer> num = new ArrayList<>();
        for(int i = 0;i < len;i++){
            num.add(sc.nextInt());
        }
        //System.out.println(num);
        //System.out.println(len);
        int counter = 0;
        for(int i = 0;i < len-2;i++){
            int one = num.get(0);
            //System.out.println(one);
            int two = num.get(1);
            int three = num.get(2);
            if((one < two) && (two < three)){
                counter++;
            }else if((one > two) && (two > three)){
                counter++;
            }
            num.remove(0);
        }
        System.out.println(counter);
    }
}
