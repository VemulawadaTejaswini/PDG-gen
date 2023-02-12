public class func{
public void home(Model model){
    DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);  
    String formattedDate = dateFormat.format(date);    
    model.addAttribute("serverTime", formattedDate );
}
}
