/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2015, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package ch.qos.logback.classic.spi;

/**
 * 可抛出的异常的代理
 */
public interface IThrowableProxy {
    /**
     * @return 消息
     */
    String getMessage();

    /**
     * @return 类的完全限定名
     */
    String getClassName();

    /**
     * @return 调用堆栈元素代理对象的数组
     */
    StackTraceElementProxy[] getStackTraceElementProxyArray();

    int getCommonFrames();

    /**
     * @return 异常的根因
     */
    IThrowableProxy getCause();

    IThrowableProxy[] getSuppressed();

    /**
     * Is this instance the result of a cyclic exception?
     * 
     * @return true if cyclic, false otherwise
     * @sine 1.3.0
     */
    boolean isCyclic();
}
