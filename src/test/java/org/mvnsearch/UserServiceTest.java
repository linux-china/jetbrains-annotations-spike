package org.mvnsearch;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * user service test
 *
 * @author linux_china
 */
public class UserServiceTest {
    private UserService userService = new UserService();

    @Test
    public void testFindUserById() {
        Integer id = 12;
        User user = userService.findUserById(id);
        System.out.println(user.getNick());
    }

    @Test
    public void testWelcome() {
        String nick = "雷卷";
        System.out.println(userService.welcome(nick).length());
        nick = null;
        System.out.println(userService.welcome(nick).length());
    }

    @Test
    public void testFindByUuid() {
        final User user = userService.findByUuid("123");
        System.out.println(user.getId());
    }

    @Test
    public void testUnmodifiable() {
        final List<String> vips = userService.getVips();
        vips.add("linux_china");
    }
}
