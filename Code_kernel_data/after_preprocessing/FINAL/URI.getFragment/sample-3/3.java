public class func{
public void openDB(){
        SQLiteDatabase mDb = context.openOrCreateDatabase(DB_NAME, Context.MODE_PRIVATE, null);
        if (mDb.getVersion() == 1) {
            Log.i(K9.LOG_TAG, "Updating preferences to urlencoded username/password");
            String accountUuids = readValue(mDb, "accountUuids");
            if (accountUuids != null && accountUuids.length() != 0) {
                String[] uuids = accountUuids.split(",");
                for (String uuid : uuids) {
                    try {
                        String storeUriStr = Base64.decode(readValue(mDb, uuid + ".storeUri"));
                        String transportUriStr = Base64.decode(readValue(mDb, uuid + ".transportUri"));
                        URI uri = new URI(transportUriStr);
                        String newUserInfo = null;
                        if (transportUriStr != null) {
                            String[] userInfoParts = uri.getUserInfo().split(":");
                            String usernameEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[0]);
                            String passwordEnc = "";
                            String authType = "";
                            if (userInfoParts.length > 1) {
                                passwordEnc = ":" + UrlEncodingHelper.encodeUtf8(userInfoParts[1]);
                            }
                            if (userInfoParts.length > 2) {
                                authType = ":" + userInfoParts[2];
                            }
                            newUserInfo = usernameEnc + passwordEnc + authType;
                        }
                        if (newUserInfo != null) {
                            URI newUri = new URI(uri.getScheme(), newUserInfo, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
                            String newTransportUriStr = Base64.encode(newUri.toString());
                            writeValue(mDb, uuid + ".transportUri", newTransportUriStr);
                        }
                        uri = new URI(storeUriStr);
                        newUserInfo = null;
                        if (storeUriStr.startsWith("imap")) {
                            String[] userInfoParts = uri.getUserInfo().split(":");
                            if (userInfoParts.length == 2) {
                                String usernameEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[0]);
                                String passwordEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[1]);
                                newUserInfo = usernameEnc + ":" + passwordEnc;
                            } else {
                                String authType = userInfoParts[0];
                                String usernameEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[1]);
                                String passwordEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[2]);
                                newUserInfo = authType + ":" + usernameEnc + ":" + passwordEnc;
                            }
                        } else if (storeUriStr.startsWith("pop3")) {
                            String[] userInfoParts = uri.getUserInfo().split(":", 2);
                            String usernameEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[0]);
                            String passwordEnc = "";
                            if (userInfoParts.length > 1) {
                                passwordEnc = ":" + UrlEncodingHelper.encodeUtf8(userInfoParts[1]);
                            }
                            newUserInfo = usernameEnc + passwordEnc;
                        } else if (storeUriStr.startsWith("webdav")) {
                            String[] userInfoParts = uri.getUserInfo().split(":", 2);
                            String usernameEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[0]);
                            String passwordEnc = "";
                            if (userInfoParts.length > 1) {
                                passwordEnc = ":" + UrlEncodingHelper.encodeUtf8(userInfoParts[1]);
                            }
                            newUserInfo = usernameEnc + passwordEnc;
                        }
                        if (newUserInfo != null) {
                            URI newUri = new URI(uri.getScheme(), newUserInfo, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
                            String newStoreUriStr = Base64.encode(newUri.toString());
                            writeValue(mDb, uuid + ".storeUri", newStoreUriStr);
                        }
                    } catch (Exception e) {
                        Log.e(K9.LOG_TAG, "ooops", e);
                    }
                }
            }
            mDb.setVersion(DB_VERSION);
        }
        if (mDb.getVersion() != DB_VERSION) {
            Log.i(K9.LOG_TAG, "Creating Storage database");
            mDb.execSQL("DROP TABLE IF EXISTS preferences_storage");
            mDb.execSQL("CREATE TABLE preferences_storage " +
                        "(primkey TEXT PRIMARY KEY ON CONFLICT REPLACE, value TEXT)");
            mDb.setVersion(DB_VERSION);
        }
}
}
