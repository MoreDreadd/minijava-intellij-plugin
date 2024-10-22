// This is a generated file. Not intended for manual editing.
package com.github.moredreadd.minijava.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.moredreadd.minijava.psi.MiniJavaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.moredreadd.minijava.psi.*;

public class MiniJavaRoutinenBlockImpl extends ASTWrapperPsiElement implements MiniJavaRoutinenBlock {

  public MiniJavaRoutinenBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MiniJavaVisitor visitor) {
    visitor.visitRoutinenBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MiniJavaVisitor) accept((MiniJavaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MiniJavaConstDecl getConstDecl() {
    return findChildByClass(MiniJavaConstDecl.class);
  }

  @Override
  @NotNull
  public MiniJavaStatement getStatement() {
    return findNotNullChildByClass(MiniJavaStatement.class);
  }

  @Override
  @Nullable
  public MiniJavaVarDecl getVarDecl() {
    return findChildByClass(MiniJavaVarDecl.class);
  }

}
