public class func{
public void getHadoopMultiUsersList(){
    while((strLine = disObj.readLine()) != null){
      usersList.add(strLine.substring(0,strLine.indexOf(',')));
    }
}
}
