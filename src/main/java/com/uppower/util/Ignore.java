package com.uppower.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Ignore {

    /**
     * 是否能为null
     * @return
     */
    boolean isNull() default false;

    /**
     * 是否能为空字符串
     * @return
     */
    boolean isEmpty() default false;

    /**
     * 是否能为0
     * @return
     */
    boolean isZero() default false;
}
