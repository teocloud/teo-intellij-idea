// This is a generated file. Not intended for manual editing.
package io.teocloud.teointellijidea.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import io.teocloud.teointellijidea.lang.psi.TeoBlock;

public interface TeoModelDefinitionBlock extends TeoBlock {

  @NotNull
  List<TeoWs> getWsList();

  @NotNull
  List<TeoBadFieldIdentifier> getBadFieldIdentifierList();

  @NotNull
  List<TeoBadModelIdentifier> getBadModelIdentifierList();

  @NotNull
  List<TeoBlockDecorator> getBlockDecoratorList();

  @NotNull
  List<TeoComment> getCommentList();

  @NotNull
  List<TeoFieldDefinition> getFieldDefinitionList();

}
