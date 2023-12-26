public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String[] astr = str.split(""); 
        sc.close();
        Arrays.sort(astr);
        if(astr[0].equals(astr[1]) && !astr[1].equals(astr[2]) && astr[2].equals(astr[3])){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
