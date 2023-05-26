//5
public class func{
public void run(){
                truc=br.read();
                if(truc!=-1){
                  if(((char)truc)!='\n'){
                    str+=(char)truc;
                  }else{
                    System.out.println(str);
                    str="";
                  }
                }
              while((truc=br.read())!=-1){
                if(truc!=10){
                  str+=(char)truc;
                }else{
                  System.out.println(str);
                  str="";
                }
              }
              br.close();
}
}
