// $ANTLR 3.2 Sep 23, 2009 12:02:23 ABNF.g 2016-09-02 13:02:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ABNFLexer extends Lexer {
    public static final int T__9=9;
    public static final int ABSTRACT=7;
    public static final int ARROW=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int DOUBLEARROW=4;
    public static final int T__14=14;
    public static final int ID=6;
    public static final int WS=8;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators

    public ABNFLexer() {;} 
    public ABNFLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ABNFLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "ABNF.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:3:6: ( ';' )
            // ABNF.g:3:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:4:7: ( '[' )
            // ABNF.g:4:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:5:7: ( '<' )
            // ABNF.g:5:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:6:7: ( ':' )
            // ABNF.g:6:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:7:7: ( '>' )
            // ABNF.g:7:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:8:7: ( '*' )
            // ABNF.g:8:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:9:7: ( '+' )
            // ABNF.g:9:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:10:7: ( '?' )
            // ABNF.g:10:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:11:7: ( ']' )
            // ABNF.g:11:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "ABSTRACT"
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:349:10: ( '!' )
            // ABNF.g:349:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABSTRACT"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:350:8: ( '->' )
            // ABNF.g:350:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "DOUBLEARROW"
    public final void mDOUBLEARROW() throws RecognitionException {
        try {
            int _type = DOUBLEARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:351:13: ( '=>' )
            // ABNF.g:351:15: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEARROW"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:352:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )* )
            // ABNF.g:352:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ABNF.g:352:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='#' && LA1_0<='$')||LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ABNF.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ABNF.g:353:7: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // ABNF.g:353:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // ABNF.g:353:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ABNF.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // ABNF.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | ABSTRACT | ARROW | DOUBLEARROW | ID | WS )
        int alt3=14;
        switch ( input.LA(1) ) {
        case ';':
            {
            alt3=1;
            }
            break;
        case '[':
            {
            alt3=2;
            }
            break;
        case '<':
            {
            alt3=3;
            }
            break;
        case ':':
            {
            alt3=4;
            }
            break;
        case '>':
            {
            alt3=5;
            }
            break;
        case '*':
            {
            alt3=6;
            }
            break;
        case '+':
            {
            alt3=7;
            }
            break;
        case '?':
            {
            alt3=8;
            }
            break;
        case ']':
            {
            alt3=9;
            }
            break;
        case '!':
            {
            alt3=10;
            }
            break;
        case '-':
            {
            alt3=11;
            }
            break;
        case '=':
            {
            alt3=12;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=13;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=14;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;
        }

        switch (alt3) {
            case 1 :
                // ABNF.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // ABNF.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // ABNF.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // ABNF.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // ABNF.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // ABNF.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // ABNF.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // ABNF.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // ABNF.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // ABNF.g:1:63: ABSTRACT
                {
                mABSTRACT(); 

                }
                break;
            case 11 :
                // ABNF.g:1:72: ARROW
                {
                mARROW(); 

                }
                break;
            case 12 :
                // ABNF.g:1:78: DOUBLEARROW
                {
                mDOUBLEARROW(); 

                }
                break;
            case 13 :
                // ABNF.g:1:90: ID
                {
                mID(); 

                }
                break;
            case 14 :
                // ABNF.g:1:93: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}