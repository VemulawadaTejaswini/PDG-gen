class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int a,b,c,x;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        x=sc.nextInt();
        int ans=0;
        for(int i=0;i<=a;i++){
            for(int j=0;j<=b;j++){
                for(int k=0;k<=c;k++){
                    if(500*i+100*j+50*k==x){
                        ans++;
                    }
                }
            }
        }
        System.out.print(ans+"\n");
    }
}
