package org.mvnsearch;


import org.intellij.lang.annotations.Language;
import org.intellij.lang.annotations.Subst;
import org.jetbrains.annotations.Range;
import org.junit.jupiter.api.Test;

public class MiscTest {
    @Subst("red")
    private String color;

    @Test
    public void shouldAnswerWithTrue() {
        User vipUser = loadVip(9);
    }

    public User loadVip(@Range(from = 1000, to = 2000) Integer id) {
        return new User();
    }

    @Test
    public void testSubst() {
        @Language("HTML")
        String message = "<html><span style='color: " + color + "; font-size:smaller'></span></html>";
    }

}
