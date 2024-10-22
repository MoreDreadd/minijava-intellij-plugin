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

public class MiniJavaFunctionImpl extends ASTWrapperPsiElement implements MiniJavaFunction {

  public MiniJavaFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MiniJavaVisitor visitor) {
    visitor.visitFunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MiniJavaVisitor) accept((MiniJavaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MiniJavaExpression getExpression() {
    return findNotNullChildByClass(MiniJavaExpression.class);
  }

  @Override
  @Nullable
  public MiniJavaRoutinenBlock getRoutinenBlock() {
    return findChildByClass(MiniJavaRoutinenBlock.class);
  }

  @Override
  @Nullable
  public MiniJavaRoutinenParameter getRoutinenParameter() {
    return findChildByClass(MiniJavaRoutinenParameter.class);
  }

}
