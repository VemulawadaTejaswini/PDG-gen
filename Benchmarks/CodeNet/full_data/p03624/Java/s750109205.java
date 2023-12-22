
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                String s=scanner.next();
                int[] a=new int[26];
                for(int i=0;i<26;i++){
                        a[i]=97+i;
                }
                for(int i=0;i<s.length();i++){
                        a[s.charAt(i)-97]=0;
                }
                for(int i=0;i<s.length();i++){
                        if(a[i]!=0){
                                System.out.println((char)(i+97));
                                return;
                        }
                }
                System.out.println("None");
        }
}	