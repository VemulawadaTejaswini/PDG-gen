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
