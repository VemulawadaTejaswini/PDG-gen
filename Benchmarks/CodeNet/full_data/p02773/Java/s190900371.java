import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();String[] array = new String[n];int[] s=new int[n];int result=0;
        for(int i=0;i<n;i++)
            s[i]=0;
        for(int i=0;i<n;i++)
            array[i]=sc.next();
        Arrays.sort(array);
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(array[i].equals(array[j])){
                    s[i]++;
                }
                if(s[i]>result)
                    result=s[i];
            }
        }
        for(int i=0;i<n;i++){
            if(s[i]==result){
                System.out.println(array[i]);
            }
        }
}
    }