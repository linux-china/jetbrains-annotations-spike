package org.mvnsearch;

import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.PropertyKey;
import org.junit.jupiter.api.Test;

/**
 * property key test
 *
 * @author linux_china
 */
public class PropertyTest {

    @Test
    public void testI18N() {
        @NonNls
        String name = "Jackie";
        @Nls(capitalization = Nls.Capitalization.Title)
        String welcome = "Welcome";
    }

    public void testLoadValue() {
        @PropertyKey(resourceBundle = "messages")
        String key = "nick";
    }
}
