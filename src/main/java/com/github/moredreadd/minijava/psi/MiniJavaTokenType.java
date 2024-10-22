package com.github.moredreadd.minijava.psi;

import com.github.moredreadd.minijava.MiniJavaLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MiniJavaTokenType extends IElementType {
    public MiniJavaTokenType(@NotNull @NonNls String debugName) {
        super(debugName, MiniJavaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MiniJavaTokenType." + super.toString();
    }
}
