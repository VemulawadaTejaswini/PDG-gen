class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h,m;
        String str,str1,tmp;
        StringBuffer sb;
        while(true){
            str = sc.nextLine();
            if(str.equals("-")) break;
            str1 = sc.nextLine();
            m = Integer.parseInt(str1);
            sb = new StringBuffer(str);
            for(int i = 0;i < m;i++){
                str1 = sc.nextLine();
                h = Integer.parseInt(str1);
                tmp = sb.substring(0,h);
                sb.append(tmp);
                sb.delete(0,h);
            }
            System.out.println(sb);
        }
    }
}
