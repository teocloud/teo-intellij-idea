// This is a generated file. Not intended for manual editing.
package io.teocloud.teointellijidea.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TeoConfigItem extends PsiElement {

  @NotNull
  TeoConfigItemName getConfigItemName();

  @Nullable
  TeoDocComment getDocComment();

  @NotNull
  TeoExpression getExpression();

}