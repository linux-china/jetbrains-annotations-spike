package org.mvnsearch;

import org.intellij.lang.annotations.Language;
import org.intellij.lang.annotations.Pattern;
import org.intellij.lang.annotations.RegExp;
import org.intellij.lang.annotations.Subst;
import org.junit.jupiter.api.Test;

/**
 * language injection test
 *
 * @author linux_china
 */
public class LanguageInjectionTest {

    @Test
    public void testNormalLanguage() {
        //language=HTML
        String text = """
                <span style='color: blue'>Welcome</span>
                """;
        @Language("HTML")
        String html = """
                <span style='color: red'>Hello</span>
                """;
    }

    @Test
    public void testLanguageInjection() {
        @Language(value = "HTML", prefix = "<div ", suffix = ">")
        String divAttributes = "style='color: red' class='alert'";
        @Language(value = "JavaScript", prefix = "function welcome(name) {}; function hello(name) {};")
        String jsCode = """
                let name ='jacky';
                welcome(name);
                hello(name);
                """;
        @Language(value = "JAVA", prefix = "class TempClass { private String name =\"\"; void nothing(){ ", suffix = "}}")
        String javaCode = """
                 this.name = "jacky";
                """;
    }

    @Test
    public void testRegex() {
        @Language("RegExp")
        String passCodePattern = "[a-zA-Z0-9]";
        @RegExp
        String nickPattern = "[a-zA-Z0-9]";
    }

    @Test
    public void testPattern() {
        @Pattern("[a-zA-Z0-9]+")
        String nick = "good";
    }

    @Test
    public void testSubst() {
        @Subst("red")
        String color = "red";
        //language=HTML
        String text = "<span style='color: " + color + "'>Welcome</span>";
    }
}
