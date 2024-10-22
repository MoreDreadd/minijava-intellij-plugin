package com.github.moredreadd.minijava;

import com.github.moredreadd.minijava.parser.MiniJavaParser;
import com.github.moredreadd.minijava.psi.MiniJavaFile;
import com.github.moredreadd.minijava.psi.MiniJavaTokenSets;
import com.github.moredreadd.minijava.psi.MiniJavaTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class MiniJavaParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(MiniJavaLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new MiniJavaLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return MiniJavaTokenSets.COMMENT;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new MiniJavaParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new MiniJavaFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return MiniJavaTypes.Factory.createElement(node);
    }
}
