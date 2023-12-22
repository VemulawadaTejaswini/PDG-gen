import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        String[] strList = line.split("",0);
        String str1 = "";


        for(int i=0; i<strList.length; i++) {
            if(strList[i].equals("0")) {
                str1+="0";
            } else if(strList[i].equals(("1"))) {
                str1+="1";
            } else {
                if(str1.length()>0) {
                    String[] hoge = str1.split("", 0);
                    str1 = "";
                    for(int j=0;j<hoge.length-1;j++) {
                        str1 += hoge[j];
                    }
                }
            }
        }

        System.out.println(str1);


    }
}
