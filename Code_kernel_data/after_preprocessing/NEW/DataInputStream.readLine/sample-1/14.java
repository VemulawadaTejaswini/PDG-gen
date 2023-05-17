//14
public class func{
public void isRoot(){
            String currUid = osRes.readLine();
            if (null == currUid)
            {
              retval = false;
              exitSu = false;
              Log.e("ROOT", "Can't get root access or denied by user");
            }
            else if (true == currUid.contains("uid=0"))
            {
              retval = true;
              exitSu = true;
            }
            else
            {
              retval = false;
              exitSu = true;
              Log.e("ROOT", "Root access rejected: " + currUid);
            }
}
}
