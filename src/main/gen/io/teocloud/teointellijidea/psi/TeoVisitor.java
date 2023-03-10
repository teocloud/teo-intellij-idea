// This is a generated file. Not intended for manual editing.
package io.teocloud.teointellijidea.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import io.teocloud.teointellijidea.lang.psi.TeoDeclaration;
import io.teocloud.teointellijidea.lang.psi.TeoKeyValuePairDeclaration;
import io.teocloud.teointellijidea.lang.psi.TeoDecorator;
import io.teocloud.teointellijidea.lang.psi.TeoMemberDeclaration;
import io.teocloud.teointellijidea.lang.psi.TeoBlock;
import io.teocloud.teointellijidea.lang.psi.TeoFieldTypeInterface;

public class TeoVisitor extends PsiElementVisitor {

  public void visitArity(@NotNull TeoArity o) {
    visitPsiElement(o);
  }

  public void visitCollectionOptional(@NotNull TeoCollectionOptional o) {
    visitPsiElement(o);
  }

  public void visitEolWsc(@NotNull TeoEolWsc o) {
    visitPsiElement(o);
  }

  public void visitItemOptional(@NotNull TeoItemOptional o) {
    visitPsiElement(o);
  }

  public void visitWs(@NotNull TeoWs o) {
    visitPsiElement(o);
  }

  public void visitArgument(@NotNull TeoArgument o) {
    visitPsiElement(o);
  }

  public void visitArgumentList(@NotNull TeoArgumentList o) {
    visitPsiElement(o);
  }

  public void visitArrayLiteral(@NotNull TeoArrayLiteral o) {
    visitPsiElement(o);
  }

  public void visitBadDocComment(@NotNull TeoBadDocComment o) {
    visitPsiElement(o);
  }

  public void visitBadEnumMemberIdentifier(@NotNull TeoBadEnumMemberIdentifier o) {
    visitPsiElement(o);
  }

  public void visitBadFieldIdentifier(@NotNull TeoBadFieldIdentifier o) {
    visitPsiElement(o);
  }

  public void visitBadModelIdentifier(@NotNull TeoBadModelIdentifier o) {
    visitPsiElement(o);
  }

  public void visitBadTopDecorator(@NotNull TeoBadTopDecorator o) {
    visitDecorator(o);
  }

  public void visitBadTopIdentifier(@NotNull TeoBadTopIdentifier o) {
    visitPsiElement(o);
  }

  public void visitBlockDecorator(@NotNull TeoBlockDecorator o) {
    visitDecorator(o);
  }

  public void visitComment(@NotNull TeoComment o) {
    visitPsiElement(o);
  }

  public void visitConfigBlock(@NotNull TeoConfigBlock o) {
    visitBlock(o);
  }

  public void visitConfigDefinition(@NotNull TeoConfigDefinition o) {
    visitDeclaration(o);
    // visitKeyValuePairDeclaration(o);
  }

  public void visitConfigItem(@NotNull TeoConfigItem o) {
    visitMemberDeclaration(o);
  }

  public void visitDictionaryLiteral(@NotNull TeoDictionaryLiteral o) {
    visitPsiElement(o);
  }

  public void visitDocCommentBlock(@NotNull TeoDocCommentBlock o) {
    visitPsiElement(o);
  }

  public void visitEnumChoiceLiteral(@NotNull TeoEnumChoiceLiteral o) {
    visitPsiElement(o);
  }

  public void visitEnumDefinition(@NotNull TeoEnumDefinition o) {
    visitDeclaration(o);
  }

  public void visitEnumDefinitionBlock(@NotNull TeoEnumDefinitionBlock o) {
    visitBlock(o);
  }

  public void visitEnumMemberName(@NotNull TeoEnumMemberName o) {
    visitPsiElement(o);
  }

  public void visitEnumValueDeclaration(@NotNull TeoEnumValueDeclaration o) {
    visitMemberDeclaration(o);
  }

  public void visitExpression(@NotNull TeoExpression o) {
    visitPsiElement(o);
  }

  public void visitFieldDefinition(@NotNull TeoFieldDefinition o) {
    visitMemberDeclaration(o);
  }

  public void visitFieldType(@NotNull TeoFieldType o) {
    visitFieldTypeInterface(o);
  }

  public void visitGroup(@NotNull TeoGroup o) {
    visitPsiElement(o);
  }

  public void visitIdentifierUnit(@NotNull TeoIdentifierUnit o) {
    visitPsiElement(o);
  }

  public void visitImportIdentifierList(@NotNull TeoImportIdentifierList o) {
    visitPsiElement(o);
  }

  public void visitImportIdentifiersBlock(@NotNull TeoImportIdentifiersBlock o) {
    visitPsiElement(o);
  }

  public void visitImportStatement(@NotNull TeoImportStatement o) {
    visitPsiElement(o);
  }

  public void visitInitialUnitIdentifier(@NotNull TeoInitialUnitIdentifier o) {
    visitPsiElement(o);
  }

  public void visitItemDecorator(@NotNull TeoItemDecorator o) {
    visitDecorator(o);
  }

  public void visitItemDecoratorList(@NotNull TeoItemDecoratorList o) {
    visitPsiElement(o);
  }

  public void visitLetDeclaration(@NotNull TeoLetDeclaration o) {
    visitDeclaration(o);
  }

  public void visitLiteral(@NotNull TeoLiteral o) {
    visitPsiElement(o);
  }

  public void visitModelDefinition(@NotNull TeoModelDefinition o) {
    visitDeclaration(o);
  }

  public void visitModelDefinitionBlock(@NotNull TeoModelDefinitionBlock o) {
    visitBlock(o);
  }

  public void visitNamedArgument(@NotNull TeoNamedArgument o) {
    visitPsiElement(o);
  }

  public void visitNamedExpression(@NotNull TeoNamedExpression o) {
    visitPsiElement(o);
  }

  public void visitNullishCoalescing(@NotNull TeoNullishCoalescing o) {
    visitPsiElement(o);
  }

  public void visitPaddedDocComment(@NotNull TeoPaddedDocComment o) {
    visitPsiElement(o);
  }

  public void visitPipeline(@NotNull TeoPipeline o) {
    visitPsiElement(o);
  }

  public void visitSubscript(@NotNull TeoSubscript o) {
    visitPsiElement(o);
  }

  public void visitTupleLiteral(@NotNull TeoTupleLiteral o) {
    visitPsiElement(o);
  }

  public void visitUnit(@NotNull TeoUnit o) {
    visitPsiElement(o);
  }

  public void visitBlock(@NotNull TeoBlock o) {
    visitPsiElement(o);
  }

  public void visitDeclaration(@NotNull TeoDeclaration o) {
    visitPsiElement(o);
  }

  public void visitDecorator(@NotNull TeoDecorator o) {
    visitPsiElement(o);
  }

  public void visitFieldTypeInterface(@NotNull TeoFieldTypeInterface o) {
    visitPsiElement(o);
  }

  public void visitMemberDeclaration(@NotNull TeoMemberDeclaration o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
