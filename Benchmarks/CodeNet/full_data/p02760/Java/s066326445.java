import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 標準入力から値を取得してinput_lineに入れる
        String line1 = sc.nextLine();
        String num1 = line1.substring(0,line1.indexOf(" "));
        String num2 = num1.substring(0,line1.indexOf(" "));
        String num3 = num2.substring(0);
        String line2 = sc.nextLine();
        String num4 = line2.substring(0,line2.indexOf(" "));
        String num5 = num4.substring(0,line2.indexOf(" "));
        String num6 = num5.substring(0);
        String line3 = sc.nextLine();
        String num7 = line3.substring(0,line3.indexOf(" "));
        String num8 = num7.substring(0,line3.indexOf(" "));
        String num9 = num8.substring(0);
        String num1c = "";
        String num2c = "";
        String num3c = "";
        String num4c = "";
        String num5c = "";
        String num6c = "";
        String num7c = "";
        String num8c = "";
        String num9c = "";


        // ArrayList<String> input = new ArrayList<String>();
        // 入力をすべて受け取る
        while(sc.hasNextLine()){
         String inta = sc.nextLine();
        //   if(inta.equals(null)){
        //       break;
        //   }
         	if(inta.equals(num1)) {
         		num1c = "check";
         	} else if(inta.equals(num2)) {
         		num2c = "check";
         	} else if(inta.equals(num3)) {
         		num3c = "check";
         	} else if(inta.equals(num4)) {
         		num4c = "check";
         	} else if(inta.equals(num5)) {
         		num5c = "check";
         	} else if(inta.equals(num6)) {
         		num6c = "check";
         	} else if(inta.equals(num7)) {
         		num7c = "check";
         	} else if(inta.equals(num8)) {
         		num8c = "check";
         	} else if(inta.equals(num9)) {
         		num9c = "check";
         	}
        }
        if(num1c.equals("check") && num2c.equals("check") && num3c.equals("check")) {
        	System.out.println("Yes");
        } else if(num1c.equals("check") && num4c.equals("check") && num7c.equals("check")) {
        	System.out.println("Yes");
        } else if(num1c.equals("check") && num5c.equals("check") && num9c.equals("check")) {
        	System.out.println("Yes");
        } else if(num2c.equals("check") && num5c.equals("check") && num8c.equals("check")) {
        	System.out.println("Yes");
        } else if(num3c.equals("check") && num5c.equals("check") && num7c.equals("check")) {
        	System.out.println("Yes");
        } else if(num3c.equals("check") && num6c.equals("check") && num9c.equals("check")) {
        	System.out.println("Yes");
        } else if(num4c.equals("check") && num5c.equals("check") && num6c.equals("check")) {
        	System.out.println("Yes");
        } else if(num7c.equals("check") && num8c.equals("check") && num9c.equals("check")) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }

}
}