Line_2 $$ public void testArrayListReadMethod() throws Exception --> Line_3 $$ final PropertyDescriptor descriptor = propertyUtilsBean.getPropertyDescriptor(bean, "arrayList") [CD]
Line_2 $$ public void testArrayListReadMethod() throws Exception --> Line_4 $$ assertNotNull("No ArrayList Read Method", descriptor.getReadMethod()) [CD]
Line_3 $$ final PropertyDescriptor descriptor = propertyUtilsBean.getPropertyDescriptor(bean, "arrayList") --> Line_4 $$ assertNotNull("No ArrayList Read Method", descriptor.getReadMethod()) [FD]
