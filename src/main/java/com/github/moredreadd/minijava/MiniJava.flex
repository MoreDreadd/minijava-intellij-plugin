package com.github.moredreadd.minijava;

import com.github.moredreadd.minijava.psi.MiniJavaTypes;import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.moredreadd.minijava.psi.MiniJavaTypes.*;

%%

%{
  public _MiniJavaLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _MiniJavaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
END_OF_LINE_COMMENT=\/\/[^\r\n]*
IDENTIFIER=[a-z][a-zA-Z0-9]*
NUMBER=0|([1-9][0-9]*)
COMPOP=\=\=|\!=|<=|>=|<|>

%state WAITING_VALUE

%%
<YYINITIAL> {
  {WHITE_SPACE}       { return WHITE_SPACE; }

  "final"             { return FINAL; }
  "int"               { return INT; }
  "identifier"        { return IDENTIFIER; }
  "number"            { return NUMBER; }
  "void"              { return VOID; }
  "func"              { return FUNC; }
  "return"            { return RETURN; }
  "compop"            { return COMPOP; }
  "print"             { return PRINT; }
  "if"                { return IF; }
  "else"              { return ELSE; }
  "while"             { return WHILE; }
  "comment"           { return COMMENT; }


}

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return MiniJavaTypes.COMMENT; }

<YYINITIAL> {IDENTIFIER}                               		{ yybegin(YYINITIAL); return IDENTIFIER; }

<YYINITIAL> {NUMBER}                               			{ yybegin(YYINITIAL); return NUMBER; }

<YYINITIAL> {COMPOP}                               			{ yybegin(YYINITIAL); return COMPOP; }

[^] { return BAD_CHARACTER; }
