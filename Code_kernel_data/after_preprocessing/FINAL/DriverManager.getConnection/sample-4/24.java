public class func{
public void getCon(){
    if(con==null){
      try {
        con=DriverManager.getConnection(url,user,password);
      } catch (SQLException e) {
        System.out.println("Printing");
        con=null;
        e.printStackTrace();
      }      
    }
}
}
