package com.github.moredreadd.minijava;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

final class MiniJavaColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Comment", MiniJavaSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Identifier", MiniJavaSyntaxHighlighter.IDENT),
            new AttributesDescriptor("Keyword", MiniJavaSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Type", MiniJavaSyntaxHighlighter.TYPE),
            new AttributesDescriptor("Number", MiniJavaSyntaxHighlighter.NUMBER)
    };

    @Override
    public Icon getIcon() {
        return MiniJavaIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new MiniJavaSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return """
        final int b = 4;
        int a = 5, c = 3, d;
        
        {
            while a > 0
            {
                a = a - 1;
                if c > 0
                {
                    c = c - 1;
                    d = d + 1;
                } else {
                    c = c + 1;
                    d = d - 1;
                }
            }
            print(b + d);
        }
        """;
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "MiniJava";
    }
}
