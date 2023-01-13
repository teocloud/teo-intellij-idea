// This is a generated file. Not intended for manual editing.
package io.teocloud.teointellijidea.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.teocloud.teointellijidea.psi.impl.*;

public interface TeoTypes {

  IElementType ARGUMENT = new TeoElementType("ARGUMENT");
  IElementType ARGUMENT_LIST = new TeoElementType("ARGUMENT_LIST");
  IElementType BLOCK_DECORATOR = new TeoElementType("BLOCK_DECORATOR");
  IElementType CONFIG_BLOCK = new TeoElementType("CONFIG_BLOCK");
  IElementType ENUM_DEFINITION = new TeoElementType("ENUM_DEFINITION");
  IElementType EXPRESSION = new TeoElementType("EXPRESSION");
  IElementType FIELD_DEFINITION = new TeoElementType("FIELD_DEFINITION");
  IElementType FIELD_TYPE = new TeoElementType("FIELD_TYPE");
  IElementType GROUP = new TeoElementType("GROUP");
  IElementType IMPORT_IDENTIFIER_LIST = new TeoElementType("IMPORT_IDENTIFIER_LIST");
  IElementType IMPORT_STATEMENT = new TeoElementType("IMPORT_STATEMENT");
  IElementType ITEM_DECORATOR = new TeoElementType("ITEM_DECORATOR");
  IElementType ITEM_DECORATOR_LIST = new TeoElementType("ITEM_DECORATOR_LIST");
  IElementType LET_DECLARATION = new TeoElementType("LET_DECLARATION");
  IElementType LITERAL = new TeoElementType("LITERAL");
  IElementType MODEL_DEFINITION = new TeoElementType("MODEL_DEFINITION");
  IElementType MODEL_NAME = new TeoElementType("MODEL_NAME");
  IElementType NAMED_ARGUMENT = new TeoElementType("NAMED_ARGUMENT");
  IElementType NULLISH_COALESCING = new TeoElementType("NULLISH_COALESCING");
  IElementType PIPELINE = new TeoElementType("PIPELINE");
  IElementType UNIT = new TeoElementType("UNIT");
  IElementType WS_EOL = new TeoElementType("WS_EOL");

  IElementType ARITY = new TeoTokenType("ARITY");
  IElementType ARRAY_LITERAL = new TeoTokenType("ARRAY_LITERAL");
  IElementType AT = new TeoTokenType("AT");
  IElementType BLOCK_CLOSE = new TeoTokenType("BLOCK_CLOSE");
  IElementType BLOCK_OPEN = new TeoTokenType("BLOCK_OPEN");
  IElementType BOOL_LITERAL = new TeoTokenType("BOOL_LITERAL");
  IElementType COLLECTION_OPTIONAL = new TeoTokenType("COLLECTION_OPTIONAL");
  IElementType COLON = new TeoTokenType("COLON");
  IElementType COMMA = new TeoTokenType("COMMA");
  IElementType COMMENT = new TeoTokenType("COMMENT");
  IElementType CONFIG_KEYWORDS = new TeoTokenType("CONFIG_KEYWORDS");
  IElementType DICTIONARY_LITERAL = new TeoTokenType("DICTIONARY_LITERAL");
  IElementType DOLLAR_SIGN = new TeoTokenType("DOLLAR_SIGN");
  IElementType DOUBLE_AT = new TeoTokenType("DOUBLE_AT");
  IElementType ENUM_KEYWORD = new TeoTokenType("ENUM_KEYWORD");
  IElementType ENUM_MEMBER_DEFINITION = new TeoTokenType("ENUM_MEMBER_DEFINITION");
  IElementType EQUAL_SIGN = new TeoTokenType("EQUAL_SIGN");
  IElementType FROM_KEYWORD = new TeoTokenType("FROM_KEYWORD");
  IElementType IDENTIFIER = new TeoTokenType("IDENTIFIER");
  IElementType IMPORT_KEYWORD = new TeoTokenType("IMPORT_KEYWORD");
  IElementType ITEM_OPTIONAL = new TeoTokenType("ITEM_OPTIONAL");
  IElementType LET_KEYWORD = new TeoTokenType("LET_KEYWORD");
  IElementType MODEL_KEYWORD = new TeoTokenType("MODEL_KEYWORD");
  IElementType NEWLINE = new TeoTokenType("NEWLINE");
  IElementType NUMBER_LITERAL = new TeoTokenType("NUMBER_LITERAL");
  IElementType PAIR = new TeoTokenType("pair");
  IElementType RANGE_LITERAL = new TeoTokenType("RANGE_LITERAL");
  IElementType STRING_LITERAL = new TeoTokenType("STRING_LITERAL");
  IElementType SUBSCRIPT = new TeoTokenType("subscript");
  IElementType TUPLE_LITERAL = new TeoTokenType("TUPLE_LITERAL");
  IElementType WHITESPACE = new TeoTokenType("WHITESPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGUMENT) {
        return new TeoArgumentImpl(node);
      }
      else if (type == ARGUMENT_LIST) {
        return new TeoArgumentListImpl(node);
      }
      else if (type == BLOCK_DECORATOR) {
        return new TeoBlockDecoratorImpl(node);
      }
      else if (type == CONFIG_BLOCK) {
        return new TeoConfigBlockImpl(node);
      }
      else if (type == ENUM_DEFINITION) {
        return new TeoEnumDefinitionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new TeoExpressionImpl(node);
      }
      else if (type == FIELD_DEFINITION) {
        return new TeoFieldDefinitionImpl(node);
      }
      else if (type == FIELD_TYPE) {
        return new TeoFieldTypeImpl(node);
      }
      else if (type == GROUP) {
        return new TeoGroupImpl(node);
      }
      else if (type == IMPORT_IDENTIFIER_LIST) {
        return new TeoImportIdentifierListImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new TeoImportStatementImpl(node);
      }
      else if (type == ITEM_DECORATOR) {
        return new TeoItemDecoratorImpl(node);
      }
      else if (type == ITEM_DECORATOR_LIST) {
        return new TeoItemDecoratorListImpl(node);
      }
      else if (type == LET_DECLARATION) {
        return new TeoLetDeclarationImpl(node);
      }
      else if (type == LITERAL) {
        return new TeoLiteralImpl(node);
      }
      else if (type == MODEL_DEFINITION) {
        return new TeoModelDefinitionImpl(node);
      }
      else if (type == MODEL_NAME) {
        return new TeoModelNameImpl(node);
      }
      else if (type == NAMED_ARGUMENT) {
        return new TeoNamedArgumentImpl(node);
      }
      else if (type == NULLISH_COALESCING) {
        return new TeoNullishCoalescingImpl(node);
      }
      else if (type == PIPELINE) {
        return new TeoPipelineImpl(node);
      }
      else if (type == UNIT) {
        return new TeoUnitImpl(node);
      }
      else if (type == WS_EOL) {
        return new TeoWsEolImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
