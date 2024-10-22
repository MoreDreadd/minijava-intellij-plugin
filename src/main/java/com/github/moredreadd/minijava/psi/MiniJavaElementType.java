package com.github.moredreadd.minijava.psi;

import com.github.moredreadd.minijava.MiniJavaLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MiniJavaElementType extends IElementType {
    public MiniJavaElementType(@NotNull @NonNls String debugName) {
        super(debugName, MiniJavaLanguage.INSTANCE);
    }
}
