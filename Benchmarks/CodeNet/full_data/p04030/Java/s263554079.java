import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
ArrayList<String> in=new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
String s[]=line.split("",0);
for(int i=0;i<s.length;i++){
if(s[i].equals("1"))
in.add("1");

if(s[i].equals("0"))
in.add("0");
if(s[i].equals("B")&&in.size()!=0)
in.remove(in.size()-1);

}
for(int i=0;i<in.size();i++)
        System.out.print(in.get(i));System.out.println();
    }

}