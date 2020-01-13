package org.mvnsearch;

import org.junit.jupiter.api.Test;

/**
 * pattern test
 *
 * @author linux_china
 */
public class PatternTest {

    @Test
    public void testSetNick() {
        User user = new User();
        user.setNick("leijuan007");
        user.setNick("linux_china");
    }
}
