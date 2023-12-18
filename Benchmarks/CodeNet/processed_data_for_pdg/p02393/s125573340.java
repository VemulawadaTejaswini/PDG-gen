class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] n=new int[3];
        n[0]=sc.nextInt();
        n[1]=sc.nextInt();
        n[2]=sc.nextInt();
        int a;
        if(n[0]>n[1]){
            a=n[0];
            n[0]=n[1];
            n[1]=a;
        }if(n[1]>n[2]){
            a=n[1];
            n[1]=n[2];
            n[2]=a;
        }if(n[0]>n[1]){
            a=n[0];
            n[0]=n[1];
            n[1]=a;
        }
        System.out.println(n[0]+" "+n[1]+" "+n[2]);
    }
}
