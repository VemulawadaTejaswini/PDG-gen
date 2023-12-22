import java.util.Scanner;
public class Main{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next(); 
        char[] c = str.toCharArray();

        int count = 0;
        int count1 = 0;
        int count2 = 0;

        char right1[] = new char[str.length()];
        for(int i = 0; i <c.length; i=i+2){
            right1[i] = '0';
        }
        for(int i = 1; i <c.length; i=i+2){
            right1[i] = '1';
        }

        char right2[] = new char[str.length()];
        for(int i = 0; i <c.length; i=i+2){
            right2[i] = '1';
        }
        for(int i = 1; i <c.length; i=i+2){
            right2[i] = '0';
        }

        for (int i = 0; i < c.length; i++) {
            if(c[i] != right1[i]){
                count1++;
            }
            if(c[i] != right2[i]){
                count2++;
            }
        }

        count = count1 <= count2 ? count1 : count2;
        System.out.println(count);

    }
}
