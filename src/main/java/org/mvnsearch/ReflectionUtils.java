package org.mvnsearch;

import org.jetbrains.annotations.TestOnly;

import java.util.stream.Stream;

/**
 * Reflection utils for test only
 *
 * @author linux_china
 */
@TestOnly
public class ReflectionUtils {

    public static Object invokeMethod(Object target, String name, Object... args) {
        return Stream.of(target.getClass().getMethods())
                .filter(method -> method.getName().equals(name))
                .findFirst()
                .map(method -> {
                    try {
                        return method.invoke(target, args);
                    } catch (Exception ignore) {
                        return null;
                    }
                }).orElse(null);
    }

}
