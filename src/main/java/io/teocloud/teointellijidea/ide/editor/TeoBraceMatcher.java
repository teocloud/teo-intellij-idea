package io.teocloud.teointellijidea.ide.editor;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import io.teocloud.teointellijidea.psi.TeoTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TeoBraceMatcher implements PairedBraceMatcher {
    @Override
    public BracePair @NotNull [] getPairs() {
        return new BracePair[]{
                new BracePair(TeoTypes.LBRACE, TeoTypes.RBRACE, true),
                new BracePair(TeoTypes.LBRACKET, TeoTypes.RBRACKET, true),
                new BracePair(TeoTypes.LPAREN, TeoTypes.RPAREN, false),
        };
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType contextType) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        PsiElement element = file.findElementAt(openingBraceOffset);
        if (element != null) {
            return element.getNode().getStartOffsetInParent();
        }
        return openingBraceOffset;
    }
}
