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

import java.util.Map;
import java.util.Properties;

/**
 * 属性键值对的容器
 */
public interface PropertyContainer {


    void addSubstitutionProperty(String key, String value);

    String getProperty(String key);

    Map<String, String> getCopyOfPropertyMap();

    default void addSubstitutionProperties(Properties props) {
        if (props == null) {
            return;
        }
        for (Object keyObject : props.keySet()) {
            String key = (String) keyObject;
            String val = props.getProperty(key);
            addSubstitutionProperty(key, val);
        }
    }
}
