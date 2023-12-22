import java.util.Scanner;
class test08{
           public static void main(String args[]){
                 Scanner sc = new Scanner(System.in);
                 String a = sc.next();
                 String b = sc.next();
                 StringBuffer c = new StringBuffer(b);
                 String d = new String(c.reverse());
                 if (a.equals(d)) {
                   System.out.println("YES");
                        }
                 else{
                   System.out.println("NO");
                   }
           }
}
