// $ANTLR 3.2 Sep 23, 2009 12:02:23 delphi.g 2016-08-30 19:22:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class delphiLexer extends Lexer {
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int ID=4;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int LINE_COMMENT=14;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int QVALUE=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int QUOTE=10;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int MORECOMMENT=13;
    public static final int INT=5;
    public static final int DOUBLEQUOTE=11;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int WS=15;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int DQVALUE=8;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int SLASH=9;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int HEX=6;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public delphiLexer() {;} 
    public delphiLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public delphiLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "delphi.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:3:7: ( 'program' )
            // delphi.g:3:9: 'program'
            {
            match("program"); 


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
            // delphi.g:4:7: ( '(' )
            // delphi.g:4:9: '('
            {
            match('('); 

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
            // delphi.g:5:7: ( ')' )
            // delphi.g:5:9: ')'
            {
            match(')'); 

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
            // delphi.g:6:7: ( ';' )
            // delphi.g:6:9: ';'
            {
            match(';'); 

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
            // delphi.g:7:7: ( '.' )
            // delphi.g:7:9: '.'
            {
            match('.'); 

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
            // delphi.g:8:7: ( 'unit' )
            // delphi.g:8:9: 'unit'
            {
            match("unit"); 


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
            // delphi.g:9:7: ( 'package' )
            // delphi.g:9:9: 'package'
            {
            match("package"); 


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
            // delphi.g:10:7: ( 'end' )
            // delphi.g:10:9: 'end'
            {
            match("end"); 


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
            // delphi.g:11:7: ( 'library' )
            // delphi.g:11:9: 'library'
            {
            match("library"); 


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
            // delphi.g:12:7: ( 'uses' )
            // delphi.g:12:9: 'uses'
            {
            match("uses"); 


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
            // delphi.g:13:7: ( 'platform' )
            // delphi.g:13:9: 'platform'
            {
            match("platform"); 


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
            // delphi.g:14:7: ( 'deprecated' )
            // delphi.g:14:9: 'deprecated'
            {
            match("deprecated"); 


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
            // delphi.g:15:7: ( 'interface' )
            // delphi.g:15:9: 'interface'
            {
            match("interface"); 


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
            // delphi.g:16:7: ( 'implementation' )
            // delphi.g:16:9: 'implementation'
            {
            match("implementation"); 


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
            // delphi.g:17:7: ( 'name' )
            // delphi.g:17:9: 'name'
            {
            match("name"); 


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
            // delphi.g:18:7: ( 'index' )
            // delphi.g:18:9: 'index'
            {
            match("index"); 


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
            // delphi.g:19:7: ( 'exports' )
            // delphi.g:19:9: 'exports'
            {
            match("exports"); 


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
            // delphi.g:20:7: ( ',' )
            // delphi.g:20:9: ','
            {
            match(','); 

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
            // delphi.g:21:7: ( 'label' )
            // delphi.g:21:9: 'label'
            {
            match("label"); 


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
            // delphi.g:22:7: ( 'const' )
            // delphi.g:22:9: 'const'
            {
            match("const"); 


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
            // delphi.g:23:7: ( '=' )
            // delphi.g:23:9: '='
            {
            match('='); 

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
            // delphi.g:24:7: ( ':' )
            // delphi.g:24:9: ':'
            {
            match(':'); 

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
            // delphi.g:25:7: ( 'type' )
            // delphi.g:25:9: 'type'
            {
            match("type"); 


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
            // delphi.g:26:7: ( 'class' )
            // delphi.g:26:9: 'class'
            {
            match("class"); 


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
            // delphi.g:27:7: ( 'of' )
            // delphi.g:27:9: 'of'
            {
            match("of"); 


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
            // delphi.g:28:7: ( 'real48' )
            // delphi.g:28:9: 'real48'
            {
            match("real48"); 


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
            // delphi.g:29:7: ( 'real' )
            // delphi.g:29:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:30:7: ( 'single' )
            // delphi.g:30:9: 'single'
            {
            match("single"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:31:7: ( 'double' )
            // delphi.g:31:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:32:7: ( 'extended' )
            // delphi.g:32:9: 'extended'
            {
            match("extended"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:33:7: ( 'currency' )
            // delphi.g:33:9: 'currency'
            {
            match("currency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:34:7: ( 'comp' )
            // delphi.g:34:9: 'comp'
            {
            match("comp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:35:7: ( 'shortint' )
            // delphi.g:35:9: 'shortint'
            {
            match("shortint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:36:7: ( 'smallint' )
            // delphi.g:36:9: 'smallint'
            {
            match("smallint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:37:7: ( 'integer' )
            // delphi.g:37:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:38:7: ( 'byte' )
            // delphi.g:38:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:39:7: ( 'longint' )
            // delphi.g:39:9: 'longint'
            {
            match("longint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:40:7: ( 'int64' )
            // delphi.g:40:9: 'int64'
            {
            match("int64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:41:7: ( 'word' )
            // delphi.g:41:9: 'word'
            {
            match("word"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:42:7: ( 'boolean' )
            // delphi.g:42:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:43:7: ( 'char' )
            // delphi.g:43:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:44:7: ( 'widechar' )
            // delphi.g:44:9: 'widechar'
            {
            match("widechar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:45:7: ( 'longword' )
            // delphi.g:45:9: 'longword'
            {
            match("longword"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:46:7: ( 'pchar' )
            // delphi.g:46:9: 'pchar'
            {
            match("pchar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:47:7: ( 'variant' )
            // delphi.g:47:9: 'variant'
            {
            match("variant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:48:7: ( 'olevariant' )
            // delphi.g:48:9: 'olevariant'
            {
            match("olevariant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:49:7: ( '..' )
            // delphi.g:49:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:50:7: ( 'string' )
            // delphi.g:50:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:51:7: ( 'ansistring' )
            // delphi.g:51:9: 'ansistring'
            {
            match("ansistring"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:52:7: ( 'widestring' )
            // delphi.g:52:9: 'widestring'
            {
            match("widestring"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:53:7: ( 'packed' )
            // delphi.g:53:9: 'packed'
            {
            match("packed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:54:7: ( 'array' )
            // delphi.g:54:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:55:7: ( '[' )
            // delphi.g:55:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:56:7: ( ']' )
            // delphi.g:56:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:57:7: ( 'record' )
            // delphi.g:57:9: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:58:7: ( 'case' )
            // delphi.g:58:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:59:7: ( 'set' )
            // delphi.g:59:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:60:7: ( 'file' )
            // delphi.g:60:9: 'file'
            {
            match("file"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:61:7: ( '^' )
            // delphi.g:61:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:62:7: ( 'object' )
            // delphi.g:62:9: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:63:7: ( 'var' )
            // delphi.g:63:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:64:7: ( 'absolute' )
            // delphi.g:64:9: 'absolute'
            {
            match("absolute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:65:7: ( '+' )
            // delphi.g:65:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:66:7: ( '-' )
            // delphi.g:66:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:67:7: ( '@' )
            // delphi.g:67:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:68:7: ( 'nil' )
            // delphi.g:68:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:69:7: ( 'not' )
            // delphi.g:69:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:70:7: ( '>' )
            // delphi.g:70:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:71:7: ( '<' )
            // delphi.g:71:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:72:7: ( '<=' )
            // delphi.g:72:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:73:7: ( '>=' )
            // delphi.g:73:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:74:7: ( '<>' )
            // delphi.g:74:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:75:7: ( 'in' )
            // delphi.g:75:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:76:7: ( 'is' )
            // delphi.g:76:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:77:7: ( 'as' )
            // delphi.g:77:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:78:7: ( 'or' )
            // delphi.g:78:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:79:7: ( 'xor' )
            // delphi.g:79:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:80:7: ( '*' )
            // delphi.g:80:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:81:7: ( '/' )
            // delphi.g:81:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:82:7: ( 'div' )
            // delphi.g:82:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:83:7: ( 'mod' )
            // delphi.g:83:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:84:7: ( 'and' )
            // delphi.g:84:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:85:7: ( 'shl' )
            // delphi.g:85:9: 'shl'
            {
            match("shl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:86:7: ( 'shr' )
            // delphi.g:86:9: 'shr'
            {
            match("shr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:87:8: ( '&' )
            // delphi.g:87:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:88:8: ( ':=' )
            // delphi.g:88:10: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:89:8: ( 'inherited' )
            // delphi.g:89:10: 'inherited'
            {
            match("inherited"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:90:8: ( 'goto' )
            // delphi.g:90:10: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:91:8: ( 'begin' )
            // delphi.g:91:10: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:92:8: ( 'if' )
            // delphi.g:92:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:93:8: ( 'then' )
            // delphi.g:93:10: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:94:8: ( 'else' )
            // delphi.g:94:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:95:8: ( 'repeat' )
            // delphi.g:95:10: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:96:8: ( 'until' )
            // delphi.g:96:10: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:97:8: ( 'while' )
            // delphi.g:97:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:98:8: ( 'do' )
            // delphi.g:98:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:99:8: ( 'for' )
            // delphi.g:99:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:100:8: ( 'to' )
            // delphi.g:100:10: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:101:8: ( 'downto' )
            // delphi.g:101:10: 'downto'
            {
            match("downto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:102:8: ( 'with' )
            // delphi.g:102:10: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:103:8: ( 'try' )
            // delphi.g:103:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:104:8: ( 'except' )
            // delphi.g:104:10: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:105:8: ( 'finally' )
            // delphi.g:105:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:106:8: ( 'on' )
            // delphi.g:106:10: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:107:8: ( 'id' )
            // delphi.g:107:10: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:108:8: ( 'raise' )
            // delphi.g:108:10: 'raise'
            {
            match("raise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:109:8: ( 'at' )
            // delphi.g:109:10: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:110:8: ( 'asm' )
            // delphi.g:110:10: 'asm'
            {
            match("asm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:111:8: ( 'function' )
            // delphi.g:111:10: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:112:8: ( 'procedure' )
            // delphi.g:112:10: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:113:8: ( 'out' )
            // delphi.g:113:10: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:114:8: ( 'cdecl' )
            // delphi.g:114:10: 'cdecl'
            {
            match("cdecl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:115:8: ( 'register' )
            // delphi.g:115:10: 'register'
            {
            match("register"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:116:8: ( 'dynamic' )
            // delphi.g:116:10: 'dynamic'
            {
            match("dynamic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:117:8: ( 'virtual' )
            // delphi.g:117:10: 'virtual'
            {
            match("virtual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:118:8: ( 'export' )
            // delphi.g:118:10: 'export'
            {
            match("export"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:119:8: ( 'external' )
            // delphi.g:119:10: 'external'
            {
            match("external"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:120:8: ( 'near' )
            // delphi.g:120:10: 'near'
            {
            match("near"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:121:8: ( 'far' )
            // delphi.g:121:10: 'far'
            {
            match("far"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:122:8: ( 'forward' )
            // delphi.g:122:10: 'forward'
            {
            match("forward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:123:8: ( 'message' )
            // delphi.g:123:10: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:124:8: ( 'override' )
            // delphi.g:124:10: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:125:8: ( 'overload' )
            // delphi.g:125:10: 'overload'
            {
            match("overload"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:126:8: ( 'pascal' )
            // delphi.g:126:10: 'pascal'
            {
            match("pascal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:127:8: ( 'reintroduce' )
            // delphi.g:127:10: 'reintroduce'
            {
            match("reintroduce"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:128:8: ( 'safecall' )
            // delphi.g:128:10: 'safecall'
            {
            match("safecall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:129:8: ( 'stdcall' )
            // delphi.g:129:10: 'stdcall'
            {
            match("stdcall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:130:8: ( 'varargs' )
            // delphi.g:130:10: 'varargs'
            {
            match("varargs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:131:8: ( 'local' )
            // delphi.g:131:10: 'local'
            {
            match("local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:132:8: ( 'abstract' )
            // delphi.g:132:10: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:133:8: ( 'constructor' )
            // delphi.g:133:10: 'constructor'
            {
            match("constructor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:134:8: ( 'destructor' )
            // delphi.g:134:10: 'destructor'
            {
            match("destructor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:135:8: ( 'initialization' )
            // delphi.g:135:10: 'initialization'
            {
            match("initialization"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:136:8: ( 'finalization' )
            // delphi.g:136:10: 'finalization'
            {
            match("finalization"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:137:8: ( 'public' )
            // delphi.g:137:10: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:138:8: ( 'protected' )
            // delphi.g:138:10: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:139:8: ( 'private' )
            // delphi.g:139:10: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:140:8: ( 'published' )
            // delphi.g:140:10: 'published'
            {
            match("published"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:141:8: ( 'property' )
            // delphi.g:141:10: 'property'
            {
            match("property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:142:8: ( 'read' )
            // delphi.g:142:10: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:143:8: ( 'write' )
            // delphi.g:143:10: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:144:8: ( 'stored' )
            // delphi.g:144:10: 'stored'
            {
            match("stored"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:145:8: ( 'default' )
            // delphi.g:145:10: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:146:8: ( 'nodefault' )
            // delphi.g:146:10: 'nodefault'
            {
            match("nodefault"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:147:8: ( 'implements' )
            // delphi.g:147:10: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:148:8: ( 'requires' )
            // delphi.g:148:10: 'requires'
            {
            match("requires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:149:8: ( 'contains' )
            // delphi.g:149:10: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:150:8: ( '#' )
            // delphi.g:150:10: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:7298:10: ( '\\u005C' )
            // delphi.g:7298:13: '\\u005C'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:7299:9: ( '\\u0027' )
            // delphi.g:7299:12: '\\u0027'
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:7300:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | SLASH | '-' )* )
            // delphi.g:7300:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | SLASH | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // delphi.g:7300:39: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | SLASH | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='#' && LA1_0<='$')||LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='\\'||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // delphi.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

    // $ANTLR start "DOUBLEQUOTE"
    public final void mDOUBLEQUOTE() throws RecognitionException {
        try {
            int _type = DOUBLEQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:7301:14: ( '\\u0022' )
            // delphi.g:7301:17: '\\u0022'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEQUOTE"

    // $ANTLR start "DQVALUE"
    public final void mDQVALUE() throws RecognitionException {
        try {
            int _type = DQVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:7302:11: ( DOUBLEQUOTE ( options {greedy=false; } : . )* DOUBLEQUOTE )
            // delphi.g:7302:14: DOUBLEQUOTE ( options {greedy=false; } : . )* DOUBLEQUOTE
            {
            mDOUBLEQUOTE(); 
            // delphi.g:7302:26: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // delphi.g:7302:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mDOUBLEQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DQVALUE"

    // $ANTLR start "QVALUE"
    public final void mQVALUE() throws RecognitionException {
        try {
            int _type = QVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:7303:10: ( QUOTE ( options {greedy=false; } : . )* QUOTE )
            // delphi.g:7303:13: QUOTE ( options {greedy=false; } : . )* QUOTE
            {
            mQUOTE(); 
            // delphi.g:7303:19: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // delphi.g:7303:46: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QVALUE"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            int _type = HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:7304:8: ( ( '+' | '-' )? '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // delphi.g:7304:10: ( '+' | '-' )? '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            // delphi.g:7304:10: ( '+' | '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // delphi.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // delphi.g:7304:40: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='F')||(LA5_0>='a' && LA5_0<='f')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // delphi.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:7305:8: ( ( '+' | '-' )? ( '0' .. '9' )+ )
            // delphi.g:7305:11: ( '+' | '-' )? ( '0' .. '9' )+
            {
            // delphi.g:7305:11: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // delphi.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // delphi.g:7305:24: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // delphi.g:7305:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:7306:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // delphi.g:7306:16: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // delphi.g:7306:21: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // delphi.g:7306:49: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "MORECOMMENT"
    public final void mMORECOMMENT() throws RecognitionException {
        try {
            int _type = MORECOMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:7307:13: ( '{' ( options {greedy=false; } : . )* '}' )
            // delphi.g:7307:18: '{' ( options {greedy=false; } : . )* '}'
            {
            match('{'); 
            // delphi.g:7307:22: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='}') ) {
                    alt9=2;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='|')||(LA9_0>='~' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // delphi.g:7307:50: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('}'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MORECOMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:7308:15: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // delphi.g:7308:18: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // delphi.g:7308:23: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // delphi.g:7308:23: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // delphi.g:7308:37: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // delphi.g:7308:37: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // delphi.g:7309:9: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // delphi.g:7309:13: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

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
        // delphi.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | SLASH | QUOTE | ID | DOUBLEQUOTE | DQVALUE | QVALUE | HEX | INT | COMMENT | MORECOMMENT | LINE_COMMENT | WS )
        int alt12=160;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // delphi.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // delphi.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // delphi.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // delphi.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // delphi.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // delphi.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // delphi.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // delphi.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // delphi.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // delphi.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // delphi.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // delphi.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // delphi.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // delphi.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // delphi.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // delphi.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // delphi.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // delphi.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // delphi.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // delphi.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // delphi.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // delphi.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // delphi.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // delphi.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // delphi.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // delphi.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // delphi.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // delphi.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // delphi.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // delphi.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // delphi.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // delphi.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // delphi.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // delphi.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // delphi.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // delphi.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // delphi.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // delphi.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // delphi.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // delphi.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // delphi.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // delphi.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // delphi.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // delphi.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // delphi.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // delphi.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // delphi.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // delphi.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // delphi.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // delphi.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // delphi.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // delphi.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // delphi.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // delphi.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // delphi.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // delphi.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // delphi.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // delphi.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // delphi.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // delphi.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // delphi.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // delphi.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // delphi.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // delphi.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // delphi.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // delphi.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // delphi.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // delphi.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // delphi.g:1:418: T__84
                {
                mT__84(); 

                }
                break;
            case 70 :
                // delphi.g:1:424: T__85
                {
                mT__85(); 

                }
                break;
            case 71 :
                // delphi.g:1:430: T__86
                {
                mT__86(); 

                }
                break;
            case 72 :
                // delphi.g:1:436: T__87
                {
                mT__87(); 

                }
                break;
            case 73 :
                // delphi.g:1:442: T__88
                {
                mT__88(); 

                }
                break;
            case 74 :
                // delphi.g:1:448: T__89
                {
                mT__89(); 

                }
                break;
            case 75 :
                // delphi.g:1:454: T__90
                {
                mT__90(); 

                }
                break;
            case 76 :
                // delphi.g:1:460: T__91
                {
                mT__91(); 

                }
                break;
            case 77 :
                // delphi.g:1:466: T__92
                {
                mT__92(); 

                }
                break;
            case 78 :
                // delphi.g:1:472: T__93
                {
                mT__93(); 

                }
                break;
            case 79 :
                // delphi.g:1:478: T__94
                {
                mT__94(); 

                }
                break;
            case 80 :
                // delphi.g:1:484: T__95
                {
                mT__95(); 

                }
                break;
            case 81 :
                // delphi.g:1:490: T__96
                {
                mT__96(); 

                }
                break;
            case 82 :
                // delphi.g:1:496: T__97
                {
                mT__97(); 

                }
                break;
            case 83 :
                // delphi.g:1:502: T__98
                {
                mT__98(); 

                }
                break;
            case 84 :
                // delphi.g:1:508: T__99
                {
                mT__99(); 

                }
                break;
            case 85 :
                // delphi.g:1:514: T__100
                {
                mT__100(); 

                }
                break;
            case 86 :
                // delphi.g:1:521: T__101
                {
                mT__101(); 

                }
                break;
            case 87 :
                // delphi.g:1:528: T__102
                {
                mT__102(); 

                }
                break;
            case 88 :
                // delphi.g:1:535: T__103
                {
                mT__103(); 

                }
                break;
            case 89 :
                // delphi.g:1:542: T__104
                {
                mT__104(); 

                }
                break;
            case 90 :
                // delphi.g:1:549: T__105
                {
                mT__105(); 

                }
                break;
            case 91 :
                // delphi.g:1:556: T__106
                {
                mT__106(); 

                }
                break;
            case 92 :
                // delphi.g:1:563: T__107
                {
                mT__107(); 

                }
                break;
            case 93 :
                // delphi.g:1:570: T__108
                {
                mT__108(); 

                }
                break;
            case 94 :
                // delphi.g:1:577: T__109
                {
                mT__109(); 

                }
                break;
            case 95 :
                // delphi.g:1:584: T__110
                {
                mT__110(); 

                }
                break;
            case 96 :
                // delphi.g:1:591: T__111
                {
                mT__111(); 

                }
                break;
            case 97 :
                // delphi.g:1:598: T__112
                {
                mT__112(); 

                }
                break;
            case 98 :
                // delphi.g:1:605: T__113
                {
                mT__113(); 

                }
                break;
            case 99 :
                // delphi.g:1:612: T__114
                {
                mT__114(); 

                }
                break;
            case 100 :
                // delphi.g:1:619: T__115
                {
                mT__115(); 

                }
                break;
            case 101 :
                // delphi.g:1:626: T__116
                {
                mT__116(); 

                }
                break;
            case 102 :
                // delphi.g:1:633: T__117
                {
                mT__117(); 

                }
                break;
            case 103 :
                // delphi.g:1:640: T__118
                {
                mT__118(); 

                }
                break;
            case 104 :
                // delphi.g:1:647: T__119
                {
                mT__119(); 

                }
                break;
            case 105 :
                // delphi.g:1:654: T__120
                {
                mT__120(); 

                }
                break;
            case 106 :
                // delphi.g:1:661: T__121
                {
                mT__121(); 

                }
                break;
            case 107 :
                // delphi.g:1:668: T__122
                {
                mT__122(); 

                }
                break;
            case 108 :
                // delphi.g:1:675: T__123
                {
                mT__123(); 

                }
                break;
            case 109 :
                // delphi.g:1:682: T__124
                {
                mT__124(); 

                }
                break;
            case 110 :
                // delphi.g:1:689: T__125
                {
                mT__125(); 

                }
                break;
            case 111 :
                // delphi.g:1:696: T__126
                {
                mT__126(); 

                }
                break;
            case 112 :
                // delphi.g:1:703: T__127
                {
                mT__127(); 

                }
                break;
            case 113 :
                // delphi.g:1:710: T__128
                {
                mT__128(); 

                }
                break;
            case 114 :
                // delphi.g:1:717: T__129
                {
                mT__129(); 

                }
                break;
            case 115 :
                // delphi.g:1:724: T__130
                {
                mT__130(); 

                }
                break;
            case 116 :
                // delphi.g:1:731: T__131
                {
                mT__131(); 

                }
                break;
            case 117 :
                // delphi.g:1:738: T__132
                {
                mT__132(); 

                }
                break;
            case 118 :
                // delphi.g:1:745: T__133
                {
                mT__133(); 

                }
                break;
            case 119 :
                // delphi.g:1:752: T__134
                {
                mT__134(); 

                }
                break;
            case 120 :
                // delphi.g:1:759: T__135
                {
                mT__135(); 

                }
                break;
            case 121 :
                // delphi.g:1:766: T__136
                {
                mT__136(); 

                }
                break;
            case 122 :
                // delphi.g:1:773: T__137
                {
                mT__137(); 

                }
                break;
            case 123 :
                // delphi.g:1:780: T__138
                {
                mT__138(); 

                }
                break;
            case 124 :
                // delphi.g:1:787: T__139
                {
                mT__139(); 

                }
                break;
            case 125 :
                // delphi.g:1:794: T__140
                {
                mT__140(); 

                }
                break;
            case 126 :
                // delphi.g:1:801: T__141
                {
                mT__141(); 

                }
                break;
            case 127 :
                // delphi.g:1:808: T__142
                {
                mT__142(); 

                }
                break;
            case 128 :
                // delphi.g:1:815: T__143
                {
                mT__143(); 

                }
                break;
            case 129 :
                // delphi.g:1:822: T__144
                {
                mT__144(); 

                }
                break;
            case 130 :
                // delphi.g:1:829: T__145
                {
                mT__145(); 

                }
                break;
            case 131 :
                // delphi.g:1:836: T__146
                {
                mT__146(); 

                }
                break;
            case 132 :
                // delphi.g:1:843: T__147
                {
                mT__147(); 

                }
                break;
            case 133 :
                // delphi.g:1:850: T__148
                {
                mT__148(); 

                }
                break;
            case 134 :
                // delphi.g:1:857: T__149
                {
                mT__149(); 

                }
                break;
            case 135 :
                // delphi.g:1:864: T__150
                {
                mT__150(); 

                }
                break;
            case 136 :
                // delphi.g:1:871: T__151
                {
                mT__151(); 

                }
                break;
            case 137 :
                // delphi.g:1:878: T__152
                {
                mT__152(); 

                }
                break;
            case 138 :
                // delphi.g:1:885: T__153
                {
                mT__153(); 

                }
                break;
            case 139 :
                // delphi.g:1:892: T__154
                {
                mT__154(); 

                }
                break;
            case 140 :
                // delphi.g:1:899: T__155
                {
                mT__155(); 

                }
                break;
            case 141 :
                // delphi.g:1:906: T__156
                {
                mT__156(); 

                }
                break;
            case 142 :
                // delphi.g:1:913: T__157
                {
                mT__157(); 

                }
                break;
            case 143 :
                // delphi.g:1:920: T__158
                {
                mT__158(); 

                }
                break;
            case 144 :
                // delphi.g:1:927: T__159
                {
                mT__159(); 

                }
                break;
            case 145 :
                // delphi.g:1:934: T__160
                {
                mT__160(); 

                }
                break;
            case 146 :
                // delphi.g:1:941: T__161
                {
                mT__161(); 

                }
                break;
            case 147 :
                // delphi.g:1:948: T__162
                {
                mT__162(); 

                }
                break;
            case 148 :
                // delphi.g:1:955: T__163
                {
                mT__163(); 

                }
                break;
            case 149 :
                // delphi.g:1:962: SLASH
                {
                mSLASH(); 

                }
                break;
            case 150 :
                // delphi.g:1:968: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 151 :
                // delphi.g:1:974: ID
                {
                mID(); 

                }
                break;
            case 152 :
                // delphi.g:1:977: DOUBLEQUOTE
                {
                mDOUBLEQUOTE(); 

                }
                break;
            case 153 :
                // delphi.g:1:989: DQVALUE
                {
                mDQVALUE(); 

                }
                break;
            case 154 :
                // delphi.g:1:997: QVALUE
                {
                mQVALUE(); 

                }
                break;
            case 155 :
                // delphi.g:1:1004: HEX
                {
                mHEX(); 

                }
                break;
            case 156 :
                // delphi.g:1:1008: INT
                {
                mINT(); 

                }
                break;
            case 157 :
                // delphi.g:1:1012: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 158 :
                // delphi.g:1:1020: MORECOMMENT
                {
                mMORECOMMENT(); 

                }
                break;
            case 159 :
                // delphi.g:1:1032: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 160 :
                // delphi.g:1:1045: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\52\3\uffff\1\66\6\52\1\uffff\1\52\1\uffff\1\123\10\52"+
        "\2\uffff\1\52\1\uffff\1\171\1\172\1\uffff\1\174\1\177\1\52\1\uffff"+
        "\1\u0083\1\52\1\uffff\1\52\2\uffff\1\u0087\1\uffff\1\u0089\1\55"+
        "\3\uffff\5\52\2\uffff\11\52\1\u00a4\2\52\1\u00ab\1\52\1\u00ad\1"+
        "\u00ae\1\u00af\12\52\2\uffff\2\52\1\u00be\1\52\1\u00c0\2\52\1\u00c3"+
        "\1\u00c4\26\52\1\u00e7\1\u00e8\4\52\7\uffff\1\52\3\uffff\3\52\5"+
        "\uffff\12\52\1\u00ff\15\52\1\uffff\1\u010d\5\52\1\uffff\1\52\3\uffff"+
        "\1\52\1\u0116\1\u0117\13\52\1\uffff\1\u0124\1\uffff\2\52\2\uffff"+
        "\1\u0127\12\52\1\u0133\1\u0134\4\52\1\u0139\11\52\1\u0145\2\52\1"+
        "\u0148\2\52\1\u014c\2\uffff\2\52\1\u0150\1\52\1\u0152\1\u0153\1"+
        "\u0154\14\52\1\u0162\1\52\1\u0164\1\uffff\3\52\1\u0169\11\52\1\uffff"+
        "\7\52\1\u017c\2\uffff\1\52\1\u017e\2\52\1\u0181\2\52\1\u0184\1\u0185"+
        "\1\52\1\u0187\1\u0188\1\uffff\2\52\1\uffff\1\52\1\u018e\1\u018f"+
        "\10\52\2\uffff\4\52\1\uffff\1\52\1\u019d\2\52\1\u01a0\1\52\1\u01a3"+
        "\4\52\1\uffff\2\52\1\uffff\3\52\1\uffff\1\u01ad\2\52\1\uffff\1\52"+
        "\3\uffff\1\52\1\u01b2\11\52\1\u01bc\1\52\1\uffff\1\u01bf\1\uffff"+
        "\4\52\1\uffff\1\52\1\u01c5\2\52\1\u01c8\10\52\1\u01d1\1\u01d2\3"+
        "\52\1\uffff\1\52\1\uffff\1\u01d8\1\52\1\uffff\1\u01da\1\52\2\uffff"+
        "\1\u01dc\2\uffff\5\52\2\uffff\5\52\1\u01e7\7\52\1\uffff\1\52\1\u01f0"+
        "\1\uffff\2\52\1\uffff\1\u01f3\1\u01f4\4\52\1\u01f9\2\52\1\uffff"+
        "\4\52\1\uffff\6\52\1\u0207\1\u0208\1\52\1\uffff\1\u020a\1\52\1\uffff"+
        "\1\u020d\2\52\1\u0210\1\52\1\uffff\2\52\1\uffff\3\52\1\u0217\1\u0218"+
        "\3\52\2\uffff\5\52\1\uffff\1\52\1\uffff\1\52\1\uffff\1\52\1\u0224"+
        "\2\52\1\u0227\1\u0228\1\u0229\3\52\1\uffff\1\u022d\2\52\1\u0230"+
        "\1\52\1\u0232\2\52\1\uffff\2\52\2\uffff\4\52\1\uffff\7\52\1\u0242"+
        "\3\52\1\u0246\1\u0247\2\uffff\1\52\1\uffff\1\52\1\u024a\1\uffff"+
        "\2\52\1\uffff\1\u024d\1\u024e\3\52\1\u0252\2\uffff\1\u0253\1\52"+
        "\1\u0255\10\52\1\uffff\2\52\3\uffff\3\52\1\uffff\2\52\1\uffff\1"+
        "\u0265\1\uffff\1\52\1\u0267\2\52\1\u026a\1\u026b\1\u026c\3\52\1"+
        "\u0270\1\52\1\u0272\1\52\1\u0274\1\uffff\2\52\1\u0277\2\uffff\1"+
        "\u0278\1\52\1\uffff\1\u027a\1\u027b\2\uffff\1\u027c\2\52\2\uffff"+
        "\1\52\1\uffff\5\52\1\u0285\1\u0286\1\52\1\u0288\1\u0289\1\u028a"+
        "\1\52\1\u028c\1\u028d\1\u028e\1\uffff\1\u028f\1\uffff\1\u0290\1"+
        "\52\3\uffff\1\52\1\u0293\1\u0294\1\uffff\1\52\1\uffff\1\u0296\1"+
        "\uffff\1\u0297\1\u0298\2\uffff\1\u0299\3\uffff\2\52\1\u029c\1\u029d"+
        "\2\52\1\u02a1\1\52\2\uffff\1\52\3\uffff\1\52\5\uffff\2\52\2\uffff"+
        "\1\52\4\uffff\1\u02a8\1\u02a9\2\uffff\2\52\1\u02ac\1\uffff\1\52"+
        "\1\u02ae\1\52\1\u02b0\1\u02b1\1\52\2\uffff\2\52\1\uffff\1\u02b5"+
        "\1\uffff\1\u02b6\2\uffff\3\52\2\uffff\1\u02ba\2\52\1\uffff\1\u02bd"+
        "\1\u02be\2\uffff";
    static final String DFA12_eofS =
        "\u02bf\uffff";
    static final String DFA12_minS =
        "\1\11\1\141\3\uffff\1\56\1\156\1\154\1\141\1\145\1\144\1\141\1"+
        "\uffff\1\141\1\uffff\1\75\1\150\1\142\2\141\1\145\1\150\1\141\1"+
        "\142\2\uffff\1\141\1\uffff\2\60\1\uffff\2\75\1\157\1\uffff\1\52"+
        "\1\145\1\uffff\1\157\2\uffff\1\0\1\uffff\1\0\1\130\3\uffff\1\151"+
        "\1\143\1\141\1\150\1\142\2\uffff\1\151\1\145\1\144\1\143\1\163\2"+
        "\142\1\143\1\146\1\43\1\166\1\156\1\43\1\160\3\43\1\155\1\154\1"+
        "\144\1\141\1\155\1\141\1\162\1\141\1\163\1\145\2\uffff\1\160\1\145"+
        "\1\43\1\171\1\43\1\145\1\152\2\43\1\164\1\145\1\141\1\151\1\156"+
        "\1\154\1\141\1\144\1\164\1\146\1\164\1\157\1\147\1\162\1\144\2\151"+
        "\2\162\1\144\1\162\1\163\2\43\1\154\1\162\1\156\1\162\7\uffff\1"+
        "\162\3\uffff\1\144\1\163\1\164\5\uffff\1\143\1\166\1\153\1\143\1"+
        "\164\1\141\1\154\1\164\1\151\1\163\1\43\1\157\3\145\1\162\1\145"+
        "\1\147\1\141\1\162\1\164\1\141\1\142\1\156\1\uffff\1\43\1\141\1"+
        "\66\2\145\1\164\1\uffff\1\154\3\uffff\1\145\2\43\1\145\1\162\1\163"+
        "\1\160\1\163\2\162\1\145\1\143\1\145\1\156\1\uffff\1\43\1\uffff"+
        "\1\166\1\145\2\uffff\1\43\1\162\1\144\1\157\1\145\1\151\1\156\1"+
        "\165\1\163\1\147\1\162\2\43\1\154\1\151\1\143\1\162\1\43\2\145\1"+
        "\154\1\151\1\144\1\145\1\150\1\154\1\164\1\43\1\164\1\151\1\43\1"+
        "\141\1\157\1\43\2\uffff\1\145\1\141\1\43\1\143\3\43\1\163\1\157"+
        "\1\162\3\145\3\141\1\146\1\162\1\151\1\43\1\154\1\43\1\uffff\1\162"+
        "\1\156\1\160\1\43\1\141\1\154\1\151\1\154\1\145\1\162\1\165\1\154"+
        "\1\164\1\uffff\1\155\1\147\1\64\1\170\1\162\1\151\1\145\1\43\2\uffff"+
        "\1\146\1\43\1\164\1\141\1\43\1\163\1\145\2\43\1\154\2\43\1\uffff"+
        "\1\141\1\143\1\uffff\1\154\2\43\1\162\1\141\1\163\1\164\1\151\1"+
        "\145\1\154\1\164\2\uffff\1\154\1\156\1\141\1\145\1\uffff\1\143\1"+
        "\43\1\145\1\156\1\43\1\143\1\43\2\145\1\141\1\162\1\uffff\1\165"+
        "\1\163\1\uffff\1\171\1\154\1\162\1\uffff\1\43\1\154\1\141\1\uffff"+
        "\1\164\3\uffff\1\141\1\43\1\141\1\144\1\143\1\162\1\164\1\147\1"+
        "\144\1\154\1\157\1\43\1\143\1\uffff\1\43\1\uffff\1\164\1\144\1\156"+
        "\1\164\1\uffff\1\162\1\43\1\156\1\157\1\43\1\143\1\165\1\154\1\145"+
        "\1\157\1\151\1\146\1\145\2\43\1\151\1\141\1\155\1\uffff\1\141\1"+
        "\uffff\1\43\1\151\1\uffff\1\43\1\156\2\uffff\1\43\2\uffff\1\162"+
        "\1\164\1\151\1\157\1\70\2\uffff\1\144\2\164\2\162\1\43\1\145\2\151"+
        "\1\147\1\154\1\144\1\141\1\uffff\1\141\1\43\1\uffff\1\150\1\164"+
        "\1\uffff\2\43\1\156\1\147\1\141\1\164\1\43\1\165\1\141\1\uffff\1"+
        "\151\1\162\1\151\1\147\1\uffff\1\155\1\165\2\164\2\145\2\43\1\162"+
        "\1\uffff\1\43\1\150\1\uffff\1\43\1\145\1\141\1\43\1\171\1\uffff"+
        "\1\164\1\162\1\uffff\1\141\1\143\1\164\2\43\1\143\1\141\1\162\2"+
        "\uffff\1\164\1\154\1\145\2\165\1\uffff\1\156\1\uffff\1\143\1\uffff"+
        "\1\151\1\43\1\144\1\141\3\43\1\145\1\157\1\145\1\uffff\1\43\2\156"+
        "\1\43\1\154\1\43\1\154\1\156\1\uffff\1\141\1\162\2\uffff\1\164\1"+
        "\163\1\154\1\162\1\uffff\1\164\1\143\1\171\1\172\1\144\1\157\1\145"+
        "\1\43\1\162\1\145\1\171\2\43\2\uffff\1\155\1\uffff\1\145\1\43\1"+
        "\uffff\1\144\1\154\1\uffff\2\43\1\144\2\164\1\43\2\uffff\1\43\1"+
        "\143\1\43\1\145\1\151\1\156\1\154\1\143\1\163\1\171\1\141\1\uffff"+
        "\1\145\1\144\3\uffff\1\162\1\144\1\163\1\uffff\2\164\1\uffff\1\43"+
        "\1\uffff\1\154\1\43\1\162\1\151\3\43\1\151\1\145\1\164\1\43\1\141"+
        "\1\43\1\156\1\43\1\uffff\1\145\1\144\1\43\2\uffff\1\43\1\144\1\uffff"+
        "\2\43\2\uffff\1\43\1\145\1\157\2\uffff\1\145\1\uffff\1\144\1\172"+
        "\3\164\2\43\1\156\3\43\1\165\3\43\1\uffff\1\43\1\uffff\1\43\1\156"+
        "\3\uffff\1\156\2\43\1\uffff\1\164\1\uffff\1\43\1\uffff\2\43\2\uffff"+
        "\1\43\3\uffff\1\144\1\162\2\43\2\141\1\43\1\157\2\uffff\1\164\3"+
        "\uffff\1\143\5\uffff\2\147\2\uffff\1\151\4\uffff\2\43\2\uffff\2"+
        "\164\1\43\1\uffff\1\162\1\43\1\145\2\43\1\157\2\uffff\2\151\1\uffff"+
        "\1\43\1\uffff\1\43\2\uffff\1\156\2\157\2\uffff\1\43\2\156\1\uffff"+
        "\2\43\2\uffff";
    static final String DFA12_maxS =
        "\1\173\1\165\3\uffff\1\56\1\163\1\170\1\157\1\171\1\163\1\157\1"+
        "\uffff\1\165\1\uffff\1\75\1\171\1\166\1\145\1\164\1\171\1\162\1"+
        "\151\1\164\2\uffff\1\165\1\uffff\2\71\1\uffff\1\75\1\76\1\157\1"+
        "\uffff\1\57\1\157\1\uffff\1\157\2\uffff\1\uffff\1\uffff\1\uffff"+
        "\1\170\3\uffff\1\157\1\163\1\141\1\150\1\142\2\uffff\1\164\1\145"+
        "\1\144\1\164\1\163\2\142\1\156\1\163\1\172\1\166\1\156\1\172\1\160"+
        "\3\172\1\155\1\154\1\164\1\141\1\156\1\141\1\162\1\141\1\163\1\145"+
        "\2\uffff\1\160\1\145\1\172\1\171\1\172\1\145\1\152\2\172\1\164\1"+
        "\145\1\161\1\151\1\156\1\162\1\141\1\162\1\164\1\146\1\164\1\157"+
        "\1\147\1\162\1\164\2\151\2\162\1\163\1\162\1\163\2\172\1\156\1\162"+
        "\1\156\1\162\7\uffff\1\162\3\uffff\1\144\1\163\1\164\5\uffff\1\164"+
        "\1\166\1\153\1\143\1\164\1\141\1\154\1\164\1\151\1\163\1\172\1\157"+
        "\3\145\1\162\1\145\1\147\1\141\1\162\1\164\1\141\1\142\1\156\1\uffff"+
        "\1\172\1\141\3\145\1\164\1\uffff\1\154\3\uffff\1\145\2\172\1\145"+
        "\1\162\1\164\1\160\1\163\2\162\1\145\1\143\1\145\1\156\1\uffff\1"+
        "\172\1\uffff\1\166\1\145\2\uffff\1\172\1\162\1\154\1\157\1\145\1"+
        "\151\1\156\1\165\1\163\1\147\1\162\2\172\1\154\1\151\1\143\1\162"+
        "\1\172\2\145\1\154\1\151\1\144\1\145\1\150\1\154\1\164\1\172\1\164"+
        "\1\151\1\172\1\141\1\164\1\172\2\uffff\1\145\1\141\1\172\1\143\3"+
        "\172\1\163\1\157\1\162\3\145\1\141\1\145\1\141\1\146\1\162\1\151"+
        "\1\172\1\154\1\172\1\uffff\2\162\1\160\1\172\1\141\1\154\1\167\1"+
        "\154\1\145\1\162\1\165\1\154\1\164\1\uffff\1\155\1\162\1\64\1\170"+
        "\1\162\1\151\1\145\1\172\2\uffff\1\146\1\172\1\164\1\141\1\172\1"+
        "\163\1\145\2\172\1\154\2\172\1\uffff\1\141\1\143\1\uffff\1\162\2"+
        "\172\1\162\1\141\1\163\1\164\1\151\1\145\1\154\1\164\2\uffff\1\154"+
        "\1\156\1\141\1\145\1\uffff\1\143\1\172\1\145\1\156\1\172\1\163\1"+
        "\172\2\145\1\141\1\162\1\uffff\1\165\1\163\1\uffff\1\171\1\154\1"+
        "\162\1\uffff\1\172\1\154\1\141\1\uffff\1\164\3\uffff\1\141\1\172"+
        "\1\141\1\144\1\143\1\162\1\164\1\147\1\144\1\154\1\157\1\172\1\163"+
        "\1\uffff\1\172\1\uffff\1\164\1\144\1\156\1\164\1\uffff\1\162\1\172"+
        "\1\156\1\157\1\172\1\143\1\165\1\154\1\145\1\157\1\151\1\146\1\145"+
        "\2\172\1\151\1\141\1\155\1\uffff\1\141\1\uffff\1\172\1\151\1\uffff"+
        "\1\172\1\156\2\uffff\1\172\2\uffff\1\162\1\164\1\151\1\157\1\70"+
        "\2\uffff\1\144\2\164\2\162\1\172\1\145\2\151\1\147\1\154\1\144\1"+
        "\141\1\uffff\1\141\1\172\1\uffff\1\150\1\164\1\uffff\2\172\1\156"+
        "\1\147\1\141\1\164\1\172\1\165\1\141\1\uffff\1\154\1\162\1\151\1"+
        "\147\1\uffff\1\155\1\165\2\164\2\145\2\172\1\162\1\uffff\1\172\1"+
        "\150\1\uffff\1\172\1\145\1\141\1\172\1\171\1\uffff\1\164\1\162\1"+
        "\uffff\1\141\1\143\1\164\2\172\1\143\1\141\1\162\2\uffff\1\164\1"+
        "\154\1\145\2\165\1\uffff\1\156\1\uffff\1\143\1\uffff\1\151\1\172"+
        "\1\144\1\141\3\172\1\145\1\157\1\145\1\uffff\1\172\2\156\1\172\1"+
        "\154\1\172\1\154\1\156\1\uffff\1\141\1\162\2\uffff\1\164\1\163\1"+
        "\154\1\162\1\uffff\1\164\1\143\1\171\1\172\1\144\1\157\1\145\1\172"+
        "\1\162\1\145\1\171\2\172\2\uffff\1\155\1\uffff\1\145\1\172\1\uffff"+
        "\1\144\1\154\1\uffff\2\172\1\144\2\164\1\172\2\uffff\1\172\1\143"+
        "\1\172\1\145\1\151\1\156\1\154\1\143\1\163\1\171\1\141\1\uffff\1"+
        "\145\1\144\3\uffff\1\162\1\144\1\163\1\uffff\2\164\1\uffff\1\172"+
        "\1\uffff\1\154\1\172\1\162\1\151\3\172\1\151\1\145\1\164\1\172\1"+
        "\141\1\172\1\156\1\172\1\uffff\1\145\1\144\1\172\2\uffff\1\172\1"+
        "\144\1\uffff\2\172\2\uffff\1\172\1\145\1\157\2\uffff\1\145\1\uffff"+
        "\1\144\1\172\3\164\2\172\1\156\3\172\1\165\3\172\1\uffff\1\172\1"+
        "\uffff\1\172\1\156\3\uffff\1\156\2\172\1\uffff\1\164\1\uffff\1\172"+
        "\1\uffff\2\172\2\uffff\1\172\3\uffff\1\144\1\162\2\172\1\141\1\163"+
        "\1\172\1\157\2\uffff\1\164\3\uffff\1\143\5\uffff\2\147\2\uffff\1"+
        "\151\4\uffff\2\172\2\uffff\2\164\1\172\1\uffff\1\162\1\172\1\145"+
        "\2\172\1\157\2\uffff\2\151\1\uffff\1\172\1\uffff\1\172\2\uffff\1"+
        "\156\2\157\2\uffff\1\172\2\156\1\uffff\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\4\7\uffff\1\22\1\uffff\1\25\11\uffff\1\65\1"+
        "\66\1\uffff\1\73\2\uffff\1\101\3\uffff\1\116\2\uffff\1\125\1\uffff"+
        "\1\u0094\1\u0095\1\uffff\1\u0097\2\uffff\1\u009c\1\u009e\1\u00a0"+
        "\5\uffff\1\57\1\5\33\uffff\1\126\1\26\45\uffff\1\77\1\100\1\107"+
        "\1\104\1\106\1\110\1\105\1\uffff\1\u009d\1\u009f\1\117\3\uffff\1"+
        "\u0096\1\u009a\1\u0098\1\u0099\1\u009b\30\uffff\1\140\6\uffff\1"+
        "\111\1\uffff\1\112\1\132\1\151\16\uffff\1\142\1\uffff\1\31\2\uffff"+
        "\1\114\1\150\42\uffff\1\113\1\153\26\uffff\1\10\15\uffff\1\120\10"+
        "\uffff\1\102\1\103\14\uffff\1\145\2\uffff\1\157\13\uffff\1\123\1"+
        "\124\4\uffff\1\71\13\uffff\1\75\2\uffff\1\122\3\uffff\1\154\3\uffff"+
        "\1\141\1\uffff\1\167\1\115\1\121\15\uffff\1\6\1\uffff\1\12\4\uffff"+
        "\1\134\22\uffff\1\17\1\uffff\1\166\2\uffff\1\40\2\uffff\1\51\1\70"+
        "\1\uffff\1\27\1\133\5\uffff\1\33\1\u008c\15\uffff\1\44\2\uffff\1"+
        "\47\2\uffff\1\144\11\uffff\1\72\4\uffff\1\130\11\uffff\1\54\2\uffff"+
        "\1\136\5\uffff\1\23\2\uffff\1\u0081\10\uffff\1\46\1\20\5\uffff\1"+
        "\24\1\uffff\1\30\1\uffff\1\160\12\uffff\1\152\10\uffff\1\131\2\uffff"+
        "\1\137\1\u008d\4\uffff\1\64\15\uffff\1\63\1\174\1\uffff\1\u0087"+
        "\2\uffff\1\164\2\uffff\1\146\6\uffff\1\35\1\143\13\uffff\1\74\2"+
        "\uffff\1\32\1\67\1\135\3\uffff\1\34\2\uffff\1\60\1\uffff\1\u008e"+
        "\17\uffff\1\1\3\uffff\1\u0089\1\7\2\uffff\1\21\2\uffff\1\11\1\45"+
        "\3\uffff\1\u008f\1\162\1\uffff\1\43\17\uffff\1\177\1\uffff\1\50"+
        "\2\uffff\1\55\1\u0080\1\163\3\uffff\1\147\1\uffff\1\170\1\uffff"+
        "\1\171\2\uffff\1\u008b\1\13\1\uffff\1\36\1\165\1\53\10\uffff\1\u0093"+
        "\1\37\1\uffff\1\172\1\173\1\161\1\uffff\1\u0092\1\41\1\42\1\176"+
        "\1\52\2\uffff\1\76\1\u0082\1\uffff\1\155\1\156\1\u0088\1\u008a\2"+
        "\uffff\1\15\1\127\3\uffff\1\u0090\6\uffff\1\14\1\u0084\2\uffff\1"+
        "\u0091\1\uffff\1\56\1\uffff\1\62\1\61\3\uffff\1\u0083\1\175\3\uffff"+
        "\1\u0086\2\uffff\1\u0085\1\16";
    static final String DFA12_specialS =
        "\51\uffff\1\1\1\uffff\1\0\u0293\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\57\1\uffff\2\57\22\uffff\1\57\1\uffff\1\53\1\47\2\uffff"+
            "\1\45\1\51\1\2\1\3\1\42\1\34\1\14\1\35\1\5\1\43\1\54\11\55\1"+
            "\17\1\4\1\40\1\16\1\37\1\uffff\1\36\32\52\1\30\1\50\1\31\1\33"+
            "\1\52\1\uffff\1\27\1\24\1\15\1\11\1\7\1\32\1\46\1\52\1\12\2"+
            "\52\1\10\1\44\1\13\1\21\1\1\1\52\1\22\1\23\1\20\1\6\1\26\1\25"+
            "\1\41\2\52\1\56",
            "\1\61\1\uffff\1\63\10\uffff\1\62\5\uffff\1\60\2\uffff\1\64",
            "",
            "",
            "",
            "\1\65",
            "\1\67\4\uffff\1\70",
            "\1\73\1\uffff\1\71\11\uffff\1\72",
            "\1\75\7\uffff\1\74\5\uffff\1\76",
            "\1\77\3\uffff\1\101\5\uffff\1\100\11\uffff\1\102",
            "\1\107\1\uffff\1\106\6\uffff\1\104\1\103\4\uffff\1\105",
            "\1\110\3\uffff\1\113\3\uffff\1\111\5\uffff\1\112",
            "",
            "\1\120\2\uffff\1\121\3\uffff\1\117\3\uffff\1\115\2\uffff\1"+
            "\114\5\uffff\1\116",
            "",
            "\1\122",
            "\1\125\6\uffff\1\126\2\uffff\1\127\6\uffff\1\124",
            "\1\132\3\uffff\1\130\5\uffff\1\131\1\uffff\1\134\3\uffff\1"+
            "\133\2\uffff\1\135\1\136",
            "\1\140\3\uffff\1\137",
            "\1\146\3\uffff\1\145\2\uffff\1\142\1\141\3\uffff\1\143\6\uffff"+
            "\1\144",
            "\1\151\11\uffff\1\150\11\uffff\1\147",
            "\1\154\1\153\5\uffff\1\152\2\uffff\1\155",
            "\1\156\7\uffff\1\157",
            "\1\162\13\uffff\1\160\3\uffff\1\161\1\163\1\164",
            "",
            "",
            "\1\170\7\uffff\1\165\5\uffff\1\166\5\uffff\1\167",
            "",
            "\1\54\11\55",
            "\1\54\11\55",
            "",
            "\1\173",
            "\1\175\1\176",
            "\1\u0080",
            "",
            "\1\u0081\4\uffff\1\u0082",
            "\1\u0085\11\uffff\1\u0084",
            "",
            "\1\u0086",
            "",
            "",
            "\0\u0088",
            "",
            "\0\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "",
            "",
            "",
            "\1\u008d\5\uffff\1\u008c",
            "\1\u008e\17\uffff\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "\1\u0093\12\uffff\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0099\14\uffff\1\u0097\3\uffff\1\u0098",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009e\12\uffff\1\u009d",
            "\1\u00a1\11\uffff\1\u009f\2\uffff\1\u00a0",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\24\52\1\u00a2\1\52\1\u00a3\3\52",
            "\1\u00a5",
            "\1\u00a6",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\3\52\1\u00a8\3\52\1\u00a9\1\u00aa\12"+
            "\52\1\u00a7\6\52",
            "\1\u00ac",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b3\17\uffff\1\u00b2",
            "\1\u00b4",
            "\1\u00b6\1\u00b5",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u00bf",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u00c1",
            "\1\u00c2",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7\1\uffff\1\u00c8\3\uffff\1\u00ca\1\uffff\1\u00cb\6"+
            "\uffff\1\u00c9\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00d0\2\uffff\1\u00cf\2\uffff\1\u00d1",
            "\1\u00d2",
            "\1\u00d4\12\uffff\1\u00d5\2\uffff\1\u00d3",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc\17\uffff\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e3\16\uffff\1\u00e2",
            "\1\u00e4",
            "\1\u00e5",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\14\52\1\u00e6\15\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u00e9\1\uffff\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ee",
            "",
            "",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f3\3\uffff\1\u00f2\10\uffff\1\u00f5\3\uffff\1\u00f4",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u010e",
            "\1\u0110\56\uffff\1\u010f",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "\1\u0114",
            "",
            "",
            "",
            "\1\u0115",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0125",
            "\1\u0126",
            "",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0128",
            "\1\u012a\7\uffff\1\u0129",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\1\u0144\7\52\1\u0143\21\52",
            "\1\u0146",
            "\1\u0147",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0149",
            "\1\u014a\4\uffff\1\u014b",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u014d",
            "\1\u014e",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\26\52\1\u014f\3\52",
            "\1\u0151",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c\3\uffff\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0163",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0165",
            "\1\u0166\3\uffff\1\u0167",
            "\1\u0168",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c\15\uffff\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "",
            "\1\u0174",
            "\1\u0176\12\uffff\1\u0175",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u017d",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u017f",
            "\1\u0180",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0182",
            "\1\u0183",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0186",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0189",
            "\1\u018a",
            "",
            "\1\u018c\5\uffff\1\u018b",
            "\2\52\10\uffff\1\52\2\uffff\4\52\1\u018d\5\52\7\uffff\32\52"+
            "\1\uffff\1\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "",
            "",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "",
            "\1\u019c",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u019e",
            "\1\u019f",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01a1\17\uffff\1\u01a2",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\1\u01a9",
            "",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01ae",
            "\1\u01af",
            "",
            "\1\u01b0",
            "",
            "",
            "",
            "\1\u01b1",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01bd\17\uffff\1\u01be",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "",
            "\1\u01c4",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01c6",
            "\1\u01c7",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "",
            "\1\u01d6",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\21\52\1\u01d7\10\52",
            "\1\u01d9",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01db",
            "",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "",
            "",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "",
            "\1\u01ef",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u01f1",
            "\1\u01f2",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01fa",
            "\1\u01fb",
            "",
            "\1\u01fd\2\uffff\1\u01fc",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0209",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u020b",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\22\52\1\u020c\7\52",
            "\1\u020e",
            "\1\u020f",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0211",
            "",
            "\1\u0212",
            "\1\u0213",
            "",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "",
            "",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "",
            "\1\u0221",
            "",
            "\1\u0222",
            "",
            "\1\u0223",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0225",
            "\1\u0226",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u022e",
            "\1\u022f",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0231",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0233",
            "\1\u0234",
            "",
            "\1\u0235",
            "\1\u0236",
            "",
            "",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u0248",
            "",
            "\1\u0249",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u024b",
            "\1\u024c",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0254",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "",
            "\1\u025e",
            "\1\u025f",
            "",
            "",
            "",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "",
            "\1\u0263",
            "\1\u0264",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0266",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0268",
            "\1\u0269",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0271",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0273",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0275",
            "\1\u0276",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0279",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u027d",
            "\1\u027e",
            "",
            "",
            "\1\u027f",
            "",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0287",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u028b",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u0291",
            "",
            "",
            "",
            "\1\u0292",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0295",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u029a",
            "\1\u029b",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u029e",
            "\1\u029f\21\uffff\1\u02a0",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u02a2",
            "",
            "",
            "\1\u02a3",
            "",
            "",
            "",
            "\1\u02a4",
            "",
            "",
            "",
            "",
            "",
            "\1\u02a5",
            "\1\u02a6",
            "",
            "",
            "\1\u02a7",
            "",
            "",
            "",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u02aa",
            "\1\u02ab",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u02ad",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u02af",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u02b2",
            "",
            "",
            "\1\u02b3",
            "\1\u02b4",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u02bb",
            "\1\u02bc",
            "",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "\2\52\10\uffff\1\52\2\uffff\12\52\7\uffff\32\52\1\uffff\1"+
            "\52\2\uffff\1\52\1\uffff\32\52",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | SLASH | QUOTE | ID | DOUBLEQUOTE | DQVALUE | QVALUE | HEX | INT | COMMENT | MORECOMMENT | LINE_COMMENT | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( ((LA12_43>='\u0000' && LA12_43<='\uFFFF')) ) {s = 138;}

                        else s = 137;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_41 = input.LA(1);

                        s = -1;
                        if ( ((LA12_41>='\u0000' && LA12_41<='\uFFFF')) ) {s = 136;}

                        else s = 135;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}