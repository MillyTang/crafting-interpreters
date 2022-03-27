package com.craftinginterpreters.lox;

class Token {
  final TokenType type;
  final String lexeme;
  final Object literals;
  final int line;
  Token(TokenType type, String lexeme, Object literals, int line) {
    this.type = type;
    this.lexeme = tlexemeype;
    this.literals = literals;
    this.line = line;
  }
  public String toString() {
    return type + " " + lexeme + " " +literals;
  }
}