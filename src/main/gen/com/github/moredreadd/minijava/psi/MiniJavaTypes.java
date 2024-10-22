// This is a generated file. Not intended for manual editing.
package com.github.moredreadd.minijava.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.moredreadd.minijava.psi.impl.*;

public interface MiniJavaTypes {

  IElementType CONDITION = new MiniJavaElementType("CONDITION");
  IElementType CONST_DECL = new MiniJavaElementType("CONST_DECL");
  IElementType CONST_ZUW = new MiniJavaElementType("CONST_ZUW");
  IElementType EXPRESSION = new MiniJavaElementType("EXPRESSION");
  IElementType FUNCTION = new MiniJavaElementType("FUNCTION");
  IElementType FUNCTION_CALL = new MiniJavaElementType("FUNCTION_CALL");
  IElementType PROCEDURE = new MiniJavaElementType("PROCEDURE");
  IElementType PROC_CALL = new MiniJavaElementType("PROC_CALL");
  IElementType PRODUKT = new MiniJavaElementType("PRODUKT");
  IElementType ROUTINEN_BLOCK = new MiniJavaElementType("ROUTINEN_BLOCK");
  IElementType ROUTINEN_PARAMETER = new MiniJavaElementType("ROUTINEN_PARAMETER");
  IElementType STATEMENT = new MiniJavaElementType("STATEMENT");
  IElementType SUMME = new MiniJavaElementType("SUMME");
  IElementType TERM = new MiniJavaElementType("TERM");
  IElementType VAR_DECL = new MiniJavaElementType("VAR_DECL");
  IElementType VAR_ZUW = new MiniJavaElementType("VAR_ZUW");

  IElementType COMMENT = new MiniJavaTokenType("comment");
  IElementType COMPOP = new MiniJavaTokenType("compop");
  IElementType ELSE = new MiniJavaTokenType("else");
  IElementType FINAL = new MiniJavaTokenType("final");
  IElementType FUNC = new MiniJavaTokenType("func");
  IElementType IDENTIFIER = new MiniJavaTokenType("identifier");
  IElementType IF = new MiniJavaTokenType("if");
  IElementType INT = new MiniJavaTokenType("int");
  IElementType NUMBER = new MiniJavaTokenType("number");
  IElementType PRINT = new MiniJavaTokenType("print");
  IElementType RETURN = new MiniJavaTokenType("return");
  IElementType VOID = new MiniJavaTokenType("void");
  IElementType WHILE = new MiniJavaTokenType("while");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CONDITION) {
        return new MiniJavaConditionImpl(node);
      }
      else if (type == CONST_DECL) {
        return new MiniJavaConstDeclImpl(node);
      }
      else if (type == CONST_ZUW) {
        return new MiniJavaConstZuwImpl(node);
      }
      else if (type == EXPRESSION) {
        return new MiniJavaExpressionImpl(node);
      }
      else if (type == FUNCTION) {
        return new MiniJavaFunctionImpl(node);
      }
      else if (type == FUNCTION_CALL) {
        return new MiniJavaFunctionCallImpl(node);
      }
      else if (type == PROCEDURE) {
        return new MiniJavaProcedureImpl(node);
      }
      else if (type == PROC_CALL) {
        return new MiniJavaProcCallImpl(node);
      }
      else if (type == PRODUKT) {
        return new MiniJavaProduktImpl(node);
      }
      else if (type == ROUTINEN_BLOCK) {
        return new MiniJavaRoutinenBlockImpl(node);
      }
      else if (type == ROUTINEN_PARAMETER) {
        return new MiniJavaRoutinenParameterImpl(node);
      }
      else if (type == STATEMENT) {
        return new MiniJavaStatementImpl(node);
      }
      else if (type == SUMME) {
        return new MiniJavaSummeImpl(node);
      }
      else if (type == TERM) {
        return new MiniJavaTermImpl(node);
      }
      else if (type == VAR_DECL) {
        return new MiniJavaVarDeclImpl(node);
      }
      else if (type == VAR_ZUW) {
        return new MiniJavaVarZuwImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
