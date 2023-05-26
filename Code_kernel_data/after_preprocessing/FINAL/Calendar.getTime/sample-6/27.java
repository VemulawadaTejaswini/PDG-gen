public class func{
public void setupEditRequest(MockHttpServletRequest request,java.util.Map<String,String> widgets){
        Calendar yesterday = Calendar.getInstance();
        yesterday.add(Calendar.DATE, -1);
        editedDate = yesterday.getTime();
        request.addParameter("w9", dateAsString(editedDate));
}
}
