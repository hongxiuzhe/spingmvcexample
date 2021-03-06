package com.dzhao.springmvc.codegen.annotation;

import com.dzhao.springmvc.codegen.enums.OperatorEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by dzhao on 22/09/2015.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface GenerateJoinedMethod {
    GenerateMethod[] method() default{};
}
