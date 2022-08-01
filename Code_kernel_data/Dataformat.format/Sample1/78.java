//77
public class func{
	public void formatDateText(final Date dt){
        final FieldPosition yyfp = new FieldPosition(DateFormat.YEAR_FIELD);
        df.format(dt, yy, yyfp);
        return (mm.toString().substring(mmfp.getBeginIndex(), mmfp.getEndIndex()) +
                " " + yy.toString().substring(yyfp.getBeginIndex(), yyfp.getEndIndex()));
}
}
