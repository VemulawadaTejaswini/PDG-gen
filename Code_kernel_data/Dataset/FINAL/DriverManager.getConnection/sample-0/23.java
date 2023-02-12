public class func{
public void CreateTable(){
      conn=DriverManager.getConnection("jdbc:sqlite"+FILENAME);
      Statement st = (Statement) conn.createStatement();
      st.executeUpdate("create table goods_tm(_id integer primary key autoincrement,goodsCategoryTid text,goodsid text,goodsname text,memberprice text,pictureurl text)");
}
}
