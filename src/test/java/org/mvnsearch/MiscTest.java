package org.mvnsearch;


import org.jetbrains.annotations.Range;
import org.junit.jupiter.api.Test;

public class MiscTest {
    @Test
    public void shouldAnswerWithTrue() {
        User vipUser = loadVip(9);
    }

    public User loadVip(@Range(from = 1000, to = 2000) Integer id) {
       return new User();
    }

}
