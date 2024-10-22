package com.github.moredreadd.minijava;

import com.github.moredreadd.minijava.psi.MiniJavaTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class MiniJavaSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey IDENT =
            createTextAttributesKey("MINI_JAVA_IDENT", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("MINI_JAVA_IDENT", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey TYPE =
            createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL);


    private static final TextAttributesKey[] IDENT_KEYS = new TextAttributesKey[]{IDENT};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] TYPE_KEYS = new TextAttributesKey[]{TYPE};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new MiniJavaLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(MiniJavaTypes.FUNC) ||
                tokenType.equals(MiniJavaTypes.WHILE) ||
                tokenType.equals(MiniJavaTypes.ELSE) ||
                tokenType.equals(MiniJavaTypes.FINAL) ||
                tokenType.equals(MiniJavaTypes.RETURN) ||
                tokenType.equals(MiniJavaTypes.IF)) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(MiniJavaTypes.IDENTIFIER) ||
                tokenType.equals(MiniJavaTypes.PRINT)) {
            return IDENT_KEYS;
        }
        if (tokenType.equals(MiniJavaTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(MiniJavaTypes.NUMBER)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(MiniJavaTypes.INT) ||
                tokenType.equals(MiniJavaTypes.VOID)) {
            return TYPE_KEYS;
        }
        return EMPTY_KEYS;
    }
}
