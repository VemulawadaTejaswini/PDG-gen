class Main{
    public static void main(String[]args){
      	Scanner scan = new Scanner(System.in);
      	int a,b;
        try{
            a = scan.nextInt();
          	b = scan.nextInt();
        }catch(Exception e){
          	a = 0;
          	b = 0;
        }
        System.out.print(a*b + " ");
        System.out.print((a+b)*2);
        System.out.println();
    }
}
