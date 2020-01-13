package org.mvnsearch.internal;

import org.jetbrains.annotations.ApiStatus;

/**
 * internal service
 *
 * @author linux_china
 */

public class InternalService {

    @ApiStatus.Internal
    public static boolean isVip(String text) {
        return text == null || text.isEmpty();
    }

    @ApiStatus.Experimental
    public static boolean isKA(String text) {
        return text == null || text.isEmpty();
    }
}
