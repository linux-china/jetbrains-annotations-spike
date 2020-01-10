package org.mvnsearch;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * User service
 *
 * @author linux_china
 */
public class UserService {

    @Nullable
    public User findUserById(@NotNull Integer id) {
        // logic here
        return null;
    }

    @Contract("null -> null")
    public String welcome(@Nullable String nick) {
        return nick == null ? null : "Welcome " + nick;
    }
}
