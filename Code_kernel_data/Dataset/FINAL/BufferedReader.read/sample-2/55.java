public class func{
public void query(boolean longOutput,String username){
                read = input.read(__buffer, 0, __buffer.length);
                if (read <= 0) {
                    break;
                }
                result.append(__buffer, 0, read);
            input.close();
}
}
