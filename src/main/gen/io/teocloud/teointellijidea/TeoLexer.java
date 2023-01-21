/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package io.teocloud.teointellijidea;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static io.teocloud.teointellijidea.psi.TeoTypes.*;
import static com.intellij.psi.TokenType.*;
import com.intellij.openapi.util.text.StringUtil;
import java.util.ArrayList;import java.util.Stack;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Teo.flex</tt>
 */
class TeoLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int DECORATOR = 2;
  public static final int PPL = 4;
  public static final int BLOCK = 6;
  public static final int DECL = 8;
  public static final int ENUM = 10;
  public static final int ENUM_DECL = 12;
  public static final int MODEL = 14;
  public static final int MODEL_DECL = 16;
  public static final int LET_DECL = 18;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  3,  3,  4,  4,  5,  5,  3,  3, 
     6,  6,  3, 3
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 3872 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>12]<<6)|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\7\3\1\4\4\3\1\5\1\6\1\7\4\3\1\10\6\3\1\11\1\12\361\3");

  /* The ZZ_CMAP_Y table has 704 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\26\3\1\4\1\3\1\5\3\3\1\6\5\3\1\7\1\3\1\7\1\3\1\7\1\3\1\7\1\3"+
    "\1\7\1\3\1\7\1\3\1\7\1\3\1\7\1\3\1\7\1\3\1\7\1\3\1\10\1\3\1\10\1\4\4\3\1\6"+
    "\1\10\34\3\1\4\1\10\4\3\1\11\1\3\1\10\2\3\1\12\2\3\1\10\1\5\2\3\1\12\16\3"+
    "\1\13\227\3\1\4\12\3\1\10\1\6\2\3\1\14\1\3\1\10\5\3\1\5\114\3\1\10\25\3\1"+
    "\4\56\3\1\7\1\3\1\5\1\15\2\3\1\10\3\3\1\5\5\3\1\10\1\3\1\10\5\3\1\10\1\3\1"+
    "\6\1\5\6\3\1\4\15\3\1\10\67\3\1\4\3\3\1\10\61\3\1\16\105\3\1\10\32\3");

  /* The ZZ_CMAP_A table has 960 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\1\26\1\27\1\1\22\0\1\3\1\51\1\4\1\0\1\54\3\0\1\42\1\43\2\0\1"+
    "\53\1\7\1\10\1\25\12\24\1\47\2\0\1\46\1\0\1\50\1\52\32\22\1\44\1\5\1\45\1"+
    "\0\1\23\1\0\1\16\1\22\1\33\1\32\1\14\1\15\1\35\1\22\1\34\2\22\1\17\1\30\1"+
    "\21\1\31\1\37\1\22\1\12\1\20\1\11\1\13\3\22\1\36\1\22\1\40\1\0\1\41\7\0\1"+
    "\26\232\0\12\6\106\0\12\6\6\0\12\6\134\0\12\6\40\0\12\6\54\0\12\6\60\0\12"+
    "\6\6\0\12\6\116\0\2\26\46\0\12\6\26\0\12\6\74\0\12\6\16\0\62\6");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\7\0\1\1\2\2\1\3\1\4\1\5\1\1\1\6"+
    "\6\7\1\1\3\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\4\25\4\26\1\7\4\27\4\30\4\31\1\4\2\0"+
    "\1\32\6\7\1\33\4\7\1\34\1\35\3\25\3\26"+
    "\3\27\3\30\3\31\1\5\1\36\5\7\1\37\1\7"+
    "\1\33\1\40\4\7\3\25\3\26\3\27\3\30\3\31"+
    "\1\41\1\7\1\42\1\43\1\44\5\7\1\41\1\44"+
    "\1\41\1\44\1\41\1\44\1\41\1\44\1\41\1\44"+
    "\1\7\1\45\4\7\1\46\1\47\1\50\1\7\1\51"+
    "\2\7\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\207\0\264\0\341\0\u010e\0\u013b"+
    "\0\u0168\0\u013b\0\u013b\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249"+
    "\0\u0276\0\u02a3\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384\0\u03b1"+
    "\0\u03de\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b"+
    "\0\u013b\0\u040b\0\u013b\0\u0438\0\u013b\0\u013b\0\u0465\0\u0492"+
    "\0\u04bf\0\u04ec\0\u0519\0\u0546\0\u0573\0\u05a0\0\u05cd\0\u05fa"+
    "\0\u0627\0\u0654\0\u0681\0\u06ae\0\u06db\0\u0708\0\u0735\0\u0762"+
    "\0\u078f\0\u07bc\0\u07e9\0\u013b\0\u0816\0\u0843\0\u0870\0\u089d"+
    "\0\u08ca\0\u08f7\0\u0924\0\u0951\0\u097e\0\u09ab\0\u09d8\0\u0a05"+
    "\0\u0a32\0\u0a5f\0\u013b\0\u013b\0\u0a8c\0\u0ab9\0\u0ae6\0\u0b13"+
    "\0\u0b40\0\u0b6d\0\u0b9a\0\u0bc7\0\u0bf4\0\u0c21\0\u0c4e\0\u0c7b"+
    "\0\u0ca8\0\u0cd5\0\u0d02\0\u0843\0\u013b\0\u0d2f\0\u0d5c\0\u0d89"+
    "\0\u0db6\0\u0de3\0\u0276\0\u0e10\0\u0e3d\0\u0e6a\0\u0e97\0\u0ec4"+
    "\0\u0ef1\0\u0f1e\0\u0f4b\0\u0f78\0\u0fa5\0\u0fd2\0\u0fff\0\u102c"+
    "\0\u1059\0\u1086\0\u10b3\0\u10e0\0\u110d\0\u113a\0\u1167\0\u1194"+
    "\0\u11c1\0\u0276\0\u11ee\0\u0276\0\u0276\0\u0276\0\u121b\0\u1248"+
    "\0\u1275\0\u12a2\0\u12cf\0\u0492\0\u0492\0\u0546\0\u0546\0\u0627"+
    "\0\u0627\0\u06db\0\u06db\0\u078f\0\u078f\0\u12fc\0\u0276\0\u1329"+
    "\0\u1356\0\u1383\0\u13b0\0\u0276\0\u0276\0\u0276\0\u13dd\0\u0276"+
    "\0\u140a\0\u1437\0\u0276";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\10\1\11\1\12\1\13\1\14\1\10\1\15\1\16"+
    "\1\17\1\20\2\21\1\22\1\23\1\21\1\24\1\21"+
    "\1\25\1\21\1\10\1\15\1\26\1\10\1\13\1\27"+
    "\2\21\1\30\1\31\3\21\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\10\1\11\1\12\1\13\1\14\1\10\1\15"+
    "\1\16\1\17\1\47\3\50\1\51\3\50\1\52\1\50"+
    "\1\10\1\15\1\26\1\10\1\13\10\50\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\10\1\11\1\12\1\13\1\14"+
    "\1\10\1\15\1\16\1\17\1\53\3\54\1\55\3\54"+
    "\1\56\1\54\1\10\1\15\1\26\1\10\1\13\10\54"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\10\1\11\1\12"+
    "\1\13\1\14\1\10\1\15\1\16\1\17\1\20\3\21"+
    "\1\57\3\21\1\25\1\21\1\10\1\15\1\26\1\10"+
    "\1\13\10\21\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\10"+
    "\1\11\1\12\1\13\1\14\1\10\1\15\1\16\1\17"+
    "\1\60\3\61\1\62\3\61\1\63\1\61\1\10\1\15"+
    "\1\26\1\10\1\13\10\61\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\10\1\11\1\12\1\13\1\14\1\10\1\15"+
    "\1\16\1\17\1\64\3\65\1\66\3\65\1\67\1\65"+
    "\1\10\1\15\1\26\1\10\1\13\10\65\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\10\1\11\1\12\1\13\1\14"+
    "\1\10\1\15\1\16\1\17\1\70\3\71\1\72\3\71"+
    "\1\73\1\71\1\10\1\15\1\26\1\10\1\13\10\71"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\57\0\1\12\52\0"+
    "\1\14\2\0\1\14\1\74\1\75\47\14\6\0\1\15"+
    "\1\0\1\76\13\0\1\15\36\0\1\15\15\0\1\15"+
    "\40\0\1\77\55\0\1\21\1\100\12\21\3\0\10\21"+
    "\26\0\14\21\3\0\10\21\26\0\10\21\1\101\3\21"+
    "\3\0\10\21\26\0\1\21\1\102\3\21\1\103\6\21"+
    "\3\0\10\21\26\0\3\21\1\104\10\21\3\0\10\21"+
    "\26\0\2\21\1\105\11\21\3\0\10\21\42\0\1\106"+
    "\40\0\14\21\3\0\1\21\1\107\6\21\26\0\6\21"+
    "\1\110\5\21\3\0\1\21\1\111\6\21\26\0\14\21"+
    "\3\0\1\112\7\21\65\0\1\113\56\0\1\114\13\0"+
    "\1\50\1\115\12\50\3\0\10\50\26\0\14\50\3\0"+
    "\10\50\26\0\5\50\1\116\6\50\3\0\10\50\26\0"+
    "\2\50\1\117\11\50\3\0\10\50\26\0\1\54\1\120"+
    "\12\54\3\0\10\54\26\0\14\54\3\0\10\54\26\0"+
    "\5\54\1\121\6\54\3\0\10\54\26\0\2\54\1\122"+
    "\11\54\3\0\10\54\26\0\5\21\1\103\6\21\3\0"+
    "\10\21\26\0\1\61\1\123\12\61\3\0\10\61\26\0"+
    "\14\61\3\0\10\61\26\0\5\61\1\124\6\61\3\0"+
    "\10\61\26\0\2\61\1\125\11\61\3\0\10\61\26\0"+
    "\1\65\1\126\12\65\3\0\10\65\26\0\14\65\3\0"+
    "\10\65\26\0\5\65\1\127\6\65\3\0\10\65\26\0"+
    "\2\65\1\130\11\65\3\0\10\65\26\0\1\71\1\131"+
    "\12\71\3\0\10\71\26\0\14\71\3\0\10\71\26\0"+
    "\5\71\1\132\6\71\3\0\10\71\26\0\2\71\1\133"+
    "\11\71\3\0\10\71\15\0\1\14\2\0\52\14\6\0"+
    "\1\134\15\0\1\134\40\0\1\135\55\0\2\21\1\136"+
    "\11\21\3\0\10\21\26\0\1\137\1\21\1\140\11\21"+
    "\3\0\10\21\26\0\14\21\3\0\1\21\1\141\6\21"+
    "\26\0\6\21\1\142\5\21\3\0\10\21\26\0\1\143"+
    "\13\21\3\0\10\21\26\0\6\21\1\144\5\21\3\0"+
    "\10\21\15\0\1\145\2\0\22\145\1\146\2\0\25\145"+
    "\11\0\14\21\3\0\2\21\1\147\5\21\26\0\14\21"+
    "\3\0\4\21\1\150\3\21\26\0\10\21\1\151\3\21"+
    "\3\0\10\21\26\0\14\21\3\0\7\21\1\152\26\0"+
    "\2\50\1\153\11\50\3\0\10\50\26\0\6\50\1\154"+
    "\5\50\3\0\10\50\26\0\6\50\1\155\5\50\3\0"+
    "\10\50\26\0\2\54\1\156\11\54\3\0\10\54\26\0"+
    "\6\54\1\157\5\54\3\0\10\54\26\0\6\54\1\160"+
    "\5\54\3\0\10\54\26\0\2\61\1\161\11\61\3\0"+
    "\10\61\26\0\6\61\1\162\5\61\3\0\10\61\26\0"+
    "\6\61\1\163\5\61\3\0\10\61\26\0\2\65\1\164"+
    "\11\65\3\0\10\65\26\0\6\65\1\165\5\65\3\0"+
    "\10\65\26\0\6\65\1\166\5\65\3\0\10\65\26\0"+
    "\2\71\1\167\11\71\3\0\10\71\26\0\6\71\1\170"+
    "\5\71\3\0\10\71\26\0\6\71\1\171\5\71\3\0"+
    "\10\71\26\0\3\21\1\172\10\21\3\0\10\21\26\0"+
    "\14\21\3\0\4\21\1\173\3\21\26\0\14\21\3\0"+
    "\1\174\7\21\26\0\14\21\3\0\1\175\7\21\26\0"+
    "\7\21\1\136\4\21\3\0\10\21\26\0\6\21\1\176"+
    "\5\21\3\0\10\21\15\0\1\145\2\0\23\145\2\0"+
    "\25\145\1\146\2\0\23\146\2\0\25\146\11\0\3\21"+
    "\1\177\10\21\3\0\10\21\26\0\3\21\1\200\10\21"+
    "\3\0\10\21\26\0\4\21\1\201\3\21\1\202\3\21"+
    "\3\0\10\21\26\0\14\21\3\0\1\21\1\203\6\21"+
    "\26\0\3\50\1\204\10\50\3\0\10\50\26\0\7\50"+
    "\1\153\4\50\3\0\10\50\26\0\6\50\1\205\5\50"+
    "\3\0\10\50\26\0\3\54\1\206\10\54\3\0\10\54"+
    "\26\0\7\54\1\156\4\54\3\0\10\54\26\0\6\54"+
    "\1\207\5\54\3\0\10\54\26\0\3\61\1\210\10\61"+
    "\3\0\10\61\26\0\7\61\1\161\4\61\3\0\10\61"+
    "\26\0\6\61\1\211\5\61\3\0\10\61\26\0\3\65"+
    "\1\212\10\65\3\0\10\65\26\0\7\65\1\164\4\65"+
    "\3\0\10\65\26\0\6\65\1\213\5\65\3\0\10\65"+
    "\26\0\3\71\1\214\10\71\3\0\10\71\26\0\7\71"+
    "\1\167\4\71\3\0\10\71\26\0\6\71\1\215\5\71"+
    "\3\0\10\71\26\0\1\216\13\21\3\0\10\21\26\0"+
    "\6\21\1\217\5\21\3\0\10\21\26\0\10\21\1\220"+
    "\3\21\3\0\10\21\26\0\14\21\3\0\4\21\1\221"+
    "\3\21\26\0\3\21\1\222\10\21\3\0\10\21\26\0"+
    "\1\21\1\223\12\21\3\0\10\21\26\0\14\21\3\0"+
    "\6\21\1\224\1\21\26\0\1\225\13\21\3\0\10\21"+
    "\26\0\14\21\3\0\5\21\1\226\2\21\26\0\14\21"+
    "\3\0\3\21\1\227\4\21\26\0\1\230\13\21\3\0"+
    "\10\21\26\0\1\231\13\21\3\0\10\21\26\0\14\21"+
    "\3\0\1\21\1\232\6\21\26\0\1\21\1\233\12\21"+
    "\3\0\10\21\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5220];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\7\0\1\11\1\1\2\11\16\1\10\11\1\1\1\11"+
    "\1\1\2\11\25\1\1\11\2\0\14\1\2\11\20\1"+
    "\1\11\76\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

    private Stack<Integer> stack = new Stack<Integer>(){};

    private int currentBlock = 0;

    public void yypushState(int newState) {
        stack.push(yystate());
        yybegin(newState);
    }

    public void yypushStateWhenDifferent(int newState) {
        if (yystate() != newState) {
            yypushState(newState);
        }
    }

    public void yypopState() {
        if (stack.empty()) {
            System.out.format("will just be initial\n");
            yybegin(YYINITIAL);
        } else {
            System.out.format("SEE CURRENT STATE %s  -- ", stack.toString());
            int a = stack.pop();
            System.out.format("will pop %d\n", a);
            yybegin(a);
        }
    }

    public void yypopToState(int state) {
        if (yystate() == state) {
            yypopState();
        } else if (stack.empty()) {
            yypopToState(YYINITIAL);
        } else {
            yypopState();
            yypopToState(state);
        }
    }

    public TeoLexer() {
        this((java.io.Reader)null);
    }

    private void handleNewLine() {
        if ((yystate() == DECORATOR) || (yystate() == PPL)) {
            yypopState();
        }
    }

    private void handleWhiteSpace() {
        if (yystate() == DECORATOR) {
            yypopState();
        }
    }

    private void cancelDeclState() {
        if (yystate() == DECL) {
            yypopState();
        }
        if (yystate() == MODEL_DECL) {
            yypopState();
        }
        if (yystate() == ENUM_DECL) {
            yypopState();
        }
        if (yystate() == LET_DECL) {
            yypopState();
        }
    }

    private void pushBlock() {
        if (yystate() == ENUM_DECL) {
            currentBlock = ENUM;
            cancelDeclState();
            yypushState(ENUM);
        } else if (yystate() == MODEL_DECL) {
            currentBlock = MODEL;
            cancelDeclState();
            yypushState(MODEL);
        } else {
            currentBlock = BLOCK;
            cancelDeclState();
            yypushState(BLOCK);
        }
    }

    private void yypopToCurrentBlock() {
        if (currentBlock == ENUM) {
            yypopToState(ENUM);
            currentBlock = 0;
        } else if (currentBlock == MODEL) {
            yypopToState(MODEL);
            currentBlock = 0;
        } else if (currentBlock == BLOCK) {
            yypopToState(BLOCK);
            currentBlock = 0;
        }
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  TeoLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 43: break;
          case 2: 
            { cancelDeclState(); handleNewLine(); return EOL;
            } 
            // fall through
          case 44: break;
          case 3: 
            { handleWhiteSpace(); return WSC;
            } 
            // fall through
          case 45: break;
          case 4: 
            { return STRING_LITERAL;
            } 
            // fall through
          case 46: break;
          case 5: 
            { return NUMERIC_LITERAL;
            } 
            // fall through
          case 47: break;
          case 6: 
            { return DOT;
            } 
            // fall through
          case 48: break;
          case 7: 
            { return IDENTIFIER;
            } 
            // fall through
          case 49: break;
          case 8: 
            { pushBlock(); return LBRACE;
            } 
            // fall through
          case 50: break;
          case 9: 
            { yypopToCurrentBlock(); return RBRACE;
            } 
            // fall through
          case 51: break;
          case 10: 
            { yypushState(YYINITIAL); return LPAREN;
            } 
            // fall through
          case 52: break;
          case 11: 
            { yypopToState(YYINITIAL); return RPAREN;
            } 
            // fall through
          case 53: break;
          case 12: 
            { yypushState(YYINITIAL); return LBRACKET;
            } 
            // fall through
          case 54: break;
          case 13: 
            { yypopToState(YYINITIAL); return RBRACKET;
            } 
            // fall through
          case 55: break;
          case 14: 
            { cancelDeclState(); return EQ;
            } 
            // fall through
          case 56: break;
          case 15: 
            { return COLON;
            } 
            // fall through
          case 57: break;
          case 16: 
            { return QM;
            } 
            // fall through
          case 58: break;
          case 17: 
            { return EXCL;
            } 
            // fall through
          case 59: break;
          case 18: 
            { yypushStateWhenDifferent(DECORATOR); return AT;
            } 
            // fall through
          case 60: break;
          case 19: 
            { return COMMA;
            } 
            // fall through
          case 61: break;
          case 20: 
            { yypushState(PPL); return DOLLAR;
            } 
            // fall through
          case 62: break;
          case 21: 
            { return DECO_IDENTIFIER;
            } 
            // fall through
          case 63: break;
          case 22: 
            { return PPL_IDENTIFIER;
            } 
            // fall through
          case 64: break;
          case 23: 
            { return ENUM_IDENTIFIER;
            } 
            // fall through
          case 65: break;
          case 24: 
            { return ENUM_NAME;
            } 
            // fall through
          case 66: break;
          case 25: 
            { return MODEL_NAME;
            } 
            // fall through
          case 67: break;
          case 26: 
            { return ORANGE;
            } 
            // fall through
          case 68: break;
          case 27: 
            { return LINE_COMMENT;
            } 
            // fall through
          case 69: break;
          case 28: 
            { return QMQM;
            } 
            // fall through
          case 70: break;
          case 29: 
            { yypushStateWhenDifferent(DECORATOR); return ATAT;
            } 
            // fall through
          case 71: break;
          case 30: 
            { return CRANGE;
            } 
            // fall through
          case 72: break;
          case 31: 
            { yybegin(LET_DECL); return LET_KEYWORD;
            } 
            // fall through
          case 73: break;
          case 32: 
            { return DOC_COMMENT;
            } 
            // fall through
          case 74: break;
          case 33: 
            { return BOOL_LITERAL;
            } 
            // fall through
          case 75: break;
          case 34: 
            { yybegin(ENUM_DECL); return ENUM_KEYWORD;
            } 
            // fall through
          case 76: break;
          case 35: 
            { return FROM_KEYWORD;
            } 
            // fall through
          case 77: break;
          case 36: 
            { return NULL_LITERAL;
            } 
            // fall through
          case 78: break;
          case 37: 
            { yybegin(MODEL_DECL); return MODEL_KEYWORD;
            } 
            // fall through
          case 79: break;
          case 38: 
            { yybegin(DECL); return ENTITY_KEYWORD;
            } 
            // fall through
          case 80: break;
          case 39: 
            { yybegin(DECL); return CLIENT_KEYWORD;
            } 
            // fall through
          case 81: break;
          case 40: 
            { yybegin(DECL); return CONFIG_KEYWORD;
            } 
            // fall through
          case 82: break;
          case 41: 
            { return IMPORT_KEYWORD;
            } 
            // fall through
          case 83: break;
          case 42: 
            { yybegin(DECL); return CONNECTOR_KEYWORD;
            } 
            // fall through
          case 84: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
