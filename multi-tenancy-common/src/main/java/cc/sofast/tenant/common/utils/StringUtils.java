package cc.sofast.tenant.common.utils;

/**
 * @author siaron.wang@gmail.com
 */
public class StringUtils {

    public static boolean isNotBlank(String str) {
        return (str != null && !str.isEmpty() && containsText(str));
    }

    public static boolean isBlank(String str) {

        return !isNotBlank(str);
    }

    private static boolean containsText(CharSequence str) {
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

}
