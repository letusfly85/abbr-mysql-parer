// $ANTLR 3.4 MySQL.g 2015-03-15 15:54:13

package abbr.documentation.sqlscript.parser;

import java.util.List;
import java.util.Arrays;
import java.util.TreeSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySQLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESSIBLE_SYM", "ACTION", "ADD", "AFTER_SYM", "AGAINST", "AGGREGATE_SYM", "ALGORITHM_SYM", "ALL", "ALTER", "ANALYZE_SYM", "AND_AND_SYM", "AND_SYM", "ANY_SYM", "AS", "ASC", "ASCII_SYM", "ASENSITIVE_SYM", "AT_SYM", "AUTHORS_SYM", "AUTOEXTEND_SIZE_SYM", "AUTO_INC", "AVG_ROW_LENGTH", "AVG_SYM", "BACKUP_SYM", "BEFORE_SYM", "BEGIN_SYM", "BETWEEN_SYM", "BIGINT", "BINARY", "BINLOG_SYM", "BIN_NUM", "BIT_SYM", "BLOB_SYM", "BLOCK_SYM", "BOOLEAN_SYM", "BOOL_SYM", "BOTH", "BTREE_SYM", "BY", "BYTE_SYM", "CACHE_SYM", "CALL_SYM", "CASCADE", "CASCADED", "CASE_SYM", "CHAIN_SYM", "CHANGE", "CHANGED", "CHARSET", "CHAR_SYM", "CHECKSUM_SYM", "CHECK_SYM", "CIPHER_SYM", "CLIENT_SYM", "CLOSE_SYM", "COALESCE", "CODE_SYM", "COLLATE_SYM", "COLLATION_SYM", "COLUMNS", "COLUMN_SYM", "COMMENT_SYM", "COMMITTED_SYM", "COMMIT_SYM", "COMPACT_SYM", "COMPLETION_SYM", "COMPRESSED_SYM", "CONCURRENT", "CONDITION_SYM", "CONNECTION_SYM", "CONSISTENT_SYM", "CONSTRAINT", "CONTAINS_SYM", "CONTEXT_SYM", "CONTINUE_SYM", "CONTRIBUTORS_SYM", "CONVERT_SYM", "CPU_SYM", "CREATE", "CROSS", "CUBE_SYM", "CURDATE", "CURRENT_USER", "CURSOR_SYM", "CURTIME", "DATABASE", "DATABASES", "DATAFILE_SYM", "DATA_SYM", "DATETIME", "DATE_SYM", "DAY_HOUR_SYM", "DAY_MICROSECOND_SYM", "DAY_MINUTE_SYM", "DAY_SECOND_SYM", "DAY_SYM", "DEALLOCATE_SYM", "DECIMAL_NUM", "DECIMAL_SYM", "DECLARE_SYM", "DEFAULT", "DEFINER_SYM", "DELAYED_SYM", "DELAY_KEY_WRITE_SYM", "DELETE_SYM", "DESC", "DESCRIBE", "DES_KEY_FILE", "DETERMINISTIC_SYM", "DIGIT", "DIRECTORY_SYM", "DISABLE_SYM", "DISCARD", "DISK_SYM", "DISTINCT", "DIV_SYM", "DOUBLE_SYM", "DO_SYM", "DROP", "DUAL_SYM", "DUMPFILE", "DUPLICATE_SYM", "DYNAMIC_SYM", "EACH_SYM", "ELSE", "ELSEIF_SYM", "ENABLE_SYM", "ENCLOSED", "END", "ENDS_SYM", "ENGINES_SYM", "ENGINE_SYM", "ENUM", "EQ", "EQUAL_SYM", "ERRORS", "ESCAPED", "ESCAPE_SYM", "EVENTS_SYM", "EVENT_SYM", "EVERY_SYM", "EXECUTE_SYM", "EXISTS", "EXIT_SYM", "EXPANSION_SYM", "EXTENDED_SYM", "EXTENT_SIZE_SYM", "Exponent", "FALSE_SYM", "FAST_SYM", "FAULTS_SYM", "FETCH_SYM", "FILE_SYM", "FIRST_SYM", "FIXED_SYM", "FLOAT_NUM", "FLOAT_SYM", "FLUSH_SYM", "FORCE_SYM", "FOREIGN", "FOR_SYM", "FOUND_SYM", "FRAC_SECOND_SYM", "FROM", "FULL", "FULLTEXT_SYM", "FUNCTION_SYM", "GE", "GEOMETRYCOLLECTION", "GEOMETRY_SYM", "GET_FORMAT", "GLOBAL_SYM", "GRANT", "GRANTS", "GROUP_SYM", "GT_SYM", "HANDLER_SYM", "HASH_SYM", "HAVING", "HELP_SYM", "HEX_DIGIT", "HEX_NUM", "HIGH_PRIORITY", "HOSTS_SYM", "HOST_SYM", "HOUR_MICROSECOND_SYM", "HOUR_MINUTE_SYM", "HOUR_SECOND_SYM", "HOUR_SYM", "IDENT", "IDENTIFIED_SYM", "IDENT_QUOTED", "IF", "IGNORE_SYM", "IMPORT", "INDEXES", "INDEX_SYM", "INFILE", "INITIAL_SIZE_SYM", "INNER_SYM", "INNOBASE_SYM", "INOUT_SYM", "INSENSITIVE_SYM", "INSERT", "INSERT_METHOD", "INSTALL_SYM", "INTERVAL_SYM", "INTO", "INT_SYM", "INVOKER_SYM", "IN_SYM", "IO_SYM", "IPC_SYM", "IS", "ISOLATION", "ISSUER_SYM", "ITERATE_SYM", "JOIN_SYM", "KEYS", "KEY_BLOCK_SIZE", "KEY_SYM", "KILL_SYM", "LANGUAGE_SYM", "LAST_SYM", "LE", "LEADING", "LEAVES", "LEAVE_SYM", "LEFT", "LESS_SYM", "LEVEL_SYM", "LIKE", "LIMIT", "LINEAR_SYM", "LINES", "LINESTRING", "LIST_SYM", "LOAD", "LOCAL_SYM", "LOCKS_SYM", "LOCK_SYM", "LOGFILE_SYM", "LOGS_SYM", "LONGBLOB", "LONGTEXT", "LONG_NUM", "LONG_SYM", "LOOP_SYM", "LOW_PRIORITY", "LT", "MASTER_CONNECT_RETRY_SYM", "MASTER_HOST_SYM", "MASTER_LOG_FILE_SYM", "MASTER_LOG_POS_SYM", "MASTER_PASSWORD_SYM", "MASTER_PORT_SYM", "MASTER_SERVER_ID_SYM", "MASTER_SSL_CAPATH_SYM", "MASTER_SSL_CA_SYM", "MASTER_SSL_CERT_SYM", "MASTER_SSL_CIPHER_SYM", "MASTER_SSL_KEY_SYM", "MASTER_SSL_SYM", "MASTER_SSL_VERIFY_SERVER_CERT_SYM", "MASTER_SYM", "MASTER_USER_SYM", "MATCH", "MAX_CONNECTIONS_PER_HOUR", "MAX_QUERIES_PER_HOUR", "MAX_ROWS", "MAX_SIZE_SYM", "MAX_UPDATES_PER_HOUR", "MAX_USER_CONNECTIONS_SYM", "MAX_VALUE_SYM", "MEDIUMBLOB", "MEDIUMINT", "MEDIUMTEXT", "MEDIUM_SYM", "MEMORY_SYM", "MERGE_SYM", "MICROSECOND_SYM", "MIGRATE_SYM", "MINUTE_MICROSECOND_SYM", "MINUTE_SECOND_SYM", "MINUTE_SYM", "MIN_ROWS", "ML_COMMENT", "MODE_SYM", "MODIFIES_SYM", "MODIFY_SYM", "MOD_SYM", "MONTH_SYM", "MULTILINESTRING", "MULTIPOINT", "MULTIPOLYGON", "MUTEX_SYM", "NAMES_SYM", "NAME_SYM", "NATIONAL_SYM", "NATURAL", "NCHAR_STRING", "NCHAR_SYM", "NDBCLUSTER_SYM", "NE", "NEWLINE", "NEW_SYM", "NEXT_SYM", "NODEGROUP_SYM", "NONE_SYM", "NOT", "NOW_SYM", "NO_SYM", "NO_WAIT_SYM", "NO_WRITE_TO_BINLOG", "NULL_SYM", "NUM", "NUMERIC_SYM", "NUM_literal", "NVARCHAR_SYM", "OFFSET_SYM", "OLD_PASSWORD", "ON", "ONE_SHOT_SYM", "ONE_SYM", "OPEN_SYM", "OPTIMIZE", "OPTION", "OPTIONALLY", "OPTIONS_SYM", "ORDER_SYM", "OR_OR_SYM", "OR_SYM", "OUTER", "OUTFILE", "OUT_SYM", "OWNER_SYM", "PACK_KEYS_SYM", "PAGE_CHECKSUM_SYM", "PAGE_SYM", "PARSER_SYM", "PARTIAL", "PARTITIONING_SYM", "PARTITIONS_SYM", "PARTITION_SYM", "PASSWORD", "PHASE_SYM", "PLUGINS_SYM", "PLUGIN_SYM", "POINT_SYM", "POLYGON", "PORT_SYM", "PRECISION", "PREPARE_SYM", "PRESERVE_SYM", "PREV_SYM", "PRIMARY_SYM", "PRIVILEGES", "PROCEDURE", "PROCESS", "PROCESSLIST_SYM", "PROFILES_SYM", "PROFILE_SYM", "PURGE", "QUARTER_SYM", "QUERY_SYM", "QUICK", "RANGE_SYM", "READS_SYM", "READ_ONLY_SYM", "READ_SYM", "READ_WRITE_SYM", "REAL", "REBUILD_SYM", "RECOVER_SYM", "REDOFILE_SYM", "REDO_BUFFER_SIZE_SYM", "REDUNDANT_SYM", "REFERENCES", "REGEXP", "RELAY_LOG_FILE_SYM", "RELAY_LOG_POS_SYM", "RELAY_THREAD", "RELEASE_SYM", "RELOAD", "REMOVE_SYM", "RENAME", "REORGANIZE_SYM", "REPAIR", "REPEATABLE_SYM", "REPEAT_SYM", "REPLACE", "REPLICATION", "REQUIRE_SYM", "RESET_SYM", "RESOURCES", "RESTORE_SYM", "RESTRICT", "RESUME_SYM", "RETURNS_SYM", "RETURN_SYM", "REVOKE", "RIGHT", "ROLLBACK_SYM", "ROLLUP_SYM", "ROUTINE_SYM", "ROWS_SYM", "ROW_FORMAT_SYM", "ROW_SYM", "RTREE_SYM", "SAVEPOINT_SYM", "SCHEDULE_SYM", "SECOND_MICROSECOND_SYM", "SECOND_SYM", "SECURITY_SYM", "SELECT_SYM", "SENSITIVE_SYM", "SEPARATOR_SYM", "SERIALIZABLE_SYM", "SERIAL_SYM", "SERVER_SYM", "SESSION_SYM", "SET", "SET_VAR", "SHARE_SYM", "SHIFT_LEFT", "SHIFT_RIGHT", "SHOW", "SHUTDOWN", "SIGNED_SYM", "SIMPLE_SYM", "SLAVE", "SL_COMMENT", "SMALLINT", "SNAPSHOT_SYM", "SOCKET_SYM", "SONAME_SYM", "SOUNDS_SYM", "SOURCE_SYM", "SPATIAL_SYM", "SPECIFIC_SYM", "SQLEXCEPTION_SYM", "SQLSTATE_SYM", "SQLWARNING_SYM", "SQL_BIG_RESULT", "SQL_BUFFER_RESULT", "SQL_CACHE_SYM", "SQL_CALC_FOUND_ROWS", "SQL_NO_CACHE_SYM", "SQL_SMALL_RESULT", "SQL_SYM", "SQL_THREAD", "SSL_SYM", "STARTING", "STARTS_SYM", "START_SYM", "STATUS_SYM", "STOP_SYM", "STORAGE_SYM", "STRAIGHT_JOIN", "STRING_SYM", "SUBJECT_SYM", "SUBPARTITIONS_SYM", "SUBPARTITION_SYM", "SUPER_SYM", "SUSPEND_SYM", "SWAPS_SYM", "SWITCHES_SYM", "TABLES", "TABLESPACE", "TABLE_CHECKSUM_SYM", "TABLE_SYM", "TEMPORARY", "TEMPTABLE_SYM", "TERMINATED", "TEXT_STRING", "TEXT_SYM", "THAN_SYM", "THEN_SYM", "TIMESTAMP", "TIMESTAMP_ADD", "TIMESTAMP_DIFF", "TIME_SYM", "TINYBLOB", "TINYINT", "TINYTEXT", "TO_SYM", "TRAILING", "TRANSACTIONAL_SYM", "TRANSACTION_SYM", "TRIGGERS_SYM", "TRIGGER_SYM", "TRUE_SYM", "TRUNCATE_SYM", "TYPES_SYM", "TYPE_SYM", "ULONGLONG_NUM", "UNCOMMITTED_SYM", "UNDEFINED_SYM", "UNDOFILE_SYM", "UNDO_BUFFER_SIZE_SYM", "UNDO_SYM", "UNICODE_SYM", "UNINSTALL_SYM", "UNION_SYM", "UNIQUE_SYM", "UNKNOWN_SYM", "UNLOCK_SYM", "UNSIGNED", "UNSIGNED_INTEGER", "UNTIL_SYM", "UPDATE_SYM", "UPGRADE_SYM", "USAGE", "USER", "USE_FRM", "USE_SYM", "USING", "UTC_DATE_SYM", "UTC_TIMESTAMP_SYM", "UTC_TIME_SYM", "VALUES", "VALUE_SYM", "VARBINARY", "VARCHAR", "VARIABLES", "VARYING", "VIEW_SYM", "WAIT_SYM", "WARNINGS", "WEEK_SYM", "WHEN_SYM", "WHERE", "WHILE_SYM", "WITH", "WORK_SYM", "WRAPPER_SYM", "WRITE_SYM", "WS", "X509_SYM", "XA_SYM", "XOR", "YEAR_MONTH_SYM", "YEAR_SYM", "ZEROFILL", "'('", "')'", "'+'", "','", "'-'", "'.'", "';'", "'_'"
    };

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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MySQLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MySQLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MySQLParser.tokenNames; }
    public String getGrammarFileName() { return "MySQL.g"; }


    	private static final List<String> RESERVED_WORDS = Arrays.asList(new String[] { "accessible",
    			"action", "add", "after", "against", "aggregate", "algorithm",
    			"all", "alter", "analyze", "and", "any", "as", "asc", "ascii",
    			"asensitive", "at", "authors", "auto_increment", "autoextend_size",
    			"avg", "avg_row_length", "backup", "before", "begin", "between",
    			"bigint", "binary", "binlog", "bit", "blob", "block", "bool",
    			"boolean", "both", "btree", "by", "byte", "cache", "call",
    			"cascade", "cascaded", "case", "chain", "change", "changed",
    			"char", "character", "charset", "check", "checksum", "cipher",
    			"client", "close", "coalesce", "code", "collate", "collation",
    			"column", "columns", "comment", "commit", "committed", "compact",
    			"completion", "compressed", "concurrent", "condition",
    			"connection", "consistent", "constraint", "contains", "context",
    			"continue", "contributors", "convert", "cpu", "create", "cross",
    			"cube", "current_date", "current_time", "current_user", "cursor",
    			"data", "database", "databases", "datafile", "date", "datetime",
    			"day", "day_hour", "day_microsecond", "day_minute", "day_second",
    			"deallocate", "dec", "decimal", "declare", "default", "definer",
    			"delay_key_write", "delayed", "delete", "des_key_file", "desc",
    			"describe", "deterministic", "directory", "disable", "discard",
    			"disk", "distinct", "distinctrow", "div", "do", "double", "drop",
    			"dual", "dumpfile", "duplicate", "dynamic", "each", "else",
    			"elseif", "enable", "enclosed", "end", "ends", "engine", "engines",
    			"enum", "errors", "escape", "escaped", "event", "events", "every",
    			"execute", "exists", "exit", "expansion", "explain", "extended",
    			"extent_size", "false", "fast", "faults", "fetch", "fields",
    			"file", "first", "fixed", "float", "float4", "float8", "flush",
    			"for", "force", "foreign", "found", "frac_second", "from", "full",
    			"fulltext", "function", "geometry", "geometrycollection",
    			"get_format", "global", "grant", "grants", "group", "handler",
    			"hash", "having", "help", "high_priority", "host", "hosts", "hour",
    			"hour_microsecond", "hour_minute", "hour_second", "identified",
    			"if", "ignore", "import", "in", "index", "indexes", "infile",
    			"initial_size", "inner", "innobase", "innodb", "inout",
    			"insensitive", "insert", "insert_method", "install", "int", "int1",
    			"int2", "int4", "int8", "integer", "interval", "into", "invoker",
    			"io", "io_thread", "ipc", "is", "isolation", "issuer", "iterate",
    			"join", "key", "key_block_size", "keys", "kill", "language",
    			"last", "leading", "leave", "leaves", "left", "less", "level",
    			"like", "limit", "linear", "lines", "linestring", "list", "load",
    			"local", "localtime", "localtimestamp", "lock", "locks", "logfile",
    			"logs", "long", "longblob", "longtext", "loop", "low_priority",
    			"master", "master_connect_retry", "master_host", "master_log_file",
    			"master_log_pos", "master_password", "master_port",
    			"master_server_id", "master_ssl", "master_ssl_ca",
    			"master_ssl_capath", "master_ssl_cert", "master_ssl_cipher",
    			"master_ssl_key", "master_ssl_verify_server_cert", "master_user",
    			"match", "max_connections_per_hour", "max_queries_per_hour",
    			"max_rows", "max_size", "max_updates_per_hour",
    			"max_user_connections", "maxvalue", "medium", "mediumblob",
    			"mediumint", "mediumtext", "memory", "merge", "microsecond",
    			"middleint", "migrate", "min_rows", "minute", "minute_microsecond",
    			"minute_second", "mod", "mode", "modifies", "modify", "month",
    			"multilinestring", "multipoint", "multipolygon", "mutex", "name",
    			"names", "national", "natural", "nchar", "ndb", "ndbcluster",
    			"new", "next", "no", "no_wait", "no_write_to_binlog", "nodegroup",
    			"none", "not", "not", "null", "numeric", "nvarchar", "offset",
    			"old_password", "on", "one", "one_shot", "open", "optimize",
    			"option", "optionally", "options", "or", "order", "out", "outer",
    			"outfile", "owner", "pack_keys", "page", "page_checksum", "parser",
    			"partial", "partition", "partitioning", "partitions", "password",
    			"phase", "plugin", "plugins", "point", "polygon", "port",
    			"precision", "prepare", "preserve", "prev", "primary",
    			"privileges", "procedure", "process", "processlist", "profile",
    			"profiles", "purge", "quarter", "query", "quick", "range", "read",
    			"read_only", "read_write", "reads", "real", "rebuild", "recover",
    			"redo_buffer_size", "redofile", "redundant", "references",
    			"regexp", "relay_log_file", "relay_log_pos", "relay_thread",
    			"release", "reload", "remove", "rename", "reorganize", "repair",
    			"repeat", "repeatable", "replace", "replication", "require",
    			"reset", "restore", "restrict", "resume", "return", "returns",
    			"revoke", "right", "rlike", "rollback", "rollup", "routine", "row",
    			"row_format", "rows", "rtree", "savepoint", "schedule", "schema",
    			"schemas", "second", "second_microsecond", "security", "select",
    			"sensitive", "separator", "serial", "serializable", "server",
    			"session", "set", "share", "show", "shutdown", "signed", "simple",
    			"slave", "smallint", "snapshot", "socket", "some", "soname",
    			"sounds", "source", "spatial", "specific", "sql", "sql_big_result",
    			"sql_buffer_result", "sql_cache", "sql_calc_found_rows",
    			"sql_no_cache", "sql_small_result", "sql_thread", "sql_tsi_day",
    			"sql_tsi_frac_second", "sql_tsi_hour", "sql_tsi_minute",
    			"sql_tsi_month", "sql_tsi_quarter", "sql_tsi_second",
    			"sql_tsi_week", "sql_tsi_year", "sqlexception", "sqlstate",
    			"sqlwarning", "ssl", "start", "starting", "starts", "status",
    			"stop", "storage", "straight_join", "string", "subject",
    			"subpartition", "subpartitions", "super", "suspend", "swaps",
    			"switches", "table", "table_checksum", "tables", "tablespace",
    			"temporary", "temptable", "terminated", "text", "than", "then",
    			"time", "timestamp", "timestampadd", "timestampdiff", "tinyblob",
    			"tinyint", "tinytext", "to", "trailing", "transaction",
    			"transactional", "trigger", "triggers", "true", "truncate", "type",
    			"types", "uncommitted", "undefined", "undo", "undo_buffer_size",
    			"undofile", "unicode", "uninstall", "union", "unique", "unknown",
    			"unlock", "unsigned", "until", "update", "upgrade", "usage", "use",
    			"use_frm", "user", "user_resources", "using", "utc_date",
    			"utc_time", "utc_timestamp", "value", "values", "varbinary",
    			"varchar", "varcharacter", "variables", "varying", "view", "wait",
    			"warnings", "week", "when", "where", "while", "with", "work",
    			"wrapper", "write", "x509", "xa", "xor", "year", "year_month",
    			"zerofill" });
    	
    	public boolean isReservedWord(String str) {
    		return RESERVED_WORDS.contains(str);
    		
    	}
    	
    		public static class Node implements Comparable<Node> {

    		private int line;

    		public int getLine() {
    			return line;
    		}

    		public Node(int line) {
    			this.line = line;
    		}

    		@Override
    		public int compareTo(Node o) {
    			return line < o.line ? -1 : (line == o.line ? 0 : +1);
    		}

    	}

    	public static class CommentNode extends Node {
    		private String comment;

    		public CommentNode(int line, String comment) {
    			super(line);
    			this.comment = comment;
    		}

    		public String getComment() {
    			return comment;
    		}
    	}

    	public static class TableNode extends Node {
    		private String table;

    		public TableNode(int line, String table) {
    			super(line);
    			this.table = table;
    		}

    		public String getTable() {
    			return table;
    		}
    	}

    	public static class ColumnNode extends Node {
    		private String table;
    		private String column;

    		public ColumnNode(int line, String table, String column) {
    			super(line);
    			this.table = table;
    			this.column = column;
    		}

    		public String getTable() {
    			return table;
    		}

    		public String getColumn() {
    			return column;
    		}

    	}

    	
    	TreeSet<CommentNode> comments = new TreeSet<CommentNode>();
    	TreeSet<Node> identifiers = new TreeSet<Node>();
    	
    	public TreeSet<CommentNode> getComments() {
    		return comments;
    	}

    	public TreeSet<Node> getIdentifiers() {
    		return identifiers;
    	}

    	public void addComment(String comment, int line) {
    		comments.add(new CommentNode(line, comment));		
    	}
    	
    	public void addColumn(String table, String column, int line) {
    		identifiers.add(new ColumnNode(line, removeQuotes(table), removeQuotes(column)));
    	}
    	
    	public void addTable(String table, int line) {
    		identifiers.add(new TableNode(line, removeQuotes(table)));
    	}

    	private static String removeQuotes(String str) {
    		return str.replace("`","");
    	}	


    public static class create_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create"
    // MySQL.g:881:1: create : CREATE ( table_options )? TABLE_SYM ( if_not_exists )? t= table_ident create2[$t.text] ;
    public final MySQLParser.create_return create() throws RecognitionException {
        MySQLParser.create_return retval = new MySQLParser.create_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE1=null;
        Token TABLE_SYM3=null;
        MySQLParser.table_ident_return t =null;

        MySQLParser.table_options_return table_options2 =null;

        MySQLParser.if_not_exists_return if_not_exists4 =null;

        MySQLParser.create2_return create25 =null;


        Object CREATE1_tree=null;
        Object TABLE_SYM3_tree=null;

        try {
            // MySQL.g:881:7: ( CREATE ( table_options )? TABLE_SYM ( if_not_exists )? t= table_ident create2[$t.text] )
            // MySQL.g:882:11: CREATE ( table_options )? TABLE_SYM ( if_not_exists )? t= table_ident create2[$t.text]
            {
            root_0 = (Object)adaptor.nil();


            CREATE1=(Token)match(input,CREATE,FOLLOW_CREATE_in_create6524); 
            CREATE1_tree = 
            (Object)adaptor.create(CREATE1)
            ;
            adaptor.addChild(root_0, CREATE1_tree);


            // MySQL.g:882:18: ( table_options )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==TEMPORARY) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // MySQL.g:882:18: table_options
                    {
                    pushFollow(FOLLOW_table_options_in_create6526);
                    table_options2=table_options();

                    state._fsp--;

                    adaptor.addChild(root_0, table_options2.getTree());

                    }
                    break;

            }


            TABLE_SYM3=(Token)match(input,TABLE_SYM,FOLLOW_TABLE_SYM_in_create6529); 
            TABLE_SYM3_tree = 
            (Object)adaptor.create(TABLE_SYM3)
            ;
            adaptor.addChild(root_0, TABLE_SYM3_tree);


            // MySQL.g:882:43: ( if_not_exists )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IF) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // MySQL.g:882:43: if_not_exists
                    {
                    pushFollow(FOLLOW_if_not_exists_in_create6531);
                    if_not_exists4=if_not_exists();

                    state._fsp--;

                    adaptor.addChild(root_0, if_not_exists4.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_table_ident_in_create6536);
            t=table_ident();

            state._fsp--;

            adaptor.addChild(root_0, t.getTree());

            pushFollow(FOLLOW_create2_in_create6548);
            create25=create2((t!=null?input.toString(t.start,t.stop):null));

            state._fsp--;

            adaptor.addChild(root_0, create25.getTree());


                      	addTable((t!=null?input.toString(t.start,t.stop):null), (t!=null?((Token)t.start):null).getLine());
                      	System.out.println("table: " + (t!=null?input.toString(t.start,t.stop):null) + ":" + (t!=null?((Token)t.start):null).getLine()) ;
                      

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create"


    public static class table_options_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_options"
    // MySQL.g:902:1: table_options : ( table_option )+ ;
    public final MySQLParser.table_options_return table_options() throws RecognitionException {
        MySQLParser.table_options_return retval = new MySQLParser.table_options_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.table_option_return table_option6 =null;



        try {
            // MySQL.g:902:14: ( ( table_option )+ )
            // MySQL.g:903:9: ( table_option )+
            {
            root_0 = (Object)adaptor.nil();


            // MySQL.g:903:9: ( table_option )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==TEMPORARY) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // MySQL.g:903:9: table_option
            	    {
            	    pushFollow(FOLLOW_table_option_in_table_options6617);
            	    table_option6=table_option();

            	    state._fsp--;

            	    adaptor.addChild(root_0, table_option6.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_options"


    public static class table_option_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_option"
    // MySQL.g:906:1: table_option : TEMPORARY ;
    public final MySQLParser.table_option_return table_option() throws RecognitionException {
        MySQLParser.table_option_return retval = new MySQLParser.table_option_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEMPORARY7=null;

        Object TEMPORARY7_tree=null;

        try {
            // MySQL.g:906:13: ( TEMPORARY )
            // MySQL.g:907:11: TEMPORARY
            {
            root_0 = (Object)adaptor.nil();


            TEMPORARY7=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_table_option6644); 
            TEMPORARY7_tree = 
            (Object)adaptor.create(TEMPORARY7)
            ;
            adaptor.addChild(root_0, TEMPORARY7_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_option"


    public static class create2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create2"
    // MySQL.g:910:1: create2[String tableName] : ( '(' create2a[tableName] | create_table_options create3 );
    public final MySQLParser.create2_return create2(String tableName) throws RecognitionException {
        MySQLParser.create2_return retval = new MySQLParser.create2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal8=null;
        MySQLParser.create2a_return create2a9 =null;

        MySQLParser.create_table_options_return create_table_options10 =null;

        MySQLParser.create3_return create311 =null;


        Object char_literal8_tree=null;

        try {
            // MySQL.g:910:27: ( '(' create2a[tableName] | create_table_options create3 )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==548) ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= CHARSET && LA4_0 <= CHAR_SYM)||LA4_0==DEFAULT||LA4_0==ENGINE_SYM) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // MySQL.g:911:11: '(' create2a[tableName]
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal8=(Token)match(input,548,FOLLOW_548_in_create26673); 
                    char_literal8_tree = 
                    (Object)adaptor.create(char_literal8)
                    ;
                    adaptor.addChild(root_0, char_literal8_tree);


                    pushFollow(FOLLOW_create2a_in_create26675);
                    create2a9=create2a(tableName);

                    state._fsp--;

                    adaptor.addChild(root_0, create2a9.getTree());



                    }
                    break;
                case 2 :
                    // MySQL.g:912:11: create_table_options create3
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_table_options_in_create26690);
                    create_table_options10=create_table_options();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_options10.getTree());

                    pushFollow(FOLLOW_create3_in_create26703);
                    create311=create3();

                    state._fsp--;

                    adaptor.addChild(root_0, create311.getTree());



                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create2"


    public static class create2a_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create2a"
    // MySQL.g:919:1: create2a[String tableName] : field_list[tableName] ')' ( create_table_options )? create3 ;
    public final MySQLParser.create2a_return create2a(String tableName) throws RecognitionException {
        MySQLParser.create2a_return retval = new MySQLParser.create2a_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal13=null;
        MySQLParser.field_list_return field_list12 =null;

        MySQLParser.create_table_options_return create_table_options14 =null;

        MySQLParser.create3_return create315 =null;


        Object char_literal13_tree=null;

        try {
            // MySQL.g:919:28: ( field_list[tableName] ')' ( create_table_options )? create3 )
            // MySQL.g:920:11: field_list[tableName] ')' ( create_table_options )? create3
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_field_list_in_create2a6735);
            field_list12=field_list(tableName);

            state._fsp--;

            adaptor.addChild(root_0, field_list12.getTree());

            char_literal13=(Token)match(input,549,FOLLOW_549_in_create2a6738); 
            char_literal13_tree = 
            (Object)adaptor.create(char_literal13)
            ;
            adaptor.addChild(root_0, char_literal13_tree);


            // MySQL.g:920:37: ( create_table_options )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= CHARSET && LA5_0 <= CHAR_SYM)||LA5_0==DEFAULT||LA5_0==ENGINE_SYM) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // MySQL.g:920:37: create_table_options
                    {
                    pushFollow(FOLLOW_create_table_options_in_create2a6740);
                    create_table_options14=create_table_options();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_options14.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_create3_in_create2a6754);
            create315=create3();

            state._fsp--;

            adaptor.addChild(root_0, create315.getTree());



            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create2a"


    public static class create3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create3"
    // MySQL.g:928:1: create3 :;
    public final MySQLParser.create3_return create3() throws RecognitionException {
        MySQLParser.create3_return retval = new MySQLParser.create3_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        try {
            // MySQL.g:928:8: ()
            // MySQL.g:929:23: 
            {
            root_0 = (Object)adaptor.nil();




            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create3"


    public static class if_not_exists_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_not_exists"
    // MySQL.g:936:1: if_not_exists : IF NOT EXISTS ;
    public final MySQLParser.if_not_exists_return if_not_exists() throws RecognitionException {
        MySQLParser.if_not_exists_return retval = new MySQLParser.if_not_exists_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF16=null;
        Token NOT17=null;
        Token EXISTS18=null;

        Object IF16_tree=null;
        Object NOT17_tree=null;
        Object EXISTS18_tree=null;

        try {
            // MySQL.g:936:14: ( IF NOT EXISTS )
            // MySQL.g:937:9: IF NOT EXISTS
            {
            root_0 = (Object)adaptor.nil();


            IF16=(Token)match(input,IF,FOLLOW_IF_in_if_not_exists6815); 
            IF16_tree = 
            (Object)adaptor.create(IF16)
            ;
            adaptor.addChild(root_0, IF16_tree);


            NOT17=(Token)match(input,NOT,FOLLOW_NOT_in_if_not_exists6817); 
            NOT17_tree = 
            (Object)adaptor.create(NOT17)
            ;
            adaptor.addChild(root_0, NOT17_tree);


            EXISTS18=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_if_not_exists6819); 
            EXISTS18_tree = 
            (Object)adaptor.create(EXISTS18)
            ;
            adaptor.addChild(root_0, EXISTS18_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_not_exists"


    public static class field_ident_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_ident"
    // MySQL.g:940:1: field_ident : ( ident | ident '.' ident '.' ident | ident '.' ident | '.' ident );
    public final MySQLParser.field_ident_return field_ident() throws RecognitionException {
        MySQLParser.field_ident_return retval = new MySQLParser.field_ident_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal21=null;
        Token char_literal23=null;
        Token char_literal26=null;
        Token char_literal28=null;
        MySQLParser.ident_return ident19 =null;

        MySQLParser.ident_return ident20 =null;

        MySQLParser.ident_return ident22 =null;

        MySQLParser.ident_return ident24 =null;

        MySQLParser.ident_return ident25 =null;

        MySQLParser.ident_return ident27 =null;

        MySQLParser.ident_return ident29 =null;


        Object char_literal21_tree=null;
        Object char_literal23_tree=null;
        Object char_literal26_tree=null;
        Object char_literal28_tree=null;

        try {
            // MySQL.g:940:12: ( ident | ident '.' ident '.' ident | ident '.' ident | '.' ident )
            int alt6=4;
            switch ( input.LA(1) ) {
            case IDENT_QUOTED:
                {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1 >= BIGINT && LA6_1 <= BINARY)||(LA6_1 >= BIT_SYM && LA6_1 <= BLOB_SYM)||(LA6_1 >= BOOLEAN_SYM && LA6_1 <= BOOL_SYM)||LA6_1==CHAR_SYM||(LA6_1 >= DATETIME && LA6_1 <= DATE_SYM)||LA6_1==DECIMAL_SYM||LA6_1==DOUBLE_SYM||LA6_1==ENUM||LA6_1==FIXED_SYM||LA6_1==FLOAT_SYM||(LA6_1 >= GEOMETRYCOLLECTION && LA6_1 <= GEOMETRY_SYM)||LA6_1==INT_SYM||LA6_1==LINESTRING||(LA6_1 >= LONGBLOB && LA6_1 <= LONGTEXT)||LA6_1==LONG_SYM||(LA6_1 >= MEDIUMBLOB && LA6_1 <= MEDIUMTEXT)||(LA6_1 >= MULTILINESTRING && LA6_1 <= MULTIPOLYGON)||LA6_1==NATIONAL_SYM||LA6_1==NCHAR_SYM||LA6_1==NUMERIC_SYM||LA6_1==NVARCHAR_SYM||(LA6_1 >= POINT_SYM && LA6_1 <= POLYGON)||LA6_1==REAL||LA6_1==SERIAL_SYM||LA6_1==SET||LA6_1==SMALLINT||LA6_1==TEXT_SYM||LA6_1==TIMESTAMP||(LA6_1 >= TIME_SYM && LA6_1 <= TINYTEXT)||(LA6_1 >= VARBINARY && LA6_1 <= VARCHAR)||LA6_1==YEAR_SYM) ) {
                    alt6=1;
                }
                else if ( (LA6_1==553) ) {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==IDENT_QUOTED) ) {
                        int LA6_7 = input.LA(4);

                        if ( (LA6_7==553) ) {
                            alt6=2;
                        }
                        else if ( ((LA6_7 >= BIGINT && LA6_7 <= BINARY)||(LA6_7 >= BIT_SYM && LA6_7 <= BLOB_SYM)||(LA6_7 >= BOOLEAN_SYM && LA6_7 <= BOOL_SYM)||LA6_7==CHAR_SYM||(LA6_7 >= DATETIME && LA6_7 <= DATE_SYM)||LA6_7==DECIMAL_SYM||LA6_7==DOUBLE_SYM||LA6_7==ENUM||LA6_7==FIXED_SYM||LA6_7==FLOAT_SYM||(LA6_7 >= GEOMETRYCOLLECTION && LA6_7 <= GEOMETRY_SYM)||LA6_7==INT_SYM||LA6_7==LINESTRING||(LA6_7 >= LONGBLOB && LA6_7 <= LONGTEXT)||LA6_7==LONG_SYM||(LA6_7 >= MEDIUMBLOB && LA6_7 <= MEDIUMTEXT)||(LA6_7 >= MULTILINESTRING && LA6_7 <= MULTIPOLYGON)||LA6_7==NATIONAL_SYM||LA6_7==NCHAR_SYM||LA6_7==NUMERIC_SYM||LA6_7==NVARCHAR_SYM||(LA6_7 >= POINT_SYM && LA6_7 <= POLYGON)||LA6_7==REAL||LA6_7==SERIAL_SYM||LA6_7==SET||LA6_7==SMALLINT||LA6_7==TEXT_SYM||LA6_7==TIMESTAMP||(LA6_7 >= TIME_SYM && LA6_7 <= TINYTEXT)||(LA6_7 >= VARBINARY && LA6_7 <= VARCHAR)||LA6_7==YEAR_SYM) ) {
                            alt6=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 7, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA6_5==IDENT) ) {
                        int LA6_8 = input.LA(4);

                        if ( (LA6_8==553) ) {
                            alt6=2;
                        }
                        else if ( ((LA6_8 >= BIGINT && LA6_8 <= BINARY)||(LA6_8 >= BIT_SYM && LA6_8 <= BLOB_SYM)||(LA6_8 >= BOOLEAN_SYM && LA6_8 <= BOOL_SYM)||LA6_8==CHAR_SYM||(LA6_8 >= DATETIME && LA6_8 <= DATE_SYM)||LA6_8==DECIMAL_SYM||LA6_8==DOUBLE_SYM||LA6_8==ENUM||LA6_8==FIXED_SYM||LA6_8==FLOAT_SYM||(LA6_8 >= GEOMETRYCOLLECTION && LA6_8 <= GEOMETRY_SYM)||LA6_8==INT_SYM||LA6_8==LINESTRING||(LA6_8 >= LONGBLOB && LA6_8 <= LONGTEXT)||LA6_8==LONG_SYM||(LA6_8 >= MEDIUMBLOB && LA6_8 <= MEDIUMTEXT)||(LA6_8 >= MULTILINESTRING && LA6_8 <= MULTIPOLYGON)||LA6_8==NATIONAL_SYM||LA6_8==NCHAR_SYM||LA6_8==NUMERIC_SYM||LA6_8==NVARCHAR_SYM||(LA6_8 >= POINT_SYM && LA6_8 <= POLYGON)||LA6_8==REAL||LA6_8==SERIAL_SYM||LA6_8==SET||LA6_8==SMALLINT||LA6_8==TEXT_SYM||LA6_8==TIMESTAMP||(LA6_8 >= TIME_SYM && LA6_8 <= TINYTEXT)||(LA6_8 >= VARBINARY && LA6_8 <= VARCHAR)||LA6_8==YEAR_SYM) ) {
                            alt6=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA6_2 = input.LA(2);

                if ( ((LA6_2 >= BIGINT && LA6_2 <= BINARY)||(LA6_2 >= BIT_SYM && LA6_2 <= BLOB_SYM)||(LA6_2 >= BOOLEAN_SYM && LA6_2 <= BOOL_SYM)||LA6_2==CHAR_SYM||(LA6_2 >= DATETIME && LA6_2 <= DATE_SYM)||LA6_2==DECIMAL_SYM||LA6_2==DOUBLE_SYM||LA6_2==ENUM||LA6_2==FIXED_SYM||LA6_2==FLOAT_SYM||(LA6_2 >= GEOMETRYCOLLECTION && LA6_2 <= GEOMETRY_SYM)||LA6_2==INT_SYM||LA6_2==LINESTRING||(LA6_2 >= LONGBLOB && LA6_2 <= LONGTEXT)||LA6_2==LONG_SYM||(LA6_2 >= MEDIUMBLOB && LA6_2 <= MEDIUMTEXT)||(LA6_2 >= MULTILINESTRING && LA6_2 <= MULTIPOLYGON)||LA6_2==NATIONAL_SYM||LA6_2==NCHAR_SYM||LA6_2==NUMERIC_SYM||LA6_2==NVARCHAR_SYM||(LA6_2 >= POINT_SYM && LA6_2 <= POLYGON)||LA6_2==REAL||LA6_2==SERIAL_SYM||LA6_2==SET||LA6_2==SMALLINT||LA6_2==TEXT_SYM||LA6_2==TIMESTAMP||(LA6_2 >= TIME_SYM && LA6_2 <= TINYTEXT)||(LA6_2 >= VARBINARY && LA6_2 <= VARCHAR)||LA6_2==YEAR_SYM) ) {
                    alt6=1;
                }
                else if ( (LA6_2==553) ) {
                    int LA6_6 = input.LA(3);

                    if ( (LA6_6==IDENT_QUOTED) ) {
                        int LA6_9 = input.LA(4);

                        if ( (LA6_9==553) ) {
                            alt6=2;
                        }
                        else if ( ((LA6_9 >= BIGINT && LA6_9 <= BINARY)||(LA6_9 >= BIT_SYM && LA6_9 <= BLOB_SYM)||(LA6_9 >= BOOLEAN_SYM && LA6_9 <= BOOL_SYM)||LA6_9==CHAR_SYM||(LA6_9 >= DATETIME && LA6_9 <= DATE_SYM)||LA6_9==DECIMAL_SYM||LA6_9==DOUBLE_SYM||LA6_9==ENUM||LA6_9==FIXED_SYM||LA6_9==FLOAT_SYM||(LA6_9 >= GEOMETRYCOLLECTION && LA6_9 <= GEOMETRY_SYM)||LA6_9==INT_SYM||LA6_9==LINESTRING||(LA6_9 >= LONGBLOB && LA6_9 <= LONGTEXT)||LA6_9==LONG_SYM||(LA6_9 >= MEDIUMBLOB && LA6_9 <= MEDIUMTEXT)||(LA6_9 >= MULTILINESTRING && LA6_9 <= MULTIPOLYGON)||LA6_9==NATIONAL_SYM||LA6_9==NCHAR_SYM||LA6_9==NUMERIC_SYM||LA6_9==NVARCHAR_SYM||(LA6_9 >= POINT_SYM && LA6_9 <= POLYGON)||LA6_9==REAL||LA6_9==SERIAL_SYM||LA6_9==SET||LA6_9==SMALLINT||LA6_9==TEXT_SYM||LA6_9==TIMESTAMP||(LA6_9 >= TIME_SYM && LA6_9 <= TINYTEXT)||(LA6_9 >= VARBINARY && LA6_9 <= VARCHAR)||LA6_9==YEAR_SYM) ) {
                            alt6=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 9, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA6_6==IDENT) ) {
                        int LA6_10 = input.LA(4);

                        if ( (LA6_10==553) ) {
                            alt6=2;
                        }
                        else if ( ((LA6_10 >= BIGINT && LA6_10 <= BINARY)||(LA6_10 >= BIT_SYM && LA6_10 <= BLOB_SYM)||(LA6_10 >= BOOLEAN_SYM && LA6_10 <= BOOL_SYM)||LA6_10==CHAR_SYM||(LA6_10 >= DATETIME && LA6_10 <= DATE_SYM)||LA6_10==DECIMAL_SYM||LA6_10==DOUBLE_SYM||LA6_10==ENUM||LA6_10==FIXED_SYM||LA6_10==FLOAT_SYM||(LA6_10 >= GEOMETRYCOLLECTION && LA6_10 <= GEOMETRY_SYM)||LA6_10==INT_SYM||LA6_10==LINESTRING||(LA6_10 >= LONGBLOB && LA6_10 <= LONGTEXT)||LA6_10==LONG_SYM||(LA6_10 >= MEDIUMBLOB && LA6_10 <= MEDIUMTEXT)||(LA6_10 >= MULTILINESTRING && LA6_10 <= MULTIPOLYGON)||LA6_10==NATIONAL_SYM||LA6_10==NCHAR_SYM||LA6_10==NUMERIC_SYM||LA6_10==NVARCHAR_SYM||(LA6_10 >= POINT_SYM && LA6_10 <= POLYGON)||LA6_10==REAL||LA6_10==SERIAL_SYM||LA6_10==SET||LA6_10==SMALLINT||LA6_10==TEXT_SYM||LA6_10==TIMESTAMP||(LA6_10 >= TIME_SYM && LA6_10 <= TINYTEXT)||(LA6_10 >= VARBINARY && LA6_10 <= VARCHAR)||LA6_10==YEAR_SYM) ) {
                            alt6=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 10, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case 553:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // MySQL.g:941:11: ident
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ident_in_field_ident6845);
                    ident19=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident19.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:942:11: ident '.' ident '.' ident
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ident_in_field_ident6858);
                    ident20=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident20.getTree());

                    char_literal21=(Token)match(input,553,FOLLOW_553_in_field_ident6860); 
                    char_literal21_tree = 
                    (Object)adaptor.create(char_literal21)
                    ;
                    adaptor.addChild(root_0, char_literal21_tree);


                    pushFollow(FOLLOW_ident_in_field_ident6862);
                    ident22=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident22.getTree());

                    char_literal23=(Token)match(input,553,FOLLOW_553_in_field_ident6864); 
                    char_literal23_tree = 
                    (Object)adaptor.create(char_literal23)
                    ;
                    adaptor.addChild(root_0, char_literal23_tree);


                    pushFollow(FOLLOW_ident_in_field_ident6866);
                    ident24=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident24.getTree());

                    }
                    break;
                case 3 :
                    // MySQL.g:943:11: ident '.' ident
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ident_in_field_ident6878);
                    ident25=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident25.getTree());

                    char_literal26=(Token)match(input,553,FOLLOW_553_in_field_ident6880); 
                    char_literal26_tree = 
                    (Object)adaptor.create(char_literal26)
                    ;
                    adaptor.addChild(root_0, char_literal26_tree);


                    pushFollow(FOLLOW_ident_in_field_ident6882);
                    ident27=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident27.getTree());

                    }
                    break;
                case 4 :
                    // MySQL.g:944:11: '.' ident
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal28=(Token)match(input,553,FOLLOW_553_in_field_ident6894); 
                    char_literal28_tree = 
                    (Object)adaptor.create(char_literal28)
                    ;
                    adaptor.addChild(root_0, char_literal28_tree);


                    pushFollow(FOLLOW_ident_in_field_ident6896);
                    ident29=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident29.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_ident"


    public static class table_ident_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_ident"
    // MySQL.g:947:1: table_ident : ( ident | ident '.' ident | '.' ident );
    public final MySQLParser.table_ident_return table_ident() throws RecognitionException {
        MySQLParser.table_ident_return retval = new MySQLParser.table_ident_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal32=null;
        Token char_literal34=null;
        MySQLParser.ident_return ident30 =null;

        MySQLParser.ident_return ident31 =null;

        MySQLParser.ident_return ident33 =null;

        MySQLParser.ident_return ident35 =null;


        Object char_literal32_tree=null;
        Object char_literal34_tree=null;

        try {
            // MySQL.g:947:12: ( ident | ident '.' ident | '.' ident )
            int alt7=3;
            switch ( input.LA(1) ) {
            case IDENT_QUOTED:
                {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1 >= CHARSET && LA7_1 <= CHAR_SYM)||LA7_1==DEFAULT||LA7_1==ENGINE_SYM||LA7_1==MATCH||LA7_1==ON||(LA7_1 >= 548 && LA7_1 <= 549)||LA7_1==551) ) {
                    alt7=1;
                }
                else if ( (LA7_1==553) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA7_2 = input.LA(2);

                if ( ((LA7_2 >= CHARSET && LA7_2 <= CHAR_SYM)||LA7_2==DEFAULT||LA7_2==ENGINE_SYM||LA7_2==MATCH||LA7_2==ON||(LA7_2 >= 548 && LA7_2 <= 549)||LA7_2==551) ) {
                    alt7=1;
                }
                else if ( (LA7_2==553) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;

                }
                }
                break;
            case 553:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // MySQL.g:948:11: ident
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ident_in_table_ident6941);
                    ident30=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident30.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:949:11: ident '.' ident
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ident_in_table_ident6953);
                    ident31=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident31.getTree());

                    char_literal32=(Token)match(input,553,FOLLOW_553_in_table_ident6955); 
                    char_literal32_tree = 
                    (Object)adaptor.create(char_literal32)
                    ;
                    adaptor.addChild(root_0, char_literal32_tree);


                    pushFollow(FOLLOW_ident_in_table_ident6957);
                    ident33=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident33.getTree());

                    }
                    break;
                case 3 :
                    // MySQL.g:950:11: '.' ident
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal34=(Token)match(input,553,FOLLOW_553_in_table_ident6969); 
                    char_literal34_tree = 
                    (Object)adaptor.create(char_literal34)
                    ;
                    adaptor.addChild(root_0, char_literal34_tree);


                    pushFollow(FOLLOW_ident_in_table_ident6971);
                    ident35=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident35.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_ident"


    public static class ident_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ident"
    // MySQL.g:953:1: ident : ident_sys ;
    public final MySQLParser.ident_return ident() throws RecognitionException {
        MySQLParser.ident_return retval = new MySQLParser.ident_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.ident_sys_return ident_sys36 =null;



        try {
            // MySQL.g:953:6: ( ident_sys )
            // MySQL.g:954:4: ident_sys
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ident_sys_in_ident7007);
            ident_sys36=ident_sys();

            state._fsp--;

            adaptor.addChild(root_0, ident_sys36.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ident"


    public static class ident_sys_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ident_sys"
    // MySQL.g:960:1: ident_sys : ( IDENT_QUOTED |{...}? IDENT );
    public final MySQLParser.ident_sys_return ident_sys() throws RecognitionException {
        MySQLParser.ident_sys_return retval = new MySQLParser.ident_sys_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT_QUOTED37=null;
        Token IDENT38=null;

        Object IDENT_QUOTED37_tree=null;
        Object IDENT38_tree=null;

        try {
            // MySQL.g:960:10: ( IDENT_QUOTED |{...}? IDENT )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENT_QUOTED) ) {
                alt8=1;
            }
            else if ( (LA8_0==IDENT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // MySQL.g:961:11: IDENT_QUOTED
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENT_QUOTED37=(Token)match(input,IDENT_QUOTED,FOLLOW_IDENT_QUOTED_in_ident_sys7036); 
                    IDENT_QUOTED37_tree = 
                    (Object)adaptor.create(IDENT_QUOTED37)
                    ;
                    adaptor.addChild(root_0, IDENT_QUOTED37_tree);


                    }
                    break;
                case 2 :
                    // MySQL.g:962:11: {...}? IDENT
                    {
                    root_0 = (Object)adaptor.nil();


                    if ( !((! isReservedWord(input.LT(1).getText()))) ) {
                        throw new FailedPredicateException(input, "ident_sys", "! isReservedWord(input.LT(1).getText())");
                    }

                    IDENT38=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident_sys7050); 
                    IDENT38_tree = 
                    (Object)adaptor.create(IDENT38)
                    ;
                    adaptor.addChild(root_0, IDENT38_tree);


                    /* TODO check if not reserved word or special character or contains only digits */

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ident_sys"


    public static class create_table_options_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_table_options"
    // MySQL.g:967:1: create_table_options : create_table_option ( ( ',' )? create_table_option )* ;
    public final MySQLParser.create_table_options_return create_table_options() throws RecognitionException {
        MySQLParser.create_table_options_return retval = new MySQLParser.create_table_options_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal40=null;
        MySQLParser.create_table_option_return create_table_option39 =null;

        MySQLParser.create_table_option_return create_table_option41 =null;


        Object char_literal40_tree=null;

        try {
            // MySQL.g:967:21: ( create_table_option ( ( ',' )? create_table_option )* )
            // MySQL.g:968:2: create_table_option ( ( ',' )? create_table_option )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_create_table_option_in_create_table_options7072);
            create_table_option39=create_table_option();

            state._fsp--;

            adaptor.addChild(root_0, create_table_option39.getTree());

            // MySQL.g:968:22: ( ( ',' )? create_table_option )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= CHARSET && LA10_0 <= CHAR_SYM)||LA10_0==DEFAULT||LA10_0==ENGINE_SYM||LA10_0==551) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // MySQL.g:968:23: ( ',' )? create_table_option
            	    {
            	    // MySQL.g:968:23: ( ',' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==551) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // MySQL.g:968:23: ','
            	            {
            	            char_literal40=(Token)match(input,551,FOLLOW_551_in_create_table_options7075); 
            	            char_literal40_tree = 
            	            (Object)adaptor.create(char_literal40)
            	            ;
            	            adaptor.addChild(root_0, char_literal40_tree);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_create_table_option_in_create_table_options7078);
            	    create_table_option41=create_table_option();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create_table_option41.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_table_options"


    public static class create_table_option_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_table_option"
    // MySQL.g:972:1: create_table_option : ( ENGINE_SYM ( equal )? storage_engines | default_charset );
    public final MySQLParser.create_table_option_return create_table_option() throws RecognitionException {
        MySQLParser.create_table_option_return retval = new MySQLParser.create_table_option_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ENGINE_SYM42=null;
        MySQLParser.equal_return equal43 =null;

        MySQLParser.storage_engines_return storage_engines44 =null;

        MySQLParser.default_charset_return default_charset45 =null;


        Object ENGINE_SYM42_tree=null;

        try {
            // MySQL.g:972:20: ( ENGINE_SYM ( equal )? storage_engines | default_charset )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ENGINE_SYM) ) {
                alt12=1;
            }
            else if ( ((LA12_0 >= CHARSET && LA12_0 <= CHAR_SYM)||LA12_0==DEFAULT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // MySQL.g:973:13: ENGINE_SYM ( equal )? storage_engines
                    {
                    root_0 = (Object)adaptor.nil();


                    ENGINE_SYM42=(Token)match(input,ENGINE_SYM,FOLLOW_ENGINE_SYM_in_create_table_option7101); 
                    ENGINE_SYM42_tree = 
                    (Object)adaptor.create(ENGINE_SYM42)
                    ;
                    adaptor.addChild(root_0, ENGINE_SYM42_tree);


                    // MySQL.g:973:24: ( equal )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==EQ||LA11_0==SET_VAR) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // MySQL.g:973:24: equal
                            {
                            pushFollow(FOLLOW_equal_in_create_table_option7103);
                            equal43=equal();

                            state._fsp--;

                            adaptor.addChild(root_0, equal43.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_storage_engines_in_create_table_option7106);
                    storage_engines44=storage_engines();

                    state._fsp--;

                    adaptor.addChild(root_0, storage_engines44.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:989:13: default_charset
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_default_charset_in_create_table_option7135);
                    default_charset45=default_charset();

                    state._fsp--;

                    adaptor.addChild(root_0, default_charset45.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_table_option"


    public static class default_charset_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "default_charset"
    // MySQL.g:1002:1: default_charset : ( DEFAULT )? charset ( equal )? charset_name_or_default ;
    public final MySQLParser.default_charset_return default_charset() throws RecognitionException {
        MySQLParser.default_charset_return retval = new MySQLParser.default_charset_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFAULT46=null;
        MySQLParser.charset_return charset47 =null;

        MySQLParser.equal_return equal48 =null;

        MySQLParser.charset_name_or_default_return charset_name_or_default49 =null;


        Object DEFAULT46_tree=null;

        try {
            // MySQL.g:1002:16: ( ( DEFAULT )? charset ( equal )? charset_name_or_default )
            // MySQL.g:1003:11: ( DEFAULT )? charset ( equal )? charset_name_or_default
            {
            root_0 = (Object)adaptor.nil();


            // MySQL.g:1003:11: ( DEFAULT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DEFAULT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // MySQL.g:1003:11: DEFAULT
                    {
                    DEFAULT46=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_default_charset7171); 
                    DEFAULT46_tree = 
                    (Object)adaptor.create(DEFAULT46)
                    ;
                    adaptor.addChild(root_0, DEFAULT46_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_charset_in_default_charset7174);
            charset47=charset();

            state._fsp--;

            adaptor.addChild(root_0, charset47.getTree());

            // MySQL.g:1003:28: ( equal )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQ||LA14_0==SET_VAR) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // MySQL.g:1003:28: equal
                    {
                    pushFollow(FOLLOW_equal_in_default_charset7176);
                    equal48=equal();

                    state._fsp--;

                    adaptor.addChild(root_0, equal48.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_charset_name_or_default_in_default_charset7179);
            charset_name_or_default49=charset_name_or_default();

            state._fsp--;

            adaptor.addChild(root_0, charset_name_or_default49.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "default_charset"


    public static class equal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equal"
    // MySQL.g:1006:1: equal : ( EQ | SET_VAR );
    public final MySQLParser.equal_return equal() throws RecognitionException {
        MySQLParser.equal_return retval = new MySQLParser.equal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set50=null;

        Object set50_tree=null;

        try {
            // MySQL.g:1006:6: ( EQ | SET_VAR )
            // MySQL.g:
            {
            root_0 = (Object)adaptor.nil();


            set50=(Token)input.LT(1);

            if ( input.LA(1)==EQ||input.LA(1)==SET_VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set50)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equal"


    public static class storage_engines_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "storage_engines"
    // MySQL.g:1011:1: storage_engines : ident_or_text ;
    public final MySQLParser.storage_engines_return storage_engines() throws RecognitionException {
        MySQLParser.storage_engines_return retval = new MySQLParser.storage_engines_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.ident_or_text_return ident_or_text51 =null;



        try {
            // MySQL.g:1011:16: ( ident_or_text )
            // MySQL.g:1012:11: ident_or_text
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ident_or_text_in_storage_engines7245);
            ident_or_text51=ident_or_text();

            state._fsp--;

            adaptor.addChild(root_0, ident_or_text51.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "storage_engines"


    public static class ident_or_text_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ident_or_text"
    // MySQL.g:1015:1: ident_or_text : ( ident | text_string_sys );
    public final MySQLParser.ident_or_text_return ident_or_text() throws RecognitionException {
        MySQLParser.ident_or_text_return retval = new MySQLParser.ident_or_text_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.ident_return ident52 =null;

        MySQLParser.text_string_sys_return text_string_sys53 =null;



        try {
            // MySQL.g:1015:14: ( ident | text_string_sys )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT||LA15_0==IDENT_QUOTED) ) {
                alt15=1;
            }
            else if ( (LA15_0==TEXT_STRING) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // MySQL.g:1016:11: ident
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ident_in_ident_or_text7271);
                    ident52=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident52.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1017:11: text_string_sys
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_text_string_sys_in_ident_or_text7294);
                    text_string_sys53=text_string_sys();

                    state._fsp--;

                    adaptor.addChild(root_0, text_string_sys53.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ident_or_text"


    public static class field_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_list"
    // MySQL.g:1023:1: field_list[String tableName] : field_list_item[tableName] ( ',' field_list_item[tableName] )* ;
    public final MySQLParser.field_list_return field_list(String tableName) throws RecognitionException {
        MySQLParser.field_list_return retval = new MySQLParser.field_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal55=null;
        MySQLParser.field_list_item_return field_list_item54 =null;

        MySQLParser.field_list_item_return field_list_item56 =null;


        Object char_literal55_tree=null;

        try {
            // MySQL.g:1023:30: ( field_list_item[tableName] ( ',' field_list_item[tableName] )* )
            // MySQL.g:1024:11: field_list_item[tableName] ( ',' field_list_item[tableName] )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_field_list_item_in_field_list7326);
            field_list_item54=field_list_item(tableName);

            state._fsp--;

            adaptor.addChild(root_0, field_list_item54.getTree());

            // MySQL.g:1024:38: ( ',' field_list_item[tableName] )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==551) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // MySQL.g:1024:39: ',' field_list_item[tableName]
            	    {
            	    char_literal55=(Token)match(input,551,FOLLOW_551_in_field_list7330); 
            	    char_literal55_tree = 
            	    (Object)adaptor.create(char_literal55)
            	    ;
            	    adaptor.addChild(root_0, char_literal55_tree);


            	    pushFollow(FOLLOW_field_list_item_in_field_list7332);
            	    field_list_item56=field_list_item(tableName);

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_list_item56.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_list"


    public static class field_list_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_list_item"
    // MySQL.g:1027:1: field_list_item[String tableName] : ( column_def[tableName] | key_def );
    public final MySQLParser.field_list_item_return field_list_item(String tableName) throws RecognitionException {
        MySQLParser.field_list_item_return retval = new MySQLParser.field_list_item_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.column_def_return column_def57 =null;

        MySQLParser.key_def_return key_def58 =null;



        try {
            // MySQL.g:1027:35: ( column_def[tableName] | key_def )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT||LA17_0==IDENT_QUOTED||LA17_0==553) ) {
                alt17=1;
            }
            else if ( (LA17_0==CONSTRAINT||LA17_0==FOREIGN||LA17_0==FULLTEXT_SYM||LA17_0==INDEX_SYM||LA17_0==KEY_SYM||LA17_0==PRIMARY_SYM||LA17_0==SPATIAL_SYM||LA17_0==UNIQUE_SYM) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // MySQL.g:1028:11: column_def[tableName]
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_column_def_in_field_list_item7363);
                    column_def57=column_def(tableName);

                    state._fsp--;

                    adaptor.addChild(root_0, column_def57.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1029:11: key_def
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_key_def_in_field_list_item7376);
                    key_def58=key_def();

                    state._fsp--;

                    adaptor.addChild(root_0, key_def58.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_list_item"


    public static class column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_def"
    // MySQL.g:1032:1: column_def[String tableName] : field_spec[tableName] ;
    public final MySQLParser.column_def_return column_def(String tableName) throws RecognitionException {
        MySQLParser.column_def_return retval = new MySQLParser.column_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.field_spec_return field_spec59 =null;



        try {
            // MySQL.g:1032:30: ( field_spec[tableName] )
            // MySQL.g:1033:11: field_spec[tableName]
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_field_spec_in_column_def7404);
            field_spec59=field_spec(tableName);

            state._fsp--;

            adaptor.addChild(root_0, field_spec59.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_def"


    public static class key_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_def"
    // MySQL.g:1037:1: key_def : ( key_type ( ident )? key_alg '(' key_list ')' key_options | ( constraint )? constraint_key_type ( ident )? key_alg '(' key_list ')' key_options | ( constraint )? FOREIGN KEY_SYM ( ident )? '(' key_list ')' references );
    public final MySQLParser.key_def_return key_def() throws RecognitionException {
        MySQLParser.key_def_return retval = new MySQLParser.key_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal63=null;
        Token char_literal65=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token FOREIGN76=null;
        Token KEY_SYM77=null;
        Token char_literal79=null;
        Token char_literal81=null;
        MySQLParser.key_type_return key_type60 =null;

        MySQLParser.ident_return ident61 =null;

        MySQLParser.key_alg_return key_alg62 =null;

        MySQLParser.key_list_return key_list64 =null;

        MySQLParser.key_options_return key_options66 =null;

        MySQLParser.constraint_return constraint67 =null;

        MySQLParser.constraint_key_type_return constraint_key_type68 =null;

        MySQLParser.ident_return ident69 =null;

        MySQLParser.key_alg_return key_alg70 =null;

        MySQLParser.key_list_return key_list72 =null;

        MySQLParser.key_options_return key_options74 =null;

        MySQLParser.constraint_return constraint75 =null;

        MySQLParser.ident_return ident78 =null;

        MySQLParser.key_list_return key_list80 =null;

        MySQLParser.references_return references82 =null;


        Object char_literal63_tree=null;
        Object char_literal65_tree=null;
        Object char_literal71_tree=null;
        Object char_literal73_tree=null;
        Object FOREIGN76_tree=null;
        Object KEY_SYM77_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;

        try {
            // MySQL.g:1037:8: ( key_type ( ident )? key_alg '(' key_list ')' key_options | ( constraint )? constraint_key_type ( ident )? key_alg '(' key_list ')' key_options | ( constraint )? FOREIGN KEY_SYM ( ident )? '(' key_list ')' references )
            int alt23=3;
            switch ( input.LA(1) ) {
            case FULLTEXT_SYM:
            case INDEX_SYM:
            case KEY_SYM:
            case SPATIAL_SYM:
                {
                alt23=1;
                }
                break;
            case CONSTRAINT:
                {
                switch ( input.LA(2) ) {
                case IDENT_QUOTED:
                    {
                    int LA23_5 = input.LA(3);

                    if ( (LA23_5==PRIMARY_SYM||LA23_5==UNIQUE_SYM) ) {
                        alt23=2;
                    }
                    else if ( (LA23_5==FOREIGN) ) {
                        alt23=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case IDENT:
                    {
                    int LA23_6 = input.LA(3);

                    if ( (LA23_6==PRIMARY_SYM||LA23_6==UNIQUE_SYM) ) {
                        alt23=2;
                    }
                    else if ( (LA23_6==FOREIGN) ) {
                        alt23=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 6, input);

                        throw nvae;

                    }
                    }
                    break;
                case PRIMARY_SYM:
                case UNIQUE_SYM:
                    {
                    alt23=2;
                    }
                    break;
                case FOREIGN:
                    {
                    alt23=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;

                }

                }
                break;
            case PRIMARY_SYM:
            case UNIQUE_SYM:
                {
                alt23=2;
                }
                break;
            case FOREIGN:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // MySQL.g:1038:11: key_type ( ident )? key_alg '(' key_list ')' key_options
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_key_type_in_key_def7433);
                    key_type60=key_type();

                    state._fsp--;

                    adaptor.addChild(root_0, key_type60.getTree());

                    // MySQL.g:1038:20: ( ident )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==IDENT||LA18_0==IDENT_QUOTED) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // MySQL.g:1038:20: ident
                            {
                            pushFollow(FOLLOW_ident_in_key_def7435);
                            ident61=ident();

                            state._fsp--;

                            adaptor.addChild(root_0, ident61.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_key_alg_in_key_def7438);
                    key_alg62=key_alg();

                    state._fsp--;

                    adaptor.addChild(root_0, key_alg62.getTree());

                    char_literal63=(Token)match(input,548,FOLLOW_548_in_key_def7440); 
                    char_literal63_tree = 
                    (Object)adaptor.create(char_literal63)
                    ;
                    adaptor.addChild(root_0, char_literal63_tree);


                    pushFollow(FOLLOW_key_list_in_key_def7442);
                    key_list64=key_list();

                    state._fsp--;

                    adaptor.addChild(root_0, key_list64.getTree());

                    char_literal65=(Token)match(input,549,FOLLOW_549_in_key_def7444); 
                    char_literal65_tree = 
                    (Object)adaptor.create(char_literal65)
                    ;
                    adaptor.addChild(root_0, char_literal65_tree);


                    pushFollow(FOLLOW_key_options_in_key_def7446);
                    key_options66=key_options();

                    state._fsp--;

                    adaptor.addChild(root_0, key_options66.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1039:11: ( constraint )? constraint_key_type ( ident )? key_alg '(' key_list ')' key_options
                    {
                    root_0 = (Object)adaptor.nil();


                    // MySQL.g:1039:11: ( constraint )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==CONSTRAINT) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // MySQL.g:1039:11: constraint
                            {
                            pushFollow(FOLLOW_constraint_in_key_def7458);
                            constraint67=constraint();

                            state._fsp--;

                            adaptor.addChild(root_0, constraint67.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_constraint_key_type_in_key_def7461);
                    constraint_key_type68=constraint_key_type();

                    state._fsp--;

                    adaptor.addChild(root_0, constraint_key_type68.getTree());

                    // MySQL.g:1039:43: ( ident )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==IDENT||LA20_0==IDENT_QUOTED) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // MySQL.g:1039:43: ident
                            {
                            pushFollow(FOLLOW_ident_in_key_def7463);
                            ident69=ident();

                            state._fsp--;

                            adaptor.addChild(root_0, ident69.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_key_alg_in_key_def7466);
                    key_alg70=key_alg();

                    state._fsp--;

                    adaptor.addChild(root_0, key_alg70.getTree());

                    char_literal71=(Token)match(input,548,FOLLOW_548_in_key_def7468); 
                    char_literal71_tree = 
                    (Object)adaptor.create(char_literal71)
                    ;
                    adaptor.addChild(root_0, char_literal71_tree);


                    pushFollow(FOLLOW_key_list_in_key_def7470);
                    key_list72=key_list();

                    state._fsp--;

                    adaptor.addChild(root_0, key_list72.getTree());

                    char_literal73=(Token)match(input,549,FOLLOW_549_in_key_def7472); 
                    char_literal73_tree = 
                    (Object)adaptor.create(char_literal73)
                    ;
                    adaptor.addChild(root_0, char_literal73_tree);


                    pushFollow(FOLLOW_key_options_in_key_def7474);
                    key_options74=key_options();

                    state._fsp--;

                    adaptor.addChild(root_0, key_options74.getTree());

                    }
                    break;
                case 3 :
                    // MySQL.g:1040:11: ( constraint )? FOREIGN KEY_SYM ( ident )? '(' key_list ')' references
                    {
                    root_0 = (Object)adaptor.nil();


                    // MySQL.g:1040:11: ( constraint )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==CONSTRAINT) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // MySQL.g:1040:11: constraint
                            {
                            pushFollow(FOLLOW_constraint_in_key_def7486);
                            constraint75=constraint();

                            state._fsp--;

                            adaptor.addChild(root_0, constraint75.getTree());

                            }
                            break;

                    }


                    FOREIGN76=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_key_def7489); 
                    FOREIGN76_tree = 
                    (Object)adaptor.create(FOREIGN76)
                    ;
                    adaptor.addChild(root_0, FOREIGN76_tree);


                    KEY_SYM77=(Token)match(input,KEY_SYM,FOLLOW_KEY_SYM_in_key_def7491); 
                    KEY_SYM77_tree = 
                    (Object)adaptor.create(KEY_SYM77)
                    ;
                    adaptor.addChild(root_0, KEY_SYM77_tree);


                    // MySQL.g:1040:39: ( ident )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==IDENT||LA22_0==IDENT_QUOTED) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // MySQL.g:1040:39: ident
                            {
                            pushFollow(FOLLOW_ident_in_key_def7493);
                            ident78=ident();

                            state._fsp--;

                            adaptor.addChild(root_0, ident78.getTree());

                            }
                            break;

                    }


                    char_literal79=(Token)match(input,548,FOLLOW_548_in_key_def7496); 
                    char_literal79_tree = 
                    (Object)adaptor.create(char_literal79)
                    ;
                    adaptor.addChild(root_0, char_literal79_tree);


                    pushFollow(FOLLOW_key_list_in_key_def7498);
                    key_list80=key_list();

                    state._fsp--;

                    adaptor.addChild(root_0, key_list80.getTree());

                    char_literal81=(Token)match(input,549,FOLLOW_549_in_key_def7500); 
                    char_literal81_tree = 
                    (Object)adaptor.create(char_literal81)
                    ;
                    adaptor.addChild(root_0, char_literal81_tree);


                    pushFollow(FOLLOW_references_in_key_def7502);
                    references82=references();

                    state._fsp--;

                    adaptor.addChild(root_0, references82.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key_def"


    public static class key_alg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_alg"
    // MySQL.g:1046:1: key_alg : ( init_key_options | init_key_options key_using_alg );
    public final MySQLParser.key_alg_return key_alg() throws RecognitionException {
        MySQLParser.key_alg_return retval = new MySQLParser.key_alg_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.init_key_options_return init_key_options83 =null;

        MySQLParser.init_key_options_return init_key_options84 =null;

        MySQLParser.key_using_alg_return key_using_alg85 =null;



        try {
            // MySQL.g:1046:8: ( init_key_options | init_key_options key_using_alg )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==548) ) {
                alt24=1;
            }
            else if ( (LA24_0==TYPE_SYM||LA24_0==USING) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // MySQL.g:1047:11: init_key_options
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_key_options_in_key_alg7536);
                    init_key_options83=init_key_options();

                    state._fsp--;

                    adaptor.addChild(root_0, init_key_options83.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1048:11: init_key_options key_using_alg
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_key_options_in_key_alg7548);
                    init_key_options84=init_key_options();

                    state._fsp--;

                    adaptor.addChild(root_0, init_key_options84.getTree());

                    pushFollow(FOLLOW_key_using_alg_in_key_alg7550);
                    key_using_alg85=key_using_alg();

                    state._fsp--;

                    adaptor.addChild(root_0, key_using_alg85.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key_alg"


    public static class init_key_options_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_key_options"
    // MySQL.g:1051:1: init_key_options :;
    public final MySQLParser.init_key_options_return init_key_options() throws RecognitionException {
        MySQLParser.init_key_options_return retval = new MySQLParser.init_key_options_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        try {
            // MySQL.g:1051:17: ()
            // MySQL.g:1052:9: 
            {
            root_0 = (Object)adaptor.nil();


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "init_key_options"


    public static class key_options_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_options"
    // MySQL.g:1054:1: key_options : ( key_opts )? ;
    public final MySQLParser.key_options_return key_options() throws RecognitionException {
        MySQLParser.key_options_return retval = new MySQLParser.key_options_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.key_opts_return key_opts86 =null;



        try {
            // MySQL.g:1054:12: ( ( key_opts )? )
            // MySQL.g:1055:11: ( key_opts )?
            {
            root_0 = (Object)adaptor.nil();


            // MySQL.g:1055:11: ( key_opts )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEY_BLOCK_SIZE||LA25_0==TYPE_SYM||LA25_0==USING||LA25_0==WITH) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // MySQL.g:1055:11: key_opts
                    {
                    pushFollow(FOLLOW_key_opts_in_key_options7590);
                    key_opts86=key_opts();

                    state._fsp--;

                    adaptor.addChild(root_0, key_opts86.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key_options"


    public static class key_opts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_opts"
    // MySQL.g:1058:1: key_opts : ( key_opt )+ ;
    public final MySQLParser.key_opts_return key_opts() throws RecognitionException {
        MySQLParser.key_opts_return retval = new MySQLParser.key_opts_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.key_opt_return key_opt87 =null;



        try {
            // MySQL.g:1058:9: ( ( key_opt )+ )
            // MySQL.g:1059:11: ( key_opt )+
            {
            root_0 = (Object)adaptor.nil();


            // MySQL.g:1059:11: ( key_opt )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==KEY_BLOCK_SIZE||LA26_0==TYPE_SYM||LA26_0==USING||LA26_0==WITH) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // MySQL.g:1059:11: key_opt
            	    {
            	    pushFollow(FOLLOW_key_opt_in_key_opts7617);
            	    key_opt87=key_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, key_opt87.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key_opts"


    public static class key_using_alg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_using_alg"
    // MySQL.g:1062:1: key_using_alg : ( USING btree_or_rtree | TYPE_SYM btree_or_rtree );
    public final MySQLParser.key_using_alg_return key_using_alg() throws RecognitionException {
        MySQLParser.key_using_alg_return retval = new MySQLParser.key_using_alg_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token USING88=null;
        Token TYPE_SYM90=null;
        MySQLParser.btree_or_rtree_return btree_or_rtree89 =null;

        MySQLParser.btree_or_rtree_return btree_or_rtree91 =null;


        Object USING88_tree=null;
        Object TYPE_SYM90_tree=null;

        try {
            // MySQL.g:1062:14: ( USING btree_or_rtree | TYPE_SYM btree_or_rtree )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==USING) ) {
                alt27=1;
            }
            else if ( (LA27_0==TYPE_SYM) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // MySQL.g:1063:11: USING btree_or_rtree
                    {
                    root_0 = (Object)adaptor.nil();


                    USING88=(Token)match(input,USING,FOLLOW_USING_in_key_using_alg7644); 
                    USING88_tree = 
                    (Object)adaptor.create(USING88)
                    ;
                    adaptor.addChild(root_0, USING88_tree);


                    pushFollow(FOLLOW_btree_or_rtree_in_key_using_alg7646);
                    btree_or_rtree89=btree_or_rtree();

                    state._fsp--;

                    adaptor.addChild(root_0, btree_or_rtree89.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1064:11: TYPE_SYM btree_or_rtree
                    {
                    root_0 = (Object)adaptor.nil();


                    TYPE_SYM90=(Token)match(input,TYPE_SYM,FOLLOW_TYPE_SYM_in_key_using_alg7663); 
                    TYPE_SYM90_tree = 
                    (Object)adaptor.create(TYPE_SYM90)
                    ;
                    adaptor.addChild(root_0, TYPE_SYM90_tree);


                    pushFollow(FOLLOW_btree_or_rtree_in_key_using_alg7665);
                    btree_or_rtree91=btree_or_rtree();

                    state._fsp--;

                    adaptor.addChild(root_0, btree_or_rtree91.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key_using_alg"


    public static class key_opt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_opt"
    // MySQL.g:1067:1: key_opt : ( key_using_alg | KEY_BLOCK_SIZE ( equal )? ulong_num | WITH PARSER_SYM ident_sys );
    public final MySQLParser.key_opt_return key_opt() throws RecognitionException {
        MySQLParser.key_opt_return retval = new MySQLParser.key_opt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token KEY_BLOCK_SIZE93=null;
        Token WITH96=null;
        Token PARSER_SYM97=null;
        MySQLParser.key_using_alg_return key_using_alg92 =null;

        MySQLParser.equal_return equal94 =null;

        MySQLParser.ulong_num_return ulong_num95 =null;

        MySQLParser.ident_sys_return ident_sys98 =null;


        Object KEY_BLOCK_SIZE93_tree=null;
        Object WITH96_tree=null;
        Object PARSER_SYM97_tree=null;

        try {
            // MySQL.g:1067:8: ( key_using_alg | KEY_BLOCK_SIZE ( equal )? ulong_num | WITH PARSER_SYM ident_sys )
            int alt29=3;
            switch ( input.LA(1) ) {
            case TYPE_SYM:
            case USING:
                {
                alt29=1;
                }
                break;
            case KEY_BLOCK_SIZE:
                {
                alt29=2;
                }
                break;
            case WITH:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // MySQL.g:1068:11: key_using_alg
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_key_using_alg_in_key_opt7693);
                    key_using_alg92=key_using_alg();

                    state._fsp--;

                    adaptor.addChild(root_0, key_using_alg92.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1069:11: KEY_BLOCK_SIZE ( equal )? ulong_num
                    {
                    root_0 = (Object)adaptor.nil();


                    KEY_BLOCK_SIZE93=(Token)match(input,KEY_BLOCK_SIZE,FOLLOW_KEY_BLOCK_SIZE_in_key_opt7705); 
                    KEY_BLOCK_SIZE93_tree = 
                    (Object)adaptor.create(KEY_BLOCK_SIZE93)
                    ;
                    adaptor.addChild(root_0, KEY_BLOCK_SIZE93_tree);


                    // MySQL.g:1069:26: ( equal )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==EQ||LA28_0==SET_VAR) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // MySQL.g:1069:26: equal
                            {
                            pushFollow(FOLLOW_equal_in_key_opt7707);
                            equal94=equal();

                            state._fsp--;

                            adaptor.addChild(root_0, equal94.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_ulong_num_in_key_opt7710);
                    ulong_num95=ulong_num();

                    state._fsp--;

                    adaptor.addChild(root_0, ulong_num95.getTree());

                    }
                    break;
                case 3 :
                    // MySQL.g:1070:11: WITH PARSER_SYM ident_sys
                    {
                    root_0 = (Object)adaptor.nil();


                    WITH96=(Token)match(input,WITH,FOLLOW_WITH_in_key_opt7722); 
                    WITH96_tree = 
                    (Object)adaptor.create(WITH96)
                    ;
                    adaptor.addChild(root_0, WITH96_tree);


                    PARSER_SYM97=(Token)match(input,PARSER_SYM,FOLLOW_PARSER_SYM_in_key_opt7724); 
                    PARSER_SYM97_tree = 
                    (Object)adaptor.create(PARSER_SYM97)
                    ;
                    adaptor.addChild(root_0, PARSER_SYM97_tree);


                    pushFollow(FOLLOW_ident_sys_in_key_opt7726);
                    ident_sys98=ident_sys();

                    state._fsp--;

                    adaptor.addChild(root_0, ident_sys98.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key_opt"


    public static class btree_or_rtree_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "btree_or_rtree"
    // MySQL.g:1073:1: btree_or_rtree : ( BTREE_SYM | RTREE_SYM | HASH_SYM );
    public final MySQLParser.btree_or_rtree_return btree_or_rtree() throws RecognitionException {
        MySQLParser.btree_or_rtree_return retval = new MySQLParser.btree_or_rtree_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set99=null;

        Object set99_tree=null;

        try {
            // MySQL.g:1073:15: ( BTREE_SYM | RTREE_SYM | HASH_SYM )
            // MySQL.g:
            {
            root_0 = (Object)adaptor.nil();


            set99=(Token)input.LT(1);

            if ( input.LA(1)==BTREE_SYM||input.LA(1)==HASH_SYM||input.LA(1)==RTREE_SYM ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set99)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "btree_or_rtree"


    public static class key_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_list"
    // MySQL.g:1079:1: key_list : key_part order_dir ( ',' key_part order_dir )* ;
    public final MySQLParser.key_list_return key_list() throws RecognitionException {
        MySQLParser.key_list_return retval = new MySQLParser.key_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal102=null;
        MySQLParser.key_part_return key_part100 =null;

        MySQLParser.order_dir_return order_dir101 =null;

        MySQLParser.key_part_return key_part103 =null;

        MySQLParser.order_dir_return order_dir104 =null;


        Object char_literal102_tree=null;

        try {
            // MySQL.g:1079:9: ( key_part order_dir ( ',' key_part order_dir )* )
            // MySQL.g:1080:11: key_part order_dir ( ',' key_part order_dir )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_key_part_in_key_list7806);
            key_part100=key_part();

            state._fsp--;

            adaptor.addChild(root_0, key_part100.getTree());

            pushFollow(FOLLOW_order_dir_in_key_list7808);
            order_dir101=order_dir();

            state._fsp--;

            adaptor.addChild(root_0, order_dir101.getTree());

            // MySQL.g:1080:30: ( ',' key_part order_dir )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==551) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // MySQL.g:1080:31: ',' key_part order_dir
            	    {
            	    char_literal102=(Token)match(input,551,FOLLOW_551_in_key_list7811); 
            	    char_literal102_tree = 
            	    (Object)adaptor.create(char_literal102)
            	    ;
            	    adaptor.addChild(root_0, char_literal102_tree);


            	    pushFollow(FOLLOW_key_part_in_key_list7813);
            	    key_part103=key_part();

            	    state._fsp--;

            	    adaptor.addChild(root_0, key_part103.getTree());

            	    pushFollow(FOLLOW_order_dir_in_key_list7815);
            	    order_dir104=order_dir();

            	    state._fsp--;

            	    adaptor.addChild(root_0, order_dir104.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key_list"


    public static class key_part_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_part"
    // MySQL.g:1083:1: key_part : ( ident | ident '(' NUM ')' );
    public final MySQLParser.key_part_return key_part() throws RecognitionException {
        MySQLParser.key_part_return retval = new MySQLParser.key_part_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal107=null;
        Token NUM108=null;
        Token char_literal109=null;
        MySQLParser.ident_return ident105 =null;

        MySQLParser.ident_return ident106 =null;


        Object char_literal107_tree=null;
        Object NUM108_tree=null;
        Object char_literal109_tree=null;

        try {
            // MySQL.g:1083:9: ( ident | ident '(' NUM ')' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENT_QUOTED) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==ASC||LA31_1==DESC||LA31_1==549||LA31_1==551) ) {
                    alt31=1;
                }
                else if ( (LA31_1==548) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA31_0==IDENT) ) {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==ASC||LA31_2==DESC||LA31_2==549||LA31_2==551) ) {
                    alt31=1;
                }
                else if ( (LA31_2==548) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // MySQL.g:1084:11: ident
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ident_in_key_part7844);
                    ident105=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident105.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1085:11: ident '(' NUM ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ident_in_key_part7856);
                    ident106=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident106.getTree());

                    char_literal107=(Token)match(input,548,FOLLOW_548_in_key_part7858); 
                    char_literal107_tree = 
                    (Object)adaptor.create(char_literal107)
                    ;
                    adaptor.addChild(root_0, char_literal107_tree);


                    NUM108=(Token)match(input,NUM,FOLLOW_NUM_in_key_part7860); 
                    NUM108_tree = 
                    (Object)adaptor.create(NUM108)
                    ;
                    adaptor.addChild(root_0, NUM108_tree);


                    char_literal109=(Token)match(input,549,FOLLOW_549_in_key_part7862); 
                    char_literal109_tree = 
                    (Object)adaptor.create(char_literal109)
                    ;
                    adaptor.addChild(root_0, char_literal109_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key_part"


    public static class order_dir_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "order_dir"
    // MySQL.g:1088:1: order_dir : ( ASC | DESC )? ;
    public final MySQLParser.order_dir_return order_dir() throws RecognitionException {
        MySQLParser.order_dir_return retval = new MySQLParser.order_dir_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set110=null;

        Object set110_tree=null;

        try {
            // MySQL.g:1088:10: ( ( ASC | DESC )? )
            // MySQL.g:1089:9: ( ASC | DESC )?
            {
            root_0 = (Object)adaptor.nil();


            // MySQL.g:1089:9: ( ASC | DESC )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ASC||LA32_0==DESC) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // MySQL.g:
                    {
                    set110=(Token)input.LT(1);

                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set110)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "order_dir"


    public static class constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constraint"
    // MySQL.g:1101:1: constraint : CONSTRAINT ( ident )? ;
    public final MySQLParser.constraint_return constraint() throws RecognitionException {
        MySQLParser.constraint_return retval = new MySQLParser.constraint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONSTRAINT111=null;
        MySQLParser.ident_return ident112 =null;


        Object CONSTRAINT111_tree=null;

        try {
            // MySQL.g:1101:11: ( CONSTRAINT ( ident )? )
            // MySQL.g:1102:11: CONSTRAINT ( ident )?
            {
            root_0 = (Object)adaptor.nil();


            CONSTRAINT111=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint7957); 
            CONSTRAINT111_tree = 
            (Object)adaptor.create(CONSTRAINT111)
            ;
            adaptor.addChild(root_0, CONSTRAINT111_tree);


            // MySQL.g:1102:22: ( ident )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==IDENT||LA33_0==IDENT_QUOTED) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // MySQL.g:1102:22: ident
                    {
                    pushFollow(FOLLOW_ident_in_constraint7959);
                    ident112=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident112.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraint"


    public static class field_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_spec"
    // MySQL.g:1107:1: field_spec[String tableName] : c= field_ident type ( attribute )? ;
    public final MySQLParser.field_spec_return field_spec(String tableName) throws RecognitionException {
        MySQLParser.field_spec_return retval = new MySQLParser.field_spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.field_ident_return c =null;

        MySQLParser.type_return type113 =null;

        MySQLParser.attribute_return attribute114 =null;



        try {
            // MySQL.g:1107:30: (c= field_ident type ( attribute )? )
            // MySQL.g:1108:11: c= field_ident type ( attribute )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_field_ident_in_field_spec8001);
            c=field_ident();

            state._fsp--;

            adaptor.addChild(root_0, c.getTree());

             
                      	        addColumn(tableName, (c!=null?input.toString(c.start,c.stop):null), (c!=null?((Token)c.start):null).getLine());
                      		System.out.println("column: " + tableName + "." + (c!=null?input.toString(c.start,c.stop):null) + ":" + (c!=null?((Token)c.start):null).getLine() ); 
                      	

            pushFollow(FOLLOW_type_in_field_spec8027);
            type113=type();

            state._fsp--;

            adaptor.addChild(root_0, type113.getTree());

            // MySQL.g:1113:16: ( attribute )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==AUTO_INC||LA34_0==DEFAULT||LA34_0==NOT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // MySQL.g:1113:16: attribute
                    {
                    pushFollow(FOLLOW_attribute_in_field_spec8029);
                    attribute114=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute114.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_spec"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // MySQL.g:1116:1: type : ( int_type ( field_length )? field_options | real_type ( precision )? field_options | FLOAT_SYM float_options field_options | BIT_SYM | BIT_SYM field_length | BOOL_SYM | BOOLEAN_SYM | char2 field_length ( binary )? | char2 ( binary )? | nchar field_length ( bin_mod )? | nchar ( bin_mod )? | BINARY field_length | BINARY | varchar field_length ( binary )? | nvarchar field_length ( bin_mod )? | VARBINARY field_length | YEAR_SYM ( field_length )? field_options | DATE_SYM | TIME_SYM | TIMESTAMP ( field_length )? | DATETIME | TINYBLOB | BLOB_SYM field_length | spatial_type | MEDIUMBLOB | LONGBLOB | LONG_SYM VARBINARY | LONG_SYM varchar ( binary )? | TINYTEXT ( binary )? | TEXT_SYM ( field_length )? ( binary )? | MEDIUMTEXT ( binary )? | LONGTEXT ( binary )? | DECIMAL_SYM float_options field_options | NUMERIC_SYM float_options field_options | FIXED_SYM float_options field_options | ENUM | SET | LONG_SYM ( binary )? | SERIAL_SYM );
    public final MySQLParser.type_return type() throws RecognitionException {
        MySQLParser.type_return retval = new MySQLParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FLOAT_SYM121=null;
        Token BIT_SYM124=null;
        Token BIT_SYM125=null;
        Token BOOL_SYM127=null;
        Token BOOLEAN_SYM128=null;
        Token BINARY139=null;
        Token BINARY141=null;
        Token VARBINARY148=null;
        Token YEAR_SYM150=null;
        Token DATE_SYM153=null;
        Token TIME_SYM154=null;
        Token TIMESTAMP155=null;
        Token DATETIME157=null;
        Token TINYBLOB158=null;
        Token BLOB_SYM159=null;
        Token MEDIUMBLOB162=null;
        Token LONGBLOB163=null;
        Token LONG_SYM164=null;
        Token VARBINARY165=null;
        Token LONG_SYM166=null;
        Token TINYTEXT169=null;
        Token TEXT_SYM171=null;
        Token MEDIUMTEXT174=null;
        Token LONGTEXT176=null;
        Token DECIMAL_SYM178=null;
        Token NUMERIC_SYM181=null;
        Token FIXED_SYM184=null;
        Token ENUM187=null;
        Token SET188=null;
        Token LONG_SYM189=null;
        Token SERIAL_SYM191=null;
        MySQLParser.int_type_return int_type115 =null;

        MySQLParser.field_length_return field_length116 =null;

        MySQLParser.field_options_return field_options117 =null;

        MySQLParser.real_type_return real_type118 =null;

        MySQLParser.precision_return precision119 =null;

        MySQLParser.field_options_return field_options120 =null;

        MySQLParser.float_options_return float_options122 =null;

        MySQLParser.field_options_return field_options123 =null;

        MySQLParser.field_length_return field_length126 =null;

        MySQLParser.char2_return char2129 =null;

        MySQLParser.field_length_return field_length130 =null;

        MySQLParser.binary_return binary131 =null;

        MySQLParser.char2_return char2132 =null;

        MySQLParser.binary_return binary133 =null;

        MySQLParser.nchar_return nchar134 =null;

        MySQLParser.field_length_return field_length135 =null;

        MySQLParser.bin_mod_return bin_mod136 =null;

        MySQLParser.nchar_return nchar137 =null;

        MySQLParser.bin_mod_return bin_mod138 =null;

        MySQLParser.field_length_return field_length140 =null;

        MySQLParser.varchar_return varchar142 =null;

        MySQLParser.field_length_return field_length143 =null;

        MySQLParser.binary_return binary144 =null;

        MySQLParser.nvarchar_return nvarchar145 =null;

        MySQLParser.field_length_return field_length146 =null;

        MySQLParser.bin_mod_return bin_mod147 =null;

        MySQLParser.field_length_return field_length149 =null;

        MySQLParser.field_length_return field_length151 =null;

        MySQLParser.field_options_return field_options152 =null;

        MySQLParser.field_length_return field_length156 =null;

        MySQLParser.field_length_return field_length160 =null;

        MySQLParser.spatial_type_return spatial_type161 =null;

        MySQLParser.varchar_return varchar167 =null;

        MySQLParser.binary_return binary168 =null;

        MySQLParser.binary_return binary170 =null;

        MySQLParser.field_length_return field_length172 =null;

        MySQLParser.binary_return binary173 =null;

        MySQLParser.binary_return binary175 =null;

        MySQLParser.binary_return binary177 =null;

        MySQLParser.float_options_return float_options179 =null;

        MySQLParser.field_options_return field_options180 =null;

        MySQLParser.float_options_return float_options182 =null;

        MySQLParser.field_options_return field_options183 =null;

        MySQLParser.float_options_return float_options185 =null;

        MySQLParser.field_options_return field_options186 =null;

        MySQLParser.binary_return binary190 =null;


        Object FLOAT_SYM121_tree=null;
        Object BIT_SYM124_tree=null;
        Object BIT_SYM125_tree=null;
        Object BOOL_SYM127_tree=null;
        Object BOOLEAN_SYM128_tree=null;
        Object BINARY139_tree=null;
        Object BINARY141_tree=null;
        Object VARBINARY148_tree=null;
        Object YEAR_SYM150_tree=null;
        Object DATE_SYM153_tree=null;
        Object TIME_SYM154_tree=null;
        Object TIMESTAMP155_tree=null;
        Object DATETIME157_tree=null;
        Object TINYBLOB158_tree=null;
        Object BLOB_SYM159_tree=null;
        Object MEDIUMBLOB162_tree=null;
        Object LONGBLOB163_tree=null;
        Object LONG_SYM164_tree=null;
        Object VARBINARY165_tree=null;
        Object LONG_SYM166_tree=null;
        Object TINYTEXT169_tree=null;
        Object TEXT_SYM171_tree=null;
        Object MEDIUMTEXT174_tree=null;
        Object LONGTEXT176_tree=null;
        Object DECIMAL_SYM178_tree=null;
        Object NUMERIC_SYM181_tree=null;
        Object FIXED_SYM184_tree=null;
        Object ENUM187_tree=null;
        Object SET188_tree=null;
        Object LONG_SYM189_tree=null;
        Object SERIAL_SYM191_tree=null;

        try {
            // MySQL.g:1116:5: ( int_type ( field_length )? field_options | real_type ( precision )? field_options | FLOAT_SYM float_options field_options | BIT_SYM | BIT_SYM field_length | BOOL_SYM | BOOLEAN_SYM | char2 field_length ( binary )? | char2 ( binary )? | nchar field_length ( bin_mod )? | nchar ( bin_mod )? | BINARY field_length | BINARY | varchar field_length ( binary )? | nvarchar field_length ( bin_mod )? | VARBINARY field_length | YEAR_SYM ( field_length )? field_options | DATE_SYM | TIME_SYM | TIMESTAMP ( field_length )? | DATETIME | TINYBLOB | BLOB_SYM field_length | spatial_type | MEDIUMBLOB | LONGBLOB | LONG_SYM VARBINARY | LONG_SYM varchar ( binary )? | TINYTEXT ( binary )? | TEXT_SYM ( field_length )? ( binary )? | MEDIUMTEXT ( binary )? | LONGTEXT ( binary )? | DECIMAL_SYM float_options field_options | NUMERIC_SYM float_options field_options | FIXED_SYM float_options field_options | ENUM | SET | LONG_SYM ( binary )? | SERIAL_SYM )
            int alt52=39;
            switch ( input.LA(1) ) {
            case BIGINT:
            case INT_SYM:
            case MEDIUMINT:
            case SMALLINT:
            case TINYINT:
                {
                alt52=1;
                }
                break;
            case DOUBLE_SYM:
            case REAL:
                {
                alt52=2;
                }
                break;
            case FLOAT_SYM:
                {
                alt52=3;
                }
                break;
            case BIT_SYM:
                {
                int LA52_4 = input.LA(2);

                if ( (LA52_4==AUTO_INC||LA52_4==DEFAULT||LA52_4==NOT||LA52_4==549||LA52_4==551) ) {
                    alt52=4;
                }
                else if ( (LA52_4==548) ) {
                    alt52=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 4, input);

                    throw nvae;

                }
                }
                break;
            case BOOL_SYM:
                {
                alt52=6;
                }
                break;
            case BOOLEAN_SYM:
                {
                alt52=7;
                }
                break;
            case CHAR_SYM:
                {
                switch ( input.LA(2) ) {
                case 548:
                    {
                    alt52=8;
                    }
                    break;
                case ASCII_SYM:
                case AUTO_INC:
                case BINARY:
                case BYTE_SYM:
                case CHARSET:
                case CHAR_SYM:
                case DEFAULT:
                case NOT:
                case UNICODE_SYM:
                case 549:
                case 551:
                    {
                    alt52=9;
                    }
                    break;
                case VARYING:
                    {
                    alt52=14;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 7, input);

                    throw nvae;

                }

                }
                break;
            case NCHAR_SYM:
                {
                switch ( input.LA(2) ) {
                case VARCHAR:
                case VARYING:
                    {
                    alt52=15;
                    }
                    break;
                case 548:
                    {
                    alt52=10;
                    }
                    break;
                case AUTO_INC:
                case BINARY:
                case DEFAULT:
                case NOT:
                case 549:
                case 551:
                    {
                    alt52=11;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 8, input);

                    throw nvae;

                }

                }
                break;
            case NATIONAL_SYM:
                {
                int LA52_9 = input.LA(2);

                if ( (LA52_9==CHAR_SYM) ) {
                    switch ( input.LA(3) ) {
                    case VARYING:
                        {
                        alt52=15;
                        }
                        break;
                    case 548:
                        {
                        alt52=10;
                        }
                        break;
                    case AUTO_INC:
                    case BINARY:
                    case DEFAULT:
                    case NOT:
                    case 549:
                    case 551:
                        {
                        alt52=11;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 41, input);

                        throw nvae;

                    }

                }
                else if ( (LA52_9==VARCHAR) ) {
                    alt52=15;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 9, input);

                    throw nvae;

                }
                }
                break;
            case BINARY:
                {
                int LA52_10 = input.LA(2);

                if ( (LA52_10==548) ) {
                    alt52=12;
                }
                else if ( (LA52_10==AUTO_INC||LA52_10==DEFAULT||LA52_10==NOT||LA52_10==549||LA52_10==551) ) {
                    alt52=13;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 10, input);

                    throw nvae;

                }
                }
                break;
            case VARCHAR:
                {
                alt52=14;
                }
                break;
            case NVARCHAR_SYM:
                {
                alt52=15;
                }
                break;
            case VARBINARY:
                {
                alt52=16;
                }
                break;
            case YEAR_SYM:
                {
                alt52=17;
                }
                break;
            case DATE_SYM:
                {
                alt52=18;
                }
                break;
            case TIME_SYM:
                {
                alt52=19;
                }
                break;
            case TIMESTAMP:
                {
                alt52=20;
                }
                break;
            case DATETIME:
                {
                alt52=21;
                }
                break;
            case TINYBLOB:
                {
                alt52=22;
                }
                break;
            case BLOB_SYM:
                {
                alt52=23;
                }
                break;
            case GEOMETRYCOLLECTION:
            case GEOMETRY_SYM:
            case LINESTRING:
            case MULTILINESTRING:
            case MULTIPOINT:
            case MULTIPOLYGON:
            case POINT_SYM:
            case POLYGON:
                {
                alt52=24;
                }
                break;
            case MEDIUMBLOB:
                {
                alt52=25;
                }
                break;
            case LONGBLOB:
                {
                alt52=26;
                }
                break;
            case LONG_SYM:
                {
                switch ( input.LA(2) ) {
                case VARBINARY:
                    {
                    alt52=27;
                    }
                    break;
                case CHAR_SYM:
                    {
                    int LA52_45 = input.LA(3);

                    if ( (LA52_45==SET) ) {
                        alt52=38;
                    }
                    else if ( (LA52_45==VARYING) ) {
                        alt52=28;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 45, input);

                        throw nvae;

                    }
                    }
                    break;
                case VARCHAR:
                    {
                    alt52=28;
                    }
                    break;
                case ASCII_SYM:
                case AUTO_INC:
                case BINARY:
                case BYTE_SYM:
                case CHARSET:
                case DEFAULT:
                case NOT:
                case UNICODE_SYM:
                case 549:
                case 551:
                    {
                    alt52=38;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 24, input);

                    throw nvae;

                }

                }
                break;
            case TINYTEXT:
                {
                alt52=29;
                }
                break;
            case TEXT_SYM:
                {
                alt52=30;
                }
                break;
            case MEDIUMTEXT:
                {
                alt52=31;
                }
                break;
            case LONGTEXT:
                {
                alt52=32;
                }
                break;
            case DECIMAL_SYM:
                {
                alt52=33;
                }
                break;
            case NUMERIC_SYM:
                {
                alt52=34;
                }
                break;
            case FIXED_SYM:
                {
                alt52=35;
                }
                break;
            case ENUM:
                {
                alt52=36;
                }
                break;
            case SET:
                {
                alt52=37;
                }
                break;
            case SERIAL_SYM:
                {
                alt52=39;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // MySQL.g:1117:11: int_type ( field_length )? field_options
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_int_type_in_type8056);
                    int_type115=int_type();

                    state._fsp--;

                    adaptor.addChild(root_0, int_type115.getTree());

                    // MySQL.g:1117:20: ( field_length )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==548) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // MySQL.g:1117:20: field_length
                            {
                            pushFollow(FOLLOW_field_length_in_type8058);
                            field_length116=field_length();

                            state._fsp--;

                            adaptor.addChild(root_0, field_length116.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_field_options_in_type8061);
                    field_options117=field_options();

                    state._fsp--;

                    adaptor.addChild(root_0, field_options117.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1118:11: real_type ( precision )? field_options
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_real_type_in_type8074);
                    real_type118=real_type();

                    state._fsp--;

                    adaptor.addChild(root_0, real_type118.getTree());

                    // MySQL.g:1118:21: ( precision )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==548) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // MySQL.g:1118:21: precision
                            {
                            pushFollow(FOLLOW_precision_in_type8076);
                            precision119=precision();

                            state._fsp--;

                            adaptor.addChild(root_0, precision119.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_field_options_in_type8079);
                    field_options120=field_options();

                    state._fsp--;

                    adaptor.addChild(root_0, field_options120.getTree());

                    }
                    break;
                case 3 :
                    // MySQL.g:1119:11: FLOAT_SYM float_options field_options
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOAT_SYM121=(Token)match(input,FLOAT_SYM,FOLLOW_FLOAT_SYM_in_type8092); 
                    FLOAT_SYM121_tree = 
                    (Object)adaptor.create(FLOAT_SYM121)
                    ;
                    adaptor.addChild(root_0, FLOAT_SYM121_tree);


                    pushFollow(FOLLOW_float_options_in_type8094);
                    float_options122=float_options();

                    state._fsp--;

                    adaptor.addChild(root_0, float_options122.getTree());

                    pushFollow(FOLLOW_field_options_in_type8096);
                    field_options123=field_options();

                    state._fsp--;

                    adaptor.addChild(root_0, field_options123.getTree());

                    }
                    break;
                case 4 :
                    // MySQL.g:1120:11: BIT_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    BIT_SYM124=(Token)match(input,BIT_SYM,FOLLOW_BIT_SYM_in_type8109); 
                    BIT_SYM124_tree = 
                    (Object)adaptor.create(BIT_SYM124)
                    ;
                    adaptor.addChild(root_0, BIT_SYM124_tree);


                    }
                    break;
                case 5 :
                    // MySQL.g:1121:11: BIT_SYM field_length
                    {
                    root_0 = (Object)adaptor.nil();


                    BIT_SYM125=(Token)match(input,BIT_SYM,FOLLOW_BIT_SYM_in_type8121); 
                    BIT_SYM125_tree = 
                    (Object)adaptor.create(BIT_SYM125)
                    ;
                    adaptor.addChild(root_0, BIT_SYM125_tree);


                    pushFollow(FOLLOW_field_length_in_type8123);
                    field_length126=field_length();

                    state._fsp--;

                    adaptor.addChild(root_0, field_length126.getTree());

                    }
                    break;
                case 6 :
                    // MySQL.g:1122:11: BOOL_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    BOOL_SYM127=(Token)match(input,BOOL_SYM,FOLLOW_BOOL_SYM_in_type8135); 
                    BOOL_SYM127_tree = 
                    (Object)adaptor.create(BOOL_SYM127)
                    ;
                    adaptor.addChild(root_0, BOOL_SYM127_tree);


                    }
                    break;
                case 7 :
                    // MySQL.g:1123:11: BOOLEAN_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    BOOLEAN_SYM128=(Token)match(input,BOOLEAN_SYM,FOLLOW_BOOLEAN_SYM_in_type8147); 
                    BOOLEAN_SYM128_tree = 
                    (Object)adaptor.create(BOOLEAN_SYM128)
                    ;
                    adaptor.addChild(root_0, BOOLEAN_SYM128_tree);


                    }
                    break;
                case 8 :
                    // MySQL.g:1124:11: char2 field_length ( binary )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_char2_in_type8159);
                    char2129=char2();

                    state._fsp--;

                    adaptor.addChild(root_0, char2129.getTree());

                    pushFollow(FOLLOW_field_length_in_type8161);
                    field_length130=field_length();

                    state._fsp--;

                    adaptor.addChild(root_0, field_length130.getTree());

                    // MySQL.g:1124:30: ( binary )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ASCII_SYM||LA37_0==BINARY||LA37_0==BYTE_SYM||(LA37_0 >= CHARSET && LA37_0 <= CHAR_SYM)||LA37_0==UNICODE_SYM) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // MySQL.g:1124:30: binary
                            {
                            pushFollow(FOLLOW_binary_in_type8163);
                            binary131=binary();

                            state._fsp--;

                            adaptor.addChild(root_0, binary131.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 9 :
                    // MySQL.g:1125:11: char2 ( binary )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_char2_in_type8176);
                    char2132=char2();

                    state._fsp--;

                    adaptor.addChild(root_0, char2132.getTree());

                    // MySQL.g:1125:17: ( binary )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ASCII_SYM||LA38_0==BINARY||LA38_0==BYTE_SYM||(LA38_0 >= CHARSET && LA38_0 <= CHAR_SYM)||LA38_0==UNICODE_SYM) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // MySQL.g:1125:17: binary
                            {
                            pushFollow(FOLLOW_binary_in_type8178);
                            binary133=binary();

                            state._fsp--;

                            adaptor.addChild(root_0, binary133.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 10 :
                    // MySQL.g:1126:11: nchar field_length ( bin_mod )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_nchar_in_type8191);
                    nchar134=nchar();

                    state._fsp--;

                    adaptor.addChild(root_0, nchar134.getTree());

                    pushFollow(FOLLOW_field_length_in_type8193);
                    field_length135=field_length();

                    state._fsp--;

                    adaptor.addChild(root_0, field_length135.getTree());

                    // MySQL.g:1126:30: ( bin_mod )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==BINARY) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // MySQL.g:1126:30: bin_mod
                            {
                            pushFollow(FOLLOW_bin_mod_in_type8195);
                            bin_mod136=bin_mod();

                            state._fsp--;

                            adaptor.addChild(root_0, bin_mod136.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 11 :
                    // MySQL.g:1127:11: nchar ( bin_mod )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_nchar_in_type8208);
                    nchar137=nchar();

                    state._fsp--;

                    adaptor.addChild(root_0, nchar137.getTree());

                    // MySQL.g:1127:17: ( bin_mod )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==BINARY) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // MySQL.g:1127:17: bin_mod
                            {
                            pushFollow(FOLLOW_bin_mod_in_type8210);
                            bin_mod138=bin_mod();

                            state._fsp--;

                            adaptor.addChild(root_0, bin_mod138.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 12 :
                    // MySQL.g:1128:11: BINARY field_length
                    {
                    root_0 = (Object)adaptor.nil();


                    BINARY139=(Token)match(input,BINARY,FOLLOW_BINARY_in_type8223); 
                    BINARY139_tree = 
                    (Object)adaptor.create(BINARY139)
                    ;
                    adaptor.addChild(root_0, BINARY139_tree);


                    pushFollow(FOLLOW_field_length_in_type8225);
                    field_length140=field_length();

                    state._fsp--;

                    adaptor.addChild(root_0, field_length140.getTree());

                    }
                    break;
                case 13 :
                    // MySQL.g:1129:11: BINARY
                    {
                    root_0 = (Object)adaptor.nil();


                    BINARY141=(Token)match(input,BINARY,FOLLOW_BINARY_in_type8237); 
                    BINARY141_tree = 
                    (Object)adaptor.create(BINARY141)
                    ;
                    adaptor.addChild(root_0, BINARY141_tree);


                    }
                    break;
                case 14 :
                    // MySQL.g:1130:11: varchar field_length ( binary )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varchar_in_type8249);
                    varchar142=varchar();

                    state._fsp--;

                    adaptor.addChild(root_0, varchar142.getTree());

                    pushFollow(FOLLOW_field_length_in_type8251);
                    field_length143=field_length();

                    state._fsp--;

                    adaptor.addChild(root_0, field_length143.getTree());

                    // MySQL.g:1130:32: ( binary )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==ASCII_SYM||LA41_0==BINARY||LA41_0==BYTE_SYM||(LA41_0 >= CHARSET && LA41_0 <= CHAR_SYM)||LA41_0==UNICODE_SYM) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // MySQL.g:1130:32: binary
                            {
                            pushFollow(FOLLOW_binary_in_type8253);
                            binary144=binary();

                            state._fsp--;

                            adaptor.addChild(root_0, binary144.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 15 :
                    // MySQL.g:1131:11: nvarchar field_length ( bin_mod )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_nvarchar_in_type8266);
                    nvarchar145=nvarchar();

                    state._fsp--;

                    adaptor.addChild(root_0, nvarchar145.getTree());

                    pushFollow(FOLLOW_field_length_in_type8268);
                    field_length146=field_length();

                    state._fsp--;

                    adaptor.addChild(root_0, field_length146.getTree());

                    // MySQL.g:1131:33: ( bin_mod )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==BINARY) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // MySQL.g:1131:33: bin_mod
                            {
                            pushFollow(FOLLOW_bin_mod_in_type8270);
                            bin_mod147=bin_mod();

                            state._fsp--;

                            adaptor.addChild(root_0, bin_mod147.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 16 :
                    // MySQL.g:1132:11: VARBINARY field_length
                    {
                    root_0 = (Object)adaptor.nil();


                    VARBINARY148=(Token)match(input,VARBINARY,FOLLOW_VARBINARY_in_type8283); 
                    VARBINARY148_tree = 
                    (Object)adaptor.create(VARBINARY148)
                    ;
                    adaptor.addChild(root_0, VARBINARY148_tree);


                    pushFollow(FOLLOW_field_length_in_type8285);
                    field_length149=field_length();

                    state._fsp--;

                    adaptor.addChild(root_0, field_length149.getTree());

                    }
                    break;
                case 17 :
                    // MySQL.g:1133:11: YEAR_SYM ( field_length )? field_options
                    {
                    root_0 = (Object)adaptor.nil();


                    YEAR_SYM150=(Token)match(input,YEAR_SYM,FOLLOW_YEAR_SYM_in_type8297); 
                    YEAR_SYM150_tree = 
                    (Object)adaptor.create(YEAR_SYM150)
                    ;
                    adaptor.addChild(root_0, YEAR_SYM150_tree);


                    // MySQL.g:1133:20: ( field_length )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==548) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // MySQL.g:1133:20: field_length
                            {
                            pushFollow(FOLLOW_field_length_in_type8299);
                            field_length151=field_length();

                            state._fsp--;

                            adaptor.addChild(root_0, field_length151.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_field_options_in_type8302);
                    field_options152=field_options();

                    state._fsp--;

                    adaptor.addChild(root_0, field_options152.getTree());

                    }
                    break;
                case 18 :
                    // MySQL.g:1134:11: DATE_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    DATE_SYM153=(Token)match(input,DATE_SYM,FOLLOW_DATE_SYM_in_type8314); 
                    DATE_SYM153_tree = 
                    (Object)adaptor.create(DATE_SYM153)
                    ;
                    adaptor.addChild(root_0, DATE_SYM153_tree);


                    }
                    break;
                case 19 :
                    // MySQL.g:1135:11: TIME_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    TIME_SYM154=(Token)match(input,TIME_SYM,FOLLOW_TIME_SYM_in_type8326); 
                    TIME_SYM154_tree = 
                    (Object)adaptor.create(TIME_SYM154)
                    ;
                    adaptor.addChild(root_0, TIME_SYM154_tree);


                    }
                    break;
                case 20 :
                    // MySQL.g:1136:11: TIMESTAMP ( field_length )?
                    {
                    root_0 = (Object)adaptor.nil();


                    TIMESTAMP155=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_type8338); 
                    TIMESTAMP155_tree = 
                    (Object)adaptor.create(TIMESTAMP155)
                    ;
                    adaptor.addChild(root_0, TIMESTAMP155_tree);


                    // MySQL.g:1136:21: ( field_length )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==548) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // MySQL.g:1136:21: field_length
                            {
                            pushFollow(FOLLOW_field_length_in_type8340);
                            field_length156=field_length();

                            state._fsp--;

                            adaptor.addChild(root_0, field_length156.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 21 :
                    // MySQL.g:1137:11: DATETIME
                    {
                    root_0 = (Object)adaptor.nil();


                    DATETIME157=(Token)match(input,DATETIME,FOLLOW_DATETIME_in_type8353); 
                    DATETIME157_tree = 
                    (Object)adaptor.create(DATETIME157)
                    ;
                    adaptor.addChild(root_0, DATETIME157_tree);


                    }
                    break;
                case 22 :
                    // MySQL.g:1138:11: TINYBLOB
                    {
                    root_0 = (Object)adaptor.nil();


                    TINYBLOB158=(Token)match(input,TINYBLOB,FOLLOW_TINYBLOB_in_type8365); 
                    TINYBLOB158_tree = 
                    (Object)adaptor.create(TINYBLOB158)
                    ;
                    adaptor.addChild(root_0, TINYBLOB158_tree);


                    }
                    break;
                case 23 :
                    // MySQL.g:1138:32: BLOB_SYM field_length
                    {
                    root_0 = (Object)adaptor.nil();


                    BLOB_SYM159=(Token)match(input,BLOB_SYM,FOLLOW_BLOB_SYM_in_type8379); 
                    BLOB_SYM159_tree = 
                    (Object)adaptor.create(BLOB_SYM159)
                    ;
                    adaptor.addChild(root_0, BLOB_SYM159_tree);


                    pushFollow(FOLLOW_field_length_in_type8381);
                    field_length160=field_length();

                    state._fsp--;

                    adaptor.addChild(root_0, field_length160.getTree());

                    }
                    break;
                case 24 :
                    // MySQL.g:1139:11: spatial_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_spatial_type_in_type8393);
                    spatial_type161=spatial_type();

                    state._fsp--;

                    adaptor.addChild(root_0, spatial_type161.getTree());

                    }
                    break;
                case 25 :
                    // MySQL.g:1140:11: MEDIUMBLOB
                    {
                    root_0 = (Object)adaptor.nil();


                    MEDIUMBLOB162=(Token)match(input,MEDIUMBLOB,FOLLOW_MEDIUMBLOB_in_type8405); 
                    MEDIUMBLOB162_tree = 
                    (Object)adaptor.create(MEDIUMBLOB162)
                    ;
                    adaptor.addChild(root_0, MEDIUMBLOB162_tree);


                    }
                    break;
                case 26 :
                    // MySQL.g:1141:11: LONGBLOB
                    {
                    root_0 = (Object)adaptor.nil();


                    LONGBLOB163=(Token)match(input,LONGBLOB,FOLLOW_LONGBLOB_in_type8417); 
                    LONGBLOB163_tree = 
                    (Object)adaptor.create(LONGBLOB163)
                    ;
                    adaptor.addChild(root_0, LONGBLOB163_tree);


                    }
                    break;
                case 27 :
                    // MySQL.g:1142:11: LONG_SYM VARBINARY
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG_SYM164=(Token)match(input,LONG_SYM,FOLLOW_LONG_SYM_in_type8429); 
                    LONG_SYM164_tree = 
                    (Object)adaptor.create(LONG_SYM164)
                    ;
                    adaptor.addChild(root_0, LONG_SYM164_tree);


                    VARBINARY165=(Token)match(input,VARBINARY,FOLLOW_VARBINARY_in_type8431); 
                    VARBINARY165_tree = 
                    (Object)adaptor.create(VARBINARY165)
                    ;
                    adaptor.addChild(root_0, VARBINARY165_tree);


                    }
                    break;
                case 28 :
                    // MySQL.g:1143:11: LONG_SYM varchar ( binary )?
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG_SYM166=(Token)match(input,LONG_SYM,FOLLOW_LONG_SYM_in_type8443); 
                    LONG_SYM166_tree = 
                    (Object)adaptor.create(LONG_SYM166)
                    ;
                    adaptor.addChild(root_0, LONG_SYM166_tree);


                    pushFollow(FOLLOW_varchar_in_type8445);
                    varchar167=varchar();

                    state._fsp--;

                    adaptor.addChild(root_0, varchar167.getTree());

                    // MySQL.g:1143:28: ( binary )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ASCII_SYM||LA45_0==BINARY||LA45_0==BYTE_SYM||(LA45_0 >= CHARSET && LA45_0 <= CHAR_SYM)||LA45_0==UNICODE_SYM) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // MySQL.g:1143:28: binary
                            {
                            pushFollow(FOLLOW_binary_in_type8447);
                            binary168=binary();

                            state._fsp--;

                            adaptor.addChild(root_0, binary168.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 29 :
                    // MySQL.g:1144:11: TINYTEXT ( binary )?
                    {
                    root_0 = (Object)adaptor.nil();


                    TINYTEXT169=(Token)match(input,TINYTEXT,FOLLOW_TINYTEXT_in_type8460); 
                    TINYTEXT169_tree = 
                    (Object)adaptor.create(TINYTEXT169)
                    ;
                    adaptor.addChild(root_0, TINYTEXT169_tree);


                    // MySQL.g:1144:20: ( binary )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==ASCII_SYM||LA46_0==BINARY||LA46_0==BYTE_SYM||(LA46_0 >= CHARSET && LA46_0 <= CHAR_SYM)||LA46_0==UNICODE_SYM) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // MySQL.g:1144:20: binary
                            {
                            pushFollow(FOLLOW_binary_in_type8462);
                            binary170=binary();

                            state._fsp--;

                            adaptor.addChild(root_0, binary170.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 30 :
                    // MySQL.g:1145:11: TEXT_SYM ( field_length )? ( binary )?
                    {
                    root_0 = (Object)adaptor.nil();


                    TEXT_SYM171=(Token)match(input,TEXT_SYM,FOLLOW_TEXT_SYM_in_type8475); 
                    TEXT_SYM171_tree = 
                    (Object)adaptor.create(TEXT_SYM171)
                    ;
                    adaptor.addChild(root_0, TEXT_SYM171_tree);


                    // MySQL.g:1145:20: ( field_length )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==548) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // MySQL.g:1145:20: field_length
                            {
                            pushFollow(FOLLOW_field_length_in_type8477);
                            field_length172=field_length();

                            state._fsp--;

                            adaptor.addChild(root_0, field_length172.getTree());

                            }
                            break;

                    }


                    // MySQL.g:1145:34: ( binary )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==ASCII_SYM||LA48_0==BINARY||LA48_0==BYTE_SYM||(LA48_0 >= CHARSET && LA48_0 <= CHAR_SYM)||LA48_0==UNICODE_SYM) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // MySQL.g:1145:34: binary
                            {
                            pushFollow(FOLLOW_binary_in_type8480);
                            binary173=binary();

                            state._fsp--;

                            adaptor.addChild(root_0, binary173.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 31 :
                    // MySQL.g:1146:11: MEDIUMTEXT ( binary )?
                    {
                    root_0 = (Object)adaptor.nil();


                    MEDIUMTEXT174=(Token)match(input,MEDIUMTEXT,FOLLOW_MEDIUMTEXT_in_type8493); 
                    MEDIUMTEXT174_tree = 
                    (Object)adaptor.create(MEDIUMTEXT174)
                    ;
                    adaptor.addChild(root_0, MEDIUMTEXT174_tree);


                    // MySQL.g:1146:22: ( binary )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==ASCII_SYM||LA49_0==BINARY||LA49_0==BYTE_SYM||(LA49_0 >= CHARSET && LA49_0 <= CHAR_SYM)||LA49_0==UNICODE_SYM) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // MySQL.g:1146:22: binary
                            {
                            pushFollow(FOLLOW_binary_in_type8495);
                            binary175=binary();

                            state._fsp--;

                            adaptor.addChild(root_0, binary175.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 32 :
                    // MySQL.g:1147:11: LONGTEXT ( binary )?
                    {
                    root_0 = (Object)adaptor.nil();


                    LONGTEXT176=(Token)match(input,LONGTEXT,FOLLOW_LONGTEXT_in_type8508); 
                    LONGTEXT176_tree = 
                    (Object)adaptor.create(LONGTEXT176)
                    ;
                    adaptor.addChild(root_0, LONGTEXT176_tree);


                    // MySQL.g:1147:20: ( binary )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==ASCII_SYM||LA50_0==BINARY||LA50_0==BYTE_SYM||(LA50_0 >= CHARSET && LA50_0 <= CHAR_SYM)||LA50_0==UNICODE_SYM) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // MySQL.g:1147:20: binary
                            {
                            pushFollow(FOLLOW_binary_in_type8510);
                            binary177=binary();

                            state._fsp--;

                            adaptor.addChild(root_0, binary177.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 33 :
                    // MySQL.g:1148:11: DECIMAL_SYM float_options field_options
                    {
                    root_0 = (Object)adaptor.nil();


                    DECIMAL_SYM178=(Token)match(input,DECIMAL_SYM,FOLLOW_DECIMAL_SYM_in_type8523); 
                    DECIMAL_SYM178_tree = 
                    (Object)adaptor.create(DECIMAL_SYM178)
                    ;
                    adaptor.addChild(root_0, DECIMAL_SYM178_tree);


                    pushFollow(FOLLOW_float_options_in_type8525);
                    float_options179=float_options();

                    state._fsp--;

                    adaptor.addChild(root_0, float_options179.getTree());

                    pushFollow(FOLLOW_field_options_in_type8527);
                    field_options180=field_options();

                    state._fsp--;

                    adaptor.addChild(root_0, field_options180.getTree());

                    }
                    break;
                case 34 :
                    // MySQL.g:1149:11: NUMERIC_SYM float_options field_options
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMERIC_SYM181=(Token)match(input,NUMERIC_SYM,FOLLOW_NUMERIC_SYM_in_type8539); 
                    NUMERIC_SYM181_tree = 
                    (Object)adaptor.create(NUMERIC_SYM181)
                    ;
                    adaptor.addChild(root_0, NUMERIC_SYM181_tree);


                    pushFollow(FOLLOW_float_options_in_type8541);
                    float_options182=float_options();

                    state._fsp--;

                    adaptor.addChild(root_0, float_options182.getTree());

                    pushFollow(FOLLOW_field_options_in_type8543);
                    field_options183=field_options();

                    state._fsp--;

                    adaptor.addChild(root_0, field_options183.getTree());

                    }
                    break;
                case 35 :
                    // MySQL.g:1150:11: FIXED_SYM float_options field_options
                    {
                    root_0 = (Object)adaptor.nil();


                    FIXED_SYM184=(Token)match(input,FIXED_SYM,FOLLOW_FIXED_SYM_in_type8555); 
                    FIXED_SYM184_tree = 
                    (Object)adaptor.create(FIXED_SYM184)
                    ;
                    adaptor.addChild(root_0, FIXED_SYM184_tree);


                    pushFollow(FOLLOW_float_options_in_type8557);
                    float_options185=float_options();

                    state._fsp--;

                    adaptor.addChild(root_0, float_options185.getTree());

                    pushFollow(FOLLOW_field_options_in_type8559);
                    field_options186=field_options();

                    state._fsp--;

                    adaptor.addChild(root_0, field_options186.getTree());

                    }
                    break;
                case 36 :
                    // MySQL.g:1151:11: ENUM
                    {
                    root_0 = (Object)adaptor.nil();


                    ENUM187=(Token)match(input,ENUM,FOLLOW_ENUM_in_type8571); 
                    ENUM187_tree = 
                    (Object)adaptor.create(ENUM187)
                    ;
                    adaptor.addChild(root_0, ENUM187_tree);


                    }
                    break;
                case 37 :
                    // MySQL.g:1152:11: SET
                    {
                    root_0 = (Object)adaptor.nil();


                    SET188=(Token)match(input,SET,FOLLOW_SET_in_type8583); 
                    SET188_tree = 
                    (Object)adaptor.create(SET188)
                    ;
                    adaptor.addChild(root_0, SET188_tree);


                    }
                    break;
                case 38 :
                    // MySQL.g:1153:11: LONG_SYM ( binary )?
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG_SYM189=(Token)match(input,LONG_SYM,FOLLOW_LONG_SYM_in_type8595); 
                    LONG_SYM189_tree = 
                    (Object)adaptor.create(LONG_SYM189)
                    ;
                    adaptor.addChild(root_0, LONG_SYM189_tree);


                    // MySQL.g:1153:20: ( binary )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==ASCII_SYM||LA51_0==BINARY||LA51_0==BYTE_SYM||(LA51_0 >= CHARSET && LA51_0 <= CHAR_SYM)||LA51_0==UNICODE_SYM) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // MySQL.g:1153:20: binary
                            {
                            pushFollow(FOLLOW_binary_in_type8597);
                            binary190=binary();

                            state._fsp--;

                            adaptor.addChild(root_0, binary190.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 39 :
                    // MySQL.g:1154:11: SERIAL_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    SERIAL_SYM191=(Token)match(input,SERIAL_SYM,FOLLOW_SERIAL_SYM_in_type8610); 
                    SERIAL_SYM191_tree = 
                    (Object)adaptor.create(SERIAL_SYM191)
                    ;
                    adaptor.addChild(root_0, SERIAL_SYM191_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class spatial_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spatial_type"
    // MySQL.g:1157:1: spatial_type : ( GEOMETRY_SYM | GEOMETRYCOLLECTION | POINT_SYM | MULTIPOINT | LINESTRING | MULTILINESTRING | POLYGON | MULTIPOLYGON );
    public final MySQLParser.spatial_type_return spatial_type() throws RecognitionException {
        MySQLParser.spatial_type_return retval = new MySQLParser.spatial_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set192=null;

        Object set192_tree=null;

        try {
            // MySQL.g:1157:13: ( GEOMETRY_SYM | GEOMETRYCOLLECTION | POINT_SYM | MULTIPOINT | LINESTRING | MULTILINESTRING | POLYGON | MULTIPOLYGON )
            // MySQL.g:
            {
            root_0 = (Object)adaptor.nil();


            set192=(Token)input.LT(1);

            if ( (input.LA(1) >= GEOMETRYCOLLECTION && input.LA(1) <= GEOMETRY_SYM)||input.LA(1)==LINESTRING||(input.LA(1) >= MULTILINESTRING && input.LA(1) <= MULTIPOLYGON)||(input.LA(1) >= POINT_SYM && input.LA(1) <= POLYGON) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set192)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "spatial_type"


    public static class char2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "char2"
    // MySQL.g:1168:1: char2 : CHAR_SYM ;
    public final MySQLParser.char2_return char2() throws RecognitionException {
        MySQLParser.char2_return retval = new MySQLParser.char2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHAR_SYM193=null;

        Object CHAR_SYM193_tree=null;

        try {
            // MySQL.g:1168:6: ( CHAR_SYM )
            // MySQL.g:1169:11: CHAR_SYM
            {
            root_0 = (Object)adaptor.nil();


            CHAR_SYM193=(Token)match(input,CHAR_SYM,FOLLOW_CHAR_SYM_in_char28802); 
            CHAR_SYM193_tree = 
            (Object)adaptor.create(CHAR_SYM193)
            ;
            adaptor.addChild(root_0, CHAR_SYM193_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "char2"


    public static class nchar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nchar"
    // MySQL.g:1172:1: nchar : ( NCHAR_SYM | NATIONAL_SYM CHAR_SYM );
    public final MySQLParser.nchar_return nchar() throws RecognitionException {
        MySQLParser.nchar_return retval = new MySQLParser.nchar_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NCHAR_SYM194=null;
        Token NATIONAL_SYM195=null;
        Token CHAR_SYM196=null;

        Object NCHAR_SYM194_tree=null;
        Object NATIONAL_SYM195_tree=null;
        Object CHAR_SYM196_tree=null;

        try {
            // MySQL.g:1172:6: ( NCHAR_SYM | NATIONAL_SYM CHAR_SYM )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==NCHAR_SYM) ) {
                alt53=1;
            }
            else if ( (LA53_0==NATIONAL_SYM) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // MySQL.g:1173:11: NCHAR_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    NCHAR_SYM194=(Token)match(input,NCHAR_SYM,FOLLOW_NCHAR_SYM_in_nchar8829); 
                    NCHAR_SYM194_tree = 
                    (Object)adaptor.create(NCHAR_SYM194)
                    ;
                    adaptor.addChild(root_0, NCHAR_SYM194_tree);


                    }
                    break;
                case 2 :
                    // MySQL.g:1174:11: NATIONAL_SYM CHAR_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    NATIONAL_SYM195=(Token)match(input,NATIONAL_SYM,FOLLOW_NATIONAL_SYM_in_nchar8842); 
                    NATIONAL_SYM195_tree = 
                    (Object)adaptor.create(NATIONAL_SYM195)
                    ;
                    adaptor.addChild(root_0, NATIONAL_SYM195_tree);


                    CHAR_SYM196=(Token)match(input,CHAR_SYM,FOLLOW_CHAR_SYM_in_nchar8844); 
                    CHAR_SYM196_tree = 
                    (Object)adaptor.create(CHAR_SYM196)
                    ;
                    adaptor.addChild(root_0, CHAR_SYM196_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nchar"


    public static class varchar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varchar"
    // MySQL.g:1177:1: varchar : ( char2 VARYING | VARCHAR );
    public final MySQLParser.varchar_return varchar() throws RecognitionException {
        MySQLParser.varchar_return retval = new MySQLParser.varchar_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VARYING198=null;
        Token VARCHAR199=null;
        MySQLParser.char2_return char2197 =null;


        Object VARYING198_tree=null;
        Object VARCHAR199_tree=null;

        try {
            // MySQL.g:1177:8: ( char2 VARYING | VARCHAR )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==CHAR_SYM) ) {
                alt54=1;
            }
            else if ( (LA54_0==VARCHAR) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // MySQL.g:1178:11: char2 VARYING
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_char2_in_varchar8871);
                    char2197=char2();

                    state._fsp--;

                    adaptor.addChild(root_0, char2197.getTree());

                    VARYING198=(Token)match(input,VARYING,FOLLOW_VARYING_in_varchar8873); 
                    VARYING198_tree = 
                    (Object)adaptor.create(VARYING198)
                    ;
                    adaptor.addChild(root_0, VARYING198_tree);




                    }
                    break;
                case 2 :
                    // MySQL.g:1179:11: VARCHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    VARCHAR199=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_varchar8887); 
                    VARCHAR199_tree = 
                    (Object)adaptor.create(VARCHAR199)
                    ;
                    adaptor.addChild(root_0, VARCHAR199_tree);




                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varchar"


    public static class nvarchar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nvarchar"
    // MySQL.g:1182:1: nvarchar : ( NATIONAL_SYM VARCHAR | NVARCHAR_SYM | NCHAR_SYM VARCHAR | NATIONAL_SYM CHAR_SYM VARYING | NCHAR_SYM VARYING );
    public final MySQLParser.nvarchar_return nvarchar() throws RecognitionException {
        MySQLParser.nvarchar_return retval = new MySQLParser.nvarchar_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NATIONAL_SYM200=null;
        Token VARCHAR201=null;
        Token NVARCHAR_SYM202=null;
        Token NCHAR_SYM203=null;
        Token VARCHAR204=null;
        Token NATIONAL_SYM205=null;
        Token CHAR_SYM206=null;
        Token VARYING207=null;
        Token NCHAR_SYM208=null;
        Token VARYING209=null;

        Object NATIONAL_SYM200_tree=null;
        Object VARCHAR201_tree=null;
        Object NVARCHAR_SYM202_tree=null;
        Object NCHAR_SYM203_tree=null;
        Object VARCHAR204_tree=null;
        Object NATIONAL_SYM205_tree=null;
        Object CHAR_SYM206_tree=null;
        Object VARYING207_tree=null;
        Object NCHAR_SYM208_tree=null;
        Object VARYING209_tree=null;

        try {
            // MySQL.g:1182:9: ( NATIONAL_SYM VARCHAR | NVARCHAR_SYM | NCHAR_SYM VARCHAR | NATIONAL_SYM CHAR_SYM VARYING | NCHAR_SYM VARYING )
            int alt55=5;
            switch ( input.LA(1) ) {
            case NATIONAL_SYM:
                {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==VARCHAR) ) {
                    alt55=1;
                }
                else if ( (LA55_1==CHAR_SYM) ) {
                    alt55=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;

                }
                }
                break;
            case NVARCHAR_SYM:
                {
                alt55=2;
                }
                break;
            case NCHAR_SYM:
                {
                int LA55_3 = input.LA(2);

                if ( (LA55_3==VARCHAR) ) {
                    alt55=3;
                }
                else if ( (LA55_3==VARYING) ) {
                    alt55=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }

            switch (alt55) {
                case 1 :
                    // MySQL.g:1183:11: NATIONAL_SYM VARCHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    NATIONAL_SYM200=(Token)match(input,NATIONAL_SYM,FOLLOW_NATIONAL_SYM_in_nvarchar8915); 
                    NATIONAL_SYM200_tree = 
                    (Object)adaptor.create(NATIONAL_SYM200)
                    ;
                    adaptor.addChild(root_0, NATIONAL_SYM200_tree);


                    VARCHAR201=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_nvarchar8917); 
                    VARCHAR201_tree = 
                    (Object)adaptor.create(VARCHAR201)
                    ;
                    adaptor.addChild(root_0, VARCHAR201_tree);




                    }
                    break;
                case 2 :
                    // MySQL.g:1184:11: NVARCHAR_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    NVARCHAR_SYM202=(Token)match(input,NVARCHAR_SYM,FOLLOW_NVARCHAR_SYM_in_nvarchar8931); 
                    NVARCHAR_SYM202_tree = 
                    (Object)adaptor.create(NVARCHAR_SYM202)
                    ;
                    adaptor.addChild(root_0, NVARCHAR_SYM202_tree);




                    }
                    break;
                case 3 :
                    // MySQL.g:1185:11: NCHAR_SYM VARCHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    NCHAR_SYM203=(Token)match(input,NCHAR_SYM,FOLLOW_NCHAR_SYM_in_nvarchar8945); 
                    NCHAR_SYM203_tree = 
                    (Object)adaptor.create(NCHAR_SYM203)
                    ;
                    adaptor.addChild(root_0, NCHAR_SYM203_tree);


                    VARCHAR204=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_nvarchar8947); 
                    VARCHAR204_tree = 
                    (Object)adaptor.create(VARCHAR204)
                    ;
                    adaptor.addChild(root_0, VARCHAR204_tree);




                    }
                    break;
                case 4 :
                    // MySQL.g:1186:11: NATIONAL_SYM CHAR_SYM VARYING
                    {
                    root_0 = (Object)adaptor.nil();


                    NATIONAL_SYM205=(Token)match(input,NATIONAL_SYM,FOLLOW_NATIONAL_SYM_in_nvarchar8961); 
                    NATIONAL_SYM205_tree = 
                    (Object)adaptor.create(NATIONAL_SYM205)
                    ;
                    adaptor.addChild(root_0, NATIONAL_SYM205_tree);


                    CHAR_SYM206=(Token)match(input,CHAR_SYM,FOLLOW_CHAR_SYM_in_nvarchar8963); 
                    CHAR_SYM206_tree = 
                    (Object)adaptor.create(CHAR_SYM206)
                    ;
                    adaptor.addChild(root_0, CHAR_SYM206_tree);


                    VARYING207=(Token)match(input,VARYING,FOLLOW_VARYING_in_nvarchar8965); 
                    VARYING207_tree = 
                    (Object)adaptor.create(VARYING207)
                    ;
                    adaptor.addChild(root_0, VARYING207_tree);




                    }
                    break;
                case 5 :
                    // MySQL.g:1187:11: NCHAR_SYM VARYING
                    {
                    root_0 = (Object)adaptor.nil();


                    NCHAR_SYM208=(Token)match(input,NCHAR_SYM,FOLLOW_NCHAR_SYM_in_nvarchar8979); 
                    NCHAR_SYM208_tree = 
                    (Object)adaptor.create(NCHAR_SYM208)
                    ;
                    adaptor.addChild(root_0, NCHAR_SYM208_tree);


                    VARYING209=(Token)match(input,VARYING,FOLLOW_VARYING_in_nvarchar8981); 
                    VARYING209_tree = 
                    (Object)adaptor.create(VARYING209)
                    ;
                    adaptor.addChild(root_0, VARYING209_tree);




                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nvarchar"


    public static class int_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "int_type"
    // MySQL.g:1190:1: int_type : ( INT_SYM | TINYINT | SMALLINT | MEDIUMINT | BIGINT );
    public final MySQLParser.int_type_return int_type() throws RecognitionException {
        MySQLParser.int_type_return retval = new MySQLParser.int_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set210=null;

        Object set210_tree=null;

        try {
            // MySQL.g:1190:9: ( INT_SYM | TINYINT | SMALLINT | MEDIUMINT | BIGINT )
            // MySQL.g:
            {
            root_0 = (Object)adaptor.nil();


            set210=(Token)input.LT(1);

            if ( input.LA(1)==BIGINT||input.LA(1)==INT_SYM||input.LA(1)==MEDIUMINT||input.LA(1)==SMALLINT||input.LA(1)==TINYINT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set210)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "int_type"


    public static class real_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "real_type"
    // MySQL.g:1198:1: real_type : ( REAL | DOUBLE_SYM | DOUBLE_SYM PRECISION );
    public final MySQLParser.real_type_return real_type() throws RecognitionException {
        MySQLParser.real_type_return retval = new MySQLParser.real_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REAL211=null;
        Token DOUBLE_SYM212=null;
        Token DOUBLE_SYM213=null;
        Token PRECISION214=null;

        Object REAL211_tree=null;
        Object DOUBLE_SYM212_tree=null;
        Object DOUBLE_SYM213_tree=null;
        Object PRECISION214_tree=null;

        try {
            // MySQL.g:1198:10: ( REAL | DOUBLE_SYM | DOUBLE_SYM PRECISION )
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==REAL) ) {
                alt56=1;
            }
            else if ( (LA56_0==DOUBLE_SYM) ) {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==PRECISION) ) {
                    alt56=3;
                }
                else if ( (LA56_2==AUTO_INC||LA56_2==DEFAULT||LA56_2==NOT||LA56_2==SIGNED_SYM||LA56_2==UNSIGNED||(LA56_2 >= ZEROFILL && LA56_2 <= 549)||LA56_2==551) ) {
                    alt56=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // MySQL.g:1199:11: REAL
                    {
                    root_0 = (Object)adaptor.nil();


                    REAL211=(Token)match(input,REAL,FOLLOW_REAL_in_real_type9096); 
                    REAL211_tree = 
                    (Object)adaptor.create(REAL211)
                    ;
                    adaptor.addChild(root_0, REAL211_tree);


                    }
                    break;
                case 2 :
                    // MySQL.g:1200:11: DOUBLE_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLE_SYM212=(Token)match(input,DOUBLE_SYM,FOLLOW_DOUBLE_SYM_in_real_type9108); 
                    DOUBLE_SYM212_tree = 
                    (Object)adaptor.create(DOUBLE_SYM212)
                    ;
                    adaptor.addChild(root_0, DOUBLE_SYM212_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1201:11: DOUBLE_SYM PRECISION
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLE_SYM213=(Token)match(input,DOUBLE_SYM,FOLLOW_DOUBLE_SYM_in_real_type9120); 
                    DOUBLE_SYM213_tree = 
                    (Object)adaptor.create(DOUBLE_SYM213)
                    ;
                    adaptor.addChild(root_0, DOUBLE_SYM213_tree);


                    PRECISION214=(Token)match(input,PRECISION,FOLLOW_PRECISION_in_real_type9122); 
                    PRECISION214_tree = 
                    (Object)adaptor.create(PRECISION214)
                    ;
                    adaptor.addChild(root_0, PRECISION214_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "real_type"


    public static class float_options_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "float_options"
    // MySQL.g:1204:1: float_options : ( field_length | precision )? ;
    public final MySQLParser.float_options_return float_options() throws RecognitionException {
        MySQLParser.float_options_return retval = new MySQLParser.float_options_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.field_length_return field_length215 =null;

        MySQLParser.precision_return precision216 =null;



        try {
            // MySQL.g:1204:14: ( ( field_length | precision )? )
            // MySQL.g:1205:9: ( field_length | precision )?
            {
            root_0 = (Object)adaptor.nil();


            // MySQL.g:1205:9: ( field_length | precision )?
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==548) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==DECIMAL_NUM||LA57_1==LONG_NUM||LA57_1==ULONGLONG_NUM) ) {
                    alt57=1;
                }
                else if ( (LA57_1==NUM) ) {
                    int LA57_4 = input.LA(3);

                    if ( (LA57_4==549) ) {
                        alt57=1;
                    }
                    else if ( (LA57_4==551) ) {
                        alt57=2;
                    }
                }
            }
            switch (alt57) {
                case 1 :
                    // MySQL.g:1206:11: field_length
                    {
                    pushFollow(FOLLOW_field_length_in_float_options9158);
                    field_length215=field_length();

                    state._fsp--;

                    adaptor.addChild(root_0, field_length215.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1208:13: precision
                    {
                    pushFollow(FOLLOW_precision_in_float_options9183);
                    precision216=precision();

                    state._fsp--;

                    adaptor.addChild(root_0, precision216.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "float_options"


    public static class precision_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precision"
    // MySQL.g:1213:1: precision : '(' NUM ',' NUM ')' ;
    public final MySQLParser.precision_return precision() throws RecognitionException {
        MySQLParser.precision_return retval = new MySQLParser.precision_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal217=null;
        Token NUM218=null;
        Token char_literal219=null;
        Token NUM220=null;
        Token char_literal221=null;

        Object char_literal217_tree=null;
        Object NUM218_tree=null;
        Object char_literal219_tree=null;
        Object NUM220_tree=null;
        Object char_literal221_tree=null;

        try {
            // MySQL.g:1213:10: ( '(' NUM ',' NUM ')' )
            // MySQL.g:1214:11: '(' NUM ',' NUM ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal217=(Token)match(input,548,FOLLOW_548_in_precision9221); 
            char_literal217_tree = 
            (Object)adaptor.create(char_literal217)
            ;
            adaptor.addChild(root_0, char_literal217_tree);


            NUM218=(Token)match(input,NUM,FOLLOW_NUM_in_precision9223); 
            NUM218_tree = 
            (Object)adaptor.create(NUM218)
            ;
            adaptor.addChild(root_0, NUM218_tree);


            char_literal219=(Token)match(input,551,FOLLOW_551_in_precision9225); 
            char_literal219_tree = 
            (Object)adaptor.create(char_literal219)
            ;
            adaptor.addChild(root_0, char_literal219_tree);


            NUM220=(Token)match(input,NUM,FOLLOW_NUM_in_precision9227); 
            NUM220_tree = 
            (Object)adaptor.create(NUM220)
            ;
            adaptor.addChild(root_0, NUM220_tree);


            char_literal221=(Token)match(input,549,FOLLOW_549_in_precision9229); 
            char_literal221_tree = 
            (Object)adaptor.create(char_literal221)
            ;
            adaptor.addChild(root_0, char_literal221_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precision"


    public static class field_options_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_options"
    // MySQL.g:1218:1: field_options : ( field_option )* ;
    public final MySQLParser.field_options_return field_options() throws RecognitionException {
        MySQLParser.field_options_return retval = new MySQLParser.field_options_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.field_option_return field_option222 =null;



        try {
            // MySQL.g:1218:14: ( ( field_option )* )
            // MySQL.g:1219:9: ( field_option )*
            {
            root_0 = (Object)adaptor.nil();


            // MySQL.g:1219:9: ( field_option )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==SIGNED_SYM||LA58_0==UNSIGNED||LA58_0==ZEROFILL) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // MySQL.g:1219:9: field_option
            	    {
            	    pushFollow(FOLLOW_field_option_in_field_options9270);
            	    field_option222=field_option();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_option222.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_options"


    public static class field_option_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_option"
    // MySQL.g:1222:1: field_option : ( SIGNED_SYM | UNSIGNED | ZEROFILL );
    public final MySQLParser.field_option_return field_option() throws RecognitionException {
        MySQLParser.field_option_return retval = new MySQLParser.field_option_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SIGNED_SYM223=null;
        Token UNSIGNED224=null;
        Token ZEROFILL225=null;

        Object SIGNED_SYM223_tree=null;
        Object UNSIGNED224_tree=null;
        Object ZEROFILL225_tree=null;

        try {
            // MySQL.g:1222:13: ( SIGNED_SYM | UNSIGNED | ZEROFILL )
            int alt59=3;
            switch ( input.LA(1) ) {
            case SIGNED_SYM:
                {
                alt59=1;
                }
                break;
            case UNSIGNED:
                {
                alt59=2;
                }
                break;
            case ZEROFILL:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }

            switch (alt59) {
                case 1 :
                    // MySQL.g:1223:11: SIGNED_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    SIGNED_SYM223=(Token)match(input,SIGNED_SYM,FOLLOW_SIGNED_SYM_in_field_option9297); 
                    SIGNED_SYM223_tree = 
                    (Object)adaptor.create(SIGNED_SYM223)
                    ;
                    adaptor.addChild(root_0, SIGNED_SYM223_tree);




                    }
                    break;
                case 2 :
                    // MySQL.g:1224:11: UNSIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    UNSIGNED224=(Token)match(input,UNSIGNED,FOLLOW_UNSIGNED_in_field_option9311); 
                    UNSIGNED224_tree = 
                    (Object)adaptor.create(UNSIGNED224)
                    ;
                    adaptor.addChild(root_0, UNSIGNED224_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1225:11: ZEROFILL
                    {
                    root_0 = (Object)adaptor.nil();


                    ZEROFILL225=(Token)match(input,ZEROFILL,FOLLOW_ZEROFILL_in_field_option9324); 
                    ZEROFILL225_tree = 
                    (Object)adaptor.create(ZEROFILL225)
                    ;
                    adaptor.addChild(root_0, ZEROFILL225_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_option"


    public static class field_length_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_length"
    // MySQL.g:1228:1: field_length : ( '(' LONG_NUM ')' | '(' ULONGLONG_NUM ')' | '(' DECIMAL_NUM ')' | '(' NUM ')' );
    public final MySQLParser.field_length_return field_length() throws RecognitionException {
        MySQLParser.field_length_return retval = new MySQLParser.field_length_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal226=null;
        Token LONG_NUM227=null;
        Token char_literal228=null;
        Token char_literal229=null;
        Token ULONGLONG_NUM230=null;
        Token char_literal231=null;
        Token char_literal232=null;
        Token DECIMAL_NUM233=null;
        Token char_literal234=null;
        Token char_literal235=null;
        Token NUM236=null;
        Token char_literal237=null;

        Object char_literal226_tree=null;
        Object LONG_NUM227_tree=null;
        Object char_literal228_tree=null;
        Object char_literal229_tree=null;
        Object ULONGLONG_NUM230_tree=null;
        Object char_literal231_tree=null;
        Object char_literal232_tree=null;
        Object DECIMAL_NUM233_tree=null;
        Object char_literal234_tree=null;
        Object char_literal235_tree=null;
        Object NUM236_tree=null;
        Object char_literal237_tree=null;

        try {
            // MySQL.g:1228:13: ( '(' LONG_NUM ')' | '(' ULONGLONG_NUM ')' | '(' DECIMAL_NUM ')' | '(' NUM ')' )
            int alt60=4;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==548) ) {
                switch ( input.LA(2) ) {
                case LONG_NUM:
                    {
                    alt60=1;
                    }
                    break;
                case ULONGLONG_NUM:
                    {
                    alt60=2;
                    }
                    break;
                case DECIMAL_NUM:
                    {
                    alt60=3;
                    }
                    break;
                case NUM:
                    {
                    alt60=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }
            switch (alt60) {
                case 1 :
                    // MySQL.g:1229:11: '(' LONG_NUM ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal226=(Token)match(input,548,FOLLOW_548_in_field_length9351); 
                    char_literal226_tree = 
                    (Object)adaptor.create(char_literal226)
                    ;
                    adaptor.addChild(root_0, char_literal226_tree);


                    LONG_NUM227=(Token)match(input,LONG_NUM,FOLLOW_LONG_NUM_in_field_length9353); 
                    LONG_NUM227_tree = 
                    (Object)adaptor.create(LONG_NUM227)
                    ;
                    adaptor.addChild(root_0, LONG_NUM227_tree);


                    char_literal228=(Token)match(input,549,FOLLOW_549_in_field_length9355); 
                    char_literal228_tree = 
                    (Object)adaptor.create(char_literal228)
                    ;
                    adaptor.addChild(root_0, char_literal228_tree);


                    }
                    break;
                case 2 :
                    // MySQL.g:1230:11: '(' ULONGLONG_NUM ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal229=(Token)match(input,548,FOLLOW_548_in_field_length9373); 
                    char_literal229_tree = 
                    (Object)adaptor.create(char_literal229)
                    ;
                    adaptor.addChild(root_0, char_literal229_tree);


                    ULONGLONG_NUM230=(Token)match(input,ULONGLONG_NUM,FOLLOW_ULONGLONG_NUM_in_field_length9375); 
                    ULONGLONG_NUM230_tree = 
                    (Object)adaptor.create(ULONGLONG_NUM230)
                    ;
                    adaptor.addChild(root_0, ULONGLONG_NUM230_tree);


                    char_literal231=(Token)match(input,549,FOLLOW_549_in_field_length9377); 
                    char_literal231_tree = 
                    (Object)adaptor.create(char_literal231)
                    ;
                    adaptor.addChild(root_0, char_literal231_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1231:11: '(' DECIMAL_NUM ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal232=(Token)match(input,548,FOLLOW_548_in_field_length9390); 
                    char_literal232_tree = 
                    (Object)adaptor.create(char_literal232)
                    ;
                    adaptor.addChild(root_0, char_literal232_tree);


                    DECIMAL_NUM233=(Token)match(input,DECIMAL_NUM,FOLLOW_DECIMAL_NUM_in_field_length9392); 
                    DECIMAL_NUM233_tree = 
                    (Object)adaptor.create(DECIMAL_NUM233)
                    ;
                    adaptor.addChild(root_0, DECIMAL_NUM233_tree);


                    char_literal234=(Token)match(input,549,FOLLOW_549_in_field_length9394); 
                    char_literal234_tree = 
                    (Object)adaptor.create(char_literal234)
                    ;
                    adaptor.addChild(root_0, char_literal234_tree);


                    }
                    break;
                case 4 :
                    // MySQL.g:1232:11: '(' NUM ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal235=(Token)match(input,548,FOLLOW_548_in_field_length9409); 
                    char_literal235_tree = 
                    (Object)adaptor.create(char_literal235)
                    ;
                    adaptor.addChild(root_0, char_literal235_tree);


                    NUM236=(Token)match(input,NUM,FOLLOW_NUM_in_field_length9411); 
                    NUM236_tree = 
                    (Object)adaptor.create(NUM236)
                    ;
                    adaptor.addChild(root_0, NUM236_tree);


                    char_literal237=(Token)match(input,549,FOLLOW_549_in_field_length9413); 
                    char_literal237_tree = 
                    (Object)adaptor.create(char_literal237)
                    ;
                    adaptor.addChild(root_0, char_literal237_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_length"


    public static class attribute_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute_list"
    // MySQL.g:1235:1: attribute_list : ( ( attribute )+ attribute_with_key | attribute_with_key ( attribute )+ | ( attribute )* );
    public final MySQLParser.attribute_list_return attribute_list() throws RecognitionException {
        MySQLParser.attribute_list_return retval = new MySQLParser.attribute_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.attribute_return attribute238 =null;

        MySQLParser.attribute_with_key_return attribute_with_key239 =null;

        MySQLParser.attribute_with_key_return attribute_with_key240 =null;

        MySQLParser.attribute_return attribute241 =null;

        MySQLParser.attribute_return attribute242 =null;



        try {
            // MySQL.g:1235:15: ( ( attribute )+ attribute_with_key | attribute_with_key ( attribute )+ | ( attribute )* )
            int alt64=3;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // MySQL.g:1236:9: ( attribute )+ attribute_with_key
                    {
                    root_0 = (Object)adaptor.nil();


                    // MySQL.g:1236:9: ( attribute )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==AUTO_INC||LA61_0==DEFAULT||LA61_0==NOT) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // MySQL.g:1236:9: attribute
                    	    {
                    	    pushFollow(FOLLOW_attribute_in_attribute_list9448);
                    	    attribute238=attribute();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, attribute238.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt61 >= 1 ) break loop61;
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);


                    pushFollow(FOLLOW_attribute_with_key_in_attribute_list9451);
                    attribute_with_key239=attribute_with_key();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute_with_key239.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1236:41: attribute_with_key ( attribute )+
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_attribute_with_key_in_attribute_list9455);
                    attribute_with_key240=attribute_with_key();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute_with_key240.getTree());

                    // MySQL.g:1236:60: ( attribute )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==AUTO_INC||LA62_0==DEFAULT||LA62_0==NOT) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // MySQL.g:1236:60: attribute
                    	    {
                    	    pushFollow(FOLLOW_attribute_in_attribute_list9457);
                    	    attribute241=attribute();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, attribute241.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt62 >= 1 ) break loop62;
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // MySQL.g:1236:74: ( attribute )*
                    {
                    root_0 = (Object)adaptor.nil();


                    // MySQL.g:1236:74: ( attribute )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==AUTO_INC||LA63_0==DEFAULT||LA63_0==NOT) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // MySQL.g:1236:74: attribute
                    	    {
                    	    pushFollow(FOLLOW_attribute_in_attribute_list9463);
                    	    attribute242=attribute();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, attribute242.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute_list"


    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // MySQL.g:1239:1: attribute : ( DEFAULT now_or_signed_literal | NOT NULL_SYM | AUTO_INC );
    public final MySQLParser.attribute_return attribute() throws RecognitionException {
        MySQLParser.attribute_return retval = new MySQLParser.attribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFAULT243=null;
        Token NOT245=null;
        Token NULL_SYM246=null;
        Token AUTO_INC247=null;
        MySQLParser.now_or_signed_literal_return now_or_signed_literal244 =null;


        Object DEFAULT243_tree=null;
        Object NOT245_tree=null;
        Object NULL_SYM246_tree=null;
        Object AUTO_INC247_tree=null;

        try {
            // MySQL.g:1239:10: ( DEFAULT now_or_signed_literal | NOT NULL_SYM | AUTO_INC )
            int alt65=3;
            switch ( input.LA(1) ) {
            case DEFAULT:
                {
                alt65=1;
                }
                break;
            case NOT:
                {
                alt65=2;
                }
                break;
            case AUTO_INC:
                {
                alt65=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }

            switch (alt65) {
                case 1 :
                    // MySQL.g:1240:11: DEFAULT now_or_signed_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT243=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_attribute9490); 
                    DEFAULT243_tree = 
                    (Object)adaptor.create(DEFAULT243)
                    ;
                    adaptor.addChild(root_0, DEFAULT243_tree);


                    pushFollow(FOLLOW_now_or_signed_literal_in_attribute9492);
                    now_or_signed_literal244=now_or_signed_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, now_or_signed_literal244.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1242:11: NOT NULL_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    NOT245=(Token)match(input,NOT,FOLLOW_NOT_in_attribute9506); 
                    NOT245_tree = 
                    (Object)adaptor.create(NOT245)
                    ;
                    adaptor.addChild(root_0, NOT245_tree);


                    NULL_SYM246=(Token)match(input,NULL_SYM,FOLLOW_NULL_SYM_in_attribute9508); 
                    NULL_SYM246_tree = 
                    (Object)adaptor.create(NULL_SYM246)
                    ;
                    adaptor.addChild(root_0, NULL_SYM246_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1244:11: AUTO_INC
                    {
                    root_0 = (Object)adaptor.nil();


                    AUTO_INC247=(Token)match(input,AUTO_INC,FOLLOW_AUTO_INC_in_attribute9522); 
                    AUTO_INC247_tree = 
                    (Object)adaptor.create(AUTO_INC247)
                    ;
                    adaptor.addChild(root_0, AUTO_INC247_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class attribute_with_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute_with_key"
    // MySQL.g:1252:1: attribute_with_key : ( ( PRIMARY_SYM )? KEY_SYM | UNIQUE_SYM ( KEY_SYM )? );
    public final MySQLParser.attribute_with_key_return attribute_with_key() throws RecognitionException {
        MySQLParser.attribute_with_key_return retval = new MySQLParser.attribute_with_key_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRIMARY_SYM248=null;
        Token KEY_SYM249=null;
        Token UNIQUE_SYM250=null;
        Token KEY_SYM251=null;

        Object PRIMARY_SYM248_tree=null;
        Object KEY_SYM249_tree=null;
        Object UNIQUE_SYM250_tree=null;
        Object KEY_SYM251_tree=null;

        try {
            // MySQL.g:1252:19: ( ( PRIMARY_SYM )? KEY_SYM | UNIQUE_SYM ( KEY_SYM )? )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==KEY_SYM||LA68_0==PRIMARY_SYM) ) {
                alt68=1;
            }
            else if ( (LA68_0==UNIQUE_SYM) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }
            switch (alt68) {
                case 1 :
                    // MySQL.g:1253:11: ( PRIMARY_SYM )? KEY_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    // MySQL.g:1253:11: ( PRIMARY_SYM )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==PRIMARY_SYM) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // MySQL.g:1253:11: PRIMARY_SYM
                            {
                            PRIMARY_SYM248=(Token)match(input,PRIMARY_SYM,FOLLOW_PRIMARY_SYM_in_attribute_with_key9571); 
                            PRIMARY_SYM248_tree = 
                            (Object)adaptor.create(PRIMARY_SYM248)
                            ;
                            adaptor.addChild(root_0, PRIMARY_SYM248_tree);


                            }
                            break;

                    }


                    KEY_SYM249=(Token)match(input,KEY_SYM,FOLLOW_KEY_SYM_in_attribute_with_key9574); 
                    KEY_SYM249_tree = 
                    (Object)adaptor.create(KEY_SYM249)
                    ;
                    adaptor.addChild(root_0, KEY_SYM249_tree);


                    }
                    break;
                case 2 :
                    // MySQL.g:1254:11: UNIQUE_SYM ( KEY_SYM )?
                    {
                    root_0 = (Object)adaptor.nil();


                    UNIQUE_SYM250=(Token)match(input,UNIQUE_SYM,FOLLOW_UNIQUE_SYM_in_attribute_with_key9587); 
                    UNIQUE_SYM250_tree = 
                    (Object)adaptor.create(UNIQUE_SYM250)
                    ;
                    adaptor.addChild(root_0, UNIQUE_SYM250_tree);


                    // MySQL.g:1254:22: ( KEY_SYM )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==KEY_SYM) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // MySQL.g:1254:22: KEY_SYM
                            {
                            KEY_SYM251=(Token)match(input,KEY_SYM,FOLLOW_KEY_SYM_in_attribute_with_key9589); 
                            KEY_SYM251_tree = 
                            (Object)adaptor.create(KEY_SYM251)
                            ;
                            adaptor.addChild(root_0, KEY_SYM251_tree);


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute_with_key"


    public static class now_or_signed_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "now_or_signed_literal"
    // MySQL.g:1257:1: now_or_signed_literal : ( ( NOW_SYM )? | signed_literal );
    public final MySQLParser.now_or_signed_literal_return now_or_signed_literal() throws RecognitionException {
        MySQLParser.now_or_signed_literal_return retval = new MySQLParser.now_or_signed_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOW_SYM252=null;
        MySQLParser.signed_literal_return signed_literal253 =null;


        Object NOW_SYM252_tree=null;

        try {
            // MySQL.g:1257:22: ( ( NOW_SYM )? | signed_literal )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==EOF||LA70_0==AUTO_INC||LA70_0==DEFAULT||LA70_0==KEY_SYM||(LA70_0 >= NOT && LA70_0 <= NOW_SYM)||LA70_0==PRIMARY_SYM||LA70_0==UNIQUE_SYM||LA70_0==549||LA70_0==551) ) {
                alt70=1;
            }
            else if ( (LA70_0==BIN_NUM||LA70_0==DATE_SYM||LA70_0==FALSE_SYM||LA70_0==HEX_NUM||LA70_0==NCHAR_STRING||LA70_0==NULL_SYM||LA70_0==NUM_literal||LA70_0==TEXT_STRING||LA70_0==TIMESTAMP||LA70_0==TIME_SYM||LA70_0==TRUE_SYM||LA70_0==550||LA70_0==552||LA70_0==555) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // MySQL.g:1258:11: ( NOW_SYM )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // MySQL.g:1258:11: ( NOW_SYM )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==NOW_SYM) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // MySQL.g:1258:11: NOW_SYM
                            {
                            NOW_SYM252=(Token)match(input,NOW_SYM,FOLLOW_NOW_SYM_in_now_or_signed_literal9608); 
                            NOW_SYM252_tree = 
                            (Object)adaptor.create(NOW_SYM252)
                            ;
                            adaptor.addChild(root_0, NOW_SYM252_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // MySQL.g:1259:11: signed_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_signed_literal_in_now_or_signed_literal9621);
                    signed_literal253=signed_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_literal253.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "now_or_signed_literal"


    public static class braces_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "braces"
    // MySQL.g:1263:1: braces : '(' ')' ;
    public final MySQLParser.braces_return braces() throws RecognitionException {
        MySQLParser.braces_return retval = new MySQLParser.braces_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal254=null;
        Token char_literal255=null;

        Object char_literal254_tree=null;
        Object char_literal255_tree=null;

        try {
            // MySQL.g:1263:7: ( '(' ')' )
            // MySQL.g:1264:10: '(' ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal254=(Token)match(input,548,FOLLOW_548_in_braces9647); 
            char_literal254_tree = 
            (Object)adaptor.create(char_literal254)
            ;
            adaptor.addChild(root_0, char_literal254_tree);


            char_literal255=(Token)match(input,549,FOLLOW_549_in_braces9649); 
            char_literal255_tree = 
            (Object)adaptor.create(char_literal255)
            ;
            adaptor.addChild(root_0, char_literal255_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "braces"


    public static class charset_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "charset"
    // MySQL.g:1268:1: charset : ( CHAR_SYM SET | CHARSET );
    public final MySQLParser.charset_return charset() throws RecognitionException {
        MySQLParser.charset_return retval = new MySQLParser.charset_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHAR_SYM256=null;
        Token SET257=null;
        Token CHARSET258=null;

        Object CHAR_SYM256_tree=null;
        Object SET257_tree=null;
        Object CHARSET258_tree=null;

        try {
            // MySQL.g:1268:8: ( CHAR_SYM SET | CHARSET )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==CHAR_SYM) ) {
                alt71=1;
            }
            else if ( (LA71_0==CHARSET) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }
            switch (alt71) {
                case 1 :
                    // MySQL.g:1269:11: CHAR_SYM SET
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR_SYM256=(Token)match(input,CHAR_SYM,FOLLOW_CHAR_SYM_in_charset9676); 
                    CHAR_SYM256_tree = 
                    (Object)adaptor.create(CHAR_SYM256)
                    ;
                    adaptor.addChild(root_0, CHAR_SYM256_tree);


                    SET257=(Token)match(input,SET,FOLLOW_SET_in_charset9678); 
                    SET257_tree = 
                    (Object)adaptor.create(SET257)
                    ;
                    adaptor.addChild(root_0, SET257_tree);




                    }
                    break;
                case 2 :
                    // MySQL.g:1270:11: CHARSET
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARSET258=(Token)match(input,CHARSET,FOLLOW_CHARSET_in_charset9692); 
                    CHARSET258_tree = 
                    (Object)adaptor.create(CHARSET258)
                    ;
                    adaptor.addChild(root_0, CHARSET258_tree);




                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "charset"


    public static class on_delete_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "on_delete"
    // MySQL.g:1273:1: on_delete : on_delete_list ;
    public final MySQLParser.on_delete_return on_delete() throws RecognitionException {
        MySQLParser.on_delete_return retval = new MySQLParser.on_delete_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.on_delete_list_return on_delete_list259 =null;



        try {
            // MySQL.g:1273:10: ( on_delete_list )
            // MySQL.g:1274:11: on_delete_list
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_on_delete_list_in_on_delete9728);
            on_delete_list259=on_delete_list();

            state._fsp--;

            adaptor.addChild(root_0, on_delete_list259.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "on_delete"


    public static class on_delete_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "on_delete_list"
    // MySQL.g:1277:1: on_delete_list : ( on_delete_item )+ ;
    public final MySQLParser.on_delete_list_return on_delete_list() throws RecognitionException {
        MySQLParser.on_delete_list_return retval = new MySQLParser.on_delete_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.on_delete_item_return on_delete_item260 =null;



        try {
            // MySQL.g:1277:15: ( ( on_delete_item )+ )
            // MySQL.g:1278:11: ( on_delete_item )+
            {
            root_0 = (Object)adaptor.nil();


            // MySQL.g:1278:11: ( on_delete_item )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==MATCH||LA72_0==ON) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // MySQL.g:1278:11: on_delete_item
            	    {
            	    pushFollow(FOLLOW_on_delete_item_in_on_delete_list9755);
            	    on_delete_item260=on_delete_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, on_delete_item260.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "on_delete_list"


    public static class on_delete_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "on_delete_item"
    // MySQL.g:1281:1: on_delete_item : ( ON DELETE_SYM delete_option | ON UPDATE_SYM delete_option | MATCH FULL | MATCH PARTIAL | MATCH SIMPLE_SYM );
    public final MySQLParser.on_delete_item_return on_delete_item() throws RecognitionException {
        MySQLParser.on_delete_item_return retval = new MySQLParser.on_delete_item_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ON261=null;
        Token DELETE_SYM262=null;
        Token ON264=null;
        Token UPDATE_SYM265=null;
        Token MATCH267=null;
        Token FULL268=null;
        Token MATCH269=null;
        Token PARTIAL270=null;
        Token MATCH271=null;
        Token SIMPLE_SYM272=null;
        MySQLParser.delete_option_return delete_option263 =null;

        MySQLParser.delete_option_return delete_option266 =null;


        Object ON261_tree=null;
        Object DELETE_SYM262_tree=null;
        Object ON264_tree=null;
        Object UPDATE_SYM265_tree=null;
        Object MATCH267_tree=null;
        Object FULL268_tree=null;
        Object MATCH269_tree=null;
        Object PARTIAL270_tree=null;
        Object MATCH271_tree=null;
        Object SIMPLE_SYM272_tree=null;

        try {
            // MySQL.g:1281:15: ( ON DELETE_SYM delete_option | ON UPDATE_SYM delete_option | MATCH FULL | MATCH PARTIAL | MATCH SIMPLE_SYM )
            int alt73=5;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==ON) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==DELETE_SYM) ) {
                    alt73=1;
                }
                else if ( (LA73_1==UPDATE_SYM) ) {
                    alt73=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA73_0==MATCH) ) {
                switch ( input.LA(2) ) {
                case FULL:
                    {
                    alt73=3;
                    }
                    break;
                case PARTIAL:
                    {
                    alt73=4;
                    }
                    break;
                case SIMPLE_SYM:
                    {
                    alt73=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // MySQL.g:1282:11: ON DELETE_SYM delete_option
                    {
                    root_0 = (Object)adaptor.nil();


                    ON261=(Token)match(input,ON,FOLLOW_ON_in_on_delete_item9782); 
                    ON261_tree = 
                    (Object)adaptor.create(ON261)
                    ;
                    adaptor.addChild(root_0, ON261_tree);


                    DELETE_SYM262=(Token)match(input,DELETE_SYM,FOLLOW_DELETE_SYM_in_on_delete_item9784); 
                    DELETE_SYM262_tree = 
                    (Object)adaptor.create(DELETE_SYM262)
                    ;
                    adaptor.addChild(root_0, DELETE_SYM262_tree);


                    pushFollow(FOLLOW_delete_option_in_on_delete_item9786);
                    delete_option263=delete_option();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_option263.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1283:11: ON UPDATE_SYM delete_option
                    {
                    root_0 = (Object)adaptor.nil();


                    ON264=(Token)match(input,ON,FOLLOW_ON_in_on_delete_item9798); 
                    ON264_tree = 
                    (Object)adaptor.create(ON264)
                    ;
                    adaptor.addChild(root_0, ON264_tree);


                    UPDATE_SYM265=(Token)match(input,UPDATE_SYM,FOLLOW_UPDATE_SYM_in_on_delete_item9800); 
                    UPDATE_SYM265_tree = 
                    (Object)adaptor.create(UPDATE_SYM265)
                    ;
                    adaptor.addChild(root_0, UPDATE_SYM265_tree);


                    pushFollow(FOLLOW_delete_option_in_on_delete_item9802);
                    delete_option266=delete_option();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_option266.getTree());

                    }
                    break;
                case 3 :
                    // MySQL.g:1284:11: MATCH FULL
                    {
                    root_0 = (Object)adaptor.nil();


                    MATCH267=(Token)match(input,MATCH,FOLLOW_MATCH_in_on_delete_item9814); 
                    MATCH267_tree = 
                    (Object)adaptor.create(MATCH267)
                    ;
                    adaptor.addChild(root_0, MATCH267_tree);


                    FULL268=(Token)match(input,FULL,FOLLOW_FULL_in_on_delete_item9816); 
                    FULL268_tree = 
                    (Object)adaptor.create(FULL268)
                    ;
                    adaptor.addChild(root_0, FULL268_tree);


                    }
                    break;
                case 4 :
                    // MySQL.g:1285:11: MATCH PARTIAL
                    {
                    root_0 = (Object)adaptor.nil();


                    MATCH269=(Token)match(input,MATCH,FOLLOW_MATCH_in_on_delete_item9835); 
                    MATCH269_tree = 
                    (Object)adaptor.create(MATCH269)
                    ;
                    adaptor.addChild(root_0, MATCH269_tree);


                    PARTIAL270=(Token)match(input,PARTIAL,FOLLOW_PARTIAL_in_on_delete_item9837); 
                    PARTIAL270_tree = 
                    (Object)adaptor.create(PARTIAL270)
                    ;
                    adaptor.addChild(root_0, PARTIAL270_tree);


                    }
                    break;
                case 5 :
                    // MySQL.g:1286:11: MATCH SIMPLE_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    MATCH271=(Token)match(input,MATCH,FOLLOW_MATCH_in_on_delete_item9853); 
                    MATCH271_tree = 
                    (Object)adaptor.create(MATCH271)
                    ;
                    adaptor.addChild(root_0, MATCH271_tree);


                    SIMPLE_SYM272=(Token)match(input,SIMPLE_SYM,FOLLOW_SIMPLE_SYM_in_on_delete_item9855); 
                    SIMPLE_SYM272_tree = 
                    (Object)adaptor.create(SIMPLE_SYM272)
                    ;
                    adaptor.addChild(root_0, SIMPLE_SYM272_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "on_delete_item"


    public static class delete_option_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete_option"
    // MySQL.g:1289:1: delete_option : ( RESTRICT | CASCADE | SET NULL_SYM | NO_SYM ACTION | SET DEFAULT );
    public final MySQLParser.delete_option_return delete_option() throws RecognitionException {
        MySQLParser.delete_option_return retval = new MySQLParser.delete_option_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RESTRICT273=null;
        Token CASCADE274=null;
        Token SET275=null;
        Token NULL_SYM276=null;
        Token NO_SYM277=null;
        Token ACTION278=null;
        Token SET279=null;
        Token DEFAULT280=null;

        Object RESTRICT273_tree=null;
        Object CASCADE274_tree=null;
        Object SET275_tree=null;
        Object NULL_SYM276_tree=null;
        Object NO_SYM277_tree=null;
        Object ACTION278_tree=null;
        Object SET279_tree=null;
        Object DEFAULT280_tree=null;

        try {
            // MySQL.g:1289:14: ( RESTRICT | CASCADE | SET NULL_SYM | NO_SYM ACTION | SET DEFAULT )
            int alt74=5;
            switch ( input.LA(1) ) {
            case RESTRICT:
                {
                alt74=1;
                }
                break;
            case CASCADE:
                {
                alt74=2;
                }
                break;
            case SET:
                {
                int LA74_3 = input.LA(2);

                if ( (LA74_3==NULL_SYM) ) {
                    alt74=3;
                }
                else if ( (LA74_3==DEFAULT) ) {
                    alt74=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 3, input);

                    throw nvae;

                }
                }
                break;
            case NO_SYM:
                {
                alt74=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }

            switch (alt74) {
                case 1 :
                    // MySQL.g:1290:11: RESTRICT
                    {
                    root_0 = (Object)adaptor.nil();


                    RESTRICT273=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_delete_option9882); 
                    RESTRICT273_tree = 
                    (Object)adaptor.create(RESTRICT273)
                    ;
                    adaptor.addChild(root_0, RESTRICT273_tree);


                    }
                    break;
                case 2 :
                    // MySQL.g:1291:11: CASCADE
                    {
                    root_0 = (Object)adaptor.nil();


                    CASCADE274=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_delete_option9900); 
                    CASCADE274_tree = 
                    (Object)adaptor.create(CASCADE274)
                    ;
                    adaptor.addChild(root_0, CASCADE274_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1292:11: SET NULL_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    SET275=(Token)match(input,SET,FOLLOW_SET_in_delete_option9919); 
                    SET275_tree = 
                    (Object)adaptor.create(SET275)
                    ;
                    adaptor.addChild(root_0, SET275_tree);


                    NULL_SYM276=(Token)match(input,NULL_SYM,FOLLOW_NULL_SYM_in_delete_option9921); 
                    NULL_SYM276_tree = 
                    (Object)adaptor.create(NULL_SYM276)
                    ;
                    adaptor.addChild(root_0, NULL_SYM276_tree);


                    }
                    break;
                case 4 :
                    // MySQL.g:1293:11: NO_SYM ACTION
                    {
                    root_0 = (Object)adaptor.nil();


                    NO_SYM277=(Token)match(input,NO_SYM,FOLLOW_NO_SYM_in_delete_option9935); 
                    NO_SYM277_tree = 
                    (Object)adaptor.create(NO_SYM277)
                    ;
                    adaptor.addChild(root_0, NO_SYM277_tree);


                    ACTION278=(Token)match(input,ACTION,FOLLOW_ACTION_in_delete_option9937); 
                    ACTION278_tree = 
                    (Object)adaptor.create(ACTION278)
                    ;
                    adaptor.addChild(root_0, ACTION278_tree);


                    }
                    break;
                case 5 :
                    // MySQL.g:1294:11: SET DEFAULT
                    {
                    root_0 = (Object)adaptor.nil();


                    SET279=(Token)match(input,SET,FOLLOW_SET_in_delete_option9950); 
                    SET279_tree = 
                    (Object)adaptor.create(SET279)
                    ;
                    adaptor.addChild(root_0, SET279_tree);


                    DEFAULT280=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_delete_option9952); 
                    DEFAULT280_tree = 
                    (Object)adaptor.create(DEFAULT280)
                    ;
                    adaptor.addChild(root_0, DEFAULT280_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "delete_option"


    public static class key_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_type"
    // MySQL.g:1297:1: key_type : ( key_or_index | FULLTEXT_SYM ( key_or_index )? | SPATIAL_SYM ( key_or_index )? );
    public final MySQLParser.key_type_return key_type() throws RecognitionException {
        MySQLParser.key_type_return retval = new MySQLParser.key_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FULLTEXT_SYM282=null;
        Token SPATIAL_SYM284=null;
        MySQLParser.key_or_index_return key_or_index281 =null;

        MySQLParser.key_or_index_return key_or_index283 =null;

        MySQLParser.key_or_index_return key_or_index285 =null;


        Object FULLTEXT_SYM282_tree=null;
        Object SPATIAL_SYM284_tree=null;

        try {
            // MySQL.g:1297:9: ( key_or_index | FULLTEXT_SYM ( key_or_index )? | SPATIAL_SYM ( key_or_index )? )
            int alt77=3;
            switch ( input.LA(1) ) {
            case INDEX_SYM:
            case KEY_SYM:
                {
                alt77=1;
                }
                break;
            case FULLTEXT_SYM:
                {
                alt77=2;
                }
                break;
            case SPATIAL_SYM:
                {
                alt77=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }

            switch (alt77) {
                case 1 :
                    // MySQL.g:1298:11: key_or_index
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_key_or_index_in_key_type9981);
                    key_or_index281=key_or_index();

                    state._fsp--;

                    adaptor.addChild(root_0, key_or_index281.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1299:11: FULLTEXT_SYM ( key_or_index )?
                    {
                    root_0 = (Object)adaptor.nil();


                    FULLTEXT_SYM282=(Token)match(input,FULLTEXT_SYM,FOLLOW_FULLTEXT_SYM_in_key_type9994); 
                    FULLTEXT_SYM282_tree = 
                    (Object)adaptor.create(FULLTEXT_SYM282)
                    ;
                    adaptor.addChild(root_0, FULLTEXT_SYM282_tree);


                    // MySQL.g:1299:24: ( key_or_index )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==INDEX_SYM||LA75_0==KEY_SYM) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // MySQL.g:1299:24: key_or_index
                            {
                            pushFollow(FOLLOW_key_or_index_in_key_type9996);
                            key_or_index283=key_or_index();

                            state._fsp--;

                            adaptor.addChild(root_0, key_or_index283.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // MySQL.g:1300:11: SPATIAL_SYM ( key_or_index )?
                    {
                    root_0 = (Object)adaptor.nil();


                    SPATIAL_SYM284=(Token)match(input,SPATIAL_SYM,FOLLOW_SPATIAL_SYM_in_key_type10010); 
                    SPATIAL_SYM284_tree = 
                    (Object)adaptor.create(SPATIAL_SYM284)
                    ;
                    adaptor.addChild(root_0, SPATIAL_SYM284_tree);


                    // MySQL.g:1300:23: ( key_or_index )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==INDEX_SYM||LA76_0==KEY_SYM) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // MySQL.g:1300:23: key_or_index
                            {
                            pushFollow(FOLLOW_key_or_index_in_key_type10012);
                            key_or_index285=key_or_index();

                            state._fsp--;

                            adaptor.addChild(root_0, key_or_index285.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key_type"


    public static class constraint_key_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constraint_key_type"
    // MySQL.g:1303:1: constraint_key_type : ( PRIMARY_SYM KEY_SYM | UNIQUE_SYM ( key_or_index )? );
    public final MySQLParser.constraint_key_type_return constraint_key_type() throws RecognitionException {
        MySQLParser.constraint_key_type_return retval = new MySQLParser.constraint_key_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRIMARY_SYM286=null;
        Token KEY_SYM287=null;
        Token UNIQUE_SYM288=null;
        MySQLParser.key_or_index_return key_or_index289 =null;


        Object PRIMARY_SYM286_tree=null;
        Object KEY_SYM287_tree=null;
        Object UNIQUE_SYM288_tree=null;

        try {
            // MySQL.g:1303:20: ( PRIMARY_SYM KEY_SYM | UNIQUE_SYM ( key_or_index )? )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==PRIMARY_SYM) ) {
                alt79=1;
            }
            else if ( (LA79_0==UNIQUE_SYM) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }
            switch (alt79) {
                case 1 :
                    // MySQL.g:1304:11: PRIMARY_SYM KEY_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    PRIMARY_SYM286=(Token)match(input,PRIMARY_SYM,FOLLOW_PRIMARY_SYM_in_constraint_key_type10039); 
                    PRIMARY_SYM286_tree = 
                    (Object)adaptor.create(PRIMARY_SYM286)
                    ;
                    adaptor.addChild(root_0, PRIMARY_SYM286_tree);


                    KEY_SYM287=(Token)match(input,KEY_SYM,FOLLOW_KEY_SYM_in_constraint_key_type10041); 
                    KEY_SYM287_tree = 
                    (Object)adaptor.create(KEY_SYM287)
                    ;
                    adaptor.addChild(root_0, KEY_SYM287_tree);


                    }
                    break;
                case 2 :
                    // MySQL.g:1305:11: UNIQUE_SYM ( key_or_index )?
                    {
                    root_0 = (Object)adaptor.nil();


                    UNIQUE_SYM288=(Token)match(input,UNIQUE_SYM,FOLLOW_UNIQUE_SYM_in_constraint_key_type10054); 
                    UNIQUE_SYM288_tree = 
                    (Object)adaptor.create(UNIQUE_SYM288)
                    ;
                    adaptor.addChild(root_0, UNIQUE_SYM288_tree);


                    // MySQL.g:1305:22: ( key_or_index )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==INDEX_SYM||LA78_0==KEY_SYM) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // MySQL.g:1305:22: key_or_index
                            {
                            pushFollow(FOLLOW_key_or_index_in_constraint_key_type10056);
                            key_or_index289=key_or_index();

                            state._fsp--;

                            adaptor.addChild(root_0, key_or_index289.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraint_key_type"


    public static class key_or_index_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_or_index"
    // MySQL.g:1308:1: key_or_index : ( KEY_SYM | INDEX_SYM );
    public final MySQLParser.key_or_index_return key_or_index() throws RecognitionException {
        MySQLParser.key_or_index_return retval = new MySQLParser.key_or_index_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token KEY_SYM290=null;
        Token INDEX_SYM291=null;

        Object KEY_SYM290_tree=null;
        Object INDEX_SYM291_tree=null;

        try {
            // MySQL.g:1308:13: ( KEY_SYM | INDEX_SYM )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==KEY_SYM) ) {
                alt80=1;
            }
            else if ( (LA80_0==INDEX_SYM) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }
            switch (alt80) {
                case 1 :
                    // MySQL.g:1309:11: KEY_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    KEY_SYM290=(Token)match(input,KEY_SYM,FOLLOW_KEY_SYM_in_key_or_index10083); 
                    KEY_SYM290_tree = 
                    (Object)adaptor.create(KEY_SYM290)
                    ;
                    adaptor.addChild(root_0, KEY_SYM290_tree);




                    }
                    break;
                case 2 :
                    // MySQL.g:1310:11: INDEX_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    INDEX_SYM291=(Token)match(input,INDEX_SYM,FOLLOW_INDEX_SYM_in_key_or_index10097); 
                    INDEX_SYM291_tree = 
                    (Object)adaptor.create(INDEX_SYM291)
                    ;
                    adaptor.addChild(root_0, INDEX_SYM291_tree);




                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key_or_index"


    public static class keys_or_index_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keys_or_index"
    // MySQL.g:1313:1: keys_or_index : ( KEYS | INDEX_SYM | INDEXES );
    public final MySQLParser.keys_or_index_return keys_or_index() throws RecognitionException {
        MySQLParser.keys_or_index_return retval = new MySQLParser.keys_or_index_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token KEYS292=null;
        Token INDEX_SYM293=null;
        Token INDEXES294=null;

        Object KEYS292_tree=null;
        Object INDEX_SYM293_tree=null;
        Object INDEXES294_tree=null;

        try {
            // MySQL.g:1313:14: ( KEYS | INDEX_SYM | INDEXES )
            int alt81=3;
            switch ( input.LA(1) ) {
            case KEYS:
                {
                alt81=1;
                }
                break;
            case INDEX_SYM:
                {
                alt81=2;
                }
                break;
            case INDEXES:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;

            }

            switch (alt81) {
                case 1 :
                    // MySQL.g:1314:11: KEYS
                    {
                    root_0 = (Object)adaptor.nil();


                    KEYS292=(Token)match(input,KEYS,FOLLOW_KEYS_in_keys_or_index10125); 
                    KEYS292_tree = 
                    (Object)adaptor.create(KEYS292)
                    ;
                    adaptor.addChild(root_0, KEYS292_tree);




                    }
                    break;
                case 2 :
                    // MySQL.g:1315:11: INDEX_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    INDEX_SYM293=(Token)match(input,INDEX_SYM,FOLLOW_INDEX_SYM_in_keys_or_index10139); 
                    INDEX_SYM293_tree = 
                    (Object)adaptor.create(INDEX_SYM293)
                    ;
                    adaptor.addChild(root_0, INDEX_SYM293_tree);




                    }
                    break;
                case 3 :
                    // MySQL.g:1316:11: INDEXES
                    {
                    root_0 = (Object)adaptor.nil();


                    INDEXES294=(Token)match(input,INDEXES,FOLLOW_INDEXES_in_keys_or_index10153); 
                    INDEXES294_tree = 
                    (Object)adaptor.create(INDEXES294)
                    ;
                    adaptor.addChild(root_0, INDEXES294_tree);




                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "keys_or_index"


    public static class opt_unique_or_fulltext_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opt_unique_or_fulltext"
    // MySQL.g:1319:1: opt_unique_or_fulltext : ( UNIQUE_SYM | FULLTEXT_SYM | SPATIAL_SYM );
    public final MySQLParser.opt_unique_or_fulltext_return opt_unique_or_fulltext() throws RecognitionException {
        MySQLParser.opt_unique_or_fulltext_return retval = new MySQLParser.opt_unique_or_fulltext_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set295=null;

        Object set295_tree=null;

        try {
            // MySQL.g:1319:23: ( UNIQUE_SYM | FULLTEXT_SYM | SPATIAL_SYM )
            // MySQL.g:
            {
            root_0 = (Object)adaptor.nil();


            set295=(Token)input.LT(1);

            if ( input.LA(1)==FULLTEXT_SYM||input.LA(1)==SPATIAL_SYM||input.LA(1)==UNIQUE_SYM ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set295)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opt_unique_or_fulltext"


    public static class underscore_charset_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "underscore_charset"
    // MySQL.g:1326:1: underscore_charset : '_' charset_name ;
    public final MySQLParser.underscore_charset_return underscore_charset() throws RecognitionException {
        MySQLParser.underscore_charset_return retval = new MySQLParser.underscore_charset_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal296=null;
        MySQLParser.charset_name_return charset_name297 =null;


        Object char_literal296_tree=null;

        try {
            // MySQL.g:1326:19: ( '_' charset_name )
            // MySQL.g:1327:2: '_' charset_name
            {
            root_0 = (Object)adaptor.nil();


            char_literal296=(Token)match(input,555,FOLLOW_555_in_underscore_charset10213); 
            char_literal296_tree = 
            (Object)adaptor.create(char_literal296)
            ;
            adaptor.addChild(root_0, char_literal296_tree);


            pushFollow(FOLLOW_charset_name_in_underscore_charset10215);
            charset_name297=charset_name();

            state._fsp--;

            adaptor.addChild(root_0, charset_name297.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "underscore_charset"


    public static class charset_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "charset_name"
    // MySQL.g:1330:1: charset_name : ( ident_or_text | BINARY );
    public final MySQLParser.charset_name_return charset_name() throws RecognitionException {
        MySQLParser.charset_name_return retval = new MySQLParser.charset_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BINARY299=null;
        MySQLParser.ident_or_text_return ident_or_text298 =null;


        Object BINARY299_tree=null;

        try {
            // MySQL.g:1330:13: ( ident_or_text | BINARY )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==IDENT||LA82_0==IDENT_QUOTED||LA82_0==TEXT_STRING) ) {
                alt82=1;
            }
            else if ( (LA82_0==BINARY) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }
            switch (alt82) {
                case 1 :
                    // MySQL.g:1331:11: ident_or_text
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ident_or_text_in_charset_name10242);
                    ident_or_text298=ident_or_text();

                    state._fsp--;

                    adaptor.addChild(root_0, ident_or_text298.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1332:11: BINARY
                    {
                    root_0 = (Object)adaptor.nil();


                    BINARY299=(Token)match(input,BINARY,FOLLOW_BINARY_in_charset_name10254); 
                    BINARY299_tree = 
                    (Object)adaptor.create(BINARY299)
                    ;
                    adaptor.addChild(root_0, BINARY299_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "charset_name"


    public static class charset_name_or_default_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "charset_name_or_default"
    // MySQL.g:1335:1: charset_name_or_default : ( charset_name | DEFAULT );
    public final MySQLParser.charset_name_or_default_return charset_name_or_default() throws RecognitionException {
        MySQLParser.charset_name_or_default_return retval = new MySQLParser.charset_name_or_default_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFAULT301=null;
        MySQLParser.charset_name_return charset_name300 =null;


        Object DEFAULT301_tree=null;

        try {
            // MySQL.g:1335:24: ( charset_name | DEFAULT )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==BINARY||LA83_0==IDENT||LA83_0==IDENT_QUOTED||LA83_0==TEXT_STRING) ) {
                alt83=1;
            }
            else if ( (LA83_0==DEFAULT) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }
            switch (alt83) {
                case 1 :
                    // MySQL.g:1336:11: charset_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_charset_name_in_charset_name_or_default10281);
                    charset_name300=charset_name();

                    state._fsp--;

                    adaptor.addChild(root_0, charset_name300.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1337:11: DEFAULT
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT301=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_charset_name_or_default10294); 
                    DEFAULT301_tree = 
                    (Object)adaptor.create(DEFAULT301)
                    ;
                    adaptor.addChild(root_0, DEFAULT301_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "charset_name_or_default"


    public static class binary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "binary"
    // MySQL.g:1340:1: binary : ( ASCII_SYM ( BINARY )? | BYTE_SYM | UNICODE_SYM ( BINARY )? | charset charset_name ( bin_mod )? | BINARY ( bin_charset )? );
    public final MySQLParser.binary_return binary() throws RecognitionException {
        MySQLParser.binary_return retval = new MySQLParser.binary_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASCII_SYM302=null;
        Token BINARY303=null;
        Token BYTE_SYM304=null;
        Token UNICODE_SYM305=null;
        Token BINARY306=null;
        Token BINARY310=null;
        MySQLParser.charset_return charset307 =null;

        MySQLParser.charset_name_return charset_name308 =null;

        MySQLParser.bin_mod_return bin_mod309 =null;

        MySQLParser.bin_charset_return bin_charset311 =null;


        Object ASCII_SYM302_tree=null;
        Object BINARY303_tree=null;
        Object BYTE_SYM304_tree=null;
        Object UNICODE_SYM305_tree=null;
        Object BINARY306_tree=null;
        Object BINARY310_tree=null;

        try {
            // MySQL.g:1340:7: ( ASCII_SYM ( BINARY )? | BYTE_SYM | UNICODE_SYM ( BINARY )? | charset charset_name ( bin_mod )? | BINARY ( bin_charset )? )
            int alt88=5;
            switch ( input.LA(1) ) {
            case ASCII_SYM:
                {
                alt88=1;
                }
                break;
            case BYTE_SYM:
                {
                alt88=2;
                }
                break;
            case UNICODE_SYM:
                {
                alt88=3;
                }
                break;
            case CHARSET:
            case CHAR_SYM:
                {
                alt88=4;
                }
                break;
            case BINARY:
                {
                alt88=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;

            }

            switch (alt88) {
                case 1 :
                    // MySQL.g:1341:11: ASCII_SYM ( BINARY )?
                    {
                    root_0 = (Object)adaptor.nil();


                    ASCII_SYM302=(Token)match(input,ASCII_SYM,FOLLOW_ASCII_SYM_in_binary10332); 
                    ASCII_SYM302_tree = 
                    (Object)adaptor.create(ASCII_SYM302)
                    ;
                    adaptor.addChild(root_0, ASCII_SYM302_tree);


                    // MySQL.g:1341:21: ( BINARY )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==BINARY) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // MySQL.g:1341:21: BINARY
                            {
                            BINARY303=(Token)match(input,BINARY,FOLLOW_BINARY_in_binary10334); 
                            BINARY303_tree = 
                            (Object)adaptor.create(BINARY303)
                            ;
                            adaptor.addChild(root_0, BINARY303_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // MySQL.g:1342:11: BYTE_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    BYTE_SYM304=(Token)match(input,BYTE_SYM,FOLLOW_BYTE_SYM_in_binary10348); 
                    BYTE_SYM304_tree = 
                    (Object)adaptor.create(BYTE_SYM304)
                    ;
                    adaptor.addChild(root_0, BYTE_SYM304_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1343:11: UNICODE_SYM ( BINARY )?
                    {
                    root_0 = (Object)adaptor.nil();


                    UNICODE_SYM305=(Token)match(input,UNICODE_SYM,FOLLOW_UNICODE_SYM_in_binary10360); 
                    UNICODE_SYM305_tree = 
                    (Object)adaptor.create(UNICODE_SYM305)
                    ;
                    adaptor.addChild(root_0, UNICODE_SYM305_tree);


                    // MySQL.g:1343:23: ( BINARY )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==BINARY) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // MySQL.g:1343:23: BINARY
                            {
                            BINARY306=(Token)match(input,BINARY,FOLLOW_BINARY_in_binary10362); 
                            BINARY306_tree = 
                            (Object)adaptor.create(BINARY306)
                            ;
                            adaptor.addChild(root_0, BINARY306_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // MySQL.g:1344:11: charset charset_name ( bin_mod )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_charset_in_binary10375);
                    charset307=charset();

                    state._fsp--;

                    adaptor.addChild(root_0, charset307.getTree());

                    pushFollow(FOLLOW_charset_name_in_binary10377);
                    charset_name308=charset_name();

                    state._fsp--;

                    adaptor.addChild(root_0, charset_name308.getTree());

                    // MySQL.g:1344:32: ( bin_mod )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==BINARY) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // MySQL.g:1344:32: bin_mod
                            {
                            pushFollow(FOLLOW_bin_mod_in_binary10379);
                            bin_mod309=bin_mod();

                            state._fsp--;

                            adaptor.addChild(root_0, bin_mod309.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // MySQL.g:1345:11: BINARY ( bin_charset )?
                    {
                    root_0 = (Object)adaptor.nil();


                    BINARY310=(Token)match(input,BINARY,FOLLOW_BINARY_in_binary10392); 
                    BINARY310_tree = 
                    (Object)adaptor.create(BINARY310)
                    ;
                    adaptor.addChild(root_0, BINARY310_tree);


                    // MySQL.g:1345:18: ( bin_charset )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==ASCII_SYM||(LA87_0 >= CHARSET && LA87_0 <= CHAR_SYM)||LA87_0==UNICODE_SYM) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // MySQL.g:1345:18: bin_charset
                            {
                            pushFollow(FOLLOW_bin_charset_in_binary10394);
                            bin_charset311=bin_charset();

                            state._fsp--;

                            adaptor.addChild(root_0, bin_charset311.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "binary"


    public static class bin_mod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bin_mod"
    // MySQL.g:1348:1: bin_mod : BINARY ;
    public final MySQLParser.bin_mod_return bin_mod() throws RecognitionException {
        MySQLParser.bin_mod_return retval = new MySQLParser.bin_mod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BINARY312=null;

        Object BINARY312_tree=null;

        try {
            // MySQL.g:1348:8: ( BINARY )
            // MySQL.g:1349:9: BINARY
            {
            root_0 = (Object)adaptor.nil();


            BINARY312=(Token)match(input,BINARY,FOLLOW_BINARY_in_bin_mod10419); 
            BINARY312_tree = 
            (Object)adaptor.create(BINARY312)
            ;
            adaptor.addChild(root_0, BINARY312_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bin_mod"


    public static class bin_charset_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bin_charset"
    // MySQL.g:1352:1: bin_charset : ( ASCII_SYM | UNICODE_SYM | charset charset_name );
    public final MySQLParser.bin_charset_return bin_charset() throws RecognitionException {
        MySQLParser.bin_charset_return retval = new MySQLParser.bin_charset_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASCII_SYM313=null;
        Token UNICODE_SYM314=null;
        MySQLParser.charset_return charset315 =null;

        MySQLParser.charset_name_return charset_name316 =null;


        Object ASCII_SYM313_tree=null;
        Object UNICODE_SYM314_tree=null;

        try {
            // MySQL.g:1352:12: ( ASCII_SYM | UNICODE_SYM | charset charset_name )
            int alt89=3;
            switch ( input.LA(1) ) {
            case ASCII_SYM:
                {
                alt89=1;
                }
                break;
            case UNICODE_SYM:
                {
                alt89=2;
                }
                break;
            case CHARSET:
            case CHAR_SYM:
                {
                alt89=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }

            switch (alt89) {
                case 1 :
                    // MySQL.g:1353:11: ASCII_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    ASCII_SYM313=(Token)match(input,ASCII_SYM,FOLLOW_ASCII_SYM_in_bin_charset10446); 
                    ASCII_SYM313_tree = 
                    (Object)adaptor.create(ASCII_SYM313)
                    ;
                    adaptor.addChild(root_0, ASCII_SYM313_tree);


                    }
                    break;
                case 2 :
                    // MySQL.g:1354:11: UNICODE_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    UNICODE_SYM314=(Token)match(input,UNICODE_SYM,FOLLOW_UNICODE_SYM_in_bin_charset10459); 
                    UNICODE_SYM314_tree = 
                    (Object)adaptor.create(UNICODE_SYM314)
                    ;
                    adaptor.addChild(root_0, UNICODE_SYM314_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1355:11: charset charset_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_charset_in_bin_charset10471);
                    charset315=charset();

                    state._fsp--;

                    adaptor.addChild(root_0, charset315.getTree());

                    pushFollow(FOLLOW_charset_name_in_bin_charset10473);
                    charset_name316=charset_name();

                    state._fsp--;

                    adaptor.addChild(root_0, charset_name316.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bin_charset"


    public static class references_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "references"
    // MySQL.g:1358:1: references : REFERENCES table_ident opt_ref_list ;
    public final MySQLParser.references_return references() throws RecognitionException {
        MySQLParser.references_return retval = new MySQLParser.references_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REFERENCES317=null;
        MySQLParser.table_ident_return table_ident318 =null;

        MySQLParser.opt_ref_list_return opt_ref_list319 =null;


        Object REFERENCES317_tree=null;

        try {
            // MySQL.g:1358:11: ( REFERENCES table_ident opt_ref_list )
            // MySQL.g:1359:11: REFERENCES table_ident opt_ref_list
            {
            root_0 = (Object)adaptor.nil();


            REFERENCES317=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_references10500); 
            REFERENCES317_tree = 
            (Object)adaptor.create(REFERENCES317)
            ;
            adaptor.addChild(root_0, REFERENCES317_tree);


            pushFollow(FOLLOW_table_ident_in_references10502);
            table_ident318=table_ident();

            state._fsp--;

            adaptor.addChild(root_0, table_ident318.getTree());

            pushFollow(FOLLOW_opt_ref_list_in_references10514);
            opt_ref_list319=opt_ref_list();

            state._fsp--;

            adaptor.addChild(root_0, opt_ref_list319.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "references"


    public static class opt_ref_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opt_ref_list"
    // MySQL.g:1363:1: opt_ref_list : ( ( on_delete )? | '(' ref_list ')' ( on_delete )? );
    public final MySQLParser.opt_ref_list_return opt_ref_list() throws RecognitionException {
        MySQLParser.opt_ref_list_return retval = new MySQLParser.opt_ref_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal321=null;
        Token char_literal323=null;
        MySQLParser.on_delete_return on_delete320 =null;

        MySQLParser.ref_list_return ref_list322 =null;

        MySQLParser.on_delete_return on_delete324 =null;


        Object char_literal321_tree=null;
        Object char_literal323_tree=null;

        try {
            // MySQL.g:1363:13: ( ( on_delete )? | '(' ref_list ')' ( on_delete )? )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==MATCH||LA92_0==ON||LA92_0==549||LA92_0==551) ) {
                alt92=1;
            }
            else if ( (LA92_0==548) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }
            switch (alt92) {
                case 1 :
                    // MySQL.g:1364:11: ( on_delete )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // MySQL.g:1364:11: ( on_delete )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==MATCH||LA90_0==ON) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // MySQL.g:1364:11: on_delete
                            {
                            pushFollow(FOLLOW_on_delete_in_opt_ref_list10540);
                            on_delete320=on_delete();

                            state._fsp--;

                            adaptor.addChild(root_0, on_delete320.getTree());

                            }
                            break;

                    }




                    }
                    break;
                case 2 :
                    // MySQL.g:1365:11: '(' ref_list ')' ( on_delete )?
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal321=(Token)match(input,548,FOLLOW_548_in_opt_ref_list10555); 
                    char_literal321_tree = 
                    (Object)adaptor.create(char_literal321)
                    ;
                    adaptor.addChild(root_0, char_literal321_tree);


                    pushFollow(FOLLOW_ref_list_in_opt_ref_list10557);
                    ref_list322=ref_list();

                    state._fsp--;

                    adaptor.addChild(root_0, ref_list322.getTree());

                    char_literal323=(Token)match(input,549,FOLLOW_549_in_opt_ref_list10559); 
                    char_literal323_tree = 
                    (Object)adaptor.create(char_literal323)
                    ;
                    adaptor.addChild(root_0, char_literal323_tree);


                    // MySQL.g:1365:28: ( on_delete )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==MATCH||LA91_0==ON) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // MySQL.g:1365:28: on_delete
                            {
                            pushFollow(FOLLOW_on_delete_in_opt_ref_list10561);
                            on_delete324=on_delete();

                            state._fsp--;

                            adaptor.addChild(root_0, on_delete324.getTree());

                            }
                            break;

                    }




                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opt_ref_list"


    public static class ref_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ref_list"
    // MySQL.g:1368:1: ref_list : ident ( ',' ident )* ;
    public final MySQLParser.ref_list_return ref_list() throws RecognitionException {
        MySQLParser.ref_list_return retval = new MySQLParser.ref_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal326=null;
        MySQLParser.ident_return ident325 =null;

        MySQLParser.ident_return ident327 =null;


        Object char_literal326_tree=null;

        try {
            // MySQL.g:1368:9: ( ident ( ',' ident )* )
            // MySQL.g:1369:11: ident ( ',' ident )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ident_in_ref_list10590);
            ident325=ident();

            state._fsp--;

            adaptor.addChild(root_0, ident325.getTree());

            // MySQL.g:1369:17: ( ',' ident )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==551) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // MySQL.g:1369:18: ',' ident
            	    {
            	    char_literal326=(Token)match(input,551,FOLLOW_551_in_ref_list10593); 
            	    char_literal326_tree = 
            	    (Object)adaptor.create(char_literal326)
            	    ;
            	    adaptor.addChild(root_0, char_literal326_tree);


            	    pushFollow(FOLLOW_ident_in_ref_list10595);
            	    ident327=ident();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ident327.getTree());

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ref_list"


    public static class signed_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signed_literal"
    // MySQL.g:1373:1: signed_literal : ( literal | '+' NUM_literal | '-' NUM_literal );
    public final MySQLParser.signed_literal_return signed_literal() throws RecognitionException {
        MySQLParser.signed_literal_return retval = new MySQLParser.signed_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal329=null;
        Token NUM_literal330=null;
        Token char_literal331=null;
        Token NUM_literal332=null;
        MySQLParser.literal_return literal328 =null;


        Object char_literal329_tree=null;
        Object NUM_literal330_tree=null;
        Object char_literal331_tree=null;
        Object NUM_literal332_tree=null;

        try {
            // MySQL.g:1373:15: ( literal | '+' NUM_literal | '-' NUM_literal )
            int alt94=3;
            switch ( input.LA(1) ) {
            case BIN_NUM:
            case DATE_SYM:
            case FALSE_SYM:
            case HEX_NUM:
            case NCHAR_STRING:
            case NULL_SYM:
            case NUM_literal:
            case TEXT_STRING:
            case TIMESTAMP:
            case TIME_SYM:
            case TRUE_SYM:
            case 555:
                {
                alt94=1;
                }
                break;
            case 550:
                {
                alt94=2;
                }
                break;
            case 552:
                {
                alt94=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;

            }

            switch (alt94) {
                case 1 :
                    // MySQL.g:1374:11: literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_signed_literal10633);
                    literal328=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal328.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1375:11: '+' NUM_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal329=(Token)match(input,550,FOLLOW_550_in_signed_literal10646); 
                    char_literal329_tree = 
                    (Object)adaptor.create(char_literal329)
                    ;
                    adaptor.addChild(root_0, char_literal329_tree);


                    NUM_literal330=(Token)match(input,NUM_literal,FOLLOW_NUM_literal_in_signed_literal10648); 
                    NUM_literal330_tree = 
                    (Object)adaptor.create(NUM_literal330)
                    ;
                    adaptor.addChild(root_0, NUM_literal330_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1376:11: '-' NUM_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal331=(Token)match(input,552,FOLLOW_552_in_signed_literal10661); 
                    char_literal331_tree = 
                    (Object)adaptor.create(char_literal331)
                    ;
                    adaptor.addChild(root_0, char_literal331_tree);


                    NUM_literal332=(Token)match(input,NUM_literal,FOLLOW_NUM_literal_in_signed_literal10663); 
                    NUM_literal332_tree = 
                    (Object)adaptor.create(NUM_literal332)
                    ;
                    adaptor.addChild(root_0, NUM_literal332_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "signed_literal"


    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // MySQL.g:1379:1: literal : ( text_literal | NUM_literal | NULL_SYM | FALSE_SYM | TRUE_SYM | HEX_NUM | BIN_NUM | underscore_charset HEX_NUM | underscore_charset BIN_NUM | DATE_SYM text_literal | TIME_SYM text_literal | TIMESTAMP text_literal );
    public final MySQLParser.literal_return literal() throws RecognitionException {
        MySQLParser.literal_return retval = new MySQLParser.literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM_literal334=null;
        Token NULL_SYM335=null;
        Token FALSE_SYM336=null;
        Token TRUE_SYM337=null;
        Token HEX_NUM338=null;
        Token BIN_NUM339=null;
        Token HEX_NUM341=null;
        Token BIN_NUM343=null;
        Token DATE_SYM344=null;
        Token TIME_SYM346=null;
        Token TIMESTAMP348=null;
        MySQLParser.text_literal_return text_literal333 =null;

        MySQLParser.underscore_charset_return underscore_charset340 =null;

        MySQLParser.underscore_charset_return underscore_charset342 =null;

        MySQLParser.text_literal_return text_literal345 =null;

        MySQLParser.text_literal_return text_literal347 =null;

        MySQLParser.text_literal_return text_literal349 =null;


        Object NUM_literal334_tree=null;
        Object NULL_SYM335_tree=null;
        Object FALSE_SYM336_tree=null;
        Object TRUE_SYM337_tree=null;
        Object HEX_NUM338_tree=null;
        Object BIN_NUM339_tree=null;
        Object HEX_NUM341_tree=null;
        Object BIN_NUM343_tree=null;
        Object DATE_SYM344_tree=null;
        Object TIME_SYM346_tree=null;
        Object TIMESTAMP348_tree=null;

        try {
            // MySQL.g:1379:8: ( text_literal | NUM_literal | NULL_SYM | FALSE_SYM | TRUE_SYM | HEX_NUM | BIN_NUM | underscore_charset HEX_NUM | underscore_charset BIN_NUM | DATE_SYM text_literal | TIME_SYM text_literal | TIMESTAMP text_literal )
            int alt95=12;
            switch ( input.LA(1) ) {
            case NCHAR_STRING:
            case TEXT_STRING:
                {
                alt95=1;
                }
                break;
            case 555:
                {
                switch ( input.LA(2) ) {
                case IDENT_QUOTED:
                    {
                    switch ( input.LA(3) ) {
                    case TEXT_STRING:
                        {
                        alt95=1;
                        }
                        break;
                    case HEX_NUM:
                        {
                        alt95=8;
                        }
                        break;
                    case BIN_NUM:
                        {
                        alt95=9;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 12, input);

                        throw nvae;

                    }

                    }
                    break;
                case IDENT:
                    {
                    switch ( input.LA(3) ) {
                    case TEXT_STRING:
                        {
                        alt95=1;
                        }
                        break;
                    case HEX_NUM:
                        {
                        alt95=8;
                        }
                        break;
                    case BIN_NUM:
                        {
                        alt95=9;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 13, input);

                        throw nvae;

                    }

                    }
                    break;
                case TEXT_STRING:
                    {
                    switch ( input.LA(3) ) {
                    case TEXT_STRING:
                        {
                        alt95=1;
                        }
                        break;
                    case HEX_NUM:
                        {
                        alt95=8;
                        }
                        break;
                    case BIN_NUM:
                        {
                        alt95=9;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 14, input);

                        throw nvae;

                    }

                    }
                    break;
                case BINARY:
                    {
                    switch ( input.LA(3) ) {
                    case TEXT_STRING:
                        {
                        alt95=1;
                        }
                        break;
                    case HEX_NUM:
                        {
                        alt95=8;
                        }
                        break;
                    case BIN_NUM:
                        {
                        alt95=9;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 15, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 2, input);

                    throw nvae;

                }

                }
                break;
            case NUM_literal:
                {
                alt95=2;
                }
                break;
            case NULL_SYM:
                {
                alt95=3;
                }
                break;
            case FALSE_SYM:
                {
                alt95=4;
                }
                break;
            case TRUE_SYM:
                {
                alt95=5;
                }
                break;
            case HEX_NUM:
                {
                alt95=6;
                }
                break;
            case BIN_NUM:
                {
                alt95=7;
                }
                break;
            case DATE_SYM:
                {
                alt95=10;
                }
                break;
            case TIME_SYM:
                {
                alt95=11;
                }
                break;
            case TIMESTAMP:
                {
                alt95=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }

            switch (alt95) {
                case 1 :
                    // MySQL.g:1380:11: text_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_text_literal_in_literal10689);
                    text_literal333=text_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, text_literal333.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1381:11: NUM_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    NUM_literal334=(Token)match(input,NUM_literal,FOLLOW_NUM_literal_in_literal10702); 
                    NUM_literal334_tree = 
                    (Object)adaptor.create(NUM_literal334)
                    ;
                    adaptor.addChild(root_0, NUM_literal334_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1382:11: NULL_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    NULL_SYM335=(Token)match(input,NULL_SYM,FOLLOW_NULL_SYM_in_literal10715); 
                    NULL_SYM335_tree = 
                    (Object)adaptor.create(NULL_SYM335)
                    ;
                    adaptor.addChild(root_0, NULL_SYM335_tree);


                    }
                    break;
                case 4 :
                    // MySQL.g:1383:11: FALSE_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    FALSE_SYM336=(Token)match(input,FALSE_SYM,FOLLOW_FALSE_SYM_in_literal10727); 
                    FALSE_SYM336_tree = 
                    (Object)adaptor.create(FALSE_SYM336)
                    ;
                    adaptor.addChild(root_0, FALSE_SYM336_tree);


                    }
                    break;
                case 5 :
                    // MySQL.g:1384:11: TRUE_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    TRUE_SYM337=(Token)match(input,TRUE_SYM,FOLLOW_TRUE_SYM_in_literal10739); 
                    TRUE_SYM337_tree = 
                    (Object)adaptor.create(TRUE_SYM337)
                    ;
                    adaptor.addChild(root_0, TRUE_SYM337_tree);


                    }
                    break;
                case 6 :
                    // MySQL.g:1385:11: HEX_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    HEX_NUM338=(Token)match(input,HEX_NUM,FOLLOW_HEX_NUM_in_literal10751); 
                    HEX_NUM338_tree = 
                    (Object)adaptor.create(HEX_NUM338)
                    ;
                    adaptor.addChild(root_0, HEX_NUM338_tree);


                    }
                    break;
                case 7 :
                    // MySQL.g:1386:11: BIN_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    BIN_NUM339=(Token)match(input,BIN_NUM,FOLLOW_BIN_NUM_in_literal10763); 
                    BIN_NUM339_tree = 
                    (Object)adaptor.create(BIN_NUM339)
                    ;
                    adaptor.addChild(root_0, BIN_NUM339_tree);


                    }
                    break;
                case 8 :
                    // MySQL.g:1387:11: underscore_charset HEX_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_underscore_charset_in_literal10776);
                    underscore_charset340=underscore_charset();

                    state._fsp--;

                    adaptor.addChild(root_0, underscore_charset340.getTree());

                    HEX_NUM341=(Token)match(input,HEX_NUM,FOLLOW_HEX_NUM_in_literal10778); 
                    HEX_NUM341_tree = 
                    (Object)adaptor.create(HEX_NUM341)
                    ;
                    adaptor.addChild(root_0, HEX_NUM341_tree);


                    }
                    break;
                case 9 :
                    // MySQL.g:1388:11: underscore_charset BIN_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_underscore_charset_in_literal10790);
                    underscore_charset342=underscore_charset();

                    state._fsp--;

                    adaptor.addChild(root_0, underscore_charset342.getTree());

                    BIN_NUM343=(Token)match(input,BIN_NUM,FOLLOW_BIN_NUM_in_literal10792); 
                    BIN_NUM343_tree = 
                    (Object)adaptor.create(BIN_NUM343)
                    ;
                    adaptor.addChild(root_0, BIN_NUM343_tree);


                    }
                    break;
                case 10 :
                    // MySQL.g:1389:11: DATE_SYM text_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    DATE_SYM344=(Token)match(input,DATE_SYM,FOLLOW_DATE_SYM_in_literal10804); 
                    DATE_SYM344_tree = 
                    (Object)adaptor.create(DATE_SYM344)
                    ;
                    adaptor.addChild(root_0, DATE_SYM344_tree);


                    pushFollow(FOLLOW_text_literal_in_literal10806);
                    text_literal345=text_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, text_literal345.getTree());

                    }
                    break;
                case 11 :
                    // MySQL.g:1390:11: TIME_SYM text_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    TIME_SYM346=(Token)match(input,TIME_SYM,FOLLOW_TIME_SYM_in_literal10819); 
                    TIME_SYM346_tree = 
                    (Object)adaptor.create(TIME_SYM346)
                    ;
                    adaptor.addChild(root_0, TIME_SYM346_tree);


                    pushFollow(FOLLOW_text_literal_in_literal10821);
                    text_literal347=text_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, text_literal347.getTree());

                    }
                    break;
                case 12 :
                    // MySQL.g:1391:11: TIMESTAMP text_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    TIMESTAMP348=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_literal10834); 
                    TIMESTAMP348_tree = 
                    (Object)adaptor.create(TIMESTAMP348)
                    ;
                    adaptor.addChild(root_0, TIMESTAMP348_tree);


                    pushFollow(FOLLOW_text_literal_in_literal10836);
                    text_literal349=text_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, text_literal349.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class literal_without_null_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal_without_null"
    // MySQL.g:1395:1: literal_without_null : ( text_literal | NUM_literal | FALSE_SYM | TRUE_SYM | HEX_NUM | BIN_NUM | underscore_charset HEX_NUM | underscore_charset BIN_NUM | DATE_SYM text_literal | TIME_SYM text_literal | TIMESTAMP text_literal );
    public final MySQLParser.literal_without_null_return literal_without_null() throws RecognitionException {
        MySQLParser.literal_without_null_return retval = new MySQLParser.literal_without_null_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM_literal351=null;
        Token FALSE_SYM352=null;
        Token TRUE_SYM353=null;
        Token HEX_NUM354=null;
        Token BIN_NUM355=null;
        Token HEX_NUM357=null;
        Token BIN_NUM359=null;
        Token DATE_SYM360=null;
        Token TIME_SYM362=null;
        Token TIMESTAMP364=null;
        MySQLParser.text_literal_return text_literal350 =null;

        MySQLParser.underscore_charset_return underscore_charset356 =null;

        MySQLParser.underscore_charset_return underscore_charset358 =null;

        MySQLParser.text_literal_return text_literal361 =null;

        MySQLParser.text_literal_return text_literal363 =null;

        MySQLParser.text_literal_return text_literal365 =null;


        Object NUM_literal351_tree=null;
        Object FALSE_SYM352_tree=null;
        Object TRUE_SYM353_tree=null;
        Object HEX_NUM354_tree=null;
        Object BIN_NUM355_tree=null;
        Object HEX_NUM357_tree=null;
        Object BIN_NUM359_tree=null;
        Object DATE_SYM360_tree=null;
        Object TIME_SYM362_tree=null;
        Object TIMESTAMP364_tree=null;

        try {
            // MySQL.g:1395:21: ( text_literal | NUM_literal | FALSE_SYM | TRUE_SYM | HEX_NUM | BIN_NUM | underscore_charset HEX_NUM | underscore_charset BIN_NUM | DATE_SYM text_literal | TIME_SYM text_literal | TIMESTAMP text_literal )
            int alt96=11;
            switch ( input.LA(1) ) {
            case NCHAR_STRING:
            case TEXT_STRING:
                {
                alt96=1;
                }
                break;
            case 555:
                {
                switch ( input.LA(2) ) {
                case IDENT_QUOTED:
                    {
                    switch ( input.LA(3) ) {
                    case TEXT_STRING:
                        {
                        alt96=1;
                        }
                        break;
                    case HEX_NUM:
                        {
                        alt96=7;
                        }
                        break;
                    case BIN_NUM:
                        {
                        alt96=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 11, input);

                        throw nvae;

                    }

                    }
                    break;
                case IDENT:
                    {
                    switch ( input.LA(3) ) {
                    case TEXT_STRING:
                        {
                        alt96=1;
                        }
                        break;
                    case HEX_NUM:
                        {
                        alt96=7;
                        }
                        break;
                    case BIN_NUM:
                        {
                        alt96=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 12, input);

                        throw nvae;

                    }

                    }
                    break;
                case TEXT_STRING:
                    {
                    switch ( input.LA(3) ) {
                    case TEXT_STRING:
                        {
                        alt96=1;
                        }
                        break;
                    case HEX_NUM:
                        {
                        alt96=7;
                        }
                        break;
                    case BIN_NUM:
                        {
                        alt96=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 13, input);

                        throw nvae;

                    }

                    }
                    break;
                case BINARY:
                    {
                    switch ( input.LA(3) ) {
                    case TEXT_STRING:
                        {
                        alt96=1;
                        }
                        break;
                    case HEX_NUM:
                        {
                        alt96=7;
                        }
                        break;
                    case BIN_NUM:
                        {
                        alt96=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 14, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 2, input);

                    throw nvae;

                }

                }
                break;
            case NUM_literal:
                {
                alt96=2;
                }
                break;
            case FALSE_SYM:
                {
                alt96=3;
                }
                break;
            case TRUE_SYM:
                {
                alt96=4;
                }
                break;
            case HEX_NUM:
                {
                alt96=5;
                }
                break;
            case BIN_NUM:
                {
                alt96=6;
                }
                break;
            case DATE_SYM:
                {
                alt96=9;
                }
                break;
            case TIME_SYM:
                {
                alt96=10;
                }
                break;
            case TIMESTAMP:
                {
                alt96=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;

            }

            switch (alt96) {
                case 1 :
                    // MySQL.g:1396:11: text_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_text_literal_in_literal_without_null10863);
                    text_literal350=text_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, text_literal350.getTree());

                    }
                    break;
                case 2 :
                    // MySQL.g:1397:11: NUM_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    NUM_literal351=(Token)match(input,NUM_literal,FOLLOW_NUM_literal_in_literal_without_null10876); 
                    NUM_literal351_tree = 
                    (Object)adaptor.create(NUM_literal351)
                    ;
                    adaptor.addChild(root_0, NUM_literal351_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1398:11: FALSE_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    FALSE_SYM352=(Token)match(input,FALSE_SYM,FOLLOW_FALSE_SYM_in_literal_without_null10889); 
                    FALSE_SYM352_tree = 
                    (Object)adaptor.create(FALSE_SYM352)
                    ;
                    adaptor.addChild(root_0, FALSE_SYM352_tree);


                    }
                    break;
                case 4 :
                    // MySQL.g:1399:11: TRUE_SYM
                    {
                    root_0 = (Object)adaptor.nil();


                    TRUE_SYM353=(Token)match(input,TRUE_SYM,FOLLOW_TRUE_SYM_in_literal_without_null10901); 
                    TRUE_SYM353_tree = 
                    (Object)adaptor.create(TRUE_SYM353)
                    ;
                    adaptor.addChild(root_0, TRUE_SYM353_tree);


                    }
                    break;
                case 5 :
                    // MySQL.g:1400:11: HEX_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    HEX_NUM354=(Token)match(input,HEX_NUM,FOLLOW_HEX_NUM_in_literal_without_null10913); 
                    HEX_NUM354_tree = 
                    (Object)adaptor.create(HEX_NUM354)
                    ;
                    adaptor.addChild(root_0, HEX_NUM354_tree);


                    }
                    break;
                case 6 :
                    // MySQL.g:1401:11: BIN_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    BIN_NUM355=(Token)match(input,BIN_NUM,FOLLOW_BIN_NUM_in_literal_without_null10925); 
                    BIN_NUM355_tree = 
                    (Object)adaptor.create(BIN_NUM355)
                    ;
                    adaptor.addChild(root_0, BIN_NUM355_tree);


                    }
                    break;
                case 7 :
                    // MySQL.g:1402:11: underscore_charset HEX_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_underscore_charset_in_literal_without_null10938);
                    underscore_charset356=underscore_charset();

                    state._fsp--;

                    adaptor.addChild(root_0, underscore_charset356.getTree());

                    HEX_NUM357=(Token)match(input,HEX_NUM,FOLLOW_HEX_NUM_in_literal_without_null10940); 
                    HEX_NUM357_tree = 
                    (Object)adaptor.create(HEX_NUM357)
                    ;
                    adaptor.addChild(root_0, HEX_NUM357_tree);


                    }
                    break;
                case 8 :
                    // MySQL.g:1403:11: underscore_charset BIN_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_underscore_charset_in_literal_without_null10952);
                    underscore_charset358=underscore_charset();

                    state._fsp--;

                    adaptor.addChild(root_0, underscore_charset358.getTree());

                    BIN_NUM359=(Token)match(input,BIN_NUM,FOLLOW_BIN_NUM_in_literal_without_null10954); 
                    BIN_NUM359_tree = 
                    (Object)adaptor.create(BIN_NUM359)
                    ;
                    adaptor.addChild(root_0, BIN_NUM359_tree);


                    }
                    break;
                case 9 :
                    // MySQL.g:1404:11: DATE_SYM text_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    DATE_SYM360=(Token)match(input,DATE_SYM,FOLLOW_DATE_SYM_in_literal_without_null10966); 
                    DATE_SYM360_tree = 
                    (Object)adaptor.create(DATE_SYM360)
                    ;
                    adaptor.addChild(root_0, DATE_SYM360_tree);


                    pushFollow(FOLLOW_text_literal_in_literal_without_null10968);
                    text_literal361=text_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, text_literal361.getTree());

                    }
                    break;
                case 10 :
                    // MySQL.g:1405:11: TIME_SYM text_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    TIME_SYM362=(Token)match(input,TIME_SYM,FOLLOW_TIME_SYM_in_literal_without_null10981); 
                    TIME_SYM362_tree = 
                    (Object)adaptor.create(TIME_SYM362)
                    ;
                    adaptor.addChild(root_0, TIME_SYM362_tree);


                    pushFollow(FOLLOW_text_literal_in_literal_without_null10983);
                    text_literal363=text_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, text_literal363.getTree());

                    }
                    break;
                case 11 :
                    // MySQL.g:1406:11: TIMESTAMP text_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    TIMESTAMP364=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_literal_without_null10996); 
                    TIMESTAMP364_tree = 
                    (Object)adaptor.create(TIMESTAMP364)
                    ;
                    adaptor.addChild(root_0, TIMESTAMP364_tree);


                    pushFollow(FOLLOW_text_literal_in_literal_without_null10998);
                    text_literal365=text_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, text_literal365.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal_without_null"


    public static class text_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "text_literal"
    // MySQL.g:1411:1: text_literal : ( TEXT_STRING | NCHAR_STRING | underscore_charset TEXT_STRING ) ( text_string_literal )* ;
    public final MySQLParser.text_literal_return text_literal() throws RecognitionException {
        MySQLParser.text_literal_return retval = new MySQLParser.text_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEXT_STRING366=null;
        Token NCHAR_STRING367=null;
        Token TEXT_STRING369=null;
        MySQLParser.underscore_charset_return underscore_charset368 =null;

        MySQLParser.text_string_literal_return text_string_literal370 =null;


        Object TEXT_STRING366_tree=null;
        Object NCHAR_STRING367_tree=null;
        Object TEXT_STRING369_tree=null;

        try {
            // MySQL.g:1411:13: ( ( TEXT_STRING | NCHAR_STRING | underscore_charset TEXT_STRING ) ( text_string_literal )* )
            // MySQL.g:1412:11: ( TEXT_STRING | NCHAR_STRING | underscore_charset TEXT_STRING ) ( text_string_literal )*
            {
            root_0 = (Object)adaptor.nil();


            // MySQL.g:1412:11: ( TEXT_STRING | NCHAR_STRING | underscore_charset TEXT_STRING )
            int alt97=3;
            switch ( input.LA(1) ) {
            case TEXT_STRING:
                {
                alt97=1;
                }
                break;
            case NCHAR_STRING:
                {
                alt97=2;
                }
                break;
            case 555:
                {
                alt97=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;

            }

            switch (alt97) {
                case 1 :
                    // MySQL.g:1412:12: TEXT_STRING
                    {
                    TEXT_STRING366=(Token)match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_text_literal11020); 
                    TEXT_STRING366_tree = 
                    (Object)adaptor.create(TEXT_STRING366)
                    ;
                    adaptor.addChild(root_0, TEXT_STRING366_tree);


                    }
                    break;
                case 2 :
                    // MySQL.g:1412:26: NCHAR_STRING
                    {
                    NCHAR_STRING367=(Token)match(input,NCHAR_STRING,FOLLOW_NCHAR_STRING_in_text_literal11024); 
                    NCHAR_STRING367_tree = 
                    (Object)adaptor.create(NCHAR_STRING367)
                    ;
                    adaptor.addChild(root_0, NCHAR_STRING367_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1412:41: underscore_charset TEXT_STRING
                    {
                    pushFollow(FOLLOW_underscore_charset_in_text_literal11028);
                    underscore_charset368=underscore_charset();

                    state._fsp--;

                    adaptor.addChild(root_0, underscore_charset368.getTree());

                    TEXT_STRING369=(Token)match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_text_literal11030); 
                    TEXT_STRING369_tree = 
                    (Object)adaptor.create(TEXT_STRING369)
                    ;
                    adaptor.addChild(root_0, TEXT_STRING369_tree);


                    }
                    break;

            }


            // MySQL.g:1412:73: ( text_string_literal )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==TEXT_STRING) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // MySQL.g:1412:74: text_string_literal
            	    {
            	    pushFollow(FOLLOW_text_string_literal_in_text_literal11034);
            	    text_string_literal370=text_string_literal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, text_string_literal370.getTree());

            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "text_literal"


    public static class text_string_sys_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "text_string_sys"
    // MySQL.g:1416:1: text_string_sys : TEXT_STRING ;
    public final MySQLParser.text_string_sys_return text_string_sys() throws RecognitionException {
        MySQLParser.text_string_sys_return retval = new MySQLParser.text_string_sys_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEXT_STRING371=null;

        Object TEXT_STRING371_tree=null;

        try {
            // MySQL.g:1416:16: ( TEXT_STRING )
            // MySQL.g:1417:11: TEXT_STRING
            {
            root_0 = (Object)adaptor.nil();


            TEXT_STRING371=(Token)match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_text_string_sys11064); 
            TEXT_STRING371_tree = 
            (Object)adaptor.create(TEXT_STRING371)
            ;
            adaptor.addChild(root_0, TEXT_STRING371_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "text_string_sys"


    public static class text_string_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "text_string_literal"
    // MySQL.g:1421:1: text_string_literal : TEXT_STRING ;
    public final MySQLParser.text_string_literal_return text_string_literal() throws RecognitionException {
        MySQLParser.text_string_literal_return retval = new MySQLParser.text_string_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEXT_STRING372=null;

        Object TEXT_STRING372_tree=null;

        try {
            // MySQL.g:1421:20: ( TEXT_STRING )
            // MySQL.g:1422:11: TEXT_STRING
            {
            root_0 = (Object)adaptor.nil();


            TEXT_STRING372=(Token)match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_text_string_literal11091); 
            TEXT_STRING372_tree = 
            (Object)adaptor.create(TEXT_STRING372)
            ;
            adaptor.addChild(root_0, TEXT_STRING372_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "text_string_literal"


    public static class ulong_num_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ulong_num"
    // MySQL.g:1425:1: ulong_num : ( NUM | HEX_NUM | LONG_NUM | ULONGLONG_NUM | DECIMAL_NUM | FLOAT_NUM );
    public final MySQLParser.ulong_num_return ulong_num() throws RecognitionException {
        MySQLParser.ulong_num_return retval = new MySQLParser.ulong_num_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set373=null;

        Object set373_tree=null;

        try {
            // MySQL.g:1425:10: ( NUM | HEX_NUM | LONG_NUM | ULONGLONG_NUM | DECIMAL_NUM | FLOAT_NUM )
            // MySQL.g:
            {
            root_0 = (Object)adaptor.nil();


            set373=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL_NUM||input.LA(1)==FLOAT_NUM||input.LA(1)==HEX_NUM||input.LA(1)==LONG_NUM||input.LA(1)==NUM||input.LA(1)==ULONGLONG_NUM ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set373)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ulong_num"


    public static class real_ulong_num_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "real_ulong_num"
    // MySQL.g:1434:1: real_ulong_num : ( NUM | HEX_NUM | LONG_NUM | ULONGLONG_NUM | dec_num_error );
    public final MySQLParser.real_ulong_num_return real_ulong_num() throws RecognitionException {
        MySQLParser.real_ulong_num_return retval = new MySQLParser.real_ulong_num_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM374=null;
        Token HEX_NUM375=null;
        Token LONG_NUM376=null;
        Token ULONGLONG_NUM377=null;
        MySQLParser.dec_num_error_return dec_num_error378 =null;


        Object NUM374_tree=null;
        Object HEX_NUM375_tree=null;
        Object LONG_NUM376_tree=null;
        Object ULONGLONG_NUM377_tree=null;

        try {
            // MySQL.g:1434:15: ( NUM | HEX_NUM | LONG_NUM | ULONGLONG_NUM | dec_num_error )
            int alt99=5;
            switch ( input.LA(1) ) {
            case NUM:
                {
                alt99=1;
                }
                break;
            case HEX_NUM:
                {
                alt99=2;
                }
                break;
            case LONG_NUM:
                {
                alt99=3;
                }
                break;
            case ULONGLONG_NUM:
                {
                alt99=4;
                }
                break;
            case DECIMAL_NUM:
            case FLOAT_NUM:
                {
                alt99=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }

            switch (alt99) {
                case 1 :
                    // MySQL.g:1435:11: NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    NUM374=(Token)match(input,NUM,FOLLOW_NUM_in_real_ulong_num11244); 
                    NUM374_tree = 
                    (Object)adaptor.create(NUM374)
                    ;
                    adaptor.addChild(root_0, NUM374_tree);


                    }
                    break;
                case 2 :
                    // MySQL.g:1436:11: HEX_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    HEX_NUM375=(Token)match(input,HEX_NUM,FOLLOW_HEX_NUM_in_real_ulong_num11267); 
                    HEX_NUM375_tree = 
                    (Object)adaptor.create(HEX_NUM375)
                    ;
                    adaptor.addChild(root_0, HEX_NUM375_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1437:11: LONG_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG_NUM376=(Token)match(input,LONG_NUM,FOLLOW_LONG_NUM_in_real_ulong_num11286); 
                    LONG_NUM376_tree = 
                    (Object)adaptor.create(LONG_NUM376)
                    ;
                    adaptor.addChild(root_0, LONG_NUM376_tree);


                    }
                    break;
                case 4 :
                    // MySQL.g:1438:11: ULONGLONG_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    ULONGLONG_NUM377=(Token)match(input,ULONGLONG_NUM,FOLLOW_ULONGLONG_NUM_in_real_ulong_num11304); 
                    ULONGLONG_NUM377_tree = 
                    (Object)adaptor.create(ULONGLONG_NUM377)
                    ;
                    adaptor.addChild(root_0, ULONGLONG_NUM377_tree);


                    }
                    break;
                case 5 :
                    // MySQL.g:1439:11: dec_num_error
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_dec_num_error_in_real_ulong_num11317);
                    dec_num_error378=dec_num_error();

                    state._fsp--;

                    adaptor.addChild(root_0, dec_num_error378.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "real_ulong_num"


    public static class ulonglong_num_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ulonglong_num"
    // MySQL.g:1442:1: ulonglong_num : ( NUM | ULONGLONG_NUM | LONG_NUM | DECIMAL_NUM | FLOAT_NUM );
    public final MySQLParser.ulonglong_num_return ulonglong_num() throws RecognitionException {
        MySQLParser.ulonglong_num_return retval = new MySQLParser.ulonglong_num_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set379=null;

        Object set379_tree=null;

        try {
            // MySQL.g:1442:14: ( NUM | ULONGLONG_NUM | LONG_NUM | DECIMAL_NUM | FLOAT_NUM )
            // MySQL.g:
            {
            root_0 = (Object)adaptor.nil();


            set379=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL_NUM||input.LA(1)==FLOAT_NUM||input.LA(1)==LONG_NUM||input.LA(1)==NUM||input.LA(1)==ULONGLONG_NUM ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set379)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ulonglong_num"


    public static class real_ulonglong_num_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "real_ulonglong_num"
    // MySQL.g:1450:1: real_ulonglong_num : ( NUM | ULONGLONG_NUM | LONG_NUM | dec_num_error );
    public final MySQLParser.real_ulonglong_num_return real_ulonglong_num() throws RecognitionException {
        MySQLParser.real_ulonglong_num_return retval = new MySQLParser.real_ulonglong_num_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM380=null;
        Token ULONGLONG_NUM381=null;
        Token LONG_NUM382=null;
        MySQLParser.dec_num_error_return dec_num_error383 =null;


        Object NUM380_tree=null;
        Object ULONGLONG_NUM381_tree=null;
        Object LONG_NUM382_tree=null;

        try {
            // MySQL.g:1450:19: ( NUM | ULONGLONG_NUM | LONG_NUM | dec_num_error )
            int alt100=4;
            switch ( input.LA(1) ) {
            case NUM:
                {
                alt100=1;
                }
                break;
            case ULONGLONG_NUM:
                {
                alt100=2;
                }
                break;
            case LONG_NUM:
                {
                alt100=3;
                }
                break;
            case DECIMAL_NUM:
            case FLOAT_NUM:
                {
                alt100=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }

            switch (alt100) {
                case 1 :
                    // MySQL.g:1451:11: NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    NUM380=(Token)match(input,NUM,FOLLOW_NUM_in_real_ulonglong_num11444); 
                    NUM380_tree = 
                    (Object)adaptor.create(NUM380)
                    ;
                    adaptor.addChild(root_0, NUM380_tree);


                    }
                    break;
                case 2 :
                    // MySQL.g:1452:11: ULONGLONG_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    ULONGLONG_NUM381=(Token)match(input,ULONGLONG_NUM,FOLLOW_ULONGLONG_NUM_in_real_ulonglong_num11467); 
                    ULONGLONG_NUM381_tree = 
                    (Object)adaptor.create(ULONGLONG_NUM381)
                    ;
                    adaptor.addChild(root_0, ULONGLONG_NUM381_tree);


                    }
                    break;
                case 3 :
                    // MySQL.g:1453:11: LONG_NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG_NUM382=(Token)match(input,LONG_NUM,FOLLOW_LONG_NUM_in_real_ulonglong_num11480); 
                    LONG_NUM382_tree = 
                    (Object)adaptor.create(LONG_NUM382)
                    ;
                    adaptor.addChild(root_0, LONG_NUM382_tree);


                    }
                    break;
                case 4 :
                    // MySQL.g:1454:11: dec_num_error
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_dec_num_error_in_real_ulonglong_num11498);
                    dec_num_error383=dec_num_error();

                    state._fsp--;

                    adaptor.addChild(root_0, dec_num_error383.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "real_ulonglong_num"


    public static class dec_num_error_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dec_num_error"
    // MySQL.g:1457:1: dec_num_error : dec_num ;
    public final MySQLParser.dec_num_error_return dec_num_error() throws RecognitionException {
        MySQLParser.dec_num_error_return retval = new MySQLParser.dec_num_error_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLParser.dec_num_return dec_num384 =null;



        try {
            // MySQL.g:1457:14: ( dec_num )
            // MySQL.g:1458:11: dec_num
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_dec_num_in_dec_num_error11525);
            dec_num384=dec_num();

            state._fsp--;

            adaptor.addChild(root_0, dec_num384.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dec_num_error"


    public static class dec_num_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dec_num"
    // MySQL.g:1462:1: dec_num : ( DECIMAL_NUM | FLOAT_NUM );
    public final MySQLParser.dec_num_return dec_num() throws RecognitionException {
        MySQLParser.dec_num_return retval = new MySQLParser.dec_num_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set385=null;

        Object set385_tree=null;

        try {
            // MySQL.g:1462:8: ( DECIMAL_NUM | FLOAT_NUM )
            // MySQL.g:
            {
            root_0 = (Object)adaptor.nil();


            set385=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL_NUM||input.LA(1)==FLOAT_NUM ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set385)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dec_num"


    public static class sql_script_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_script"
    // MySQL.g:1482:1: sql_script : ( create ';' )+ EOF ;
    public final MySQLParser.sql_script_return sql_script() throws RecognitionException {
        MySQLParser.sql_script_return retval = new MySQLParser.sql_script_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal387=null;
        Token EOF388=null;
        MySQLParser.create_return create386 =null;


        Object char_literal387_tree=null;
        Object EOF388_tree=null;

        try {
            // MySQL.g:1482:11: ( ( create ';' )+ EOF )
            // MySQL.g:1483:2: ( create ';' )+ EOF
            {
            root_0 = (Object)adaptor.nil();


            // MySQL.g:1483:2: ( create ';' )+
            int cnt101=0;
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==CREATE) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // MySQL.g:1483:3: create ';'
            	    {
            	    pushFollow(FOLLOW_create_in_sql_script11598);
            	    create386=create();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create386.getTree());

            	    char_literal387=(Token)match(input,554,FOLLOW_554_in_sql_script11600); 
            	    char_literal387_tree = 
            	    (Object)adaptor.create(char_literal387)
            	    ;
            	    adaptor.addChild(root_0, char_literal387_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt101 >= 1 ) break loop101;
                        EarlyExitException eee =
                            new EarlyExitException(101, input);
                        throw eee;
                }
                cnt101++;
            } while (true);


            EOF388=(Token)match(input,EOF,FOLLOW_EOF_in_sql_script11604); 
            EOF388_tree = 
            (Object)adaptor.create(EOF388)
            ;
            adaptor.addChild(root_0, EOF388_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_script"


    public static class comments_in_sql_script_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comments_in_sql_script"
    // MySQL.g:1486:1: comments_in_sql_script : (c= SL_COMMENT |c= ML_COMMENT )* EOF ;
    public final MySQLParser.comments_in_sql_script_return comments_in_sql_script() throws RecognitionException {
        MySQLParser.comments_in_sql_script_return retval = new MySQLParser.comments_in_sql_script_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token c=null;
        Token EOF389=null;

        Object c_tree=null;
        Object EOF389_tree=null;

        try {
            // MySQL.g:1486:23: ( (c= SL_COMMENT |c= ML_COMMENT )* EOF )
            // MySQL.g:1487:9: (c= SL_COMMENT |c= ML_COMMENT )* EOF
            {
            root_0 = (Object)adaptor.nil();


            // MySQL.g:1487:9: (c= SL_COMMENT |c= ML_COMMENT )*
            loop102:
            do {
                int alt102=3;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==SL_COMMENT) ) {
                    alt102=1;
                }
                else if ( (LA102_0==ML_COMMENT) ) {
                    alt102=2;
                }


                switch (alt102) {
            	case 1 :
            	    // MySQL.g:1488:11: c= SL_COMMENT
            	    {
            	    c=(Token)match(input,SL_COMMENT,FOLLOW_SL_COMMENT_in_comments_in_sql_script11637); 
            	    c_tree = 
            	    (Object)adaptor.create(c)
            	    ;
            	    adaptor.addChild(root_0, c_tree);


            	     
            	              		addComment((c!=null?c.getText():null), (c!=null?c.getLine():0));
            	              		System.out.println("sl_comment: " + (c!=null?c.getText():null) + ":" + (c!=null?c.getLine():0)); 
            	              	

            	    }
            	    break;
            	case 2 :
            	    // MySQL.g:1493:11: c= ML_COMMENT
            	    {
            	    c=(Token)match(input,ML_COMMENT,FOLLOW_ML_COMMENT_in_comments_in_sql_script11665); 
            	    c_tree = 
            	    (Object)adaptor.create(c)
            	    ;
            	    adaptor.addChild(root_0, c_tree);


            	     
            	            		addComment((c!=null?c.getText():null), (c!=null?c.getLine():0));
            	            		System.out.println("ml_comment: " + (c!=null?c.getText():null) + ":" + (c!=null?c.getLine():0)); 
            	            	

            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            EOF389=(Token)match(input,EOF,FOLLOW_EOF_in_comments_in_sql_script11690); 
            EOF389_tree = 
            (Object)adaptor.create(EOF389)
            ;
            adaptor.addChild(root_0, EOF389_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comments_in_sql_script"

    // Delegated rules


    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA64_eotS =
        "\74\uffff";
    static final String DFA64_eofS =
        "\2\5\1\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\6\5\5\uffff\2\5"+
        "\4\uffff\2\5\1\uffff\2\5\1\uffff\2\5\1\uffff\6\5\4\uffff\1\5\4\uffff"+
        "\1\5\4\uffff\3\5";
    static final String DFA64_minS =
        "\2\30\1\u013e\1\30\2\uffff\1\30\1\uffff\2\30\1\40\6\30\3\u0130\2"+
        "\u0141\2\30\4\42\2\30\1\40\2\30\1\40\2\30\1\40\6\30\4\u01de\1\30"+
        "\4\u01de\1\30\4\u01de\3\30";
    static final String DFA64_maxS =
        "\1\u01fc\1\u022b\1\u013e\1\u01fc\2\uffff\1\u01fc\1\uffff\2\u01fc"+
        "\1\u01de\6\u01fc\3\u022b\2\u0141\2\u01fc\4\u01de\2\u01fc\1\u01de"+
        "\2\u01fc\1\u01de\2\u01fc\1\u01de\6\u01fc\4\u01de\1\u01fc\4\u01de"+
        "\1\u01fc\4\u01de\3\u01fc";
    static final String DFA64_acceptS =
        "\4\uffff\1\2\1\3\1\uffff\1\1\64\uffff";
    static final String DFA64_specialS =
        "\74\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\3\117\uffff\1\1\167\uffff\1\4\130\uffff\1\2\55\uffff\1\4"+
            "\u0094\uffff\1\4",
            "\1\3\11\uffff\1\20\73\uffff\1\21\11\uffff\1\1\57\uffff\1\15"+
            "\40\uffff\1\17\46\uffff\1\7\117\uffff\1\11\10\uffff\1\2\1\6"+
            "\3\uffff\1\14\2\uffff\1\13\45\uffff\1\7\166\uffff\1\10\3\uffff"+
            "\1\23\2\uffff\1\22\11\uffff\1\16\14\uffff\1\7\51\uffff\1\24"+
            "\1\uffff\1\25\2\uffff\1\12",
            "\1\26",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "",
            "",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\27\35\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\27\35\uffff\1\7",
            "\1\33\u00a0\uffff\1\31\1\uffff\1\30\u011a\uffff\1\32",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "\1\35\u00ad\uffff\1\34\114\uffff\1\36",
            "\1\40\u00ad\uffff\1\37\114\uffff\1\41",
            "\1\43\u00ad\uffff\1\42\114\uffff\1\44",
            "\1\45",
            "\1\46",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\27\35\uffff\1\7",
            "\1\51\u0096\uffff\1\50\u0124\uffff\1\47",
            "\1\51\u0096\uffff\1\50\u0124\uffff\1\47",
            "\1\51\u0096\uffff\1\50\u0124\uffff\1\47",
            "\1\51\u0096\uffff\1\50\u0124\uffff\1\47",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\52\35\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\52\35\uffff\1\7",
            "\1\56\u00a0\uffff\1\54\1\uffff\1\53\u011a\uffff\1\55",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\57\35\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\57\35\uffff\1\7",
            "\1\63\u00a0\uffff\1\61\1\uffff\1\60\u011a\uffff\1\62",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\64\35\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\64\35\uffff\1\7",
            "\1\70\u00a0\uffff\1\66\1\uffff\1\65\u011a\uffff\1\67",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\27\35\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\u0094\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\52\35\uffff\1\7",
            "\1\71",
            "\1\71",
            "\1\71",
            "\1\71",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\57\35\uffff\1\7",
            "\1\72",
            "\1\72",
            "\1\72",
            "\1\72",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\64\35\uffff\1\7",
            "\1\73",
            "\1\73",
            "\1\73",
            "\1\73",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\52\35\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\57\35\uffff\1\7",
            "\1\3\117\uffff\1\1\167\uffff\1\7\130\uffff\1\2\55\uffff\1\7"+
            "\166\uffff\1\64\35\uffff\1\7"
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "1235:1: attribute_list : ( ( attribute )+ attribute_with_key | attribute_with_key ( attribute )+ | ( attribute )* );";
        }
    }
 

    public static final BitSet FOLLOW_CREATE_in_create6524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_table_options_in_create6526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_TABLE_SYM_in_create6529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000001AL,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_if_not_exists_in_create6531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_table_ident_in_create6536 = new BitSet(new long[]{0x0030000000000000L,0x0000010000000000L,0x0000000000000080L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_create2_in_create6548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_option_in_table_options6617 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_table_option6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_548_in_create26673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0000020800000000L,0x000000010000010AL,0x0000000000000000L,0x0000008000000000L,0x0400000000000000L,0x1000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_create2a_in_create26675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_options_in_create26690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_create3_in_create26703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_list_in_create2a6735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_549_in_create2a6738 = new BitSet(new long[]{0x0030000000000000L,0x0000010000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_create_table_options_in_create2a6740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_create3_in_create2a6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_not_exists6815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_NOT_in_if_not_exists6817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_EXISTS_in_if_not_exists6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_field_ident6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_field_ident6858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_553_in_field_ident6860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ident_in_field_ident6862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_553_in_field_ident6864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ident_in_field_ident6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_field_ident6878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_553_in_field_ident6880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ident_in_field_ident6882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_553_in_field_ident6894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ident_in_field_ident6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_table_ident6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_table_ident6953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_553_in_table_ident6955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ident_in_table_ident6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_553_in_table_ident6969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ident_in_table_ident6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_sys_in_ident7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_QUOTED_in_ident_sys7036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_ident_sys7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_option_in_create_table_options7072 = new BitSet(new long[]{0x0030000000000002L,0x0000010000000000L,0x0000000000000080L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_551_in_create_table_options7075 = new BitSet(new long[]{0x0030000000000000L,0x0000010000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_create_table_option_in_create_table_options7078 = new BitSet(new long[]{0x0030000000000002L,0x0000010000000000L,0x0000000000000080L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ENGINE_SYM_in_create_table_option7101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L,0x000000000000000AL,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_equal_in_create_table_option7103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_storage_engines_in_create_table_option7106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_default_charset_in_create_table_option7135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_default_charset7171 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_charset_in_default_charset7174 = new BitSet(new long[]{0x0000000100000000L,0x0000010000000000L,0x0000000000000200L,0x000000000000000AL,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_equal_in_default_charset7176 = new BitSet(new long[]{0x0000000100000000L,0x0000010000000000L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_charset_name_or_default_in_default_charset7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_or_text_in_storage_engines7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_ident_or_text7271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_string_sys_in_ident_or_text7294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_list_item_in_field_list7326 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_551_in_field_list7330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0000020800000000L,0x000000010000010AL,0x0000000000000000L,0x0000008000000000L,0x0400000000000000L,0x1000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_field_list_item_in_field_list7332 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_column_def_in_field_list_item7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_def_in_field_list_item7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_spec_in_column_def7404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_type_in_key_def7433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ident_in_key_def7435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_key_alg_in_key_def7438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_548_in_key_def7440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_key_list_in_key_def7442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_549_in_key_def7444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000002000100L});
    public static final BitSet FOLLOW_key_options_in_key_def7446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_in_key_def7458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_constraint_key_type_in_key_def7461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ident_in_key_def7463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_key_alg_in_key_def7466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_548_in_key_def7468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_key_list_in_key_def7470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_549_in_key_def7472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000002000100L});
    public static final BitSet FOLLOW_key_options_in_key_def7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_in_key_def7486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_FOREIGN_in_key_def7489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KEY_SYM_in_key_def7491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ident_in_key_def7493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_548_in_key_def7496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_key_list_in_key_def7498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_549_in_key_def7500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_references_in_key_def7502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_key_options_in_key_alg7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_key_options_in_key_alg7548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_key_using_alg_in_key_alg7550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_opts_in_key_options7590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_opt_in_key_opts7617 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000002000100L});
    public static final BitSet FOLLOW_USING_in_key_using_alg7644 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_btree_or_rtree_in_key_using_alg7646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_SYM_in_key_using_alg7663 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_btree_or_rtree_in_key_using_alg7665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_using_alg_in_key_opt7693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_BLOCK_SIZE_in_key_opt7705 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0200000080000200L,0x0200000000000000L,0x8000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_equal_in_key_opt7707 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0200000080000000L,0x0200000000000000L,0x8000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_ulong_num_in_key_opt7710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_key_opt7722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_PARSER_SYM_in_key_opt7724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ident_sys_in_key_opt7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_part_in_key_list7806 = new BitSet(new long[]{0x0000000000040000L,0x0000200000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_order_dir_in_key_list7808 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_551_in_key_list7811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_key_part_in_key_list7813 = new BitSet(new long[]{0x0000000000040000L,0x0000200000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_order_dir_in_key_list7815 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_key_part7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_key_part7856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_548_in_key_part7858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_NUM_in_key_part7860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_549_in_key_part7862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint7957 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ident_in_constraint7959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_ident_in_field_spec8001 = new BitSet(new long[]{0x002000D980000000L,0x0100004060000000L,0x0000300140000100L,0x0580800000100000L,0x0002470001C00000L,0x0080000300000005L,0x0010024000000000L,0x000001E480000000L,0x000000040000C000L});
    public static final BitSet FOLLOW_type_in_field_spec8027 = new BitSet(new long[]{0x0000000001000002L,0x0000010000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_attribute_in_field_spec8029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_type_in_type8056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_field_length_in_type8058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_field_options_in_type8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_type_in_type8074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_precision_in_type8076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_field_options_in_type8079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_SYM_in_type8092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_float_options_in_type8094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_field_options_in_type8096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_SYM_in_type8109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_SYM_in_type8121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_field_length_in_type8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_SYM_in_type8135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_SYM_in_type8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char2_in_type8159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_field_length_in_type8161 = new BitSet(new long[]{0x0030080100080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_binary_in_type8163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char2_in_type8176 = new BitSet(new long[]{0x0030080100080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_binary_in_type8178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nchar_in_type8191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_field_length_in_type8193 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_bin_mod_in_type8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nchar_in_type8208 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_bin_mod_in_type8210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_type8223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_field_length_in_type8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_type8237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varchar_in_type8249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_field_length_in_type8251 = new BitSet(new long[]{0x0030080100080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_binary_in_type8253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nvarchar_in_type8266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_field_length_in_type8268 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_bin_mod_in_type8270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARBINARY_in_type8283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_field_length_in_type8285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_SYM_in_type8297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_field_length_in_type8299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_field_options_in_type8302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_SYM_in_type8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_SYM_in_type8326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_type8338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_field_length_in_type8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_in_type8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TINYBLOB_in_type8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOB_SYM_in_type8379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_field_length_in_type8381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spatial_type_in_type8393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIUMBLOB_in_type8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGBLOB_in_type8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_SYM_in_type8429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_VARBINARY_in_type8431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_SYM_in_type8443 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_varchar_in_type8445 = new BitSet(new long[]{0x0030080100080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_binary_in_type8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TINYTEXT_in_type8460 = new BitSet(new long[]{0x0030080100080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_binary_in_type8462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_SYM_in_type8475 = new BitSet(new long[]{0x0030080100080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_field_length_in_type8477 = new BitSet(new long[]{0x0030080100080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_binary_in_type8480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIUMTEXT_in_type8493 = new BitSet(new long[]{0x0030080100080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_binary_in_type8495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGTEXT_in_type8508 = new BitSet(new long[]{0x0030080100080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_binary_in_type8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_SYM_in_type8523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_float_options_in_type8525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_field_options_in_type8527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_SYM_in_type8539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_float_options_in_type8541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_field_options_in_type8543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIXED_SYM_in_type8555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_float_options_in_type8557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_field_options_in_type8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_type8571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_type8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_SYM_in_type8595 = new BitSet(new long[]{0x0030080100080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_binary_in_type8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SERIAL_SYM_in_type8610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYM_in_char28802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCHAR_SYM_in_nchar8829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIONAL_SYM_in_nchar8842 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_CHAR_SYM_in_nchar8844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char2_in_varchar8871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_VARYING_in_varchar8873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARCHAR_in_varchar8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIONAL_SYM_in_nvarchar8915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_VARCHAR_in_nvarchar8917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NVARCHAR_SYM_in_nvarchar8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCHAR_SYM_in_nvarchar8945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_VARCHAR_in_nvarchar8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIONAL_SYM_in_nvarchar8961 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_CHAR_SYM_in_nvarchar8963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_VARYING_in_nvarchar8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCHAR_SYM_in_nvarchar8979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_VARYING_in_nvarchar8981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_real_type9096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_SYM_in_real_type9108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_SYM_in_real_type9120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_PRECISION_in_real_type9122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_length_in_float_options9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precision_in_float_options9183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_548_in_precision9221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_NUM_in_precision9223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_551_in_precision9225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_NUM_in_precision9227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_549_in_precision9229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_option_in_field_options9270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x8000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_SIGNED_SYM_in_field_option9297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_in_field_option9311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZEROFILL_in_field_option9324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_548_in_field_length9351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_LONG_NUM_in_field_length9353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_549_in_field_length9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_548_in_field_length9373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_ULONGLONG_NUM_in_field_length9375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_549_in_field_length9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_548_in_field_length9390 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_DECIMAL_NUM_in_field_length9392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_549_in_field_length9394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_548_in_field_length9409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_NUM_in_field_length9411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_549_in_field_length9413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attribute_list9448 = new BitSet(new long[]{0x0000000001000000L,0x0000010000000000L,0x0000000000000000L,0x0000000100000000L,0x0200000000000000L,0x0000008000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_attribute_with_key_in_attribute_list9451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_with_key_in_attribute_list9455 = new BitSet(new long[]{0x0000000001000000L,0x0000010000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_attribute_in_attribute_list9457 = new BitSet(new long[]{0x0000000001000002L,0x0000010000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_attribute_in_attribute_list9463 = new BitSet(new long[]{0x0000000001000002L,0x0000010000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_attribute9490 = new BitSet(new long[]{0x0000000400000000L,0x0000000040000000L,0x0200000001000000L,0x0000000000000000L,0x4401000000000000L,0x0000000000000002L,0x0000000000000000L,0x0000802440000000L,0x0000094000000000L});
    public static final BitSet FOLLOW_now_or_signed_literal_in_attribute9492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_attribute9506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_NULL_SYM_in_attribute9508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_INC_in_attribute9522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_SYM_in_attribute_with_key9571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KEY_SYM_in_attribute_with_key9574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_SYM_in_attribute_with_key9587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KEY_SYM_in_attribute_with_key9589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOW_SYM_in_now_or_signed_literal9608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_literal_in_now_or_signed_literal9621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_548_in_braces9647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_549_in_braces9649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYM_in_charset9676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_SET_in_charset9678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARSET_in_charset9692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_on_delete_list_in_on_delete9728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_on_delete_item_in_on_delete_list9755 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ON_in_on_delete_item9782 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_DELETE_SYM_in_on_delete_item9784 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000000L,0x0000020000010000L});
    public static final BitSet FOLLOW_delete_option_in_on_delete_item9786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_on_delete_item9798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_UPDATE_SYM_in_on_delete_item9800 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000000L,0x0000020000010000L});
    public static final BitSet FOLLOW_delete_option_in_on_delete_item9802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_on_delete_item9814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_FULL_in_on_delete_item9816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_on_delete_item9835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_PARTIAL_in_on_delete_item9837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_on_delete_item9853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_SIMPLE_SYM_in_on_delete_item9855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_delete_option9882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_delete_option9900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_delete_option9919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_NULL_SYM_in_delete_option9921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NO_SYM_in_delete_option9935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ACTION_in_delete_option9937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_delete_option9950 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_delete_option9952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_or_index_in_key_type9981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULLTEXT_SYM_in_key_type9994 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000100000100L});
    public static final BitSet FOLLOW_key_or_index_in_key_type9996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPATIAL_SYM_in_key_type10010 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000100000100L});
    public static final BitSet FOLLOW_key_or_index_in_key_type10012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_SYM_in_constraint_key_type10039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KEY_SYM_in_constraint_key_type10041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_SYM_in_constraint_key_type10054 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000100000100L});
    public static final BitSet FOLLOW_key_or_index_in_constraint_key_type10056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_SYM_in_key_or_index10083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_SYM_in_key_or_index10097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYS_in_keys_or_index10125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_SYM_in_keys_or_index10139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEXES_in_keys_or_index10153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_555_in_underscore_charset10213 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_charset_name_in_underscore_charset10215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_or_text_in_charset_name10242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_charset_name10254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_charset_name_in_charset_name_or_default10281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_charset_name_or_default10294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASCII_SYM_in_binary10332 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_BINARY_in_binary10334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_SYM_in_binary10348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNICODE_SYM_in_binary10360 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_BINARY_in_binary10362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_charset_in_binary10375 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_charset_name_in_binary10377 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_bin_mod_in_binary10379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_binary10392 = new BitSet(new long[]{0x0030000000080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_bin_charset_in_binary10394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_bin_mod10419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASCII_SYM_in_bin_charset10446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNICODE_SYM_in_bin_charset10459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_charset_in_bin_charset10471 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_charset_name_in_bin_charset10473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_references10500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_table_ident_in_references10502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000020L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_opt_ref_list_in_references10514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_on_delete_in_opt_ref_list10540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_548_in_opt_ref_list10555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ref_list_in_opt_ref_list10557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_549_in_opt_ref_list10559 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_on_delete_in_opt_ref_list10561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_ref_list10590 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_551_in_ref_list10593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ident_in_ref_list10595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_literal_in_signed_literal10633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_550_in_signed_literal10646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_literal_in_signed_literal10648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_552_in_signed_literal10661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_literal_in_signed_literal10663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_literal_in_literal10689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_literal_in_literal10702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_SYM_in_literal10715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_SYM_in_literal10727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_SYM_in_literal10739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_NUM_in_literal10751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIN_NUM_in_literal10763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_underscore_charset_in_literal10776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_HEX_NUM_in_literal10778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_underscore_charset_in_literal10790 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_BIN_NUM_in_literal10792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_SYM_in_literal10804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_text_literal_in_literal10806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_SYM_in_literal10819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_text_literal_in_literal10821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_literal10834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_text_literal_in_literal10836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_literal_in_literal_without_null10863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_literal_in_literal_without_null10876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_SYM_in_literal_without_null10889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_SYM_in_literal_without_null10901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_NUM_in_literal_without_null10913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIN_NUM_in_literal_without_null10925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_underscore_charset_in_literal_without_null10938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_HEX_NUM_in_literal_without_null10940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_underscore_charset_in_literal_without_null10952 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_BIN_NUM_in_literal_without_null10954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_SYM_in_literal_without_null10966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_text_literal_in_literal_without_null10968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_SYM_in_literal_without_null10981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_text_literal_in_literal_without_null10983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_literal_without_null10996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_text_literal_in_literal_without_null10998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_STRING_in_text_literal11020 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_NCHAR_STRING_in_text_literal11024 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_underscore_charset_in_text_literal11028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TEXT_STRING_in_text_literal11030 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_text_string_literal_in_text_literal11034 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TEXT_STRING_in_text_string_sys11064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_STRING_in_text_string_literal11091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_real_ulong_num11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_NUM_in_real_ulong_num11267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_NUM_in_real_ulong_num11286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ULONGLONG_NUM_in_real_ulong_num11304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_num_error_in_real_ulong_num11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_real_ulonglong_num11444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ULONGLONG_NUM_in_real_ulonglong_num11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_NUM_in_real_ulonglong_num11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_num_error_in_real_ulonglong_num11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_num_in_dec_num_error11525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_sql_script11598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_554_in_sql_script11600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_EOF_in_sql_script11604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SL_COMMENT_in_comments_in_sql_script11637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_ML_COMMENT_in_comments_in_sql_script11665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_EOF_in_comments_in_sql_script11690 = new BitSet(new long[]{0x0000000000000002L});

}