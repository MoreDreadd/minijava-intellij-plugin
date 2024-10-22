package com.github.moredreadd.minijava;

import com.intellij.lexer.FlexAdapter;

public class MiniJavaLexerAdapter extends FlexAdapter {
    public MiniJavaLexerAdapter() {
        super(new _MiniJavaLexer(null));
    }
}
