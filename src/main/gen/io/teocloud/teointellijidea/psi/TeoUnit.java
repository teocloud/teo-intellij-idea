// This is a generated file. Not intended for manual editing.
package io.teocloud.teointellijidea.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TeoUnit extends PsiElement {

  @NotNull
  List<TeoArgumentList> getArgumentListList();

  @Nullable
  TeoEnumChoiceLiteral getEnumChoiceLiteral();

  @Nullable
  TeoGroup getGroup();

  @NotNull
  List<TeoSubscript> getSubscriptList();

  @Nullable
  TeoTupleLiteral getTupleLiteral();

}
