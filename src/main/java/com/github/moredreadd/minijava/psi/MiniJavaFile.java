package com.github.moredreadd.minijava.psi;

import com.github.moredreadd.minijava.MiniJavaFileType;
import com.github.moredreadd.minijava.MiniJavaLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class MiniJavaFile extends PsiFileBase {
    public MiniJavaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, MiniJavaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return MiniJavaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "MiniJava File";
    }
}
