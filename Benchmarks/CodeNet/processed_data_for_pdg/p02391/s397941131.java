class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=Integer.parseInt(in.next()),b=Integer.parseInt(in.next());
        String o;
        if(a<b)o=" < ";
        else if(a>b)o=" > ";
        else o=" == ";
        System.out.println("a"+o+"b");
    }
}
