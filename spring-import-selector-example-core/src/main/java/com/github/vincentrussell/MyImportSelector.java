package com.github.vincentrussell;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import javax.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.ServiceLoader;

public class MyImportSelector implements ImportSelector {

    ServiceLoader<ImportedConfiguration> importedConfigurations = ServiceLoader.load(ImportedConfiguration.class);

    public MyImportSelector() {
        System.out.println(this.getClass());
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String>
            list = Lists.newArrayList(Iterators.transform(Iterators
            .filter(importedConfigurations.iterator(), t -> {
                Annotation[] annotations = t.getClass().getAnnotations();
                for (Annotation annotation : annotations) {
                    if (annotation instanceof Configuration) {
                        return true;
                    }
                }
                return false;
            }), importedConfiguration -> importedConfiguration.getClass().getName()));

        return list.toArray(new String[list.size()]);
    }
}
