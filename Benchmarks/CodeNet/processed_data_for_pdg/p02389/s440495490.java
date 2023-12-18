class Main{
    public static void main(String[] args){
        String str = new Scanner(System.in).nextLine();
        String strs[]= str.split(" ");
        int a =Integer.parseInt(strs[0]);
        int b =Integer.parseInt(strs[1]);
        System.out.println(a*b+" "+2*(a+b));
    }
}
