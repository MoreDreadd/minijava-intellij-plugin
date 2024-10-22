package com.github.moredreadd.minijava;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MiniJavaFileType extends LanguageFileType {
    public static final MiniJavaFileType INSTANCE = new MiniJavaFileType();

    private MiniJavaFileType() {
        super(MiniJavaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "MiniJava File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "MiniJava language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mj";
    }

    @Override
    public Icon getIcon() {
        return MiniJavaIcons.FILE;
    }
}
