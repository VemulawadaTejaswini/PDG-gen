//52
public class func{
	public void handleAsCalendar(Calendar value){
        int n = value.get(Calendar.MILLISECOND) * 1000;
        super.setValueInternal(LocalDateTime.of(LocalDate.ofEpochDay(value.getTime().getTime()), LocalTime.of(h, i, s, n)));
}
}
