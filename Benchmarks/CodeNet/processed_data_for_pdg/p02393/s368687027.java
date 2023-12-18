class Main{
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String str = reader.readLine();
                String[] arr = str.split(" ");
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);
                int c = Integer.parseInt(arr[2]);
                String sort = null;
                if(b < a && c < a){
                    if(b < c){
                        sort = (b + " " + c + " " + a);
                    }
                    else{
                        sort = (c + " " + b + " " + a);
                    }
                }
                else if(a < b && c < b){
                    if(a < c){
                        sort = (a + " " + c + " " + b);
                    }
                    else{
                        sort = (c + " " + a + " " + b);
                    }
                }
                else if(a < c && b < c){
                    if(b < a){
                        sort = (b + " " + a + " " + c);
                    }
                    else{
                        sort = (a + " " + b + " " + c);
                    }
                }
                System.out.println(sort);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
