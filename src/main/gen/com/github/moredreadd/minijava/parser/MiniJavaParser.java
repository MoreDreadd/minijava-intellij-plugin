// This is a generated file. Not intended for manual editing.
package com.github.moredreadd.minijava.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.moredreadd.minijava.psi.MiniJavaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MiniJavaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return miniJavaFile(b, l + 1);
  }

  /* ********************************************************** */
  // expression compop expression
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = expression(b, l + 1);
    r = r && consumeToken(b, COMPOP);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // final int constZuw ("," constZuw)* ";"
  public static boolean constDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constDecl")) return false;
    if (!nextTokenIs(b, FINAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FINAL, INT);
    r = r && constZuw(b, l + 1);
    r = r && constDecl_3(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, CONST_DECL, r);
    return r;
  }

  // ("," constZuw)*
  private static boolean constDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constDecl_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!constDecl_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constDecl_3", c)) break;
    }
    return true;
  }

  // "," constZuw
  private static boolean constDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && constZuw(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier "=" number
  public static boolean constZuw(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constZuw")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, CONST_ZUW, r);
    return r;
  }

  /* ********************************************************** */
  // summe
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = summe(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // func identifier "(" routinenParameter? ")" "{" routinenBlock? return expression ";" "}"
  public static boolean function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function")) return false;
    if (!nextTokenIs(b, FUNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNC, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && function_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "{");
    r = r && function_6(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, "}");
    exit_section_(b, m, FUNCTION, r);
    return r;
  }

  // routinenParameter?
  private static boolean function_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_3")) return false;
    routinenParameter(b, l + 1);
    return true;
  }

  // routinenBlock?
  private static boolean function_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_6")) return false;
    routinenBlock(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "(" (expression ("," expression)*)? ")"
  public static boolean functionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL, "<function call>");
    r = consumeToken(b, "(");
    r = r && functionCall_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expression ("," expression)*)?
  private static boolean functionCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_1")) return false;
    functionCall_1_0(b, l + 1);
    return true;
  }

  // expression ("," expression)*
  private static boolean functionCall_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && functionCall_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," expression)*
  private static boolean functionCall_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!functionCall_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionCall_1_0_1", c)) break;
    }
    return true;
  }

  // "," expression
  private static boolean functionCall_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // constDecl? varDecl? procedure* function* statement <<eof>>
  static boolean miniJavaFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "miniJavaFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = miniJavaFile_0(b, l + 1);
    r = r && miniJavaFile_1(b, l + 1);
    r = r && miniJavaFile_2(b, l + 1);
    r = r && miniJavaFile_3(b, l + 1);
    r = r && statement(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // constDecl?
  private static boolean miniJavaFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "miniJavaFile_0")) return false;
    constDecl(b, l + 1);
    return true;
  }

  // varDecl?
  private static boolean miniJavaFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "miniJavaFile_1")) return false;
    varDecl(b, l + 1);
    return true;
  }

  // procedure*
  private static boolean miniJavaFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "miniJavaFile_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!procedure(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "miniJavaFile_2", c)) break;
    }
    return true;
  }

  // function*
  private static boolean miniJavaFile_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "miniJavaFile_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "miniJavaFile_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "(" (expression ("," expression)*)? ")"
  public static boolean procCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procCall")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROC_CALL, "<proc call>");
    r = consumeToken(b, "(");
    r = r && procCall_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expression ("," expression)*)?
  private static boolean procCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procCall_1")) return false;
    procCall_1_0(b, l + 1);
    return true;
  }

  // expression ("," expression)*
  private static boolean procCall_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procCall_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && procCall_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," expression)*
  private static boolean procCall_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procCall_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!procCall_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "procCall_1_0_1", c)) break;
    }
    return true;
  }

  // "," expression
  private static boolean procCall_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procCall_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // void identifier "(" routinenParameter? ")" "{" routinenBlock? "}"
  public static boolean procedure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure")) return false;
    if (!nextTokenIs(b, VOID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VOID, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && procedure_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "{");
    r = r && procedure_6(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, PROCEDURE, r);
    return r;
  }

  // routinenParameter?
  private static boolean procedure_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_3")) return false;
    routinenParameter(b, l + 1);
    return true;
  }

  // routinenBlock?
  private static boolean procedure_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_6")) return false;
    routinenBlock(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // term (("*" | "/") term)*
  public static boolean produkt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "produkt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRODUKT, "<produkt>");
    r = term(b, l + 1);
    r = r && produkt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (("*" | "/") term)*
  private static boolean produkt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "produkt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!produkt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "produkt_1", c)) break;
    }
    return true;
  }

  // ("*" | "/") term
  private static boolean produkt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "produkt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = produkt_1_0_0(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "*" | "/"
  private static boolean produkt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "produkt_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "/");
    return r;
  }

  /* ********************************************************** */
  // constDecl? varDecl? statement
  public static boolean routinenBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routinenBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROUTINEN_BLOCK, "<routinen block>");
    r = routinenBlock_0(b, l + 1);
    r = r && routinenBlock_1(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // constDecl?
  private static boolean routinenBlock_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routinenBlock_0")) return false;
    constDecl(b, l + 1);
    return true;
  }

  // varDecl?
  private static boolean routinenBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routinenBlock_1")) return false;
    varDecl(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // int identifier ("," int identifier)*
  public static boolean routinenParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routinenParameter")) return false;
    if (!nextTokenIs(b, INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INT, IDENTIFIER);
    r = r && routinenParameter_2(b, l + 1);
    exit_section_(b, m, ROUTINEN_PARAMETER, r);
    return r;
  }

  // ("," int identifier)*
  private static boolean routinenParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routinenParameter_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!routinenParameter_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "routinenParameter_2", c)) break;
    }
    return true;
  }

  // "," int identifier
  private static boolean routinenParameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routinenParameter_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeTokens(b, 0, INT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((identifier (("=" expression) | (procCall)) | print "(" expression ")") ";") |
  // 			  "{" (statement)* "}" |
  // 			  if condition statement (else statement)? |
  // 			  while condition statement |
  // 			  comment
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_0(b, l + 1);
    if (!r) r = statement_1(b, l + 1);
    if (!r) r = statement_2(b, l + 1);
    if (!r) r = statement_3(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (identifier (("=" expression) | (procCall)) | print "(" expression ")") ";"
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_0_0(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier (("=" expression) | (procCall)) | print "(" expression ")"
  private static boolean statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_0_0_0(b, l + 1);
    if (!r) r = statement_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier (("=" expression) | (procCall))
  private static boolean statement_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && statement_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("=" expression) | (procCall)
  private static boolean statement_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_0_0_0_1_0(b, l + 1);
    if (!r) r = statement_0_0_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "=" expression
  private static boolean statement_0_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (procCall)
  private static boolean statement_0_0_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_0_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = procCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // print "(" expression ")"
  private static boolean statement_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PRINT);
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // "{" (statement)* "}"
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && statement_1_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement)*
  private static boolean statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_1_1", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean statement_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // if condition statement (else statement)?
  private static boolean statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && condition(b, l + 1);
    r = r && statement(b, l + 1);
    r = r && statement_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (else statement)?
  private static boolean statement_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2_3")) return false;
    statement_2_3_0(b, l + 1);
    return true;
  }

  // else statement
  private static boolean statement_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // while condition statement
  private static boolean statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && condition(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // produkt (("+" | "-") produkt)*
  public static boolean summe(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "summe")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUMME, "<summe>");
    r = produkt(b, l + 1);
    r = r && summe_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (("+" | "-") produkt)*
  private static boolean summe_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "summe_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!summe_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "summe_1", c)) break;
    }
    return true;
  }

  // ("+" | "-") produkt
  private static boolean summe_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "summe_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = summe_1_0_0(b, l + 1);
    r = r && produkt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "+" | "-"
  private static boolean summe_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "summe_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    return r;
  }

  /* ********************************************************** */
  // number | (identifier functionCall?) | "(" expression ")"
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = consumeToken(b, NUMBER);
    if (!r) r = term_1(b, l + 1);
    if (!r) r = term_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier functionCall?
  private static boolean term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && term_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // functionCall?
  private static boolean term_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1_1")) return false;
    functionCall(b, l + 1);
    return true;
  }

  // "(" expression ")"
  private static boolean term_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // int varZuw ("," varZuw)* ";"
  public static boolean varDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varDecl")) return false;
    if (!nextTokenIs(b, INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT);
    r = r && varZuw(b, l + 1);
    r = r && varDecl_2(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, VAR_DECL, r);
    return r;
  }

  // ("," varZuw)*
  private static boolean varDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varDecl_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!varDecl_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "varDecl_2", c)) break;
    }
    return true;
  }

  // "," varZuw
  private static boolean varDecl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varDecl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && varZuw(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier ("=" number)?
  public static boolean varZuw(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varZuw")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && varZuw_1(b, l + 1);
    exit_section_(b, m, VAR_ZUW, r);
    return r;
  }

  // ("=" number)?
  private static boolean varZuw_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varZuw_1")) return false;
    varZuw_1_0(b, l + 1);
    return true;
  }

  // "=" number
  private static boolean varZuw_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varZuw_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

}
