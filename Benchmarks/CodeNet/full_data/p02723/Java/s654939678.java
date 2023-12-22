import java.util.Scanner;

 class b {
    public static void main(String[] args) {
        String s;
        Scanner input=new Scanner(System.in);
        s=input.nextLine();
        if(s.charAt(3)==s.charAt(4) && s.charAt(5)==s.charAt(6)){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
