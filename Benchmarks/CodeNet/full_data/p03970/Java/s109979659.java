import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        char[] source = cin.nextLine().toCharArray();
        char[] target = "CODEFESTIVAL2016".toCharArray();
        int count = 0;
        for(int i = 0; i < source.length; i++){
        	if(source[0] != target[0]){
        		count++;
        	}
        }
        System.out.println(count);
    }
}