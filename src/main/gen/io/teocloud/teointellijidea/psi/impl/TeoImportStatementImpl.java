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

public class TeoImportStatementImpl extends ASTWrapperPsiElement implements TeoImportStatement {

  public TeoImportStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TeoVisitor visitor) {
    visitor.visitImportStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TeoVisitor) accept((TeoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TeoWs> getWsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TeoWs.class);
  }

  @Override
  @Nullable
  public TeoImportIdentifierList getImportIdentifierList() {
    return findChildByClass(TeoImportIdentifierList.class);
  }

}
