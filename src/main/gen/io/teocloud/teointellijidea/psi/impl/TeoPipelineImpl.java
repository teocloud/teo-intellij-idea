// This is a generated file. Not intended for manual editing.
package io.teocloud.teointellijidea.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.teocloud.teointellijidea.psi.TeoTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.teocloud.teointellijidea.psi.*;
import io.teocloud.teointellijidea.lang.psi.impl.TeoPsiImplUtil;

public class TeoPipelineImpl extends ASTWrapperPsiElement implements TeoPipeline {

  public TeoPipelineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TeoVisitor visitor) {
    visitor.visitPipeline(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TeoVisitor) accept((TeoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TeoIdentifierUnit getIdentifierUnit() {
    return findChildByClass(TeoIdentifierUnit.class);
  }

}
