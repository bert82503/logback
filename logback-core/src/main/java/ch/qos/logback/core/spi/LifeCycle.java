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
package ch.qos.logback.core.spi;

/**
 * Components supporting start/stop implement this interface.
 * 组件生命周期，支持启动/停止的组件。
 *
 * @since 1.0.0
 */
public interface LifeCycle {

    /**
     * 启动阶段
     */
    void start();

    /**
     * 关闭阶段
     */
    void stop();

    /**
     * 是否是启动状态
     */
    boolean isStarted();

}
