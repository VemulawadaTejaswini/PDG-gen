import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int n = sc.nextInt();
        char[] qc = sc.next().toCharArray();
        int data[] = new int[length+1];
        for(int i = 1;i<length;i++){
            if(qc[i-1] == 'A' && qc[i] == 'C'){
                data[i] = data[i-1] + 1;
            }else{
                data[i] = data[i-1];
            }
        }
        int tmp = 0;
        for(int i = 0;i<n;i++){
            tmp = sc.nextInt();
            System.out.println(data[sc.nextInt()] - data[tmp]);
            sc.nextLine();
        }
    }
}