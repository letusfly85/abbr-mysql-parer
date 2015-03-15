// $ANTLR 3.4 MySQLBase.g 2015-03-15 15:54:09

package abbr.documentation.sqlscript.parser;

import java.util.Arrays;
import java.util.List;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySQLBase extends Lexer {
    public static final int EOF=-1;
    public static final int BIN_NUM=4;
    public static final int DECIMAL_NUM=5;
    public static final int DIGIT=6;
    public static final int Exponent=7;
    public static final int FLOAT_NUM=8;
    public static final int HEX_DIGIT=9;
    public static final int HEX_NUM=10;
    public static final int IDENT=11;
    public static final int IDENT_QUOTED=12;
    public static final int LONG_NUM=13;
    public static final int ML_COMMENT=14;
    public static final int NCHAR_STRING=15;
    public static final int NEWLINE=16;
    public static final int NUM=17;
    public static final int NUM_literal=18;
    public static final int SL_COMMENT=19;
    public static final int TEXT_STRING=20;
    public static final int ULONGLONG_NUM=21;
    public static final int UNSIGNED_INTEGER=22;
    public static final int WS=23;


    	public static final int COMMENTS_CHANNEL = 5;
    	
    	/*
    	** Calc type of integer; long integer, longlong integer or real.
    	** Returns smallest type that match the string.
    	** When using unsigned long long values the result is converted to a real
    	** because else they will be unexpected sign changes because all calculation
    	** is done with longlong or double.
    	*/

    	static final String long_str="2147483647";
    	static final int long_len=10;
    	static final String signed_long_str="-2147483648";
    	static final String longlong_str="9223372036854775807";
    	static final int longlong_len=19;
    	static final String signed_longlong_str="-9223372036854775808";
    	static final int signed_longlong_len=19;
    	static final String unsigned_longlong_str="18446744073709551615";
    	static final int unsigned_longlong_len=20;

    	public static int getIntType(String str)
    	{
    		char ch;
    		int i = 0;
    		int length;

    		ch = str.charAt(i);
    		length = str.length();

    		if (length < long_len) // quick normal case
    			return NUM;

    		while (ch == '0' && length > 0) {
    			ch = str.charAt(++i);
    			length--;
    		}

    		if (length < long_len)
    			return NUM;

    		int smaller, bigger;
    		String cmp;
    		if (length == long_len) {
    			cmp = long_str;
    			smaller = NUM;
    			bigger = LONG_NUM;
    		} else if (length < longlong_len)
    			return LONG_NUM;
    		else if (length > longlong_len) {
    			if (length > unsigned_longlong_len)
    				return DECIMAL_NUM;
    			cmp = unsigned_longlong_str;
    			smaller = ULONGLONG_NUM;
    			bigger = DECIMAL_NUM;
    		} else {
    			cmp = longlong_str;
    			smaller = LONG_NUM;
    			bigger = ULONGLONG_NUM;
    		}

    		int j = 0;
    		while (j < cmp.length() && cmp.charAt(j++) == str.charAt(i++))
    			;
    		return cmp.charAt(j - 1) == str.charAt(i - 1) ? smaller : bigger;
    	}	
    	
    	public static int getNegativeIntType(String str)
    	{
    		char ch;
    		int i = 0;
    		int length;

    		ch = str.charAt(i);
    		length = str.length();

    		if (length < long_len) // quick normal case
    			return NUM;

    		while (ch == '0' && length > 0) {
    			ch = str.charAt(++i);
    			length--;
    		}

    		if (length < long_len)
    			return NUM;

    		int smaller, bigger;
    		String cmp;

    		if (length == long_len) {
    			cmp = signed_long_str.substring(1);
    			smaller = NUM; // If <= signed_long_str
    			bigger = LONG_NUM; // If >= signed_long_str
    		} else if (length < signed_longlong_len)
    			return LONG_NUM;
    		else if (length > signed_longlong_len)
    			return DECIMAL_NUM;
    		else {
    			cmp = signed_longlong_str.substring(1);
    			smaller = LONG_NUM; // If <= signed_longlong_str
    			bigger = DECIMAL_NUM;
    		}

    		int j = 0;
    		while (j < cmp.length() && cmp.charAt(j++) == str.charAt(i++))
    			;
    		return cmp.charAt(j - 1) == str.charAt(i - 1) ? smaller : bigger;
    	}	


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MySQLBase() {} 
    public MySQLBase(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MySQLBase(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "MySQLBase.g"; }

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // MySQLBase.g:123:7: ( '0' .. '9' )
            // MySQLBase.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // MySQLBase.g:128:10: ( ( 'a' .. 'f' | 'A' .. 'F' | DIGIT ) )
            // MySQLBase.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "UNSIGNED_INTEGER"
    public final void mUNSIGNED_INTEGER() throws RecognitionException {
        try {
            // MySQLBase.g:133:18: ( ( DIGIT )+ )
            // MySQLBase.g:134:2: ( DIGIT )+
            {
            // MySQLBase.g:134:2: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MySQLBase.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNSIGNED_INTEGER"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // MySQLBase.g:138:9: ( ( 'e' | 'E' ) ( '+' | '-' )? UNSIGNED_INTEGER )
            // MySQLBase.g:139:2: ( 'e' | 'E' ) ( '+' | '-' )? UNSIGNED_INTEGER
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // MySQLBase.g:139:12: ( '+' | '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // MySQLBase.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            mUNSIGNED_INTEGER(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            // MySQLBase.g:143:13: ()
            // MySQLBase.g:143:15: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "LONG_NUM"
    public final void mLONG_NUM() throws RecognitionException {
        try {
            // MySQLBase.g:144:18: ()
            // MySQLBase.g:144:20: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LONG_NUM"

    // $ANTLR start "ULONGLONG_NUM"
    public final void mULONGLONG_NUM() throws RecognitionException {
        try {
            // MySQLBase.g:145:23: ()
            // MySQLBase.g:145:25: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ULONGLONG_NUM"

    // $ANTLR start "DECIMAL_NUM"
    public final void mDECIMAL_NUM() throws RecognitionException {
        try {
            // MySQLBase.g:146:21: ()
            // MySQLBase.g:146:23: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL_NUM"

    // $ANTLR start "FLOAT_NUM"
    public final void mFLOAT_NUM() throws RecognitionException {
        try {
            // MySQLBase.g:147:19: ()
            // MySQLBase.g:147:21: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT_NUM"

    // $ANTLR start "NUM_literal"
    public final void mNUM_literal() throws RecognitionException {
        try {
            int _type = NUM_literal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken i=null;

            // MySQLBase.g:150:12: ( ( '-' | '+' )? UNSIGNED_INTEGER '.' ( UNSIGNED_INTEGER )? ( Exponent |) | ( '-' | '+' )? '.' UNSIGNED_INTEGER ( Exponent |) | ( '-' | '+' )? ( '0' .. '9' )+ Exponent | '-' i= UNSIGNED_INTEGER | ( '+' )? i= UNSIGNED_INTEGER )
            int alt11=5;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // MySQLBase.g:151:12: ( '-' | '+' )? UNSIGNED_INTEGER '.' ( UNSIGNED_INTEGER )? ( Exponent |)
                    {
                    // MySQLBase.g:151:12: ( '-' | '+' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='+'||LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // MySQLBase.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    mUNSIGNED_INTEGER(); 


                    match('.'); 

                    // MySQLBase.g:151:44: ( UNSIGNED_INTEGER )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // MySQLBase.g:151:44: UNSIGNED_INTEGER
                            {
                            mUNSIGNED_INTEGER(); 


                            }
                            break;

                    }


                    // MySQLBase.g:151:62: ( Exponent |)
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    else {
                        alt5=2;
                    }
                    switch (alt5) {
                        case 1 :
                            // MySQLBase.g:151:63: Exponent
                            {
                            mExponent(); 


                            _type = FLOAT_NUM; 

                            }
                            break;
                        case 2 :
                            // MySQLBase.g:151:96: 
                            {
                            _type = DECIMAL_NUM; 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // MySQLBase.g:152:9: ( '-' | '+' )? '.' UNSIGNED_INTEGER ( Exponent |)
                    {
                    // MySQLBase.g:152:9: ( '-' | '+' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // MySQLBase.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    match('.'); 

                    mUNSIGNED_INTEGER(); 


                    // MySQLBase.g:152:41: ( Exponent |)
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    else {
                        alt7=2;
                    }
                    switch (alt7) {
                        case 1 :
                            // MySQLBase.g:152:42: Exponent
                            {
                            mExponent(); 


                            _type = FLOAT_NUM; 

                            }
                            break;
                        case 2 :
                            // MySQLBase.g:152:75: 
                            {
                            _type = DECIMAL_NUM;  

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // MySQLBase.g:153:9: ( '-' | '+' )? ( '0' .. '9' )+ Exponent
                    {
                    // MySQLBase.g:153:9: ( '-' | '+' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // MySQLBase.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // MySQLBase.g:153:20: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // MySQLBase.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    mExponent(); 


                    _type = FLOAT_NUM; 

                    }
                    break;
                case 4 :
                    // MySQLBase.g:154:5: '-' i= UNSIGNED_INTEGER
                    {
                    match('-'); 

                    int iStart253 = getCharIndex();
                    int iStartLine253 = getLine();
                    int iStartCharPos253 = getCharPositionInLine();
                    mUNSIGNED_INTEGER(); 
                    i = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, iStart253, getCharIndex()-1);
                    i.setLine(iStartLine253);
                    i.setCharPositionInLine(iStartCharPos253);


                     _type = getNegativeIntType((i!=null?i.getText():null)); 

                    }
                    break;
                case 5 :
                    // MySQLBase.g:155:4: ( '+' )? i= UNSIGNED_INTEGER
                    {
                    // MySQLBase.g:155:4: ( '+' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='+') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // MySQLBase.g:155:4: '+'
                            {
                            match('+'); 

                            }
                            break;

                    }


                    int iStart266 = getCharIndex();
                    int iStartLine266 = getLine();
                    int iStartCharPos266 = getCharPositionInLine();
                    mUNSIGNED_INTEGER(); 
                    i = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, iStart266, getCharIndex()-1);
                    i.setLine(iStartLine266);
                    i.setCharPositionInLine(iStartCharPos266);


                     _type = getIntType((i!=null?i.getText():null)); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM_literal"

    // $ANTLR start "BIN_NUM"
    public final void mBIN_NUM() throws RecognitionException {
        try {
            int _type = BIN_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySQLBase.g:158:9: ( ( 'B' | 'b' ) '\\'' ( '0' | '1' )+ '\\'' )
            // MySQLBase.g:159:2: ( 'B' | 'b' ) '\\'' ( '0' | '1' )+ '\\''
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

            // MySQLBase.g:159:19: ( '0' | '1' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '1')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // MySQLBase.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BIN_NUM"

    // $ANTLR start "HEX_NUM"
    public final void mHEX_NUM() throws RecognitionException {
        try {
            int _type = HEX_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySQLBase.g:162:9: ( ( 'X' | 'x' ) '\\'' ( HEX_DIGIT HEX_DIGIT )+ '\\'' )
            // MySQLBase.g:163:2: ( 'X' | 'x' ) '\\'' ( HEX_DIGIT HEX_DIGIT )+ '\\''
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

            // MySQLBase.g:163:19: ( HEX_DIGIT HEX_DIGIT )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'F')||(LA13_0 >= 'a' && LA13_0 <= 'f')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // MySQLBase.g:163:22: HEX_DIGIT HEX_DIGIT
            	    {
            	    mHEX_DIGIT(); 


            	    mHEX_DIGIT(); 


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_NUM"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySQLBase.g:166:4: ( ( ' ' | '\\r' | '\\t' | '\\n' )+ )
            // MySQLBase.g:166:6: ( ' ' | '\\r' | '\\t' | '\\n' )+
            {
            // MySQLBase.g:166:6: ( ' ' | '\\r' | '\\t' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // MySQLBase.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySQLBase.g:170:2: ( ( '--' | '#' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // MySQLBase.g:170:4: ( '--' | '#' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            // MySQLBase.g:170:4: ( '--' | '#' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='-') ) {
                alt15=1;
            }
            else if ( (LA15_0=='#') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // MySQLBase.g:170:5: '--'
                    {
                    match("--"); 



                    }
                    break;
                case 2 :
                    // MySQLBase.g:170:10: '#'
                    {
                    match('#'); 

                    }
                    break;

            }


            // MySQLBase.g:170:15: (~ ( '\\n' | '\\r' ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\t')||(LA16_0 >= '\u000B' && LA16_0 <= '\f')||(LA16_0 >= '\u000E' && LA16_0 <= '\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // MySQLBase.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // MySQLBase.g:170:29: ( '\\r' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // MySQLBase.g:170:29: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=COMMENTS_CHANNEL;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySQLBase.g:174:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // MySQLBase.g:174:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // MySQLBase.g:174:9: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1 >= '\u0000' && LA18_1 <= '.')||(LA18_1 >= '0' && LA18_1 <= '\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0 >= '\u0000' && LA18_0 <= ')')||(LA18_0 >= '+' && LA18_0 <= '\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // MySQLBase.g:174:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            match("*/"); 



            _channel=COMMENTS_CHANNEL;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "NCHAR_STRING"
    public final void mNCHAR_STRING() throws RecognitionException {
        try {
            int _type = NCHAR_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySQLBase.g:180:13: ( ( 'N' | 'n' ) ( '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\'' ) )
            // MySQLBase.g:181:2: ( 'N' | 'n' ) ( '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\'' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // MySQLBase.g:182:4: ( '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\'' )
            // MySQLBase.g:182:5: '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\''
            {
            match('\''); 

            // MySQLBase.g:183:5: ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\'') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='\'') ) {
                        alt19=2;
                    }


                }
                else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\t')||(LA19_0 >= '\u000B' && LA19_0 <= '\f')||(LA19_0 >= '\u000E' && LA19_0 <= '&')||(LA19_0 >= '(' && LA19_0 <= '\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // MySQLBase.g:184:31: ~ ( '\\'' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // MySQLBase.g:184:56: '\\'' '\\''
            	    {
            	    match('\''); 

            	    match('\''); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match('\''); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NCHAR_STRING"

    // $ANTLR start "TEXT_STRING"
    public final void mTEXT_STRING() throws RecognitionException {
        try {
            int _type = TEXT_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySQLBase.g:190:12: ( ( '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\'' ) )
            // MySQLBase.g:191:4: ( '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\'' )
            {
            // MySQLBase.g:191:4: ( '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\'' )
            // MySQLBase.g:191:5: '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\''
            {
            match('\''); 

            // MySQLBase.g:192:5: ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\'') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='\'') ) {
                        alt20=2;
                    }


                }
                else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\t')||(LA20_0 >= '\u000B' && LA20_0 <= '\f')||(LA20_0 >= '\u000E' && LA20_0 <= '&')||(LA20_0 >= '(' && LA20_0 <= '\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // MySQLBase.g:193:31: ~ ( '\\'' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // MySQLBase.g:193:56: '\\'' '\\''
            	    {
            	    match('\''); 

            	    match('\''); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match('\''); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT_STRING"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // MySQLBase.g:200:9: ( ( '\\r' )? '\\n' )
            // MySQLBase.g:200:11: ( '\\r' )? '\\n'
            {
            // MySQLBase.g:200:11: ( '\\r' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // MySQLBase.g:200:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "IDENT_QUOTED"
    public final void mIDENT_QUOTED() throws RecognitionException {
        try {
            int _type = IDENT_QUOTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySQLBase.g:204:13: ( '`' ( '$' | '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ '`' )
            // MySQLBase.g:205:2: '`' ( '$' | '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ '`'
            {
            match('`'); 

            // MySQLBase.g:205:6: ( '$' | '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='$'||(LA22_0 >= '0' && LA22_0 <= '9')||(LA22_0 >= 'A' && LA22_0 <= 'Z')||LA22_0=='_'||(LA22_0 >= 'a' && LA22_0 <= 'z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // MySQLBase.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT_QUOTED"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySQLBase.g:209:7: ( ( '$' | '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // MySQLBase.g:209:9: ( '$' | '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            // MySQLBase.g:209:9: ( '$' | '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='$'||(LA23_0 >= '0' && LA23_0 <= '9')||(LA23_0 >= 'A' && LA23_0 <= 'Z')||LA23_0=='_'||(LA23_0 >= 'a' && LA23_0 <= 'z')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // MySQLBase.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    public void mTokens() throws RecognitionException {
        // MySQLBase.g:1:8: ( NUM_literal | BIN_NUM | HEX_NUM | WS | SL_COMMENT | ML_COMMENT | NCHAR_STRING | TEXT_STRING | IDENT_QUOTED | IDENT )
        int alt24=10;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // MySQLBase.g:1:10: NUM_literal
                {
                mNUM_literal(); 


                }
                break;
            case 2 :
                // MySQLBase.g:1:22: BIN_NUM
                {
                mBIN_NUM(); 


                }
                break;
            case 3 :
                // MySQLBase.g:1:30: HEX_NUM
                {
                mHEX_NUM(); 


                }
                break;
            case 4 :
                // MySQLBase.g:1:38: WS
                {
                mWS(); 


                }
                break;
            case 5 :
                // MySQLBase.g:1:41: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 6 :
                // MySQLBase.g:1:52: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 7 :
                // MySQLBase.g:1:63: NCHAR_STRING
                {
                mNCHAR_STRING(); 


                }
                break;
            case 8 :
                // MySQLBase.g:1:76: TEXT_STRING
                {
                mTEXT_STRING(); 


                }
                break;
            case 9 :
                // MySQLBase.g:1:88: IDENT_QUOTED
                {
                mIDENT_QUOTED(); 


                }
                break;
            case 10 :
                // MySQLBase.g:1:101: IDENT
                {
                mIDENT(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA11_eotS =
        "\2\uffff\1\6\2\uffff\1\11\4\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\53\2\56\1\uffff\2\56\4\uffff";
    static final String DFA11_maxS =
        "\2\71\1\145\1\uffff\1\71\1\145\4\uffff";
    static final String DFA11_acceptS =
        "\3\uffff\1\2\2\uffff\1\5\1\1\1\3\1\4";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\4\1\uffff\1\1\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\5",
            "\1\7\1\uffff\12\2\13\uffff\1\10\37\uffff\1\10",
            "",
            "\1\3\1\uffff\12\2",
            "\1\7\1\uffff\12\5\13\uffff\1\10\37\uffff\1\10",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "150:1: NUM_literal : ( ( '-' | '+' )? UNSIGNED_INTEGER '.' ( UNSIGNED_INTEGER )? ( Exponent |) | ( '-' | '+' )? '.' UNSIGNED_INTEGER ( Exponent |) | ( '-' | '+' )? ( '0' .. '9' )+ Exponent | '-' i= UNSIGNED_INTEGER | ( '+' )? i= UNSIGNED_INTEGER );";
        }
    }
    static final String DFA24_eotS =
        "\2\uffff\1\3\1\uffff\2\14\3\uffff\1\14\3\uffff\1\14\3\uffff\1\3";
    static final String DFA24_eofS =
        "\22\uffff";
    static final String DFA24_minS =
        "\1\11\1\55\1\44\1\uffff\2\47\3\uffff\1\47\3\uffff\1\53\3\uffff\1"+
        "\44";
    static final String DFA24_maxS =
        "\1\172\1\71\1\172\1\uffff\2\47\3\uffff\1\47\3\uffff\1\71\3\uffff"+
        "\1\172";
    static final String DFA24_acceptS =
        "\3\uffff\1\1\2\uffff\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\uffff"+
        "\1\2\1\3\1\7\1\uffff";
    static final String DFA24_specialS =
        "\22\uffff}>";
    static final String[] DFA24_transitionS = {
            "\2\6\2\uffff\1\6\22\uffff\1\6\2\uffff\1\7\1\14\2\uffff\1\12"+
            "\3\uffff\1\3\1\uffff\1\1\1\3\1\10\12\2\7\uffff\1\14\1\4\13\14"+
            "\1\11\11\14\1\5\2\14\4\uffff\1\14\1\13\1\14\1\4\13\14\1\11\11"+
            "\14\1\5\2\14",
            "\1\7\1\3\1\uffff\12\3",
            "\1\14\13\uffff\12\2\7\uffff\4\14\1\15\25\14\4\uffff\1\14\1"+
            "\uffff\4\14\1\15\25\14",
            "",
            "\1\16",
            "\1\17",
            "",
            "",
            "",
            "\1\20",
            "",
            "",
            "",
            "\1\3\1\uffff\1\3\2\uffff\12\21",
            "",
            "",
            "",
            "\1\14\13\uffff\12\21\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( NUM_literal | BIN_NUM | HEX_NUM | WS | SL_COMMENT | ML_COMMENT | NCHAR_STRING | TEXT_STRING | IDENT_QUOTED | IDENT );";
        }
    }
 

}