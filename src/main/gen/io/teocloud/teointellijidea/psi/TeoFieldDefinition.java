// This is a generated file. Not intended for manual editing.
package io.teocloud.teointellijidea.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TeoFieldDefinition extends PsiElement {

  @Nullable
  TeoDocComment getDocComment();

  @NotNull
  TeoFieldName getFieldName();

  @NotNull
  TeoFieldType getFieldType();

  @Nullable
  TeoItemDecoratorList getItemDecoratorList();

}
