// $ANTLR 3.2 Sep 23, 2009 12:02:23 DDL.g 2016-10-17 13:33:13

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DDLLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int ID=4;
    public static final int WS=9;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int TYPE=5;
    public static final int T__31=31;
    public static final int T__10=10;
    public static final int T__32=32;
    public static final int NUMBER=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int ISNULL=7;
    public static final int STRING=8;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators

    public DDLLexer() {;} 
    public DDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "DDL.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:3:7: ( 'CREATE TABLE' )
            // DDL.g:3:9: 'CREATE TABLE'
            {
            match("CREATE TABLE"); 


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
            // DDL.g:4:7: ( '(' )
            // DDL.g:4:9: '('
            {
            match('('); 

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
            // DDL.g:5:7: ( ',' )
            // DDL.g:5:9: ','
            {
            match(','); 

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
            // DDL.g:6:7: ( ')' )
            // DDL.g:6:9: ')'
            {
            match(')'); 

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
            // DDL.g:7:7: ( ';' )
            // DDL.g:7:9: ';'
            {
            match(';'); 

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
            // DDL.g:8:7: ( 'ALTER TABLE' )
            // DDL.g:8:9: 'ALTER TABLE'
            {
            match("ALTER TABLE"); 


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
            // DDL.g:9:7: ( 'ADD' )
            // DDL.g:9:9: 'ADD'
            {
            match("ADD"); 


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
            // DDL.g:10:7: ( 'ENABLE' )
            // DDL.g:10:9: 'ENABLE'
            {
            match("ENABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:11:7: ( 'CONSTRAINT' )
            // DDL.g:11:9: 'CONSTRAINT'
            {
            match("CONSTRAINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:12:7: ( 'COMMENT ON' )
            // DDL.g:12:9: 'COMMENT ON'
            {
            match("COMMENT ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:13:7: ( 'TABLE' )
            // DDL.g:13:9: 'TABLE'
            {
            match("TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:14:7: ( 'COLUMN' )
            // DDL.g:14:9: 'COLUMN'
            {
            match("COLUMN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:15:7: ( '.' )
            // DDL.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:16:7: ( 'IS' )
            // DDL.g:16:9: 'IS'
            {
            match("IS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:17:7: ( 'CREATE SEQUENCE' )
            // DDL.g:17:9: 'CREATE SEQUENCE'
            {
            match("CREATE SEQUENCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:18:7: ( 'INCREMENT' )
            // DDL.g:18:9: 'INCREMENT'
            {
            match("INCREMENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:19:7: ( 'BY' )
            // DDL.g:19:9: 'BY'
            {
            match("BY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:20:7: ( 'START' )
            // DDL.g:20:9: 'START'
            {
            match("START"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:21:7: ( 'WITH' )
            // DDL.g:21:9: 'WITH'
            {
            match("WITH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:22:7: ( 'MAXVALUE' )
            // DDL.g:22:9: 'MAXVALUE'
            {
            match("MAXVALUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:23:7: ( 'NOMAXVALUE' )
            // DDL.g:23:9: 'NOMAXVALUE'
            {
            match("NOMAXVALUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:24:7: ( 'MINVALUE' )
            // DDL.g:24:9: 'MINVALUE'
            {
            match("MINVALUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:25:7: ( 'NOMINVALUE' )
            // DDL.g:25:9: 'NOMINVALUE'
            {
            match("NOMINVALUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:26:7: ( 'CYCLE' )
            // DDL.g:26:9: 'CYCLE'
            {
            match("CYCLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:27:7: ( 'NOCYCLE' )
            // DDL.g:27:9: 'NOCYCLE'
            {
            match("NOCYCLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:28:7: ( 'CACHE' )
            // DDL.g:28:9: 'CACHE'
            {
            match("CACHE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:29:7: ( 'NOCACHE' )
            // DDL.g:29:9: 'NOCACHE'
            {
            match("NOCACHE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:30:7: ( 'ORDER' )
            // DDL.g:30:9: 'ORDER'
            {
            match("ORDER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:31:7: ( 'NOORDER' )
            // DDL.g:31:9: 'NOORDER'
            {
            match("NOORDER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:32:7: ( 'PRIMARY KEY' )
            // DDL.g:32:9: 'PRIMARY KEY'
            {
            match("PRIMARY KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:33:7: ( 'UNIQUE' )
            // DDL.g:33:9: 'UNIQUE'
            {
            match("UNIQUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:34:7: ( 'FOREIGN KEY' )
            // DDL.g:34:9: 'FOREIGN KEY'
            {
            match("FOREIGN KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:35:7: ( 'REFERENCES' )
            // DDL.g:35:9: 'REFERENCES'
            {
            match("REFERENCES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "ISNULL"
    public final void mISNULL() throws RecognitionException {
        try {
            int _type = ISNULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:1145:8: ( 'NULL' | 'NOT NULL' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='N') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='U') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='O') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // DDL.g:1145:10: 'NULL'
                    {
                    match("NULL"); 


                    }
                    break;
                case 2 :
                    // DDL.g:1145:19: 'NOT NULL'
                    {
                    match("NOT NULL"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISNULL"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:1148:8: ( ( ( '1' .. '9' ) ( '0' .. '9' )* ) | ( '0' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='0') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // DDL.g:1148:10: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    {
                    // DDL.g:1148:10: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    // DDL.g:1148:11: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // DDL.g:1148:11: ( '1' .. '9' )
                    // DDL.g:1148:12: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // DDL.g:1148:21: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // DDL.g:1148:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // DDL.g:1148:36: ( '0' )
                    {
                    // DDL.g:1148:36: ( '0' )
                    // DDL.g:1148:37: '0'
                    {
                    match('0'); 

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:1151:6: ( 'NUMBER' | 'VARCHAR2' | 'DATE' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 'N':
                {
                alt4=1;
                }
                break;
            case 'V':
                {
                alt4=2;
                }
                break;
            case 'D':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // DDL.g:1151:8: 'NUMBER'
                    {
                    match("NUMBER"); 


                    }
                    break;
                case 2 :
                    // DDL.g:1151:19: 'VARCHAR2'
                    {
                    match("VARCHAR2"); 


                    }
                    break;
                case 3 :
                    // DDL.g:1151:32: 'DATE'
                    {
                    match("DATE"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:1154:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* )
            // DDL.g:1154:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // DDL.g:1154:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='#' && LA5_0<='$')||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:1158:8: ( '\\'' (~ ( '\\'' ) )* '\\'' )
            // DDL.g:1158:10: '\\'' (~ ( '\\'' ) )* '\\''
            {
            match('\''); 
            // DDL.g:1158:15: (~ ( '\\'' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // DDL.g:1158:15: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:1161:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // DDL.g:1161:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // DDL.g:1161:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // DDL.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
        // DDL.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | ISNULL | NUMBER | TYPE | ID | STRING | WS )
        int alt8=39;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // DDL.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // DDL.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // DDL.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // DDL.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // DDL.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // DDL.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // DDL.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // DDL.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // DDL.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // DDL.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // DDL.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // DDL.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // DDL.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // DDL.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // DDL.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // DDL.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // DDL.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // DDL.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // DDL.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // DDL.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // DDL.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // DDL.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // DDL.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // DDL.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // DDL.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // DDL.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // DDL.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // DDL.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // DDL.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // DDL.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // DDL.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // DDL.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // DDL.g:1:202: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // DDL.g:1:208: ISNULL
                {
                mISNULL(); 

                }
                break;
            case 35 :
                // DDL.g:1:215: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 36 :
                // DDL.g:1:222: TYPE
                {
                mTYPE(); 

                }
                break;
            case 37 :
                // DDL.g:1:227: ID
                {
                mID(); 

                }
                break;
            case 38 :
                // DDL.g:1:230: STRING
                {
                mSTRING(); 

                }
                break;
            case 39 :
                // DDL.g:1:237: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\30\4\uffff\3\30\1\uffff\13\30\1\uffff\2\30\3\uffff\10"+
        "\30\1\75\1\30\1\77\24\30\1\130\2\30\1\uffff\1\30\1\uffff\30\30\1"+
        "\uffff\4\30\1\172\7\30\1\uffff\1\145\7\30\1\u0089\4\30\1\u008e\1"+
        "\u008f\2\30\1\u0092\1\30\1\u0094\1\uffff\10\30\1\u009d\5\30\1\uffff"+
        "\3\30\1\u00a6\3\uffff\1\u00a7\1\uffff\1\30\1\uffff\7\30\1\u0089"+
        "\1\uffff\1\30\1\u00b1\3\30\1\uffff\2\30\2\uffff\5\30\1\u00be\1\u00bf"+
        "\1\u00c0\1\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\1\u00c7\1\u00c8"+
        "\2\30\5\uffff\1\30\1\u0089\1\30\1\u00cd\2\uffff\3\30\1\u00d1\1\uffff"+
        "\1\u00d2\1\u00d3\1\u00d4\4\uffff";
    static final String DFA8_eofS =
        "\u00d5\uffff";
    static final String DFA8_minS =
        "\1\11\1\101\4\uffff\1\104\1\116\1\101\1\uffff\1\116\1\131\1\124"+
        "\1\111\1\101\1\117\2\122\1\116\1\117\1\105\1\uffff\2\101\3\uffff"+
        "\1\105\1\114\2\103\1\124\1\104\1\101\1\102\1\43\1\103\1\43\1\101"+
        "\1\124\1\130\1\116\1\103\1\114\1\104\2\111\1\122\1\106\1\122\1\124"+
        "\1\101\1\123\1\115\1\125\1\114\1\110\1\105\1\43\1\102\1\114\1\uffff"+
        "\1\122\1\uffff\1\122\1\110\2\126\2\101\1\122\1\40\1\114\1\102\1"+
        "\105\1\115\1\121\2\105\1\103\1\105\2\124\1\105\1\115\2\105\1\122"+
        "\1\uffff\1\114\2\105\1\124\1\43\2\101\1\130\1\116\2\103\1\104\1"+
        "\uffff\1\43\1\105\1\122\1\101\1\125\1\111\1\122\1\110\1\43\1\105"+
        "\1\122\2\116\2\43\1\40\1\105\1\43\1\115\1\43\1\uffff\2\114\2\126"+
        "\1\114\1\110\1\105\1\122\1\43\1\122\1\105\1\107\1\105\1\101\1\uffff"+
        "\1\40\1\101\1\124\1\43\3\uffff\1\43\1\uffff\1\105\1\uffff\2\125"+
        "\2\101\2\105\1\122\1\43\1\uffff\1\131\1\43\2\116\1\122\1\123\1\111"+
        "\1\40\2\uffff\1\116\2\105\2\114\3\43\1\40\1\uffff\1\40\1\103\1\62"+
        "\2\uffff\1\116\1\uffff\1\124\2\43\2\125\5\uffff\1\105\1\43\1\124"+
        "\1\43\2\uffff\2\105\1\123\1\43\1\uffff\3\43\4\uffff";
    static final String DFA8_maxS =
        "\1\172\1\131\4\uffff\1\114\1\116\1\101\1\uffff\1\123\1\131\1\124"+
        "\2\111\1\125\2\122\1\116\1\117\1\105\1\uffff\2\101\3\uffff\1\105"+
        "\1\116\2\103\1\124\1\104\1\101\1\102\1\172\1\103\1\172\1\101\1\124"+
        "\1\130\1\116\1\124\1\115\1\104\2\111\1\122\1\106\1\122\1\124\1\101"+
        "\1\123\1\115\1\125\1\114\1\110\1\105\1\172\1\102\1\114\1\uffff\1"+
        "\122\1\uffff\1\122\1\110\2\126\1\111\1\131\1\122\1\40\1\114\1\102"+
        "\1\105\1\115\1\121\2\105\1\103\1\105\2\124\1\105\1\115\2\105\1\122"+
        "\1\uffff\1\114\2\105\1\124\1\172\2\101\1\130\1\116\2\103\1\104\1"+
        "\uffff\1\172\1\105\1\122\1\101\1\125\1\111\1\122\1\110\1\172\1\105"+
        "\1\122\2\116\2\172\1\40\1\105\1\172\1\115\1\172\1\uffff\2\114\2"+
        "\126\1\114\1\110\1\105\1\122\1\172\1\122\1\105\1\107\1\105\1\101"+
        "\1\uffff\1\40\1\101\1\124\1\172\3\uffff\1\172\1\uffff\1\105\1\uffff"+
        "\2\125\2\101\2\105\1\122\1\172\1\uffff\1\131\1\172\2\116\1\122\1"+
        "\124\1\111\1\40\2\uffff\1\116\2\105\2\114\3\172\1\40\1\uffff\1\40"+
        "\1\103\1\62\2\uffff\1\116\1\uffff\1\124\2\172\2\125\5\uffff\1\105"+
        "\1\172\1\124\1\172\2\uffff\2\105\1\123\1\172\1\uffff\3\172\4\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\3\uffff\1\15\13\uffff\1\43\2\uffff\1\45"+
        "\1\46\1\47\42\uffff\1\16\1\uffff\1\21\30\uffff\1\7\14\uffff\1\42"+
        "\24\uffff\1\23\16\uffff\1\44\4\uffff\1\30\1\32\1\6\1\uffff\1\13"+
        "\1\uffff\1\22\10\uffff\1\34\10\uffff\1\14\1\10\11\uffff\1\37\3\uffff"+
        "\1\1\1\17\1\uffff\1\12\5\uffff\1\31\1\33\1\35\1\36\1\40\4\uffff"+
        "\1\24\1\26\4\uffff\1\20\3\uffff\1\11\1\25\1\27\1\41";
    static final String DFA8_specialS =
        "\u00d5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\32\2\uffff\1\32\22\uffff\1\32\6\uffff\1\31\1\2\1\4\2\uffff"+
            "\1\3\1\uffff\1\11\1\uffff\12\25\1\uffff\1\5\5\uffff\1\6\1\13"+
            "\1\1\1\27\1\7\1\23\2\30\1\12\3\30\1\16\1\17\1\20\1\21\1\30\1"+
            "\24\1\14\1\10\1\22\1\26\1\15\3\30\6\uffff\32\30",
            "\1\36\15\uffff\1\34\2\uffff\1\33\6\uffff\1\35",
            "",
            "",
            "",
            "",
            "\1\40\7\uffff\1\37",
            "\1\41",
            "\1\42",
            "",
            "\1\44\4\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50\7\uffff\1\51",
            "\1\52\5\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "\1\61",
            "\1\62",
            "",
            "",
            "",
            "\1\63",
            "\1\66\1\65\1\64",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\76",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\105\11\uffff\1\104\1\uffff\1\106\4\uffff\1\107",
            "\1\110\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\131",
            "\1\132",
            "",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140\7\uffff\1\141",
            "\1\143\27\uffff\1\142",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\u0090",
            "\1\u0091",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\u0093",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "",
            "",
            "",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "",
            "\1\u00b0",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b6\1\u00b5",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "",
            "",
            "",
            "",
            "\1\u00cb",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\u00cc",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\2\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | ISNULL | NUMBER | TYPE | ID | STRING | WS );";
        }
    }
 

}