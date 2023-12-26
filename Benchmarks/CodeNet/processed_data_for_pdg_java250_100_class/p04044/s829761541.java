class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();   
        int l = sc.nextInt();
        String s;
        ArrayList<String> sl = new ArrayList<String>(); 
        for(int i=0;i<n;i++){
            s = sc.next();
            sl.add(s);  
        }
        Collections.sort(sl);
        String ans = "";
        for(String str : sl){
            ans += str;
        }
        System.out.println(ans);    
    }
}
