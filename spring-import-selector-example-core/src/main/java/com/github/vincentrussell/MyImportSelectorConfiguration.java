package com.github.vincentrussell;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyImportSelector.class)
public class MyImportSelectorConfiguration {

    public MyImportSelectorConfiguration() {
        System.out.println(this.getClass());
    }

}
