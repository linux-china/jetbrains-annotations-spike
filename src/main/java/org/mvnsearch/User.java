package org.mvnsearch;

import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.Debug;

/**
 * user class
 *
 * @author linux_china
 */
@Debug.Renderer(text = "\"id: \" + id + \",nick:\" + nick")
public class User {
    private Integer id;
    private String nick;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(@Pattern("[a-zA-Z0-9]+") String nick) {
        this.nick = nick;
    }
}
