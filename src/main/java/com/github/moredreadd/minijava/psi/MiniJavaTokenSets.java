package com.github.moredreadd.minijava.psi;

import com.intellij.psi.tree.TokenSet;

public interface MiniJavaTokenSets {
    TokenSet IDENTIFIER = TokenSet.create(MiniJavaTypes.IDENTIFIER);
    TokenSet COMPOP = TokenSet.create(MiniJavaTypes.COMPOP);
    TokenSet ELSE = TokenSet.create(MiniJavaTypes.ELSE);
    TokenSet FINAL = TokenSet.create(MiniJavaTypes.FINAL);
    TokenSet FUNC = TokenSet.create(MiniJavaTypes.FUNC);
    TokenSet IF = TokenSet.create(MiniJavaTypes.IF);
    TokenSet INT = TokenSet.create(MiniJavaTypes.INT);
    TokenSet NUMBER = TokenSet.create(MiniJavaTypes.NUMBER);
    TokenSet PRINT = TokenSet.create(MiniJavaTypes.PRINT);
    TokenSet RETURN = TokenSet.create(MiniJavaTypes.RETURN);
    TokenSet VOID = TokenSet.create(MiniJavaTypes.VOID);
    TokenSet WHILE = TokenSet.create(MiniJavaTypes.WHILE);
    TokenSet COMMENT = TokenSet.create(MiniJavaTypes.COMMENT);
}