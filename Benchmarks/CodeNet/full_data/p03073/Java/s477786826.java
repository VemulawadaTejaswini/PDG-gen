import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        scanner.close();

        int count0 = 0;
        int count1 = 0;

        int length = S.length();

        // other
        String[] ch = S.split("");

        // 0101...
        for(int i=0;i<length;i++){
            boolean isEven = (i%2 == 0);
            if (isEven){
                if("0".equals(ch[i])){
                    count0++;
                }
            }else{
                if("1".equals(ch[i])){
                    count0++;
                }
            }
        }

        // 1010...
        for(int i=0;i<length;i++){
            boolean isEven = (i%2 == 0);
            if (isEven){
                if("1".equals(ch[i])){
                    count1++;
                }
            }else{
                if("0".equals(ch[i])){
                    count1++;
                }
            }
        }

        int count = (count0 < count1)? count0 :count1;

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }
}
