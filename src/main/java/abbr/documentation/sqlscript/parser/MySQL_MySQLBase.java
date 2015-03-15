// $ANTLR 3.4 MySQLBase.g 2015-03-15 15:54:15

package abbr.documentation.sqlscript.parser;

import java.util.Arrays;
import java.util.List;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySQL_MySQLBase extends Lexer {
    public static final int EOF=-1;
    public static final int T__548=548;
    public static final int T__549=549;
    public static final int T__550=550;
    public static final int T__551=551;
    public static final int T__552=552;
    public static final int T__553=553;
    public static final int T__554=554;
    public static final int T__555=555;
    public static final int ACCESSIBLE_SYM=4;
    public static final int ACTION=5;
    public static final int ADD=6;
    public static final int AFTER_SYM=7;
    public static final int AGAINST=8;
    public static final int AGGREGATE_SYM=9;
    public static final int ALGORITHM_SYM=10;
    public static final int ALL=11;
    public static final int ALTER=12;
    public static final int ANALYZE_SYM=13;
    public static final int AND_AND_SYM=14;
    public static final int AND_SYM=15;
    public static final int ANY_SYM=16;
    public static final int AS=17;
    public static final int ASC=18;
    public static final int ASCII_SYM=19;
    public static final int ASENSITIVE_SYM=20;
    public static final int AT_SYM=21;
    public static final int AUTHORS_SYM=22;
    public static final int AUTOEXTEND_SIZE_SYM=23;
    public static final int AUTO_INC=24;
    public static final int AVG_ROW_LENGTH=25;
    public static final int AVG_SYM=26;
    public static final int BACKUP_SYM=27;
    public static final int BEFORE_SYM=28;
    public static final int BEGIN_SYM=29;
    public static final int BETWEEN_SYM=30;
    public static final int BIGINT=31;
    public static final int BINARY=32;
    public static final int BINLOG_SYM=33;
    public static final int BIN_NUM=34;
    public static final int BIT_SYM=35;
    public static final int BLOB_SYM=36;
    public static final int BLOCK_SYM=37;
    public static final int BOOLEAN_SYM=38;
    public static final int BOOL_SYM=39;
    public static final int BOTH=40;
    public static final int BTREE_SYM=41;
    public static final int BY=42;
    public static final int BYTE_SYM=43;
    public static final int CACHE_SYM=44;
    public static final int CALL_SYM=45;
    public static final int CASCADE=46;
    public static final int CASCADED=47;
    public static final int CASE_SYM=48;
    public static final int CHAIN_SYM=49;
    public static final int CHANGE=50;
    public static final int CHANGED=51;
    public static final int CHARSET=52;
    public static final int CHAR_SYM=53;
    public static final int CHECKSUM_SYM=54;
    public static final int CHECK_SYM=55;
    public static final int CIPHER_SYM=56;
    public static final int CLIENT_SYM=57;
    public static final int CLOSE_SYM=58;
    public static final int COALESCE=59;
    public static final int CODE_SYM=60;
    public static final int COLLATE_SYM=61;
    public static final int COLLATION_SYM=62;
    public static final int COLUMNS=63;
    public static final int COLUMN_SYM=64;
    public static final int COMMENT_SYM=65;
    public static final int COMMITTED_SYM=66;
    public static final int COMMIT_SYM=67;
    public static final int COMPACT_SYM=68;
    public static final int COMPLETION_SYM=69;
    public static final int COMPRESSED_SYM=70;
    public static final int CONCURRENT=71;
    public static final int CONDITION_SYM=72;
    public static final int CONNECTION_SYM=73;
    public static final int CONSISTENT_SYM=74;
    public static final int CONSTRAINT=75;
    public static final int CONTAINS_SYM=76;
    public static final int CONTEXT_SYM=77;
    public static final int CONTINUE_SYM=78;
    public static final int CONTRIBUTORS_SYM=79;
    public static final int CONVERT_SYM=80;
    public static final int CPU_SYM=81;
    public static final int CREATE=82;
    public static final int CROSS=83;
    public static final int CUBE_SYM=84;
    public static final int CURDATE=85;
    public static final int CURRENT_USER=86;
    public static final int CURSOR_SYM=87;
    public static final int CURTIME=88;
    public static final int DATABASE=89;
    public static final int DATABASES=90;
    public static final int DATAFILE_SYM=91;
    public static final int DATA_SYM=92;
    public static final int DATETIME=93;
    public static final int DATE_SYM=94;
    public static final int DAY_HOUR_SYM=95;
    public static final int DAY_MICROSECOND_SYM=96;
    public static final int DAY_MINUTE_SYM=97;
    public static final int DAY_SECOND_SYM=98;
    public static final int DAY_SYM=99;
    public static final int DEALLOCATE_SYM=100;
    public static final int DECIMAL_NUM=101;
    public static final int DECIMAL_SYM=102;
    public static final int DECLARE_SYM=103;
    public static final int DEFAULT=104;
    public static final int DEFINER_SYM=105;
    public static final int DELAYED_SYM=106;
    public static final int DELAY_KEY_WRITE_SYM=107;
    public static final int DELETE_SYM=108;
    public static final int DESC=109;
    public static final int DESCRIBE=110;
    public static final int DES_KEY_FILE=111;
    public static final int DETERMINISTIC_SYM=112;
    public static final int DIGIT=113;
    public static final int DIRECTORY_SYM=114;
    public static final int DISABLE_SYM=115;
    public static final int DISCARD=116;
    public static final int DISK_SYM=117;
    public static final int DISTINCT=118;
    public static final int DIV_SYM=119;
    public static final int DOUBLE_SYM=120;
    public static final int DO_SYM=121;
    public static final int DROP=122;
    public static final int DUAL_SYM=123;
    public static final int DUMPFILE=124;
    public static final int DUPLICATE_SYM=125;
    public static final int DYNAMIC_SYM=126;
    public static final int EACH_SYM=127;
    public static final int ELSE=128;
    public static final int ELSEIF_SYM=129;
    public static final int ENABLE_SYM=130;
    public static final int ENCLOSED=131;
    public static final int END=132;
    public static final int ENDS_SYM=133;
    public static final int ENGINES_SYM=134;
    public static final int ENGINE_SYM=135;
    public static final int ENUM=136;
    public static final int EQ=137;
    public static final int EQUAL_SYM=138;
    public static final int ERRORS=139;
    public static final int ESCAPED=140;
    public static final int ESCAPE_SYM=141;
    public static final int EVENTS_SYM=142;
    public static final int EVENT_SYM=143;
    public static final int EVERY_SYM=144;
    public static final int EXECUTE_SYM=145;
    public static final int EXISTS=146;
    public static final int EXIT_SYM=147;
    public static final int EXPANSION_SYM=148;
    public static final int EXTENDED_SYM=149;
    public static final int EXTENT_SIZE_SYM=150;
    public static final int Exponent=151;
    public static final int FALSE_SYM=152;
    public static final int FAST_SYM=153;
    public static final int FAULTS_SYM=154;
    public static final int FETCH_SYM=155;
    public static final int FILE_SYM=156;
    public static final int FIRST_SYM=157;
    public static final int FIXED_SYM=158;
    public static final int FLOAT_NUM=159;
    public static final int FLOAT_SYM=160;
    public static final int FLUSH_SYM=161;
    public static final int FORCE_SYM=162;
    public static final int FOREIGN=163;
    public static final int FOR_SYM=164;
    public static final int FOUND_SYM=165;
    public static final int FRAC_SECOND_SYM=166;
    public static final int FROM=167;
    public static final int FULL=168;
    public static final int FULLTEXT_SYM=169;
    public static final int FUNCTION_SYM=170;
    public static final int GE=171;
    public static final int GEOMETRYCOLLECTION=172;
    public static final int GEOMETRY_SYM=173;
    public static final int GET_FORMAT=174;
    public static final int GLOBAL_SYM=175;
    public static final int GRANT=176;
    public static final int GRANTS=177;
    public static final int GROUP_SYM=178;
    public static final int GT_SYM=179;
    public static final int HANDLER_SYM=180;
    public static final int HASH_SYM=181;
    public static final int HAVING=182;
    public static final int HELP_SYM=183;
    public static final int HEX_DIGIT=184;
    public static final int HEX_NUM=185;
    public static final int HIGH_PRIORITY=186;
    public static final int HOSTS_SYM=187;
    public static final int HOST_SYM=188;
    public static final int HOUR_MICROSECOND_SYM=189;
    public static final int HOUR_MINUTE_SYM=190;
    public static final int HOUR_SECOND_SYM=191;
    public static final int HOUR_SYM=192;
    public static final int IDENT=193;
    public static final int IDENTIFIED_SYM=194;
    public static final int IDENT_QUOTED=195;
    public static final int IF=196;
    public static final int IGNORE_SYM=197;
    public static final int IMPORT=198;
    public static final int INDEXES=199;
    public static final int INDEX_SYM=200;
    public static final int INFILE=201;
    public static final int INITIAL_SIZE_SYM=202;
    public static final int INNER_SYM=203;
    public static final int INNOBASE_SYM=204;
    public static final int INOUT_SYM=205;
    public static final int INSENSITIVE_SYM=206;
    public static final int INSERT=207;
    public static final int INSERT_METHOD=208;
    public static final int INSTALL_SYM=209;
    public static final int INTERVAL_SYM=210;
    public static final int INTO=211;
    public static final int INT_SYM=212;
    public static final int INVOKER_SYM=213;
    public static final int IN_SYM=214;
    public static final int IO_SYM=215;
    public static final int IPC_SYM=216;
    public static final int IS=217;
    public static final int ISOLATION=218;
    public static final int ISSUER_SYM=219;
    public static final int ITERATE_SYM=220;
    public static final int JOIN_SYM=221;
    public static final int KEYS=222;
    public static final int KEY_BLOCK_SIZE=223;
    public static final int KEY_SYM=224;
    public static final int KILL_SYM=225;
    public static final int LANGUAGE_SYM=226;
    public static final int LAST_SYM=227;
    public static final int LE=228;
    public static final int LEADING=229;
    public static final int LEAVES=230;
    public static final int LEAVE_SYM=231;
    public static final int LEFT=232;
    public static final int LESS_SYM=233;
    public static final int LEVEL_SYM=234;
    public static final int LIKE=235;
    public static final int LIMIT=236;
    public static final int LINEAR_SYM=237;
    public static final int LINES=238;
    public static final int LINESTRING=239;
    public static final int LIST_SYM=240;
    public static final int LOAD=241;
    public static final int LOCAL_SYM=242;
    public static final int LOCKS_SYM=243;
    public static final int LOCK_SYM=244;
    public static final int LOGFILE_SYM=245;
    public static final int LOGS_SYM=246;
    public static final int LONGBLOB=247;
    public static final int LONGTEXT=248;
    public static final int LONG_NUM=249;
    public static final int LONG_SYM=250;
    public static final int LOOP_SYM=251;
    public static final int LOW_PRIORITY=252;
    public static final int LT=253;
    public static final int MASTER_CONNECT_RETRY_SYM=254;
    public static final int MASTER_HOST_SYM=255;
    public static final int MASTER_LOG_FILE_SYM=256;
    public static final int MASTER_LOG_POS_SYM=257;
    public static final int MASTER_PASSWORD_SYM=258;
    public static final int MASTER_PORT_SYM=259;
    public static final int MASTER_SERVER_ID_SYM=260;
    public static final int MASTER_SSL_CAPATH_SYM=261;
    public static final int MASTER_SSL_CA_SYM=262;
    public static final int MASTER_SSL_CERT_SYM=263;
    public static final int MASTER_SSL_CIPHER_SYM=264;
    public static final int MASTER_SSL_KEY_SYM=265;
    public static final int MASTER_SSL_SYM=266;
    public static final int MASTER_SSL_VERIFY_SERVER_CERT_SYM=267;
    public static final int MASTER_SYM=268;
    public static final int MASTER_USER_SYM=269;
    public static final int MATCH=270;
    public static final int MAX_CONNECTIONS_PER_HOUR=271;
    public static final int MAX_QUERIES_PER_HOUR=272;
    public static final int MAX_ROWS=273;
    public static final int MAX_SIZE_SYM=274;
    public static final int MAX_UPDATES_PER_HOUR=275;
    public static final int MAX_USER_CONNECTIONS_SYM=276;
    public static final int MAX_VALUE_SYM=277;
    public static final int MEDIUMBLOB=278;
    public static final int MEDIUMINT=279;
    public static final int MEDIUMTEXT=280;
    public static final int MEDIUM_SYM=281;
    public static final int MEMORY_SYM=282;
    public static final int MERGE_SYM=283;
    public static final int MICROSECOND_SYM=284;
    public static final int MIGRATE_SYM=285;
    public static final int MINUTE_MICROSECOND_SYM=286;
    public static final int MINUTE_SECOND_SYM=287;
    public static final int MINUTE_SYM=288;
    public static final int MIN_ROWS=289;
    public static final int ML_COMMENT=290;
    public static final int MODE_SYM=291;
    public static final int MODIFIES_SYM=292;
    public static final int MODIFY_SYM=293;
    public static final int MOD_SYM=294;
    public static final int MONTH_SYM=295;
    public static final int MULTILINESTRING=296;
    public static final int MULTIPOINT=297;
    public static final int MULTIPOLYGON=298;
    public static final int MUTEX_SYM=299;
    public static final int NAMES_SYM=300;
    public static final int NAME_SYM=301;
    public static final int NATIONAL_SYM=302;
    public static final int NATURAL=303;
    public static final int NCHAR_STRING=304;
    public static final int NCHAR_SYM=305;
    public static final int NDBCLUSTER_SYM=306;
    public static final int NE=307;
    public static final int NEWLINE=308;
    public static final int NEW_SYM=309;
    public static final int NEXT_SYM=310;
    public static final int NODEGROUP_SYM=311;
    public static final int NONE_SYM=312;
    public static final int NOT=313;
    public static final int NOW_SYM=314;
    public static final int NO_SYM=315;
    public static final int NO_WAIT_SYM=316;
    public static final int NO_WRITE_TO_BINLOG=317;
    public static final int NULL_SYM=318;
    public static final int NUM=319;
    public static final int NUMERIC_SYM=320;
    public static final int NUM_literal=321;
    public static final int NVARCHAR_SYM=322;
    public static final int OFFSET_SYM=323;
    public static final int OLD_PASSWORD=324;
    public static final int ON=325;
    public static final int ONE_SHOT_SYM=326;
    public static final int ONE_SYM=327;
    public static final int OPEN_SYM=328;
    public static final int OPTIMIZE=329;
    public static final int OPTION=330;
    public static final int OPTIONALLY=331;
    public static final int OPTIONS_SYM=332;
    public static final int ORDER_SYM=333;
    public static final int OR_OR_SYM=334;
    public static final int OR_SYM=335;
    public static final int OUTER=336;
    public static final int OUTFILE=337;
    public static final int OUT_SYM=338;
    public static final int OWNER_SYM=339;
    public static final int PACK_KEYS_SYM=340;
    public static final int PAGE_CHECKSUM_SYM=341;
    public static final int PAGE_SYM=342;
    public static final int PARSER_SYM=343;
    public static final int PARTIAL=344;
    public static final int PARTITIONING_SYM=345;
    public static final int PARTITIONS_SYM=346;
    public static final int PARTITION_SYM=347;
    public static final int PASSWORD=348;
    public static final int PHASE_SYM=349;
    public static final int PLUGINS_SYM=350;
    public static final int PLUGIN_SYM=351;
    public static final int POINT_SYM=352;
    public static final int POLYGON=353;
    public static final int PORT_SYM=354;
    public static final int PRECISION=355;
    public static final int PREPARE_SYM=356;
    public static final int PRESERVE_SYM=357;
    public static final int PREV_SYM=358;
    public static final int PRIMARY_SYM=359;
    public static final int PRIVILEGES=360;
    public static final int PROCEDURE=361;
    public static final int PROCESS=362;
    public static final int PROCESSLIST_SYM=363;
    public static final int PROFILES_SYM=364;
    public static final int PROFILE_SYM=365;
    public static final int PURGE=366;
    public static final int QUARTER_SYM=367;
    public static final int QUERY_SYM=368;
    public static final int QUICK=369;
    public static final int RANGE_SYM=370;
    public static final int READS_SYM=371;
    public static final int READ_ONLY_SYM=372;
    public static final int READ_SYM=373;
    public static final int READ_WRITE_SYM=374;
    public static final int REAL=375;
    public static final int REBUILD_SYM=376;
    public static final int RECOVER_SYM=377;
    public static final int REDOFILE_SYM=378;
    public static final int REDO_BUFFER_SIZE_SYM=379;
    public static final int REDUNDANT_SYM=380;
    public static final int REFERENCES=381;
    public static final int REGEXP=382;
    public static final int RELAY_LOG_FILE_SYM=383;
    public static final int RELAY_LOG_POS_SYM=384;
    public static final int RELAY_THREAD=385;
    public static final int RELEASE_SYM=386;
    public static final int RELOAD=387;
    public static final int REMOVE_SYM=388;
    public static final int RENAME=389;
    public static final int REORGANIZE_SYM=390;
    public static final int REPAIR=391;
    public static final int REPEATABLE_SYM=392;
    public static final int REPEAT_SYM=393;
    public static final int REPLACE=394;
    public static final int REPLICATION=395;
    public static final int REQUIRE_SYM=396;
    public static final int RESET_SYM=397;
    public static final int RESOURCES=398;
    public static final int RESTORE_SYM=399;
    public static final int RESTRICT=400;
    public static final int RESUME_SYM=401;
    public static final int RETURNS_SYM=402;
    public static final int RETURN_SYM=403;
    public static final int REVOKE=404;
    public static final int RIGHT=405;
    public static final int ROLLBACK_SYM=406;
    public static final int ROLLUP_SYM=407;
    public static final int ROUTINE_SYM=408;
    public static final int ROWS_SYM=409;
    public static final int ROW_FORMAT_SYM=410;
    public static final int ROW_SYM=411;
    public static final int RTREE_SYM=412;
    public static final int SAVEPOINT_SYM=413;
    public static final int SCHEDULE_SYM=414;
    public static final int SECOND_MICROSECOND_SYM=415;
    public static final int SECOND_SYM=416;
    public static final int SECURITY_SYM=417;
    public static final int SELECT_SYM=418;
    public static final int SENSITIVE_SYM=419;
    public static final int SEPARATOR_SYM=420;
    public static final int SERIALIZABLE_SYM=421;
    public static final int SERIAL_SYM=422;
    public static final int SERVER_SYM=423;
    public static final int SESSION_SYM=424;
    public static final int SET=425;
    public static final int SET_VAR=426;
    public static final int SHARE_SYM=427;
    public static final int SHIFT_LEFT=428;
    public static final int SHIFT_RIGHT=429;
    public static final int SHOW=430;
    public static final int SHUTDOWN=431;
    public static final int SIGNED_SYM=432;
    public static final int SIMPLE_SYM=433;
    public static final int SLAVE=434;
    public static final int SL_COMMENT=435;
    public static final int SMALLINT=436;
    public static final int SNAPSHOT_SYM=437;
    public static final int SOCKET_SYM=438;
    public static final int SONAME_SYM=439;
    public static final int SOUNDS_SYM=440;
    public static final int SOURCE_SYM=441;
    public static final int SPATIAL_SYM=442;
    public static final int SPECIFIC_SYM=443;
    public static final int SQLEXCEPTION_SYM=444;
    public static final int SQLSTATE_SYM=445;
    public static final int SQLWARNING_SYM=446;
    public static final int SQL_BIG_RESULT=447;
    public static final int SQL_BUFFER_RESULT=448;
    public static final int SQL_CACHE_SYM=449;
    public static final int SQL_CALC_FOUND_ROWS=450;
    public static final int SQL_NO_CACHE_SYM=451;
    public static final int SQL_SMALL_RESULT=452;
    public static final int SQL_SYM=453;
    public static final int SQL_THREAD=454;
    public static final int SSL_SYM=455;
    public static final int STARTING=456;
    public static final int STARTS_SYM=457;
    public static final int START_SYM=458;
    public static final int STATUS_SYM=459;
    public static final int STOP_SYM=460;
    public static final int STORAGE_SYM=461;
    public static final int STRAIGHT_JOIN=462;
    public static final int STRING_SYM=463;
    public static final int SUBJECT_SYM=464;
    public static final int SUBPARTITIONS_SYM=465;
    public static final int SUBPARTITION_SYM=466;
    public static final int SUPER_SYM=467;
    public static final int SUSPEND_SYM=468;
    public static final int SWAPS_SYM=469;
    public static final int SWITCHES_SYM=470;
    public static final int TABLES=471;
    public static final int TABLESPACE=472;
    public static final int TABLE_CHECKSUM_SYM=473;
    public static final int TABLE_SYM=474;
    public static final int TEMPORARY=475;
    public static final int TEMPTABLE_SYM=476;
    public static final int TERMINATED=477;
    public static final int TEXT_STRING=478;
    public static final int TEXT_SYM=479;
    public static final int THAN_SYM=480;
    public static final int THEN_SYM=481;
    public static final int TIMESTAMP=482;
    public static final int TIMESTAMP_ADD=483;
    public static final int TIMESTAMP_DIFF=484;
    public static final int TIME_SYM=485;
    public static final int TINYBLOB=486;
    public static final int TINYINT=487;
    public static final int TINYTEXT=488;
    public static final int TO_SYM=489;
    public static final int TRAILING=490;
    public static final int TRANSACTIONAL_SYM=491;
    public static final int TRANSACTION_SYM=492;
    public static final int TRIGGERS_SYM=493;
    public static final int TRIGGER_SYM=494;
    public static final int TRUE_SYM=495;
    public static final int TRUNCATE_SYM=496;
    public static final int TYPES_SYM=497;
    public static final int TYPE_SYM=498;
    public static final int ULONGLONG_NUM=499;
    public static final int UNCOMMITTED_SYM=500;
    public static final int UNDEFINED_SYM=501;
    public static final int UNDOFILE_SYM=502;
    public static final int UNDO_BUFFER_SIZE_SYM=503;
    public static final int UNDO_SYM=504;
    public static final int UNICODE_SYM=505;
    public static final int UNINSTALL_SYM=506;
    public static final int UNION_SYM=507;
    public static final int UNIQUE_SYM=508;
    public static final int UNKNOWN_SYM=509;
    public static final int UNLOCK_SYM=510;
    public static final int UNSIGNED=511;
    public static final int UNSIGNED_INTEGER=512;
    public static final int UNTIL_SYM=513;
    public static final int UPDATE_SYM=514;
    public static final int UPGRADE_SYM=515;
    public static final int USAGE=516;
    public static final int USER=517;
    public static final int USE_FRM=518;
    public static final int USE_SYM=519;
    public static final int USING=520;
    public static final int UTC_DATE_SYM=521;
    public static final int UTC_TIMESTAMP_SYM=522;
    public static final int UTC_TIME_SYM=523;
    public static final int VALUES=524;
    public static final int VALUE_SYM=525;
    public static final int VARBINARY=526;
    public static final int VARCHAR=527;
    public static final int VARIABLES=528;
    public static final int VARYING=529;
    public static final int VIEW_SYM=530;
    public static final int WAIT_SYM=531;
    public static final int WARNINGS=532;
    public static final int WEEK_SYM=533;
    public static final int WHEN_SYM=534;
    public static final int WHERE=535;
    public static final int WHILE_SYM=536;
    public static final int WITH=537;
    public static final int WORK_SYM=538;
    public static final int WRAPPER_SYM=539;
    public static final int WRITE_SYM=540;
    public static final int WS=541;
    public static final int X509_SYM=542;
    public static final int XA_SYM=543;
    public static final int XOR=544;
    public static final int YEAR_MONTH_SYM=545;
    public static final int YEAR_SYM=546;
    public static final int ZEROFILL=547;
    public static final int Tokens=556;


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
    public MySQLLexer gMySQL;
    public MySQLLexer gParent;
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MySQL_MySQLBase() {} 
    public MySQL_MySQLBase(CharStream input, MySQLLexer gMySQL) {
        this(input, new RecognizerSharedState(), gMySQL);
    }
    public MySQL_MySQLBase(CharStream input, RecognizerSharedState state, MySQLLexer gMySQL) {
        super(input,state);
        this.gMySQL = gMySQL;
        gParent = gMySQL;
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