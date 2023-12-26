public class Main{      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String strs[] = new String[100];
        int count2=0;
        while(true){
            String str = sc.next();
            if(str.equals("-"))
                {
                    for(int j=0;j<count2;j++){
                        System.out.println(strs[j]);
                    }
                    sc.close();
                    break;
                }
            int num = sc.nextInt();
            for(int i=0;i<num;i++)
            {
                int count=sc.nextInt();
                String str1=str.substring(0,count);
                String str2=str.substring(count,str.length());
                str = str2 + str1;
            }
            strs[count2]=str;
            count2++;
        }  
    }   
}
