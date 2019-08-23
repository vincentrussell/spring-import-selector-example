package com.github.vincentrussell;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DevProfileActivated implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return Lists.newArrayList(context.getEnvironment().getActiveProfiles()).contains("dev");
    }
}
