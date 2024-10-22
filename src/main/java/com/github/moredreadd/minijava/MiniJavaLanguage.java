package com.github.moredreadd.minijava;

import com.intellij.lang.Language;

public class MiniJavaLanguage extends Language {
    public static final MiniJavaLanguage INSTANCE = new MiniJavaLanguage();

    private MiniJavaLanguage() {
        super("MiniJava");
    }
}
