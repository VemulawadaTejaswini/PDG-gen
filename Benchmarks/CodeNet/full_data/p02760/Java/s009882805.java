import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 標準入力から値を取得してinput_lineに入れる
        String line1 = sc.nextLine();
        String num1 = line1.substring(0,line1.indexOf(" "));
        String num1_2 = line1.substring(line1.indexOf(" ")+1);
        String num2 = num1_2.substring(0,num1_2.indexOf(" "));
        String num2_2 = num2.substring(0);
        String num3 = num2_2.substring(0);
        String line2 = sc.nextLine();
        String num4 = line2.substring(0,line2.indexOf(" "));
        String num4_2 = line2.substring(line2.indexOf(" ")+1);
        String num5 = num4_2.substring(0,num4_2.indexOf(" "));
        String num5_2 = num5.substring(0);
        String num6 = num5_2.substring(0);
        String line3 = sc.nextLine();
        String num7 = line3.substring(0,line3.indexOf(" "));
        String num7_2 = line3.substring(line3.indexOf(" ")+1);
        String num8 = num7_2.substring(0,num7_2.indexOf(" "));
        String num8_2 = num8.substring(0);
        String num9 = num8_2.substring(0);

        // ArrayList<String> input = new ArrayList<String>();
        // 入力をすべて受け取る
        while(sc.hasNextLine()){
         String inta = sc.nextLine();
        //   if(inta.equals(null)){
        //       break;
        //   }
         	if(inta.equals(num1)) {
         		num1 = "check";
         	} else if(inta.equals(num2)) {
         		num2 = "check";
         	} else if(inta.equals(num3)) {
         		num3 = "check";
         	} else if(inta.equals(num4)) {
         		num4 = "check";
         	} else if(inta.equals(num5)) {
         		num5 = "check";
         	} else if(inta.equals(num6)) {
         		num6 = "check";
         	} else if(inta.equals(num7)) {
         		num7 = "check";
         	} else if(inta.equals(num8)) {
         		num8 = "check";
         	} else if(inta.equals(num9)) {
         		num9 = "check";
         	}
        }
        if(num1.equals("check") && num2.equals("check") && num3.equals("check")) {
        	System.out.println("Yes");
        } else if(num1.equals("check") && num4.equals("check") && num7.equals("check")) {
        	System.out.println("Yes");
        } else if(num1.equals("check") && num5.equals("check") && num9.equals("check")) {
        	System.out.println("Yes");
        } else if(num2.equals("check") && num5.equals("check") && num8.equals("check")) {
        	System.out.println("Yes");
        } else if(num3.equals("check") && num5.equals("check") && num7.equals("check")) {
        	System.out.println("Yes");
        } else if(num3.equals("check") && num6.equals("check") && num9.equals("check")) {
        	System.out.println("Yes");
        } else if(num4.equals("check") && num5.equals("check") && num6.equals("check")) {
        	System.out.println("Yes");
        } else if(num7.equals("check") && num8.equals("check") && num9.equals("check")) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }

}
}