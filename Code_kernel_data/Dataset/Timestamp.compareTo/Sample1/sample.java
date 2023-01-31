//0
public class func{
	public void getLabelBounds(FemLabel referenceLabel,FarragoRepos repos){
        for (FemLabel label : labels) {
            // Ignore label aliases since they are "pointers" to base
            // labels.  So, only the timestamps of base labels are
            // meaningful in determining which label is the oldest.
            if (label.getParentLabel() != null) {
                continue;
            }
            String timestamp = label.getCreationTimestamp();

            // Ignore new labels that haven't been created yet
            if (timestamp == null) {
                continue;
            }
            Timestamp labelTimestamp = Timestamp.valueOf(timestamp);
            int rc = referenceTimestamp.compareTo(labelTimestamp);

            // Find the newest label older than the reference label
            if ((rc > 0)
                && ((lowerBound == null)
                    || (labelTimestamp.compareTo(lowerBound) > 0)))
            {
                lowerBound = labelTimestamp;

                // Find the oldest label newer than the reference label
            } else if (
                (rc < 0)
                && ((upperBound == null)
                    || (labelTimestamp.compareTo(upperBound) < 0)))
            {
                upperBound = labelTimestamp;
            }
        }
}
}
//1
public class func{
	public void getTable(String[] names){
        if ((labelTimestamp != null) && (table instanceof FemLocalTable)) {
            FemAnnotatedElement annotated = (FemAnnotatedElement) table;
            Timestamp objectCreateTimestamp =
                Timestamp.valueOf(annotated.getCreationTimestamp());
            if (objectCreateTimestamp.compareTo(labelTimestamp) > 0) {
                throw FarragoResource.instance()
                .ValidatorAccessObjectNonVisibleToLabel.ex(
                    getRepos().getLocalizedObjectName(table));
            }
        }
        addDependency(table, action);
        if (table.getVisibility() == null) {
            throw new FarragoUnvalidatedDependencyException();
        }
        RelDataType rowType = createTableRowType(table);
        if (table instanceof FemLocalTable) {
            int nColumnsTotal = rowType.getFieldCount();
            int nColumnsActual = nColumnsTotal;

            // If table is undergoing ALTER TABLE ADD COLUMN,
            // hide the new (last) column.
            DependencySupplier supplier =
                getRepos().getCorePackage().getDependencySupplier();
            for (CwmDependency dep : supplier.getSupplierDependency(table)) {
                if (dep.getNamespace() instanceof FemRecoveryReference) {
                    FemRecoveryReference recoveryRef =
                        (FemRecoveryReference) dep.getNamespace();
                    if (recoveryRef.getRecoveryType()
                        == RecoveryTypeEnum.ALTER_TABLE_ADD_COLUMN)
                    {
                        --nColumnsActual;
                        break;
                    }
                }
            }

            // If a label is set, hide any columns which were created
            // after the label
            if (labelTimestamp != null) {
                while (nColumnsActual > 1) {
                    FemStoredColumn column =
                        (FemStoredColumn) table.getFeature().get(
                            nColumnsActual - 1);
                    Timestamp columnCreateTimestamp =
                        Timestamp.valueOf(column.getCreationTimestamp());
                    if (columnCreateTimestamp.compareTo(labelTimestamp) > 0) {
                        --nColumnsActual;
                    } else {
                        // Once we see the first visible column, everything
                        // before it is guaranteed to be visible since
                        // we only allow creation of columns at the end.
                        break;
                    }
                }
            }

            // Now truncate the row if necessary
            if (nColumnsActual < nColumnsTotal) {
                rowType =
                    getFarragoTypeFactory().createStructType(
                        RelOptUtil.getFieldTypeList(rowType).subList(
                            0,
                            nColumnsActual),
                        RelOptUtil.getFieldNameList(rowType).subList(
                            0,
                            nColumnsActual));
            }
        }
            FarragoCatalogUtil.getTableAllowedAccess(table);
}
}
//2
public class func{
	public void timeSheetChecker(HttpServletRequest request,HttpServletResponse response){
                        for (int i = 0; i < 5; i++) {
                            Timestamp realTimeDate = UtilDateTime.addDaysToTimestamp(timesheetDate, i);
                            Timestamp nowStartDate = UtilDateTime.getDayStart(now);
                            //compare week and compare date
                            if ((timesheetDate.compareTo(weekStart) <= 0) && (realTimeDate.compareTo(nowStartDate) < 0)) {
                                //check time entry
                                List<GenericValue> timeEntryList = timesheetMap.getRelated("TimeEntry", UtilMisc.toMap("partyId", partyId, "timesheetId",timesheetId, "fromDate",realTimeDate), null, false);
                                //check EmplLeave
                                List<GenericValue> emplLeaveList = EntityQuery.use(delegator).from("EmplLeave").where("partyId", partyId, "fromDate", realTimeDate).cache(true).queryList();
                                if (UtilValidate.isEmpty(timeEntryList) && UtilValidate.isEmpty(emplLeaveList)) {
                                    Map<String, Object> noEntryMap = new HashMap<String, Object>();
                                    noEntryMap.put("timesheetId", timesheetId);
                                    noTimeEntryList.add(noEntryMap);
                                    break;
                                }
                            }
                        }
}
}
//3
public class func{
	public void compare(Object o1,Object o2,byte dt1,byte dt2){
        return ((Timestamp)o1).compareTo((Timestamp)o2);
}
}
//4
public class func{
	public void compare(final Object obj1,final Object obj2){
         return ((Timestamp)obj1).compareTo((Timestamp)obj2);
}
}
//5
public class func{
	public void compare(Object arg0,Object arg1){
      return ((Timestamp) arg0).compareTo((Timestamp) arg1);
}
}
