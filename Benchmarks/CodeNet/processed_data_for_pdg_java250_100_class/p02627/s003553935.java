class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String A = a.toUpperCase();
        if(a.equals(A)){
            System.out.println("A");
        }
        else{
            System.out.println("a");
        }
    } 
}
