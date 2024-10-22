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

public class MiniJavaStatementImpl extends ASTWrapperPsiElement implements MiniJavaStatement {

  public MiniJavaStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MiniJavaVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MiniJavaVisitor) accept((MiniJavaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MiniJavaCondition getCondition() {
    return findChildByClass(MiniJavaCondition.class);
  }

  @Override
  @Nullable
  public MiniJavaExpression getExpression() {
    return findChildByClass(MiniJavaExpression.class);
  }

  @Override
  @Nullable
  public MiniJavaProcCall getProcCall() {
    return findChildByClass(MiniJavaProcCall.class);
  }

  @Override
  @NotNull
  public List<MiniJavaStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MiniJavaStatement.class);
  }

}
