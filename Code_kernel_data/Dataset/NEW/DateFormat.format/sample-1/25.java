//25
public class func{
public void getItemRepresentation(ItemValueWrapperType item){
            if (item.hasFullDatesRange()) {
              sb.append(getMessage("dict.full.range"));
            }
            else {
              sb.append(item.getValidStartDate() != null ? dateFormat.format(item.getValidStartDate()) : EMPTY_VALID_DATE)
                  .append(" - ")
                  .append(item.getValidEndDate() != null ? dateFormat.format(item.getValidEndDate()) : EMPTY_VALID_DATE);
            }
}
}
