class Main{
    public static void main(String args[]){
        try{
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String s=reader.readLine();
            StringTokenizer st=new StringTokenizer(s," ");
            String a=st.nextToken();
            String b=st.nextToken();
            String c=st.nextToken();
            int an=Integer.parseInt(a);
            int bn=Integer.parseInt(b);
            int cn=Integer.parseInt(c);
            int min,mid,max;
            if(an>bn&&an>cn){
                max=an;
                if(bn>cn){
                    mid=bn; min=cn;
                }else{
                    mid=cn; min=bn;
                }
            }else if(bn>cn){
                max=bn;
                if(an>cn){
                    mid=an; min=cn;
                }else{
                    mid=cn; min=an;
                }
            }else{
                max=cn;
                if(an>bn){
                    mid=an; min=bn;
                }else{
                    mid=bn; min=an;
                }
            }
            System.out.println(min+" "+mid+" "+max);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
