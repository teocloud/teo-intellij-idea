package io.teocloud.teointellijidea.lang.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import io.teocloud.teointellijidea.lang.TeoLanguage;
import io.teocloud.teointellijidea.lang.lexer.TeoFlexLexerAdapter;
import io.teocloud.teointellijidea.parser.TeoParser;
import io.teocloud.teointellijidea.lang.psi.TeoFile;
import io.teocloud.teointellijidea.lang.psi.TeoTokenSets;
import org.jetbrains.annotations.NotNull;
import io.teocloud.teointellijidea.psi.TeoTypes;

public class TeoParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(TeoLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new TeoFlexLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TeoTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TeoTokenSets.STRING_LITERAL;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new TeoParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new TeoFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return TeoTypes.Factory.createElement(node);
    }

}
