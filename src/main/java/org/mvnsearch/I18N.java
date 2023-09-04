package org.mvnsearch;

import org.jetbrains.annotations.PropertyKey;

import java.util.ResourceBundle;


public class I18N {
    public static final String BUNDLE_NAME = "messages";
    private static ResourceBundle myResourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);

    public static String getValue(@PropertyKey(resourceBundle = BUNDLE_NAME) String name) {
        return myResourceBundle.getString(name);
    }

    public static void main(String[] args) {
        System.out.println(I18N.getValue("nick"));
    }
}
