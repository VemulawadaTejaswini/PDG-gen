public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Character a=str.charAt(0);
        if (a.charValue()>='A'&&a.charValue()<='Z'){
            System.out.println('A');
        }else if (a.charValue()>='a'&&a.charValue()<='z'){
            System.out.println('a');
        }
    }
}
