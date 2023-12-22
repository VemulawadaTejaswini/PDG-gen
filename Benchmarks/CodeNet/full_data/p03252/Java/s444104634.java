import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int[] array_a = new int[a.length()];
        int[] array_b = new int[b.length()];

        int count = 0;
        boolean flag = false;

        for(int i = 0;i < a.length();i++){
            array_a[i] = count;
            for(int j = 0;j < i;j++){
                if(a.charAt(j) == a.charAt(i)){
                    array_a[i] = array_a[j];
                    flag = true;
                    break;
                }
            }
            if (!flag){
                count++;
            }
            flag = false;
        }

        count = 0;
        for(int i = 0;i < b.length();i++){
            array_b[i] = count;
            for(int j = 0;j < i;j++){
                if(b.charAt(j) == b.charAt(i)){
                    array_b[i] = array_b[j];
                    flag = true;
                    break;
                }
            }
            if (!flag){
                count++;
            }
            flag = false;
        }

        for(int i = 0;i < a.length();i++){
            if(array_a[i] != array_b[i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

//        for(int i = 0;i<a.length();i++){
//            System.out.print(array_a[i]+" ");
//            if(i == a.length()-1)
//                System.out.println("");
//        }
    }
}
