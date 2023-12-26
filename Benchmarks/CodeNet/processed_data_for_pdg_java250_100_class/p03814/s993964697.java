class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();
        int ans=0;
        int aind=-1;
        int zind=-1;
        for (int i=0;i<s.length;i++){
            if (s[i]=='A' && aind==-1){
                aind=i;
            }    
            if (s[i]=='Z'){
                zind=i;
            }
        }
		System.out.println(zind-aind+1);        
    }
}
