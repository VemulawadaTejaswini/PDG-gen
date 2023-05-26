//5
public class func{
public void testDateToStringConversion(){
        Calendar date = Calendar.getInstance();
        String dateText = view.getDateFormatter().format(date.getTime());
        view.setDate(date);
        assertThat(view.getText(), equalTo(dateText));
}
}
