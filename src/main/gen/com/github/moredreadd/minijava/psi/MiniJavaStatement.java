// This is a generated file. Not intended for manual editing.
package com.github.moredreadd.minijava.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MiniJavaStatement extends PsiElement {

  @Nullable
  MiniJavaCondition getCondition();

  @Nullable
  MiniJavaExpression getExpression();

  @Nullable
  MiniJavaProcCall getProcCall();

  @NotNull
  List<MiniJavaStatement> getStatementList();

}
