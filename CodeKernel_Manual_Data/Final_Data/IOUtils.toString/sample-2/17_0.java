public void dummy {

public String get(String fullProperty, Method method) {
    Connection conn = null;/*  ww w.  j a  v a2 s  .com*/
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        conn = getConnection();
        stmt = conn.prepareStatement("SELECT VALUE                           "
                + "FROM   PUBLIC.CLS_METHOD_PROP_VALUE_V2 " + "WHERE  FULL_PROP = ?                   "
                + "AND    NAM_CLASS = ?                   " + "AND    NAM_METHOD = ?                  ");

        stmt.setString(1, StringUtils.upperCase(fullProperty));
        stmt.setString(2, method.getDeclaringClass().getName());
        stmt.setString(3, method.getName());
        rs = stmt.executeQuery();

        if (rs.next()) {
            return rs.getClob(1) == null ? null
                    : rs.getClob(1).getCharacterStream() == null ? null
                            : IOUtils.toString(rs.getClob(1).getCharacterStream());
        }

        return null;

    } catch (Exception e) {
        LoggerHolder.getLog().warn(msg.format("error.db", "get"), e);
        throw new RuntimeException(e);

    } finally {
        close(rs);
        close(stmt);
        close(conn);
    }
}

}