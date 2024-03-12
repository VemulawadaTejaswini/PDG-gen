Line_2 $$ public void testListReadMethod() throws Exception --> Line_3 $$ final PropertyDescriptor descriptor = propertyUtilsBean.getPropertyDescriptor(bean, "stringList") [CD]
Line_2 $$ public void testListReadMethod() throws Exception --> Line_4 $$ assertNotNull("No List Read Method", descriptor.getReadMethod()) [CD]
Line_3 $$ final PropertyDescriptor descriptor = propertyUtilsBean.getPropertyDescriptor(bean, "stringList") --> Line_4 $$ assertNotNull("No List Read Method", descriptor.getReadMethod()) [FD]
