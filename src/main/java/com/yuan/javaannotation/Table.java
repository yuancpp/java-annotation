package com.yuan.javaannotation;

import java.lang.annotation.*;

/**
 * @author chen.yuanpeng
 * @date 2018/12/12 11:00
 */

/**
 * @Target
 * CONSTRUCTOR:用于描述构造器
 * FIELD:用于描述域
 * LOCAL_VARIABLE:用于描述局部变量
 * METHOD:用于描述方法
 * PACKAGE:用于描述包
 * PARAMETER:用于描述参数
 * TYPE:用于描述类、接口(包括注解类型) 或enum声明
 *
 * @Retention
 * SOURCE:在源文件中有效
 * CLASS:在class文件中有效
 * RUNTIME:在运行时有效（即运行时保留）
 *
 * @Documented
 * 是一个标记注解，有该注解的注解会在生成 java 文档中保留。
 *
 * @Inherited
 * 该注解表明子类是有继承了父类的注解。比如一个注解被该元注解修饰，并且该注解的作用在父类上，那么子类有持有该注解。如果注解没有被该元注解修饰，则子类不持有父类的注解。
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
public @interface Table {

    String value() default "";
}
