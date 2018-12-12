package com.yuan.javaannotation;

import java.lang.annotation.*;

/**
 * @author chen.yuanpeng
 * @date 2018/12/12 11:03
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Column {
    String value();
}
