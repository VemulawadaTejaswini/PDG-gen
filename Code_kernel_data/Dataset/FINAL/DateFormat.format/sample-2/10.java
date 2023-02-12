public class func{
public void setDate(String id,@DateTimeFormat(pattern="dd/MM/yyyy") Date date,@AuthenticationPrincipal UserDetails ud){
    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    return id + "," + dateFormat.format(date) + ","
}
}
