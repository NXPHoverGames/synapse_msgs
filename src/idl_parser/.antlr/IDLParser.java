// Generated from /home/docker/ws/src/synapse_msgs/src/idl_parser/IDL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER_LITERAL=1, OCTAL_LITERAL=2, HEX_LITERAL=3, FLOATING_PT_LITERAL=4, 
		FIXED_PT_LITERAL=5, WIDE_CHARACTER_LITERAL=6, CHARACTER_LITERAL=7, WIDE_STRING_LITERAL=8, 
		STRING_LITERAL=9, BOOLEAN_LITERAL=10, SEMICOLON=11, COLON=12, COMMA=13, 
		LEFT_BRACE=14, RIGHT_BRACE=15, LEFT_BRACKET=16, RIGHT_BRACKET=17, LEFT_SQUARE_BRACKET=18, 
		RIGHT_SQUARE_BRACKET=19, TILDE=20, SLASH=21, LEFT_ANG_BRACKET=22, RIGHT_ANG_BRACKET=23, 
		STAR=24, PLUS=25, MINUS=26, CARET=27, AMPERSAND=28, PIPE=29, EQUAL=30, 
		PERCENT=31, DOUBLE_COLON=32, RIGHT_SHIFT=33, LEFT_SHIFT=34, AT=35, KW_SETRAISES=36, 
		KW_OUT=37, KW_EMITS=38, KW_STRING=39, KW_SWITCH=40, KW_PUBLISHES=41, KW_TYPEDEF=42, 
		KW_USES=43, KW_PRIMARYKEY=44, KW_CUSTOM=45, KW_OCTET=46, KW_SEQUENCE=47, 
		KW_IMPORT=48, KW_STRUCT=49, KW_NATIVE=50, KW_READONLY=51, KW_FINDER=52, 
		KW_RAISES=53, KW_VOID=54, KW_PRIVATE=55, KW_EVENTTYPE=56, KW_WCHAR=57, 
		KW_IN=58, KW_DEFAULT=59, KW_PUBLIC=60, KW_SHORT=61, KW_LONG=62, KW_ENUM=63, 
		KW_WSTRING=64, KW_CONTEXT=65, KW_HOME=66, KW_FACTORY=67, KW_EXCEPTION=68, 
		KW_GETRAISES=69, KW_CONST=70, KW_VALUEBASE=71, KW_VALUETYPE=72, KW_SUPPORTS=73, 
		KW_MODULE=74, KW_OBJECT=75, KW_TRUNCATABLE=76, KW_UNSIGNED=77, KW_FIXED=78, 
		KW_UNION=79, KW_ONEWAY=80, KW_ANY=81, KW_CHAR=82, KW_CASE=83, KW_FLOAT=84, 
		KW_BOOLEAN=85, KW_MULTIPLE=86, KW_ABSTRACT=87, KW_INOUT=88, KW_PROVIDES=89, 
		KW_CONSUMES=90, KW_DOUBLE=91, KW_TYPEPREFIX=92, KW_TYPEID=93, KW_ATTRIBUTE=94, 
		KW_LOCAL=95, KW_MANAGES=96, KW_INTERFACE=97, KW_COMPONENT=98, KW_SET=99, 
		KW_MAP=100, KW_BITFIELD=101, KW_BITSET=102, KW_BITMASK=103, KW_INT8=104, 
		KW_UINT8=105, KW_INT16=106, KW_UINT16=107, KW_INT32=108, KW_UINT32=109, 
		KW_INT64=110, KW_UINT64=111, KW_AT_ANNOTATION=112, ID=113, WS=114, COMMENT=115, 
		LINE_COMMENT=116;
	public static final int
		RULE_specification = 0, RULE_definition = 1, RULE_module = 2, RULE_interface_or_forward_decl = 3, 
		RULE_interface_decl = 4, RULE_forward_decl = 5, RULE_interface_header = 6, 
		RULE_interface_body = 7, RULE_export_ = 8, RULE_interface_inheritance_spec = 9, 
		RULE_interface_name = 10, RULE_a_scoped_name = 11, RULE_scoped_name = 12, 
		RULE_value = 13, RULE_value_forward_decl = 14, RULE_value_box_decl = 15, 
		RULE_value_abs_decl = 16, RULE_value_decl = 17, RULE_value_header = 18, 
		RULE_value_inheritance_spec = 19, RULE_value_name = 20, RULE_value_element = 21, 
		RULE_state_member = 22, RULE_init_decl = 23, RULE_init_param_decls = 24, 
		RULE_init_param_decl = 25, RULE_init_param_attribute = 26, RULE_const_decl = 27, 
		RULE_const_type = 28, RULE_const_exp = 29, RULE_or_expr = 30, RULE_xor_expr = 31, 
		RULE_and_expr = 32, RULE_shift_expr = 33, RULE_add_expr = 34, RULE_mult_expr = 35, 
		RULE_unary_expr = 36, RULE_unary_operator = 37, RULE_primary_expr = 38, 
		RULE_literal = 39, RULE_positive_int_const = 40, RULE_type_decl = 41, 
		RULE_type_declarator = 42, RULE_type_spec = 43, RULE_simple_type_spec = 44, 
		RULE_bitfield_type_spec = 45, RULE_base_type_spec = 46, RULE_template_type_spec = 47, 
		RULE_constr_type_spec = 48, RULE_simple_declarators = 49, RULE_declarators = 50, 
		RULE_declarator = 51, RULE_simple_declarator = 52, RULE_complex_declarator = 53, 
		RULE_floating_pt_type = 54, RULE_integer_type = 55, RULE_signed_int = 56, 
		RULE_signed_tiny_int = 57, RULE_signed_short_int = 58, RULE_signed_long_int = 59, 
		RULE_signed_longlong_int = 60, RULE_unsigned_int = 61, RULE_unsigned_tiny_int = 62, 
		RULE_unsigned_short_int = 63, RULE_unsigned_long_int = 64, RULE_unsigned_longlong_int = 65, 
		RULE_char_type = 66, RULE_wide_char_type = 67, RULE_boolean_type = 68, 
		RULE_octet_type = 69, RULE_any_type = 70, RULE_object_type = 71, RULE_annotation_decl = 72, 
		RULE_annotation_def = 73, RULE_annotation_header = 74, RULE_annotation_inheritance_spec = 75, 
		RULE_annotation_body = 76, RULE_annotation_member = 77, RULE_annotation_forward_dcl = 78, 
		RULE_bitset_type = 79, RULE_bitfield = 80, RULE_bitfield_spec = 81, RULE_bitmask_type = 82, 
		RULE_bit_values = 83, RULE_struct_type = 84, RULE_member_list = 85, RULE_member = 86, 
		RULE_union_type = 87, RULE_switch_type_spec = 88, RULE_switch_body = 89, 
		RULE_case_stmt = 90, RULE_case_label = 91, RULE_element_spec = 92, RULE_enum_type = 93, 
		RULE_enumerator = 94, RULE_sequence_type = 95, RULE_set_type = 96, RULE_map_type = 97, 
		RULE_string_type = 98, RULE_wide_string_type = 99, RULE_array_declarator = 100, 
		RULE_fixed_array_size = 101, RULE_attr_decl = 102, RULE_except_decl = 103, 
		RULE_op_decl = 104, RULE_op_attribute = 105, RULE_op_type_spec = 106, 
		RULE_parameter_decls = 107, RULE_param_decl = 108, RULE_param_attribute = 109, 
		RULE_raises_expr = 110, RULE_context_expr = 111, RULE_param_type_spec = 112, 
		RULE_fixed_pt_type = 113, RULE_fixed_pt_const_type = 114, RULE_value_base_type = 115, 
		RULE_constr_forward_decl = 116, RULE_import_decl = 117, RULE_imported_scope = 118, 
		RULE_type_id_decl = 119, RULE_type_prefix_decl = 120, RULE_readonly_attr_spec = 121, 
		RULE_readonly_attr_declarator = 122, RULE_attr_spec = 123, RULE_attr_declarator = 124, 
		RULE_attr_raises_expr = 125, RULE_get_excep_expr = 126, RULE_set_excep_expr = 127, 
		RULE_exception_list = 128, RULE_component = 129, RULE_component_forward_decl = 130, 
		RULE_component_decl = 131, RULE_component_header = 132, RULE_supported_interface_spec = 133, 
		RULE_component_inheritance_spec = 134, RULE_component_body = 135, RULE_component_export = 136, 
		RULE_provides_decl = 137, RULE_interface_type = 138, RULE_uses_decl = 139, 
		RULE_emits_decl = 140, RULE_publishes_decl = 141, RULE_consumes_decl = 142, 
		RULE_home_decl = 143, RULE_home_header = 144, RULE_home_inheritance_spec = 145, 
		RULE_primary_key_spec = 146, RULE_home_body = 147, RULE_home_export = 148, 
		RULE_factory_decl = 149, RULE_finder_decl = 150, RULE_event = 151, RULE_event_forward_decl = 152, 
		RULE_event_abs_decl = 153, RULE_event_decl = 154, RULE_event_header = 155, 
		RULE_annapps = 156, RULE_annotation_appl = 157, RULE_annotation_appl_params = 158, 
		RULE_annotation_appl_param = 159, RULE_identifier = 160;
	private static String[] makeRuleNames() {
		return new String[] {
			"specification", "definition", "module", "interface_or_forward_decl", 
			"interface_decl", "forward_decl", "interface_header", "interface_body", 
			"export_", "interface_inheritance_spec", "interface_name", "a_scoped_name", 
			"scoped_name", "value", "value_forward_decl", "value_box_decl", "value_abs_decl", 
			"value_decl", "value_header", "value_inheritance_spec", "value_name", 
			"value_element", "state_member", "init_decl", "init_param_decls", "init_param_decl", 
			"init_param_attribute", "const_decl", "const_type", "const_exp", "or_expr", 
			"xor_expr", "and_expr", "shift_expr", "add_expr", "mult_expr", "unary_expr", 
			"unary_operator", "primary_expr", "literal", "positive_int_const", "type_decl", 
			"type_declarator", "type_spec", "simple_type_spec", "bitfield_type_spec", 
			"base_type_spec", "template_type_spec", "constr_type_spec", "simple_declarators", 
			"declarators", "declarator", "simple_declarator", "complex_declarator", 
			"floating_pt_type", "integer_type", "signed_int", "signed_tiny_int", 
			"signed_short_int", "signed_long_int", "signed_longlong_int", "unsigned_int", 
			"unsigned_tiny_int", "unsigned_short_int", "unsigned_long_int", "unsigned_longlong_int", 
			"char_type", "wide_char_type", "boolean_type", "octet_type", "any_type", 
			"object_type", "annotation_decl", "annotation_def", "annotation_header", 
			"annotation_inheritance_spec", "annotation_body", "annotation_member", 
			"annotation_forward_dcl", "bitset_type", "bitfield", "bitfield_spec", 
			"bitmask_type", "bit_values", "struct_type", "member_list", "member", 
			"union_type", "switch_type_spec", "switch_body", "case_stmt", "case_label", 
			"element_spec", "enum_type", "enumerator", "sequence_type", "set_type", 
			"map_type", "string_type", "wide_string_type", "array_declarator", "fixed_array_size", 
			"attr_decl", "except_decl", "op_decl", "op_attribute", "op_type_spec", 
			"parameter_decls", "param_decl", "param_attribute", "raises_expr", "context_expr", 
			"param_type_spec", "fixed_pt_type", "fixed_pt_const_type", "value_base_type", 
			"constr_forward_decl", "import_decl", "imported_scope", "type_id_decl", 
			"type_prefix_decl", "readonly_attr_spec", "readonly_attr_declarator", 
			"attr_spec", "attr_declarator", "attr_raises_expr", "get_excep_expr", 
			"set_excep_expr", "exception_list", "component", "component_forward_decl", 
			"component_decl", "component_header", "supported_interface_spec", "component_inheritance_spec", 
			"component_body", "component_export", "provides_decl", "interface_type", 
			"uses_decl", "emits_decl", "publishes_decl", "consumes_decl", "home_decl", 
			"home_header", "home_inheritance_spec", "primary_key_spec", "home_body", 
			"home_export", "factory_decl", "finder_decl", "event", "event_forward_decl", 
			"event_abs_decl", "event_decl", "event_header", "annapps", "annotation_appl", 
			"annotation_appl_params", "annotation_appl_param", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "';'", 
			"':'", "','", "'{'", "'}'", "'('", "')'", "'['", "']'", "'~'", "'/'", 
			"'<'", "'>'", "'*'", "'+'", "'-'", "'^'", "'&'", "'|'", "'='", "'%'", 
			"'::'", "'>>'", "'<<'", "'@'", "'setraises'", "'out'", "'emits'", "'string'", 
			"'switch'", "'publishes'", "'typedef'", "'uses'", "'primarykey'", "'custom'", 
			"'octet'", "'sequence'", "'import'", "'struct'", "'native'", "'readonly'", 
			"'finder'", "'raises'", "'void'", "'private'", "'eventtype'", "'wchar'", 
			"'in'", "'default'", "'public'", "'short'", "'long'", "'enum'", "'wstring'", 
			"'context'", "'home'", "'factory'", "'exception'", "'getraises'", "'const'", 
			"'ValueBase'", "'valuetype'", "'supports'", "'module'", "'Object'", "'truncatable'", 
			"'unsigned'", "'fixed'", "'union'", "'oneway'", "'any'", "'char'", "'case'", 
			"'float'", "'boolean'", "'multiple'", "'abstract'", "'inout'", "'provides'", 
			"'consumes'", "'double'", "'typeprefix'", "'typeid'", "'attribute'", 
			"'local'", "'manages'", "'interface'", "'component'", "'set'", "'map'", 
			"'bitfield'", "'bitset'", "'bitmask'", "'int8'", "'uint8'", "'int16'", 
			"'uint16'", "'int32'", "'uint32'", "'int64'", "'uint64'", "'@annotation'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER_LITERAL", "OCTAL_LITERAL", "HEX_LITERAL", "FLOATING_PT_LITERAL", 
			"FIXED_PT_LITERAL", "WIDE_CHARACTER_LITERAL", "CHARACTER_LITERAL", "WIDE_STRING_LITERAL", 
			"STRING_LITERAL", "BOOLEAN_LITERAL", "SEMICOLON", "COLON", "COMMA", "LEFT_BRACE", 
			"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SQUARE_BRACKET", 
			"RIGHT_SQUARE_BRACKET", "TILDE", "SLASH", "LEFT_ANG_BRACKET", "RIGHT_ANG_BRACKET", 
			"STAR", "PLUS", "MINUS", "CARET", "AMPERSAND", "PIPE", "EQUAL", "PERCENT", 
			"DOUBLE_COLON", "RIGHT_SHIFT", "LEFT_SHIFT", "AT", "KW_SETRAISES", "KW_OUT", 
			"KW_EMITS", "KW_STRING", "KW_SWITCH", "KW_PUBLISHES", "KW_TYPEDEF", "KW_USES", 
			"KW_PRIMARYKEY", "KW_CUSTOM", "KW_OCTET", "KW_SEQUENCE", "KW_IMPORT", 
			"KW_STRUCT", "KW_NATIVE", "KW_READONLY", "KW_FINDER", "KW_RAISES", "KW_VOID", 
			"KW_PRIVATE", "KW_EVENTTYPE", "KW_WCHAR", "KW_IN", "KW_DEFAULT", "KW_PUBLIC", 
			"KW_SHORT", "KW_LONG", "KW_ENUM", "KW_WSTRING", "KW_CONTEXT", "KW_HOME", 
			"KW_FACTORY", "KW_EXCEPTION", "KW_GETRAISES", "KW_CONST", "KW_VALUEBASE", 
			"KW_VALUETYPE", "KW_SUPPORTS", "KW_MODULE", "KW_OBJECT", "KW_TRUNCATABLE", 
			"KW_UNSIGNED", "KW_FIXED", "KW_UNION", "KW_ONEWAY", "KW_ANY", "KW_CHAR", 
			"KW_CASE", "KW_FLOAT", "KW_BOOLEAN", "KW_MULTIPLE", "KW_ABSTRACT", "KW_INOUT", 
			"KW_PROVIDES", "KW_CONSUMES", "KW_DOUBLE", "KW_TYPEPREFIX", "KW_TYPEID", 
			"KW_ATTRIBUTE", "KW_LOCAL", "KW_MANAGES", "KW_INTERFACE", "KW_COMPONENT", 
			"KW_SET", "KW_MAP", "KW_BITFIELD", "KW_BITSET", "KW_BITMASK", "KW_INT8", 
			"KW_UINT8", "KW_INT16", "KW_UINT16", "KW_INT32", "KW_UINT32", "KW_INT64", 
			"KW_UINT64", "KW_AT_ANNOTATION", "ID", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "IDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SpecificationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(IDLParser.EOF, 0); }
		public List<Import_declContext> import_decl() {
			return getRuleContexts(Import_declContext.class);
		}
		public Import_declContext import_decl(int i) {
			return getRuleContext(Import_declContext.class,i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_specification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					import_decl();
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(329); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(328);
				definition();
				}
				}
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << KW_TYPEDEF) | (1L << KW_CUSTOM) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_EVENTTYPE) | (1L << KW_ENUM))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KW_HOME - 66)) | (1L << (KW_EXCEPTION - 66)) | (1L << (KW_CONST - 66)) | (1L << (KW_VALUETYPE - 66)) | (1L << (KW_MODULE - 66)) | (1L << (KW_UNION - 66)) | (1L << (KW_ABSTRACT - 66)) | (1L << (KW_TYPEPREFIX - 66)) | (1L << (KW_TYPEID - 66)) | (1L << (KW_LOCAL - 66)) | (1L << (KW_INTERFACE - 66)) | (1L << (KW_COMPONENT - 66)) | (1L << (KW_BITSET - 66)) | (1L << (KW_BITMASK - 66)) | (1L << (KW_AT_ANNOTATION - 66)))) != 0) );
			setState(333);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public Except_declContext except_decl() {
			return getRuleContext(Except_declContext.class,0);
		}
		public Interface_or_forward_declContext interface_or_forward_decl() {
			return getRuleContext(Interface_or_forward_declContext.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Type_id_declContext type_id_decl() {
			return getRuleContext(Type_id_declContext.class,0);
		}
		public Type_prefix_declContext type_prefix_decl() {
			return getRuleContext(Type_prefix_declContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public Home_declContext home_decl() {
			return getRuleContext(Home_declContext.class,0);
		}
		public Annotation_declContext annotation_decl() {
			return getRuleContext(Annotation_declContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			annapps();
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(336);
				type_decl();
				setState(337);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(339);
				const_decl();
				setState(340);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				setState(342);
				except_decl();
				setState(343);
				match(SEMICOLON);
				}
				break;
			case 4:
				{
				setState(345);
				interface_or_forward_decl();
				setState(346);
				match(SEMICOLON);
				}
				break;
			case 5:
				{
				setState(348);
				module();
				setState(349);
				match(SEMICOLON);
				}
				break;
			case 6:
				{
				setState(351);
				value();
				setState(352);
				match(SEMICOLON);
				}
				break;
			case 7:
				{
				setState(354);
				type_id_decl();
				setState(355);
				match(SEMICOLON);
				}
				break;
			case 8:
				{
				setState(357);
				type_prefix_decl();
				setState(358);
				match(SEMICOLON);
				}
				break;
			case 9:
				{
				setState(360);
				event();
				setState(361);
				match(SEMICOLON);
				}
				break;
			case 10:
				{
				setState(363);
				component();
				setState(364);
				match(SEMICOLON);
				}
				break;
			case 11:
				{
				setState(366);
				home_decl();
				setState(367);
				match(SEMICOLON);
				}
				break;
			case 12:
				{
				setState(369);
				annotation_decl();
				setState(370);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode KW_MODULE() { return getToken(IDLParser.KW_MODULE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(KW_MODULE);
			setState(375);
			identifier();
			setState(376);
			match(LEFT_BRACE);
			setState(378); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(377);
				definition();
				}
				}
				setState(380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << KW_TYPEDEF) | (1L << KW_CUSTOM) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_EVENTTYPE) | (1L << KW_ENUM))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KW_HOME - 66)) | (1L << (KW_EXCEPTION - 66)) | (1L << (KW_CONST - 66)) | (1L << (KW_VALUETYPE - 66)) | (1L << (KW_MODULE - 66)) | (1L << (KW_UNION - 66)) | (1L << (KW_ABSTRACT - 66)) | (1L << (KW_TYPEPREFIX - 66)) | (1L << (KW_TYPEID - 66)) | (1L << (KW_LOCAL - 66)) | (1L << (KW_INTERFACE - 66)) | (1L << (KW_COMPONENT - 66)) | (1L << (KW_BITSET - 66)) | (1L << (KW_BITMASK - 66)) | (1L << (KW_AT_ANNOTATION - 66)))) != 0) );
			setState(382);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_or_forward_declContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Interface_declContext interface_decl() {
			return getRuleContext(Interface_declContext.class,0);
		}
		public Forward_declContext forward_decl() {
			return getRuleContext(Forward_declContext.class,0);
		}
		public Interface_or_forward_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_or_forward_decl; }
	}

	public final Interface_or_forward_declContext interface_or_forward_decl() throws RecognitionException {
		Interface_or_forward_declContext _localctx = new Interface_or_forward_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interface_or_forward_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			annapps();
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(385);
				interface_decl();
				}
				break;
			case 2:
				{
				setState(386);
				forward_decl();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_declContext extends ParserRuleContext {
		public Interface_headerContext interface_header() {
			return getRuleContext(Interface_headerContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public Interface_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_decl; }
	}

	public final Interface_declContext interface_decl() throws RecognitionException {
		Interface_declContext _localctx = new Interface_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interface_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			interface_header();
			setState(390);
			match(LEFT_BRACE);
			setState(391);
			interface_body();
			setState(392);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forward_declContext extends ParserRuleContext {
		public TerminalNode KW_INTERFACE() { return getToken(IDLParser.KW_INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_ABSTRACT() { return getToken(IDLParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_LOCAL() { return getToken(IDLParser.KW_LOCAL, 0); }
		public Forward_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forward_decl; }
	}

	public final Forward_declContext forward_decl() throws RecognitionException {
		Forward_declContext _localctx = new Forward_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forward_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ABSTRACT || _la==KW_LOCAL) {
				{
				setState(394);
				_la = _input.LA(1);
				if ( !(_la==KW_ABSTRACT || _la==KW_LOCAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(397);
			match(KW_INTERFACE);
			setState(398);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_headerContext extends ParserRuleContext {
		public TerminalNode KW_INTERFACE() { return getToken(IDLParser.KW_INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Interface_inheritance_specContext interface_inheritance_spec() {
			return getRuleContext(Interface_inheritance_specContext.class,0);
		}
		public TerminalNode KW_ABSTRACT() { return getToken(IDLParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_LOCAL() { return getToken(IDLParser.KW_LOCAL, 0); }
		public Interface_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_header; }
	}

	public final Interface_headerContext interface_header() throws RecognitionException {
		Interface_headerContext _localctx = new Interface_headerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interface_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ABSTRACT || _la==KW_LOCAL) {
				{
				setState(400);
				_la = _input.LA(1);
				if ( !(_la==KW_ABSTRACT || _la==KW_LOCAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(403);
			match(KW_INTERFACE);
			setState(404);
			identifier();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(405);
				interface_inheritance_spec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_bodyContext extends ParserRuleContext {
		public List<Export_Context> export_() {
			return getRuleContexts(Export_Context.class);
		}
		public Export_Context export_(int i) {
			return getRuleContext(Export_Context.class,i);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_READONLY) | (1L << KW_VOID) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_EXCEPTION - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ONEWAY - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_TYPEPREFIX - 64)) | (1L << (KW_TYPEID - 64)) | (1L << (KW_ATTRIBUTE - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(408);
				export_();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Export_Context extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public Except_declContext except_decl() {
			return getRuleContext(Except_declContext.class,0);
		}
		public Attr_declContext attr_decl() {
			return getRuleContext(Attr_declContext.class,0);
		}
		public Op_declContext op_decl() {
			return getRuleContext(Op_declContext.class,0);
		}
		public Type_id_declContext type_id_decl() {
			return getRuleContext(Type_id_declContext.class,0);
		}
		public Type_prefix_declContext type_prefix_decl() {
			return getRuleContext(Type_prefix_declContext.class,0);
		}
		public Export_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_; }
	}

	public final Export_Context export_() throws RecognitionException {
		Export_Context _localctx = new Export_Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_export_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			annapps();
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TYPEDEF:
			case KW_STRUCT:
			case KW_NATIVE:
			case KW_ENUM:
			case KW_UNION:
			case KW_BITSET:
			case KW_BITMASK:
				{
				setState(415);
				type_decl();
				setState(416);
				match(SEMICOLON);
				}
				break;
			case KW_CONST:
				{
				setState(418);
				const_decl();
				setState(419);
				match(SEMICOLON);
				}
				break;
			case KW_EXCEPTION:
				{
				setState(421);
				except_decl();
				setState(422);
				match(SEMICOLON);
				}
				break;
			case KW_READONLY:
			case KW_ATTRIBUTE:
				{
				setState(424);
				attr_decl();
				setState(425);
				match(SEMICOLON);
				}
				break;
			case DOUBLE_COLON:
			case AT:
			case KW_STRING:
			case KW_OCTET:
			case KW_VOID:
			case KW_WCHAR:
			case KW_SHORT:
			case KW_LONG:
			case KW_WSTRING:
			case KW_VALUEBASE:
			case KW_OBJECT:
			case KW_UNSIGNED:
			case KW_ONEWAY:
			case KW_ANY:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_BOOLEAN:
			case KW_DOUBLE:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
			case ID:
				{
				setState(427);
				op_decl();
				setState(428);
				match(SEMICOLON);
				}
				break;
			case KW_TYPEID:
				{
				setState(430);
				type_id_decl();
				setState(431);
				match(SEMICOLON);
				}
				break;
			case KW_TYPEPREFIX:
				{
				setState(433);
				type_prefix_decl();
				setState(434);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_inheritance_specContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public List<Interface_nameContext> interface_name() {
			return getRuleContexts(Interface_nameContext.class);
		}
		public Interface_nameContext interface_name(int i) {
			return getRuleContext(Interface_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Interface_inheritance_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_inheritance_spec; }
	}

	public final Interface_inheritance_specContext interface_inheritance_spec() throws RecognitionException {
		Interface_inheritance_specContext _localctx = new Interface_inheritance_specContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interface_inheritance_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(COLON);
			setState(439);
			interface_name();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(440);
				match(COMMA);
				setState(441);
				interface_name();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_nameContext extends ParserRuleContext {
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public Interface_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_name; }
	}

	public final Interface_nameContext interface_name() throws RecognitionException {
		Interface_nameContext _localctx = new Interface_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interface_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			a_scoped_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_scoped_nameContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public A_scoped_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_scoped_name; }
	}

	public final A_scoped_nameContext a_scoped_name() throws RecognitionException {
		A_scoped_nameContext _localctx = new A_scoped_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_a_scoped_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			annapps();
			setState(450);
			scoped_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scoped_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IDLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IDLParser.ID, i);
		}
		public List<TerminalNode> DOUBLE_COLON() { return getTokens(IDLParser.DOUBLE_COLON); }
		public TerminalNode DOUBLE_COLON(int i) {
			return getToken(IDLParser.DOUBLE_COLON, i);
		}
		public Scoped_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scoped_name; }
	}

	public final Scoped_nameContext scoped_name() throws RecognitionException {
		Scoped_nameContext _localctx = new Scoped_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scoped_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLE_COLON) {
				{
				setState(452);
				match(DOUBLE_COLON);
				}
			}

			setState(455);
			match(ID);
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(456);
					match(DOUBLE_COLON);
					setState(457);
					match(ID);
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Value_declContext value_decl() {
			return getRuleContext(Value_declContext.class,0);
		}
		public Value_abs_declContext value_abs_decl() {
			return getRuleContext(Value_abs_declContext.class,0);
		}
		public Value_box_declContext value_box_decl() {
			return getRuleContext(Value_box_declContext.class,0);
		}
		public Value_forward_declContext value_forward_decl() {
			return getRuleContext(Value_forward_declContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			annapps();
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(464);
				value_decl();
				}
				break;
			case 2:
				{
				setState(465);
				value_abs_decl();
				}
				break;
			case 3:
				{
				setState(466);
				value_box_decl();
				}
				break;
			case 4:
				{
				setState(467);
				value_forward_decl();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_forward_declContext extends ParserRuleContext {
		public TerminalNode KW_VALUETYPE() { return getToken(IDLParser.KW_VALUETYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_ABSTRACT() { return getToken(IDLParser.KW_ABSTRACT, 0); }
		public Value_forward_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_forward_decl; }
	}

	public final Value_forward_declContext value_forward_decl() throws RecognitionException {
		Value_forward_declContext _localctx = new Value_forward_declContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value_forward_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ABSTRACT) {
				{
				setState(470);
				match(KW_ABSTRACT);
				}
			}

			setState(473);
			match(KW_VALUETYPE);
			setState(474);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_box_declContext extends ParserRuleContext {
		public TerminalNode KW_VALUETYPE() { return getToken(IDLParser.KW_VALUETYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public Value_box_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_box_decl; }
	}

	public final Value_box_declContext value_box_decl() throws RecognitionException {
		Value_box_declContext _localctx = new Value_box_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value_box_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(KW_VALUETYPE);
			setState(477);
			identifier();
			setState(478);
			type_spec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_abs_declContext extends ParserRuleContext {
		public TerminalNode KW_ABSTRACT() { return getToken(IDLParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_VALUETYPE() { return getToken(IDLParser.KW_VALUETYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Value_inheritance_specContext value_inheritance_spec() {
			return getRuleContext(Value_inheritance_specContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<Export_Context> export_() {
			return getRuleContexts(Export_Context.class);
		}
		public Export_Context export_(int i) {
			return getRuleContext(Export_Context.class,i);
		}
		public Value_abs_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_abs_decl; }
	}

	public final Value_abs_declContext value_abs_decl() throws RecognitionException {
		Value_abs_declContext _localctx = new Value_abs_declContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value_abs_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(KW_ABSTRACT);
			setState(481);
			match(KW_VALUETYPE);
			setState(482);
			identifier();
			setState(483);
			value_inheritance_spec();
			setState(484);
			match(LEFT_BRACE);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_READONLY) | (1L << KW_VOID) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_EXCEPTION - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ONEWAY - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_TYPEPREFIX - 64)) | (1L << (KW_TYPEID - 64)) | (1L << (KW_ATTRIBUTE - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(485);
				export_();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_declContext extends ParserRuleContext {
		public Value_headerContext value_header() {
			return getRuleContext(Value_headerContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<Value_elementContext> value_element() {
			return getRuleContexts(Value_elementContext.class);
		}
		public Value_elementContext value_element(int i) {
			return getRuleContext(Value_elementContext.class,i);
		}
		public Value_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_decl; }
	}

	public final Value_declContext value_decl() throws RecognitionException {
		Value_declContext _localctx = new Value_declContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			value_header();
			setState(494);
			match(LEFT_BRACE);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_READONLY) | (1L << KW_VOID) | (1L << KW_PRIVATE) | (1L << KW_WCHAR) | (1L << KW_PUBLIC) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_FACTORY - 64)) | (1L << (KW_EXCEPTION - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ONEWAY - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_TYPEPREFIX - 64)) | (1L << (KW_TYPEID - 64)) | (1L << (KW_ATTRIBUTE - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(495);
				value_element();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_headerContext extends ParserRuleContext {
		public TerminalNode KW_VALUETYPE() { return getToken(IDLParser.KW_VALUETYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Value_inheritance_specContext value_inheritance_spec() {
			return getRuleContext(Value_inheritance_specContext.class,0);
		}
		public TerminalNode KW_CUSTOM() { return getToken(IDLParser.KW_CUSTOM, 0); }
		public Value_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_header; }
	}

	public final Value_headerContext value_header() throws RecognitionException {
		Value_headerContext _localctx = new Value_headerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CUSTOM) {
				{
				setState(503);
				match(KW_CUSTOM);
				}
			}

			setState(506);
			match(KW_VALUETYPE);
			setState(507);
			identifier();
			setState(508);
			value_inheritance_spec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_inheritance_specContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public List<Value_nameContext> value_name() {
			return getRuleContexts(Value_nameContext.class);
		}
		public Value_nameContext value_name(int i) {
			return getRuleContext(Value_nameContext.class,i);
		}
		public TerminalNode KW_SUPPORTS() { return getToken(IDLParser.KW_SUPPORTS, 0); }
		public List<Interface_nameContext> interface_name() {
			return getRuleContexts(Interface_nameContext.class);
		}
		public Interface_nameContext interface_name(int i) {
			return getRuleContext(Interface_nameContext.class,i);
		}
		public TerminalNode KW_TRUNCATABLE() { return getToken(IDLParser.KW_TRUNCATABLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Value_inheritance_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_inheritance_spec; }
	}

	public final Value_inheritance_specContext value_inheritance_spec() throws RecognitionException {
		Value_inheritance_specContext _localctx = new Value_inheritance_specContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value_inheritance_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(510);
				match(COLON);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_TRUNCATABLE) {
					{
					setState(511);
					match(KW_TRUNCATABLE);
					}
				}

				setState(514);
				value_name();
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(515);
					match(COMMA);
					setState(516);
					value_name();
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SUPPORTS) {
				{
				setState(524);
				match(KW_SUPPORTS);
				setState(525);
				interface_name();
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(526);
					match(COMMA);
					setState(527);
					interface_name();
					}
					}
					setState(532);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_nameContext extends ParserRuleContext {
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public Value_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_name; }
	}

	public final Value_nameContext value_name() throws RecognitionException {
		Value_nameContext _localctx = new Value_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			a_scoped_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_elementContext extends ParserRuleContext {
		public Export_Context export_() {
			return getRuleContext(Export_Context.class,0);
		}
		public State_memberContext state_member() {
			return getRuleContext(State_memberContext.class,0);
		}
		public Init_declContext init_decl() {
			return getRuleContext(Init_declContext.class,0);
		}
		public Value_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_element; }
	}

	public final Value_elementContext value_element() throws RecognitionException {
		Value_elementContext _localctx = new Value_elementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(537);
				export_();
				}
				break;
			case 2:
				{
				setState(538);
				state_member();
				}
				break;
			case 3:
				{
				setState(539);
				init_decl();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class State_memberContext extends ParserRuleContext {
		public List<AnnappsContext> annapps() {
			return getRuleContexts(AnnappsContext.class);
		}
		public AnnappsContext annapps(int i) {
			return getRuleContext(AnnappsContext.class,i);
		}
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public DeclaratorsContext declarators() {
			return getRuleContext(DeclaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public TerminalNode KW_PUBLIC() { return getToken(IDLParser.KW_PUBLIC, 0); }
		public TerminalNode KW_PRIVATE() { return getToken(IDLParser.KW_PRIVATE, 0); }
		public State_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_member; }
	}

	public final State_memberContext state_member() throws RecognitionException {
		State_memberContext _localctx = new State_memberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_state_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			annapps();
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PUBLIC:
				{
				setState(543);
				match(KW_PUBLIC);
				setState(544);
				annapps();
				}
				break;
			case KW_PRIVATE:
				{
				setState(545);
				match(KW_PRIVATE);
				setState(546);
				annapps();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(549);
			type_spec();
			setState(550);
			declarators();
			setState(551);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public TerminalNode KW_FACTORY() { return getToken(IDLParser.KW_FACTORY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public Init_param_declsContext init_param_decls() {
			return getRuleContext(Init_param_declsContext.class,0);
		}
		public Raises_exprContext raises_expr() {
			return getRuleContext(Raises_exprContext.class,0);
		}
		public Init_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_decl; }
	}

	public final Init_declContext init_decl() throws RecognitionException {
		Init_declContext _localctx = new Init_declContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_init_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			annapps();
			setState(554);
			match(KW_FACTORY);
			setState(555);
			identifier();
			setState(556);
			match(LEFT_BRACKET);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==KW_IN) {
				{
				setState(557);
				init_param_decls();
				}
			}

			setState(560);
			match(RIGHT_BRACKET);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RAISES) {
				{
				setState(561);
				raises_expr();
				}
			}

			setState(564);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_param_declsContext extends ParserRuleContext {
		public List<Init_param_declContext> init_param_decl() {
			return getRuleContexts(Init_param_declContext.class);
		}
		public Init_param_declContext init_param_decl(int i) {
			return getRuleContext(Init_param_declContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Init_param_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_param_decls; }
	}

	public final Init_param_declsContext init_param_decls() throws RecognitionException {
		Init_param_declsContext _localctx = new Init_param_declsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_init_param_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			init_param_decl();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(567);
				match(COMMA);
				setState(568);
				init_param_decl();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_param_declContext extends ParserRuleContext {
		public List<AnnappsContext> annapps() {
			return getRuleContexts(AnnappsContext.class);
		}
		public AnnappsContext annapps(int i) {
			return getRuleContext(AnnappsContext.class,i);
		}
		public Init_param_attributeContext init_param_attribute() {
			return getRuleContext(Init_param_attributeContext.class,0);
		}
		public Param_type_specContext param_type_spec() {
			return getRuleContext(Param_type_specContext.class,0);
		}
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public Init_param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_param_decl; }
	}

	public final Init_param_declContext init_param_decl() throws RecognitionException {
		Init_param_declContext _localctx = new Init_param_declContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_init_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			annapps();
			setState(575);
			init_param_attribute();
			setState(576);
			annapps();
			setState(577);
			param_type_spec();
			setState(578);
			annapps();
			setState(579);
			simple_declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_param_attributeContext extends ParserRuleContext {
		public TerminalNode KW_IN() { return getToken(IDLParser.KW_IN, 0); }
		public Init_param_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_param_attribute; }
	}

	public final Init_param_attributeContext init_param_attribute() throws RecognitionException {
		Init_param_attributeContext _localctx = new Init_param_attributeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_init_param_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(KW_IN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode KW_CONST() { return getToken(IDLParser.KW_CONST, 0); }
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(IDLParser.EQUAL, 0); }
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_const_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(KW_CONST);
			setState(584);
			const_type();
			setState(585);
			identifier();
			setState(586);
			match(EQUAL);
			setState(587);
			const_exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_typeContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Char_typeContext char_type() {
			return getRuleContext(Char_typeContext.class,0);
		}
		public Wide_char_typeContext wide_char_type() {
			return getRuleContext(Wide_char_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public Floating_pt_typeContext floating_pt_type() {
			return getRuleContext(Floating_pt_typeContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Wide_string_typeContext wide_string_type() {
			return getRuleContext(Wide_string_typeContext.class,0);
		}
		public Fixed_pt_const_typeContext fixed_pt_const_type() {
			return getRuleContext(Fixed_pt_const_typeContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Octet_typeContext octet_type() {
			return getRuleContext(Octet_typeContext.class,0);
		}
		public Const_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_type; }
	}

	public final Const_typeContext const_type() throws RecognitionException {
		Const_typeContext _localctx = new Const_typeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_const_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			annapps();
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(590);
				integer_type();
				}
				break;
			case 2:
				{
				setState(591);
				char_type();
				}
				break;
			case 3:
				{
				setState(592);
				wide_char_type();
				}
				break;
			case 4:
				{
				setState(593);
				boolean_type();
				}
				break;
			case 5:
				{
				setState(594);
				floating_pt_type();
				}
				break;
			case 6:
				{
				setState(595);
				string_type();
				}
				break;
			case 7:
				{
				setState(596);
				wide_string_type();
				}
				break;
			case 8:
				{
				setState(597);
				fixed_pt_const_type();
				}
				break;
			case 9:
				{
				setState(598);
				scoped_name();
				}
				break;
			case 10:
				{
				setState(599);
				octet_type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_expContext extends ParserRuleContext {
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public Const_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_exp; }
	}

	public final Const_expContext const_exp() throws RecognitionException {
		Const_expContext _localctx = new Const_expContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_const_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			or_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_exprContext extends ParserRuleContext {
		public List<Xor_exprContext> xor_expr() {
			return getRuleContexts(Xor_exprContext.class);
		}
		public Xor_exprContext xor_expr(int i) {
			return getRuleContext(Xor_exprContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(IDLParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(IDLParser.PIPE, i);
		}
		public Or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expr; }
	}

	public final Or_exprContext or_expr() throws RecognitionException {
		Or_exprContext _localctx = new Or_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_or_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			xor_expr();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(605);
				match(PIPE);
				setState(606);
				xor_expr();
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xor_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(IDLParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(IDLParser.CARET, i);
		}
		public Xor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expr; }
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			and_expr();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(613);
				match(CARET);
				setState(614);
				and_expr();
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_exprContext extends ParserRuleContext {
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public List<TerminalNode> AMPERSAND() { return getTokens(IDLParser.AMPERSAND); }
		public TerminalNode AMPERSAND(int i) {
			return getToken(IDLParser.AMPERSAND, i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			shift_expr();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMPERSAND) {
				{
				{
				setState(621);
				match(AMPERSAND);
				setState(622);
				shift_expr();
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_exprContext extends ParserRuleContext {
		public List<Add_exprContext> add_expr() {
			return getRuleContexts(Add_exprContext.class);
		}
		public Add_exprContext add_expr(int i) {
			return getRuleContext(Add_exprContext.class,i);
		}
		public List<TerminalNode> RIGHT_SHIFT() { return getTokens(IDLParser.RIGHT_SHIFT); }
		public TerminalNode RIGHT_SHIFT(int i) {
			return getToken(IDLParser.RIGHT_SHIFT, i);
		}
		public List<TerminalNode> LEFT_SHIFT() { return getTokens(IDLParser.LEFT_SHIFT); }
		public TerminalNode LEFT_SHIFT(int i) {
			return getToken(IDLParser.LEFT_SHIFT, i);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			add_expr();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RIGHT_SHIFT || _la==LEFT_SHIFT) {
				{
				{
				setState(629);
				_la = _input.LA(1);
				if ( !(_la==RIGHT_SHIFT || _la==LEFT_SHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(630);
				add_expr();
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_exprContext extends ParserRuleContext {
		public List<Mult_exprContext> mult_expr() {
			return getRuleContexts(Mult_exprContext.class);
		}
		public Mult_exprContext mult_expr(int i) {
			return getRuleContext(Mult_exprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(IDLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(IDLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(IDLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(IDLParser.MINUS, i);
		}
		public Add_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expr; }
	}

	public final Add_exprContext add_expr() throws RecognitionException {
		Add_exprContext _localctx = new Add_exprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_add_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			mult_expr();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(637);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(638);
				mult_expr();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mult_exprContext extends ParserRuleContext {
		public List<Unary_exprContext> unary_expr() {
			return getRuleContexts(Unary_exprContext.class);
		}
		public Unary_exprContext unary_expr(int i) {
			return getRuleContext(Unary_exprContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(IDLParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(IDLParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(IDLParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(IDLParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(IDLParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(IDLParser.PERCENT, i);
		}
		public Mult_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_expr; }
	}

	public final Mult_exprContext mult_expr() throws RecognitionException {
		Mult_exprContext _localctx = new Mult_exprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mult_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			unary_expr();
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0)) {
				{
				{
				setState(645);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(646);
				unary_expr();
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_exprContext extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Primary_exprContext primary_expr() {
			return getRuleContext(Primary_exprContext.class,0);
		}
		public Unary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr; }
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unary_expr);
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TILDE:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				unary_operator();
				setState(653);
				primary_expr();
				}
				break;
			case INTEGER_LITERAL:
			case OCTAL_LITERAL:
			case HEX_LITERAL:
			case FLOATING_PT_LITERAL:
			case FIXED_PT_LITERAL:
			case WIDE_CHARACTER_LITERAL:
			case CHARACTER_LITERAL:
			case WIDE_STRING_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case LEFT_BRACKET:
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				primary_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(IDLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(IDLParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(IDLParser.TILDE, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TILDE) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_exprContext extends ParserRuleContext {
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public Primary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expr; }
	}

	public final Primary_exprContext primary_expr() throws RecognitionException {
		Primary_exprContext _localctx = new Primary_exprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_primary_expr);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				scoped_name();
				}
				break;
			case INTEGER_LITERAL:
			case OCTAL_LITERAL:
			case HEX_LITERAL:
			case FLOATING_PT_LITERAL:
			case FIXED_PT_LITERAL:
			case WIDE_CHARACTER_LITERAL:
			case CHARACTER_LITERAL:
			case WIDE_STRING_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				literal();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
				match(LEFT_BRACKET);
				setState(663);
				const_exp();
				setState(664);
				match(RIGHT_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(IDLParser.HEX_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(IDLParser.INTEGER_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(IDLParser.OCTAL_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(IDLParser.STRING_LITERAL, 0); }
		public TerminalNode WIDE_STRING_LITERAL() { return getToken(IDLParser.WIDE_STRING_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(IDLParser.CHARACTER_LITERAL, 0); }
		public TerminalNode WIDE_CHARACTER_LITERAL() { return getToken(IDLParser.WIDE_CHARACTER_LITERAL, 0); }
		public TerminalNode FIXED_PT_LITERAL() { return getToken(IDLParser.FIXED_PT_LITERAL, 0); }
		public TerminalNode FLOATING_PT_LITERAL() { return getToken(IDLParser.FLOATING_PT_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(IDLParser.BOOLEAN_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << OCTAL_LITERAL) | (1L << HEX_LITERAL) | (1L << FLOATING_PT_LITERAL) | (1L << FIXED_PT_LITERAL) | (1L << WIDE_CHARACTER_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << WIDE_STRING_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Positive_int_constContext extends ParserRuleContext {
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public Positive_int_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positive_int_const; }
	}

	public final Positive_int_constContext positive_int_const() throws RecognitionException {
		Positive_int_constContext _localctx = new Positive_int_constContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_positive_int_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			const_exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declContext extends ParserRuleContext {
		public TerminalNode KW_TYPEDEF() { return getToken(IDLParser.KW_TYPEDEF, 0); }
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Type_declaratorContext type_declarator() {
			return getRuleContext(Type_declaratorContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public Union_typeContext union_type() {
			return getRuleContext(Union_typeContext.class,0);
		}
		public Enum_typeContext enum_type() {
			return getRuleContext(Enum_typeContext.class,0);
		}
		public Bitset_typeContext bitset_type() {
			return getRuleContext(Bitset_typeContext.class,0);
		}
		public Bitmask_typeContext bitmask_type() {
			return getRuleContext(Bitmask_typeContext.class,0);
		}
		public TerminalNode KW_NATIVE() { return getToken(IDLParser.KW_NATIVE, 0); }
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public Constr_forward_declContext constr_forward_decl() {
			return getRuleContext(Constr_forward_declContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type_decl);
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				match(KW_TYPEDEF);
				setState(673);
				annapps();
				setState(674);
				type_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				struct_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				union_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				enum_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				bitset_type();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(680);
				bitmask_type();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(681);
				match(KW_NATIVE);
				setState(682);
				annapps();
				setState(683);
				simple_declarator();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(685);
				constr_forward_decl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declaratorContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public DeclaratorsContext declarators() {
			return getRuleContext(DeclaratorsContext.class,0);
		}
		public Type_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declarator; }
	}

	public final Type_declaratorContext type_declarator() throws RecognitionException {
		Type_declaratorContext _localctx = new Type_declaratorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_type_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			type_spec();
			setState(689);
			declarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specContext extends ParserRuleContext {
		public Simple_type_specContext simple_type_spec() {
			return getRuleContext(Simple_type_specContext.class,0);
		}
		public Constr_type_specContext constr_type_spec() {
			return getRuleContext(Constr_type_specContext.class,0);
		}
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_type_spec);
		try {
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
			case KW_STRING:
			case KW_OCTET:
			case KW_SEQUENCE:
			case KW_WCHAR:
			case KW_SHORT:
			case KW_LONG:
			case KW_WSTRING:
			case KW_VALUEBASE:
			case KW_OBJECT:
			case KW_UNSIGNED:
			case KW_FIXED:
			case KW_ANY:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_BOOLEAN:
			case KW_DOUBLE:
			case KW_SET:
			case KW_MAP:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				simple_type_spec();
				}
				break;
			case KW_STRUCT:
			case KW_ENUM:
			case KW_UNION:
			case KW_BITSET:
			case KW_BITMASK:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				constr_type_spec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_type_specContext extends ParserRuleContext {
		public Base_type_specContext base_type_spec() {
			return getRuleContext(Base_type_specContext.class,0);
		}
		public Template_type_specContext template_type_spec() {
			return getRuleContext(Template_type_specContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Simple_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type_spec; }
	}

	public final Simple_type_specContext simple_type_spec() throws RecognitionException {
		Simple_type_specContext _localctx = new Simple_type_specContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_simple_type_spec);
		try {
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_OCTET:
			case KW_WCHAR:
			case KW_SHORT:
			case KW_LONG:
			case KW_VALUEBASE:
			case KW_OBJECT:
			case KW_UNSIGNED:
			case KW_ANY:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_BOOLEAN:
			case KW_DOUBLE:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				base_type_spec();
				}
				break;
			case KW_STRING:
			case KW_SEQUENCE:
			case KW_WSTRING:
			case KW_FIXED:
			case KW_SET:
			case KW_MAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				template_type_spec();
				}
				break;
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				scoped_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitfield_type_specContext extends ParserRuleContext {
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public Octet_typeContext octet_type() {
			return getRuleContext(Octet_typeContext.class,0);
		}
		public Bitfield_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitfield_type_spec; }
	}

	public final Bitfield_type_specContext bitfield_type_spec() throws RecognitionException {
		Bitfield_type_specContext _localctx = new Bitfield_type_specContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_bitfield_type_spec);
		try {
			setState(703);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SHORT:
			case KW_LONG:
			case KW_UNSIGNED:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				integer_type();
				}
				break;
			case KW_BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				boolean_type();
				}
				break;
			case KW_OCTET:
				enterOuterAlt(_localctx, 3);
				{
				setState(702);
				octet_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_type_specContext extends ParserRuleContext {
		public Floating_pt_typeContext floating_pt_type() {
			return getRuleContext(Floating_pt_typeContext.class,0);
		}
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Char_typeContext char_type() {
			return getRuleContext(Char_typeContext.class,0);
		}
		public Wide_char_typeContext wide_char_type() {
			return getRuleContext(Wide_char_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public Octet_typeContext octet_type() {
			return getRuleContext(Octet_typeContext.class,0);
		}
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public Object_typeContext object_type() {
			return getRuleContext(Object_typeContext.class,0);
		}
		public Value_base_typeContext value_base_type() {
			return getRuleContext(Value_base_typeContext.class,0);
		}
		public Base_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type_spec; }
	}

	public final Base_type_specContext base_type_spec() throws RecognitionException {
		Base_type_specContext _localctx = new Base_type_specContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_base_type_spec);
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				floating_pt_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				integer_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				char_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(708);
				wide_char_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(709);
				boolean_type();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(710);
				octet_type();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(711);
				any_type();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(712);
				object_type();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(713);
				value_base_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_type_specContext extends ParserRuleContext {
		public Sequence_typeContext sequence_type() {
			return getRuleContext(Sequence_typeContext.class,0);
		}
		public Set_typeContext set_type() {
			return getRuleContext(Set_typeContext.class,0);
		}
		public Map_typeContext map_type() {
			return getRuleContext(Map_typeContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Wide_string_typeContext wide_string_type() {
			return getRuleContext(Wide_string_typeContext.class,0);
		}
		public Fixed_pt_typeContext fixed_pt_type() {
			return getRuleContext(Fixed_pt_typeContext.class,0);
		}
		public Template_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_type_spec; }
	}

	public final Template_type_specContext template_type_spec() throws RecognitionException {
		Template_type_specContext _localctx = new Template_type_specContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_template_type_spec);
		try {
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SEQUENCE:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				sequence_type();
				}
				break;
			case KW_SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				set_type();
				}
				break;
			case KW_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(718);
				map_type();
				}
				break;
			case KW_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(719);
				string_type();
				}
				break;
			case KW_WSTRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(720);
				wide_string_type();
				}
				break;
			case KW_FIXED:
				enterOuterAlt(_localctx, 6);
				{
				setState(721);
				fixed_pt_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constr_type_specContext extends ParserRuleContext {
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public Union_typeContext union_type() {
			return getRuleContext(Union_typeContext.class,0);
		}
		public Enum_typeContext enum_type() {
			return getRuleContext(Enum_typeContext.class,0);
		}
		public Bitset_typeContext bitset_type() {
			return getRuleContext(Bitset_typeContext.class,0);
		}
		public Bitmask_typeContext bitmask_type() {
			return getRuleContext(Bitmask_typeContext.class,0);
		}
		public Constr_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_type_spec; }
	}

	public final Constr_type_specContext constr_type_spec() throws RecognitionException {
		Constr_type_specContext _localctx = new Constr_type_specContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constr_type_spec);
		try {
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				struct_type();
				}
				break;
			case KW_UNION:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				union_type();
				}
				break;
			case KW_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				enum_type();
				}
				break;
			case KW_BITSET:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				bitset_type();
				}
				break;
			case KW_BITMASK:
				enterOuterAlt(_localctx, 5);
				{
				setState(728);
				bitmask_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declaratorsContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Simple_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declarators; }
	}

	public final Simple_declaratorsContext simple_declarators() throws RecognitionException {
		Simple_declaratorsContext _localctx = new Simple_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_simple_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			identifier();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(732);
				match(COMMA);
				setState(733);
				identifier();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorsContext extends ParserRuleContext {
		public List<DeclaratorContext> declarator() {
			return getRuleContexts(DeclaratorContext.class);
		}
		public DeclaratorContext declarator(int i) {
			return getRuleContext(DeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public DeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarators; }
	}

	public final DeclaratorsContext declarators() throws RecognitionException {
		DeclaratorsContext _localctx = new DeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			declarator();
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(740);
				match(COMMA);
				setState(741);
				declarator();
				}
				}
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public Complex_declaratorContext complex_declarator() {
			return getRuleContext(Complex_declaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			annapps();
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(748);
				simple_declarator();
				}
				break;
			case 2:
				{
				setState(749);
				complex_declarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public Simple_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declarator; }
	}

	public final Simple_declaratorContext simple_declarator() throws RecognitionException {
		Simple_declaratorContext _localctx = new Simple_declaratorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_simple_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complex_declaratorContext extends ParserRuleContext {
		public Array_declaratorContext array_declarator() {
			return getRuleContext(Array_declaratorContext.class,0);
		}
		public Complex_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_declarator; }
	}

	public final Complex_declaratorContext complex_declarator() throws RecognitionException {
		Complex_declaratorContext _localctx = new Complex_declaratorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_complex_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			array_declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Floating_pt_typeContext extends ParserRuleContext {
		public TerminalNode KW_FLOAT() { return getToken(IDLParser.KW_FLOAT, 0); }
		public TerminalNode KW_DOUBLE() { return getToken(IDLParser.KW_DOUBLE, 0); }
		public TerminalNode KW_LONG() { return getToken(IDLParser.KW_LONG, 0); }
		public Floating_pt_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_pt_type; }
	}

	public final Floating_pt_typeContext floating_pt_type() throws RecognitionException {
		Floating_pt_typeContext _localctx = new Floating_pt_typeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_floating_pt_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FLOAT:
				{
				setState(756);
				match(KW_FLOAT);
				}
				break;
			case KW_DOUBLE:
				{
				setState(757);
				match(KW_DOUBLE);
				}
				break;
			case KW_LONG:
				{
				setState(758);
				match(KW_LONG);
				setState(759);
				match(KW_DOUBLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_typeContext extends ParserRuleContext {
		public Signed_intContext signed_int() {
			return getRuleContext(Signed_intContext.class,0);
		}
		public Unsigned_intContext unsigned_int() {
			return getRuleContext(Unsigned_intContext.class,0);
		}
		public Integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_type; }
	}

	public final Integer_typeContext integer_type() throws RecognitionException {
		Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_integer_type);
		try {
			setState(764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SHORT:
			case KW_LONG:
			case KW_INT8:
			case KW_INT16:
			case KW_INT32:
			case KW_INT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				signed_int();
				}
				break;
			case KW_UNSIGNED:
			case KW_UINT8:
			case KW_UINT16:
			case KW_UINT32:
			case KW_UINT64:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				unsigned_int();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_intContext extends ParserRuleContext {
		public Signed_short_intContext signed_short_int() {
			return getRuleContext(Signed_short_intContext.class,0);
		}
		public Signed_long_intContext signed_long_int() {
			return getRuleContext(Signed_long_intContext.class,0);
		}
		public Signed_longlong_intContext signed_longlong_int() {
			return getRuleContext(Signed_longlong_intContext.class,0);
		}
		public Signed_tiny_intContext signed_tiny_int() {
			return getRuleContext(Signed_tiny_intContext.class,0);
		}
		public Signed_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_int; }
	}

	public final Signed_intContext signed_int() throws RecognitionException {
		Signed_intContext _localctx = new Signed_intContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_signed_int);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				signed_short_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				signed_long_int();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				signed_longlong_int();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(769);
				signed_tiny_int();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_tiny_intContext extends ParserRuleContext {
		public TerminalNode KW_INT8() { return getToken(IDLParser.KW_INT8, 0); }
		public Signed_tiny_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_tiny_int; }
	}

	public final Signed_tiny_intContext signed_tiny_int() throws RecognitionException {
		Signed_tiny_intContext _localctx = new Signed_tiny_intContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_signed_tiny_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(KW_INT8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_short_intContext extends ParserRuleContext {
		public TerminalNode KW_SHORT() { return getToken(IDLParser.KW_SHORT, 0); }
		public TerminalNode KW_INT16() { return getToken(IDLParser.KW_INT16, 0); }
		public Signed_short_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_short_int; }
	}

	public final Signed_short_intContext signed_short_int() throws RecognitionException {
		Signed_short_intContext _localctx = new Signed_short_intContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_signed_short_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			_la = _input.LA(1);
			if ( !(_la==KW_SHORT || _la==KW_INT16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_long_intContext extends ParserRuleContext {
		public TerminalNode KW_LONG() { return getToken(IDLParser.KW_LONG, 0); }
		public TerminalNode KW_INT32() { return getToken(IDLParser.KW_INT32, 0); }
		public Signed_long_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_long_int; }
	}

	public final Signed_long_intContext signed_long_int() throws RecognitionException {
		Signed_long_intContext _localctx = new Signed_long_intContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_signed_long_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			_la = _input.LA(1);
			if ( !(_la==KW_LONG || _la==KW_INT32) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_longlong_intContext extends ParserRuleContext {
		public List<TerminalNode> KW_LONG() { return getTokens(IDLParser.KW_LONG); }
		public TerminalNode KW_LONG(int i) {
			return getToken(IDLParser.KW_LONG, i);
		}
		public TerminalNode KW_INT64() { return getToken(IDLParser.KW_INT64, 0); }
		public Signed_longlong_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_longlong_int; }
	}

	public final Signed_longlong_intContext signed_longlong_int() throws RecognitionException {
		Signed_longlong_intContext _localctx = new Signed_longlong_intContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_signed_longlong_int);
		try {
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				match(KW_LONG);
				setState(779);
				match(KW_LONG);
				}
				break;
			case KW_INT64:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(KW_INT64);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_intContext extends ParserRuleContext {
		public Unsigned_short_intContext unsigned_short_int() {
			return getRuleContext(Unsigned_short_intContext.class,0);
		}
		public Unsigned_long_intContext unsigned_long_int() {
			return getRuleContext(Unsigned_long_intContext.class,0);
		}
		public Unsigned_longlong_intContext unsigned_longlong_int() {
			return getRuleContext(Unsigned_longlong_intContext.class,0);
		}
		public Unsigned_tiny_intContext unsigned_tiny_int() {
			return getRuleContext(Unsigned_tiny_intContext.class,0);
		}
		public Unsigned_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_int; }
	}

	public final Unsigned_intContext unsigned_int() throws RecognitionException {
		Unsigned_intContext _localctx = new Unsigned_intContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unsigned_int);
		try {
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				unsigned_short_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				unsigned_long_int();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				unsigned_longlong_int();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(786);
				unsigned_tiny_int();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_tiny_intContext extends ParserRuleContext {
		public TerminalNode KW_UINT8() { return getToken(IDLParser.KW_UINT8, 0); }
		public Unsigned_tiny_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_tiny_int; }
	}

	public final Unsigned_tiny_intContext unsigned_tiny_int() throws RecognitionException {
		Unsigned_tiny_intContext _localctx = new Unsigned_tiny_intContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unsigned_tiny_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(KW_UINT8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_short_intContext extends ParserRuleContext {
		public TerminalNode KW_UNSIGNED() { return getToken(IDLParser.KW_UNSIGNED, 0); }
		public TerminalNode KW_SHORT() { return getToken(IDLParser.KW_SHORT, 0); }
		public TerminalNode KW_UINT16() { return getToken(IDLParser.KW_UINT16, 0); }
		public Unsigned_short_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_short_int; }
	}

	public final Unsigned_short_intContext unsigned_short_int() throws RecognitionException {
		Unsigned_short_intContext _localctx = new Unsigned_short_intContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unsigned_short_int);
		try {
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_UNSIGNED:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(KW_UNSIGNED);
				setState(792);
				match(KW_SHORT);
				}
				break;
			case KW_UINT16:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				match(KW_UINT16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_long_intContext extends ParserRuleContext {
		public TerminalNode KW_UNSIGNED() { return getToken(IDLParser.KW_UNSIGNED, 0); }
		public TerminalNode KW_LONG() { return getToken(IDLParser.KW_LONG, 0); }
		public TerminalNode KW_UINT32() { return getToken(IDLParser.KW_UINT32, 0); }
		public Unsigned_long_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_long_int; }
	}

	public final Unsigned_long_intContext unsigned_long_int() throws RecognitionException {
		Unsigned_long_intContext _localctx = new Unsigned_long_intContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unsigned_long_int);
		try {
			setState(799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_UNSIGNED:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				match(KW_UNSIGNED);
				setState(797);
				match(KW_LONG);
				}
				break;
			case KW_UINT32:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				match(KW_UINT32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_longlong_intContext extends ParserRuleContext {
		public TerminalNode KW_UNSIGNED() { return getToken(IDLParser.KW_UNSIGNED, 0); }
		public List<TerminalNode> KW_LONG() { return getTokens(IDLParser.KW_LONG); }
		public TerminalNode KW_LONG(int i) {
			return getToken(IDLParser.KW_LONG, i);
		}
		public TerminalNode KW_UINT64() { return getToken(IDLParser.KW_UINT64, 0); }
		public Unsigned_longlong_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_longlong_int; }
	}

	public final Unsigned_longlong_intContext unsigned_longlong_int() throws RecognitionException {
		Unsigned_longlong_intContext _localctx = new Unsigned_longlong_intContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unsigned_longlong_int);
		try {
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_UNSIGNED:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				match(KW_UNSIGNED);
				setState(802);
				match(KW_LONG);
				setState(803);
				match(KW_LONG);
				}
				break;
			case KW_UINT64:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				match(KW_UINT64);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_typeContext extends ParserRuleContext {
		public TerminalNode KW_CHAR() { return getToken(IDLParser.KW_CHAR, 0); }
		public Char_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_type; }
	}

	public final Char_typeContext char_type() throws RecognitionException {
		Char_typeContext _localctx = new Char_typeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_char_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(KW_CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wide_char_typeContext extends ParserRuleContext {
		public TerminalNode KW_WCHAR() { return getToken(IDLParser.KW_WCHAR, 0); }
		public Wide_char_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wide_char_type; }
	}

	public final Wide_char_typeContext wide_char_type() throws RecognitionException {
		Wide_char_typeContext _localctx = new Wide_char_typeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_wide_char_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(KW_WCHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_typeContext extends ParserRuleContext {
		public TerminalNode KW_BOOLEAN() { return getToken(IDLParser.KW_BOOLEAN, 0); }
		public Boolean_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_type; }
	}

	public final Boolean_typeContext boolean_type() throws RecognitionException {
		Boolean_typeContext _localctx = new Boolean_typeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_boolean_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(KW_BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Octet_typeContext extends ParserRuleContext {
		public TerminalNode KW_OCTET() { return getToken(IDLParser.KW_OCTET, 0); }
		public Octet_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octet_type; }
	}

	public final Octet_typeContext octet_type() throws RecognitionException {
		Octet_typeContext _localctx = new Octet_typeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_octet_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(KW_OCTET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_typeContext extends ParserRuleContext {
		public TerminalNode KW_ANY() { return getToken(IDLParser.KW_ANY, 0); }
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_any_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(KW_ANY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_typeContext extends ParserRuleContext {
		public TerminalNode KW_OBJECT() { return getToken(IDLParser.KW_OBJECT, 0); }
		public Object_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_type; }
	}

	public final Object_typeContext object_type() throws RecognitionException {
		Object_typeContext _localctx = new Object_typeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_object_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(KW_OBJECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_declContext extends ParserRuleContext {
		public Annotation_defContext annotation_def() {
			return getRuleContext(Annotation_defContext.class,0);
		}
		public Annotation_forward_dclContext annotation_forward_dcl() {
			return getRuleContext(Annotation_forward_dclContext.class,0);
		}
		public Annotation_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_decl; }
	}

	public final Annotation_declContext annotation_decl() throws RecognitionException {
		Annotation_declContext _localctx = new Annotation_declContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_annotation_decl);
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				annotation_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				annotation_forward_dcl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_defContext extends ParserRuleContext {
		public Annotation_headerContext annotation_header() {
			return getRuleContext(Annotation_headerContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public Annotation_bodyContext annotation_body() {
			return getRuleContext(Annotation_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public Annotation_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_def; }
	}

	public final Annotation_defContext annotation_def() throws RecognitionException {
		Annotation_defContext _localctx = new Annotation_defContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_annotation_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			annotation_header();
			setState(824);
			match(LEFT_BRACE);
			setState(825);
			annotation_body();
			setState(826);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_headerContext extends ParserRuleContext {
		public TerminalNode KW_AT_ANNOTATION() { return getToken(IDLParser.KW_AT_ANNOTATION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Annotation_inheritance_specContext annotation_inheritance_spec() {
			return getRuleContext(Annotation_inheritance_specContext.class,0);
		}
		public Annotation_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_header; }
	}

	public final Annotation_headerContext annotation_header() throws RecognitionException {
		Annotation_headerContext _localctx = new Annotation_headerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_annotation_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(KW_AT_ANNOTATION);
			setState(829);
			identifier();
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(830);
				annotation_inheritance_spec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_inheritance_specContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Annotation_inheritance_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_inheritance_spec; }
	}

	public final Annotation_inheritance_specContext annotation_inheritance_spec() throws RecognitionException {
		Annotation_inheritance_specContext _localctx = new Annotation_inheritance_specContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_annotation_inheritance_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(COLON);
			setState(834);
			scoped_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_bodyContext extends ParserRuleContext {
		public List<Annotation_memberContext> annotation_member() {
			return getRuleContexts(Annotation_memberContext.class);
		}
		public Annotation_memberContext annotation_member(int i) {
			return getRuleContext(Annotation_memberContext.class,i);
		}
		public List<Enum_typeContext> enum_type() {
			return getRuleContexts(Enum_typeContext.class);
		}
		public Enum_typeContext enum_type(int i) {
			return getRuleContext(Enum_typeContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(IDLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(IDLParser.SEMICOLON, i);
		}
		public List<Const_declContext> const_decl() {
			return getRuleContexts(Const_declContext.class);
		}
		public Const_declContext const_decl(int i) {
			return getRuleContext(Const_declContext.class,i);
		}
		public List<TerminalNode> KW_TYPEDEF() { return getTokens(IDLParser.KW_TYPEDEF); }
		public TerminalNode KW_TYPEDEF(int i) {
			return getToken(IDLParser.KW_TYPEDEF, i);
		}
		public List<Type_declaratorContext> type_declarator() {
			return getRuleContexts(Type_declaratorContext.class);
		}
		public Type_declaratorContext type_declarator(int i) {
			return getRuleContext(Type_declaratorContext.class,i);
		}
		public Annotation_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_body; }
	}

	public final Annotation_bodyContext annotation_body() throws RecognitionException {
		Annotation_bodyContext _localctx = new Annotation_bodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_annotation_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_FIXED - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				setState(847);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOUBLE_COLON:
				case AT:
				case KW_STRING:
				case KW_OCTET:
				case KW_WCHAR:
				case KW_SHORT:
				case KW_LONG:
				case KW_WSTRING:
				case KW_UNSIGNED:
				case KW_FIXED:
				case KW_CHAR:
				case KW_FLOAT:
				case KW_BOOLEAN:
				case KW_DOUBLE:
				case KW_INT8:
				case KW_UINT8:
				case KW_INT16:
				case KW_UINT16:
				case KW_INT32:
				case KW_UINT32:
				case KW_INT64:
				case KW_UINT64:
				case ID:
					{
					setState(836);
					annotation_member();
					}
					break;
				case KW_ENUM:
					{
					setState(837);
					enum_type();
					setState(838);
					match(SEMICOLON);
					}
					break;
				case KW_CONST:
					{
					setState(840);
					const_decl();
					setState(841);
					match(SEMICOLON);
					}
					break;
				case KW_TYPEDEF:
					{
					setState(843);
					match(KW_TYPEDEF);
					setState(844);
					type_declarator();
					setState(845);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_memberContext extends ParserRuleContext {
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(IDLParser.KW_DEFAULT, 0); }
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public Annotation_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_member; }
	}

	public final Annotation_memberContext annotation_member() throws RecognitionException {
		Annotation_memberContext _localctx = new Annotation_memberContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_annotation_member);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			const_type();
			setState(853);
			simple_declarator();
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEFAULT) {
				{
				setState(854);
				match(KW_DEFAULT);
				setState(855);
				const_exp();
				}
			}

			setState(858);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_forward_dclContext extends ParserRuleContext {
		public TerminalNode KW_AT_ANNOTATION() { return getToken(IDLParser.KW_AT_ANNOTATION, 0); }
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Annotation_forward_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_forward_dcl; }
	}

	public final Annotation_forward_dclContext annotation_forward_dcl() throws RecognitionException {
		Annotation_forward_dclContext _localctx = new Annotation_forward_dclContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_annotation_forward_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(KW_AT_ANNOTATION);
			setState(861);
			scoped_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitset_typeContext extends ParserRuleContext {
		public TerminalNode KW_BITSET() { return getToken(IDLParser.KW_BITSET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public BitfieldContext bitfield() {
			return getRuleContext(BitfieldContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Bitset_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitset_type; }
	}

	public final Bitset_typeContext bitset_type() throws RecognitionException {
		Bitset_typeContext _localctx = new Bitset_typeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_bitset_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(KW_BITSET);
			setState(864);
			identifier();
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(865);
				match(COLON);
				setState(866);
				scoped_name();
				}
			}

			setState(869);
			match(LEFT_BRACE);
			setState(870);
			bitfield();
			setState(871);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitfieldContext extends ParserRuleContext {
		public List<Bitfield_specContext> bitfield_spec() {
			return getRuleContexts(Bitfield_specContext.class);
		}
		public Bitfield_specContext bitfield_spec(int i) {
			return getRuleContext(Bitfield_specContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(IDLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(IDLParser.SEMICOLON, i);
		}
		public List<Simple_declaratorsContext> simple_declarators() {
			return getRuleContexts(Simple_declaratorsContext.class);
		}
		public Simple_declaratorsContext simple_declarators(int i) {
			return getRuleContext(Simple_declaratorsContext.class,i);
		}
		public BitfieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitfield; }
	}

	public final BitfieldContext bitfield() throws RecognitionException {
		BitfieldContext _localctx = new BitfieldContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_bitfield);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(873);
				bitfield_spec();
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==ID) {
					{
					setState(874);
					simple_declarators();
					}
				}

				setState(877);
				match(SEMICOLON);
				}
				}
				setState(881); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT || _la==KW_BITFIELD );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitfield_specContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public TerminalNode KW_BITFIELD() { return getToken(IDLParser.KW_BITFIELD, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(IDLParser.COMMA, 0); }
		public Bitfield_type_specContext bitfield_type_spec() {
			return getRuleContext(Bitfield_type_specContext.class,0);
		}
		public Bitfield_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitfield_spec; }
	}

	public final Bitfield_specContext bitfield_spec() throws RecognitionException {
		Bitfield_specContext _localctx = new Bitfield_specContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_bitfield_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			annapps();
			setState(884);
			match(KW_BITFIELD);
			setState(885);
			match(LEFT_ANG_BRACKET);
			setState(886);
			positive_int_const();
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(887);
				match(COMMA);
				setState(888);
				bitfield_type_spec();
				}
			}

			setState(891);
			match(RIGHT_ANG_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitmask_typeContext extends ParserRuleContext {
		public TerminalNode KW_BITMASK() { return getToken(IDLParser.KW_BITMASK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public Bit_valuesContext bit_values() {
			return getRuleContext(Bit_valuesContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public Bitmask_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitmask_type; }
	}

	public final Bitmask_typeContext bitmask_type() throws RecognitionException {
		Bitmask_typeContext _localctx = new Bitmask_typeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_bitmask_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(KW_BITMASK);
			setState(894);
			identifier();
			setState(895);
			match(LEFT_BRACE);
			setState(896);
			bit_values();
			setState(897);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_valuesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Bit_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_values; }
	}

	public final Bit_valuesContext bit_values() throws RecognitionException {
		Bit_valuesContext _localctx = new Bit_valuesContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_bit_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			identifier();
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(900);
				match(COMMA);
				setState(901);
				identifier();
				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_typeContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(IDLParser.KW_STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_struct_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(KW_STRUCT);
			setState(908);
			identifier();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(909);
				match(COLON);
				setState(910);
				scoped_name();
				}
			}

			setState(913);
			match(LEFT_BRACE);
			setState(914);
			member_list();
			setState(915);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_listContext extends ParserRuleContext {
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public Member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_list; }
	}

	public final Member_listContext member_list() throws RecognitionException {
		Member_listContext _localctx = new Member_listContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_member_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_OCTET) | (1L << KW_SEQUENCE) | (1L << KW_STRUCT) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_FIXED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_SET - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(917);
				member();
				}
				}
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public DeclaratorsContext declarators() {
			return getRuleContext(DeclaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			annapps();
			setState(924);
			type_spec();
			setState(925);
			declarators();
			setState(926);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_typeContext extends ParserRuleContext {
		public TerminalNode KW_UNION() { return getToken(IDLParser.KW_UNION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SWITCH() { return getToken(IDLParser.KW_SWITCH, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Switch_type_specContext switch_type_spec() {
			return getRuleContext(Switch_type_specContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public Switch_bodyContext switch_body() {
			return getRuleContext(Switch_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public Union_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_type; }
	}

	public final Union_typeContext union_type() throws RecognitionException {
		Union_typeContext _localctx = new Union_typeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_union_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(KW_UNION);
			setState(929);
			identifier();
			setState(930);
			match(KW_SWITCH);
			setState(931);
			match(LEFT_BRACKET);
			setState(932);
			annapps();
			setState(933);
			switch_type_spec();
			setState(934);
			match(RIGHT_BRACKET);
			setState(935);
			match(LEFT_BRACE);
			setState(936);
			switch_body();
			setState(937);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_type_specContext extends ParserRuleContext {
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Char_typeContext char_type() {
			return getRuleContext(Char_typeContext.class,0);
		}
		public Wide_char_typeContext wide_char_type() {
			return getRuleContext(Wide_char_typeContext.class,0);
		}
		public Octet_typeContext octet_type() {
			return getRuleContext(Octet_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public Enum_typeContext enum_type() {
			return getRuleContext(Enum_typeContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Switch_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_type_spec; }
	}

	public final Switch_type_specContext switch_type_spec() throws RecognitionException {
		Switch_type_specContext _localctx = new Switch_type_specContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_switch_type_spec);
		try {
			setState(946);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SHORT:
			case KW_LONG:
			case KW_UNSIGNED:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				integer_type();
				}
				break;
			case KW_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				char_type();
				}
				break;
			case KW_WCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(941);
				wide_char_type();
				}
				break;
			case KW_OCTET:
				enterOuterAlt(_localctx, 4);
				{
				setState(942);
				octet_type();
				}
				break;
			case KW_BOOLEAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(943);
				boolean_type();
				}
				break;
			case KW_ENUM:
				enterOuterAlt(_localctx, 6);
				{
				setState(944);
				enum_type();
				}
				break;
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(945);
				scoped_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_bodyContext extends ParserRuleContext {
		public List<Case_stmtContext> case_stmt() {
			return getRuleContexts(Case_stmtContext.class);
		}
		public Case_stmtContext case_stmt(int i) {
			return getRuleContext(Case_stmtContext.class,i);
		}
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_switch_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(948);
				case_stmt();
				}
				}
				setState(951); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (AT - 35)) | (1L << (KW_DEFAULT - 35)) | (1L << (KW_CASE - 35)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_stmtContext extends ParserRuleContext {
		public Element_specContext element_spec() {
			return getRuleContext(Element_specContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public List<Case_labelContext> case_label() {
			return getRuleContexts(Case_labelContext.class);
		}
		public Case_labelContext case_label(int i) {
			return getRuleContext(Case_labelContext.class,i);
		}
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_case_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(954); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(953);
					case_label();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(956); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(958);
			element_spec();
			setState(959);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_labelContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public TerminalNode KW_CASE() { return getToken(IDLParser.KW_CASE, 0); }
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(IDLParser.KW_DEFAULT, 0); }
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			annapps();
			setState(968);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CASE:
				{
				setState(962);
				match(KW_CASE);
				setState(963);
				const_exp();
				setState(964);
				match(COLON);
				}
				break;
			case KW_DEFAULT:
				{
				setState(966);
				match(KW_DEFAULT);
				setState(967);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_specContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Element_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_spec; }
	}

	public final Element_specContext element_spec() throws RecognitionException {
		Element_specContext _localctx = new Element_specContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_element_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			annapps();
			setState(971);
			type_spec();
			setState(972);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_typeContext extends ParserRuleContext {
		public TerminalNode KW_ENUM() { return getToken(IDLParser.KW_ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Enum_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_type; }
	}

	public final Enum_typeContext enum_type() throws RecognitionException {
		Enum_typeContext _localctx = new Enum_typeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enum_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(KW_ENUM);
			setState(975);
			identifier();
			setState(976);
			match(LEFT_BRACE);
			setState(977);
			enumerator();
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(978);
				match(COMMA);
				setState(979);
				enumerator();
				}
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(985);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sequence_typeContext extends ParserRuleContext {
		public TerminalNode KW_SEQUENCE() { return getToken(IDLParser.KW_SEQUENCE, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Simple_type_specContext simple_type_spec() {
			return getRuleContext(Simple_type_specContext.class,0);
		}
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(IDLParser.COMMA, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public Sequence_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_type; }
	}

	public final Sequence_typeContext sequence_type() throws RecognitionException {
		Sequence_typeContext _localctx = new Sequence_typeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_sequence_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(KW_SEQUENCE);
			setState(990);
			match(LEFT_ANG_BRACKET);
			setState(991);
			annapps();
			setState(992);
			simple_type_spec();
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(993);
				match(COMMA);
				setState(994);
				positive_int_const();
				}
			}

			setState(997);
			match(RIGHT_ANG_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_typeContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(IDLParser.KW_SET, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public Simple_type_specContext simple_type_spec() {
			return getRuleContext(Simple_type_specContext.class,0);
		}
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(IDLParser.COMMA, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public Set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_type; }
	}

	public final Set_typeContext set_type() throws RecognitionException {
		Set_typeContext _localctx = new Set_typeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_set_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			match(KW_SET);
			setState(1000);
			match(LEFT_ANG_BRACKET);
			setState(1001);
			simple_type_spec();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1002);
				match(COMMA);
				setState(1003);
				positive_int_const();
				}
			}

			setState(1006);
			match(RIGHT_ANG_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Map_typeContext extends ParserRuleContext {
		public TerminalNode KW_MAP() { return getToken(IDLParser.KW_MAP, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public List<Simple_type_specContext> simple_type_spec() {
			return getRuleContexts(Simple_type_specContext.class);
		}
		public Simple_type_specContext simple_type_spec(int i) {
			return getRuleContext(Simple_type_specContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public Map_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_type; }
	}

	public final Map_typeContext map_type() throws RecognitionException {
		Map_typeContext _localctx = new Map_typeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_map_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(KW_MAP);
			setState(1009);
			match(LEFT_ANG_BRACKET);
			setState(1010);
			simple_type_spec();
			setState(1011);
			match(COMMA);
			setState(1012);
			simple_type_spec();
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1013);
				match(COMMA);
				setState(1014);
				positive_int_const();
				}
			}

			setState(1017);
			match(RIGHT_ANG_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_typeContext extends ParserRuleContext {
		public TerminalNode KW_STRING() { return getToken(IDLParser.KW_STRING, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public String_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_type; }
	}

	public final String_typeContext string_type() throws RecognitionException {
		String_typeContext _localctx = new String_typeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_string_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(KW_STRING);
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_ANG_BRACKET) {
				{
				setState(1020);
				match(LEFT_ANG_BRACKET);
				setState(1021);
				positive_int_const();
				setState(1022);
				match(RIGHT_ANG_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wide_string_typeContext extends ParserRuleContext {
		public TerminalNode KW_WSTRING() { return getToken(IDLParser.KW_WSTRING, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public Wide_string_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wide_string_type; }
	}

	public final Wide_string_typeContext wide_string_type() throws RecognitionException {
		Wide_string_typeContext _localctx = new Wide_string_typeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_wide_string_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(KW_WSTRING);
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_ANG_BRACKET) {
				{
				setState(1027);
				match(LEFT_ANG_BRACKET);
				setState(1028);
				positive_int_const();
				setState(1029);
				match(RIGHT_ANG_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_declaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public List<Fixed_array_sizeContext> fixed_array_size() {
			return getRuleContexts(Fixed_array_sizeContext.class);
		}
		public Fixed_array_sizeContext fixed_array_size(int i) {
			return getRuleContext(Fixed_array_sizeContext.class,i);
		}
		public Array_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declarator; }
	}

	public final Array_declaratorContext array_declarator() throws RecognitionException {
		Array_declaratorContext _localctx = new Array_declaratorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_array_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(ID);
			setState(1035); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1034);
				fixed_array_size();
				}
				}
				setState(1037); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEFT_SQUARE_BRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_array_sizeContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(IDLParser.LEFT_SQUARE_BRACKET, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(IDLParser.RIGHT_SQUARE_BRACKET, 0); }
		public Fixed_array_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_array_size; }
	}

	public final Fixed_array_sizeContext fixed_array_size() throws RecognitionException {
		Fixed_array_sizeContext _localctx = new Fixed_array_sizeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_fixed_array_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(LEFT_SQUARE_BRACKET);
			setState(1040);
			positive_int_const();
			setState(1041);
			match(RIGHT_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_declContext extends ParserRuleContext {
		public Readonly_attr_specContext readonly_attr_spec() {
			return getRuleContext(Readonly_attr_specContext.class,0);
		}
		public Attr_specContext attr_spec() {
			return getRuleContext(Attr_specContext.class,0);
		}
		public Attr_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_decl; }
	}

	public final Attr_declContext attr_decl() throws RecognitionException {
		Attr_declContext _localctx = new Attr_declContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_attr_decl);
		try {
			setState(1045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_READONLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				readonly_attr_spec();
				}
				break;
			case KW_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				attr_spec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Except_declContext extends ParserRuleContext {
		public TerminalNode KW_EXCEPTION() { return getToken(IDLParser.KW_EXCEPTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public Except_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_decl; }
	}

	public final Except_declContext except_decl() throws RecognitionException {
		Except_declContext _localctx = new Except_declContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_except_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			match(KW_EXCEPTION);
			setState(1048);
			identifier();
			setState(1049);
			match(LEFT_BRACE);
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_OCTET) | (1L << KW_SEQUENCE) | (1L << KW_STRUCT) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_FIXED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_SET - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(1050);
				member();
				}
				}
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1056);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_declContext extends ParserRuleContext {
		public Op_type_specContext op_type_spec() {
			return getRuleContext(Op_type_specContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_declsContext parameter_decls() {
			return getRuleContext(Parameter_declsContext.class,0);
		}
		public Op_attributeContext op_attribute() {
			return getRuleContext(Op_attributeContext.class,0);
		}
		public Raises_exprContext raises_expr() {
			return getRuleContext(Raises_exprContext.class,0);
		}
		public Context_exprContext context_expr() {
			return getRuleContext(Context_exprContext.class,0);
		}
		public Op_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_decl; }
	}

	public final Op_declContext op_decl() throws RecognitionException {
		Op_declContext _localctx = new Op_declContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_op_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ONEWAY) {
				{
				setState(1058);
				op_attribute();
				}
			}

			setState(1061);
			op_type_spec();
			setState(1062);
			identifier();
			setState(1063);
			parameter_decls();
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RAISES) {
				{
				setState(1064);
				raises_expr();
				}
			}

			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONTEXT) {
				{
				setState(1067);
				context_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_attributeContext extends ParserRuleContext {
		public TerminalNode KW_ONEWAY() { return getToken(IDLParser.KW_ONEWAY, 0); }
		public Op_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_attribute; }
	}

	public final Op_attributeContext op_attribute() throws RecognitionException {
		Op_attributeContext _localctx = new Op_attributeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_op_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			match(KW_ONEWAY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_type_specContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Param_type_specContext param_type_spec() {
			return getRuleContext(Param_type_specContext.class,0);
		}
		public TerminalNode KW_VOID() { return getToken(IDLParser.KW_VOID, 0); }
		public Op_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_type_spec; }
	}

	public final Op_type_specContext op_type_spec() throws RecognitionException {
		Op_type_specContext _localctx = new Op_type_specContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_op_type_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			annapps();
			setState(1075);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
			case KW_STRING:
			case KW_OCTET:
			case KW_WCHAR:
			case KW_SHORT:
			case KW_LONG:
			case KW_WSTRING:
			case KW_VALUEBASE:
			case KW_OBJECT:
			case KW_UNSIGNED:
			case KW_ANY:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_BOOLEAN:
			case KW_DOUBLE:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
			case ID:
				{
				setState(1073);
				param_type_spec();
				}
				break;
			case KW_VOID:
				{
				setState(1074);
				match(KW_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declsContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public List<Param_declContext> param_decl() {
			return getRuleContexts(Param_declContext.class);
		}
		public Param_declContext param_decl(int i) {
			return getRuleContext(Param_declContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Parameter_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decls; }
	}

	public final Parameter_declsContext parameter_decls() throws RecognitionException {
		Parameter_declsContext _localctx = new Parameter_declsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_parameter_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(LEFT_BRACKET);
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (AT - 35)) | (1L << (KW_OUT - 35)) | (1L << (KW_IN - 35)) | (1L << (KW_INOUT - 35)))) != 0)) {
				{
				setState(1078);
				param_decl();
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1079);
					match(COMMA);
					setState(1080);
					param_decl();
					}
					}
					setState(1085);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1088);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_declContext extends ParserRuleContext {
		public List<AnnappsContext> annapps() {
			return getRuleContexts(AnnappsContext.class);
		}
		public AnnappsContext annapps(int i) {
			return getRuleContext(AnnappsContext.class,i);
		}
		public Param_attributeContext param_attribute() {
			return getRuleContext(Param_attributeContext.class,0);
		}
		public Param_type_specContext param_type_spec() {
			return getRuleContext(Param_type_specContext.class,0);
		}
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			annapps();
			setState(1091);
			param_attribute();
			setState(1092);
			annapps();
			setState(1093);
			param_type_spec();
			setState(1094);
			annapps();
			setState(1095);
			simple_declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_attributeContext extends ParserRuleContext {
		public TerminalNode KW_IN() { return getToken(IDLParser.KW_IN, 0); }
		public TerminalNode KW_OUT() { return getToken(IDLParser.KW_OUT, 0); }
		public TerminalNode KW_INOUT() { return getToken(IDLParser.KW_INOUT, 0); }
		public Param_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_attribute; }
	}

	public final Param_attributeContext param_attribute() throws RecognitionException {
		Param_attributeContext _localctx = new Param_attributeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_param_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (KW_OUT - 37)) | (1L << (KW_IN - 37)) | (1L << (KW_INOUT - 37)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raises_exprContext extends ParserRuleContext {
		public TerminalNode KW_RAISES() { return getToken(IDLParser.KW_RAISES, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public List<A_scoped_nameContext> a_scoped_name() {
			return getRuleContexts(A_scoped_nameContext.class);
		}
		public A_scoped_nameContext a_scoped_name(int i) {
			return getRuleContext(A_scoped_nameContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Raises_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raises_expr; }
	}

	public final Raises_exprContext raises_expr() throws RecognitionException {
		Raises_exprContext _localctx = new Raises_exprContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_raises_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			match(KW_RAISES);
			setState(1100);
			match(LEFT_BRACKET);
			setState(1101);
			a_scoped_name();
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1102);
				match(COMMA);
				setState(1103);
				a_scoped_name();
				}
				}
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1109);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_exprContext extends ParserRuleContext {
		public TerminalNode KW_CONTEXT() { return getToken(IDLParser.KW_CONTEXT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(IDLParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(IDLParser.STRING_LITERAL, i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Context_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_expr; }
	}

	public final Context_exprContext context_expr() throws RecognitionException {
		Context_exprContext _localctx = new Context_exprContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_context_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(KW_CONTEXT);
			setState(1112);
			match(LEFT_BRACKET);
			setState(1113);
			match(STRING_LITERAL);
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1114);
				match(COMMA);
				setState(1115);
				match(STRING_LITERAL);
				}
				}
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1121);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_type_specContext extends ParserRuleContext {
		public Base_type_specContext base_type_spec() {
			return getRuleContext(Base_type_specContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Wide_string_typeContext wide_string_type() {
			return getRuleContext(Wide_string_typeContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Param_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_spec; }
	}

	public final Param_type_specContext param_type_spec() throws RecognitionException {
		Param_type_specContext _localctx = new Param_type_specContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_param_type_spec);
		try {
			setState(1127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_OCTET:
			case KW_WCHAR:
			case KW_SHORT:
			case KW_LONG:
			case KW_VALUEBASE:
			case KW_OBJECT:
			case KW_UNSIGNED:
			case KW_ANY:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_BOOLEAN:
			case KW_DOUBLE:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				base_type_spec();
				}
				break;
			case KW_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1124);
				string_type();
				}
				break;
			case KW_WSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1125);
				wide_string_type();
				}
				break;
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(1126);
				scoped_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pt_typeContext extends ParserRuleContext {
		public TerminalNode KW_FIXED() { return getToken(IDLParser.KW_FIXED, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public List<Positive_int_constContext> positive_int_const() {
			return getRuleContexts(Positive_int_constContext.class);
		}
		public Positive_int_constContext positive_int_const(int i) {
			return getRuleContext(Positive_int_constContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(IDLParser.COMMA, 0); }
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public Fixed_pt_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pt_type; }
	}

	public final Fixed_pt_typeContext fixed_pt_type() throws RecognitionException {
		Fixed_pt_typeContext _localctx = new Fixed_pt_typeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_fixed_pt_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			match(KW_FIXED);
			setState(1130);
			match(LEFT_ANG_BRACKET);
			setState(1131);
			positive_int_const();
			setState(1132);
			match(COMMA);
			setState(1133);
			positive_int_const();
			setState(1134);
			match(RIGHT_ANG_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pt_const_typeContext extends ParserRuleContext {
		public TerminalNode KW_FIXED() { return getToken(IDLParser.KW_FIXED, 0); }
		public Fixed_pt_const_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pt_const_type; }
	}

	public final Fixed_pt_const_typeContext fixed_pt_const_type() throws RecognitionException {
		Fixed_pt_const_typeContext _localctx = new Fixed_pt_const_typeContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_fixed_pt_const_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(KW_FIXED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_base_typeContext extends ParserRuleContext {
		public TerminalNode KW_VALUEBASE() { return getToken(IDLParser.KW_VALUEBASE, 0); }
		public Value_base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_base_type; }
	}

	public final Value_base_typeContext value_base_type() throws RecognitionException {
		Value_base_typeContext _localctx = new Value_base_typeContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_value_base_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			match(KW_VALUEBASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constr_forward_declContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(IDLParser.KW_STRUCT, 0); }
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public TerminalNode KW_UNION() { return getToken(IDLParser.KW_UNION, 0); }
		public Constr_forward_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_forward_decl; }
	}

	public final Constr_forward_declContext constr_forward_decl() throws RecognitionException {
		Constr_forward_declContext _localctx = new Constr_forward_declContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_constr_forward_decl);
		try {
			setState(1144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				match(KW_STRUCT);
				setState(1141);
				match(ID);
				}
				break;
			case KW_UNION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1142);
				match(KW_UNION);
				setState(1143);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_declContext extends ParserRuleContext {
		public List<AnnappsContext> annapps() {
			return getRuleContexts(AnnappsContext.class);
		}
		public AnnappsContext annapps(int i) {
			return getRuleContext(AnnappsContext.class,i);
		}
		public TerminalNode KW_IMPORT() { return getToken(IDLParser.KW_IMPORT, 0); }
		public Imported_scopeContext imported_scope() {
			return getRuleContext(Imported_scopeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public Import_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_decl; }
	}

	public final Import_declContext import_decl() throws RecognitionException {
		Import_declContext _localctx = new Import_declContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_import_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			annapps();
			setState(1147);
			match(KW_IMPORT);
			setState(1148);
			annapps();
			setState(1149);
			imported_scope();
			setState(1150);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Imported_scopeContext extends ParserRuleContext {
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(IDLParser.STRING_LITERAL, 0); }
		public Imported_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imported_scope; }
	}

	public final Imported_scopeContext imported_scope() throws RecognitionException {
		Imported_scopeContext _localctx = new Imported_scopeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_imported_scope);
		try {
			setState(1154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1152);
				scoped_name();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_id_declContext extends ParserRuleContext {
		public TerminalNode KW_TYPEID() { return getToken(IDLParser.KW_TYPEID, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(IDLParser.STRING_LITERAL, 0); }
		public Type_id_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id_decl; }
	}

	public final Type_id_declContext type_id_decl() throws RecognitionException {
		Type_id_declContext _localctx = new Type_id_declContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_type_id_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(KW_TYPEID);
			setState(1157);
			a_scoped_name();
			setState(1158);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_prefix_declContext extends ParserRuleContext {
		public TerminalNode KW_TYPEPREFIX() { return getToken(IDLParser.KW_TYPEPREFIX, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(IDLParser.STRING_LITERAL, 0); }
		public Type_prefix_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_prefix_decl; }
	}

	public final Type_prefix_declContext type_prefix_decl() throws RecognitionException {
		Type_prefix_declContext _localctx = new Type_prefix_declContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_type_prefix_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			match(KW_TYPEPREFIX);
			setState(1161);
			a_scoped_name();
			setState(1162);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Readonly_attr_specContext extends ParserRuleContext {
		public TerminalNode KW_READONLY() { return getToken(IDLParser.KW_READONLY, 0); }
		public TerminalNode KW_ATTRIBUTE() { return getToken(IDLParser.KW_ATTRIBUTE, 0); }
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Param_type_specContext param_type_spec() {
			return getRuleContext(Param_type_specContext.class,0);
		}
		public Readonly_attr_declaratorContext readonly_attr_declarator() {
			return getRuleContext(Readonly_attr_declaratorContext.class,0);
		}
		public Readonly_attr_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readonly_attr_spec; }
	}

	public final Readonly_attr_specContext readonly_attr_spec() throws RecognitionException {
		Readonly_attr_specContext _localctx = new Readonly_attr_specContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_readonly_attr_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			match(KW_READONLY);
			setState(1165);
			match(KW_ATTRIBUTE);
			setState(1166);
			annapps();
			setState(1167);
			param_type_spec();
			setState(1168);
			readonly_attr_declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Readonly_attr_declaratorContext extends ParserRuleContext {
		public List<AnnappsContext> annapps() {
			return getRuleContexts(AnnappsContext.class);
		}
		public AnnappsContext annapps(int i) {
			return getRuleContext(AnnappsContext.class,i);
		}
		public List<Simple_declaratorContext> simple_declarator() {
			return getRuleContexts(Simple_declaratorContext.class);
		}
		public Simple_declaratorContext simple_declarator(int i) {
			return getRuleContext(Simple_declaratorContext.class,i);
		}
		public Raises_exprContext raises_expr() {
			return getRuleContext(Raises_exprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Readonly_attr_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readonly_attr_declarator; }
	}

	public final Readonly_attr_declaratorContext readonly_attr_declarator() throws RecognitionException {
		Readonly_attr_declaratorContext _localctx = new Readonly_attr_declaratorContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_readonly_attr_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			annapps();
			setState(1171);
			simple_declarator();
			setState(1182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_RAISES:
				{
				setState(1172);
				raises_expr();
				}
				break;
			case SEMICOLON:
			case COMMA:
				{
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1173);
					match(COMMA);
					setState(1174);
					annapps();
					setState(1175);
					simple_declarator();
					}
					}
					setState(1181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_specContext extends ParserRuleContext {
		public TerminalNode KW_ATTRIBUTE() { return getToken(IDLParser.KW_ATTRIBUTE, 0); }
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Param_type_specContext param_type_spec() {
			return getRuleContext(Param_type_specContext.class,0);
		}
		public Attr_declaratorContext attr_declarator() {
			return getRuleContext(Attr_declaratorContext.class,0);
		}
		public Attr_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_spec; }
	}

	public final Attr_specContext attr_spec() throws RecognitionException {
		Attr_specContext _localctx = new Attr_specContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_attr_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(KW_ATTRIBUTE);
			setState(1185);
			annapps();
			setState(1186);
			param_type_spec();
			setState(1187);
			attr_declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_declaratorContext extends ParserRuleContext {
		public List<AnnappsContext> annapps() {
			return getRuleContexts(AnnappsContext.class);
		}
		public AnnappsContext annapps(int i) {
			return getRuleContext(AnnappsContext.class,i);
		}
		public List<Simple_declaratorContext> simple_declarator() {
			return getRuleContexts(Simple_declaratorContext.class);
		}
		public Simple_declaratorContext simple_declarator(int i) {
			return getRuleContext(Simple_declaratorContext.class,i);
		}
		public Attr_raises_exprContext attr_raises_expr() {
			return getRuleContext(Attr_raises_exprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Attr_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_declarator; }
	}

	public final Attr_declaratorContext attr_declarator() throws RecognitionException {
		Attr_declaratorContext _localctx = new Attr_declaratorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_attr_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			annapps();
			setState(1190);
			simple_declarator();
			setState(1201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SETRAISES:
			case KW_GETRAISES:
				{
				setState(1191);
				attr_raises_expr();
				}
				break;
			case SEMICOLON:
			case COMMA:
				{
				setState(1198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1192);
					match(COMMA);
					setState(1193);
					annapps();
					setState(1194);
					simple_declarator();
					}
					}
					setState(1200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_raises_exprContext extends ParserRuleContext {
		public Get_excep_exprContext get_excep_expr() {
			return getRuleContext(Get_excep_exprContext.class,0);
		}
		public Set_excep_exprContext set_excep_expr() {
			return getRuleContext(Set_excep_exprContext.class,0);
		}
		public Attr_raises_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_raises_expr; }
	}

	public final Attr_raises_exprContext attr_raises_expr() throws RecognitionException {
		Attr_raises_exprContext _localctx = new Attr_raises_exprContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_attr_raises_expr);
		int _la;
		try {
			setState(1208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_GETRAISES:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				get_excep_expr();
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_SETRAISES) {
					{
					setState(1204);
					set_excep_expr();
					}
				}

				}
				break;
			case KW_SETRAISES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				set_excep_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_excep_exprContext extends ParserRuleContext {
		public TerminalNode KW_GETRAISES() { return getToken(IDLParser.KW_GETRAISES, 0); }
		public Exception_listContext exception_list() {
			return getRuleContext(Exception_listContext.class,0);
		}
		public Get_excep_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_excep_expr; }
	}

	public final Get_excep_exprContext get_excep_expr() throws RecognitionException {
		Get_excep_exprContext _localctx = new Get_excep_exprContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_get_excep_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(KW_GETRAISES);
			setState(1211);
			exception_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_excep_exprContext extends ParserRuleContext {
		public TerminalNode KW_SETRAISES() { return getToken(IDLParser.KW_SETRAISES, 0); }
		public Exception_listContext exception_list() {
			return getRuleContext(Exception_listContext.class,0);
		}
		public Set_excep_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_excep_expr; }
	}

	public final Set_excep_exprContext set_excep_expr() throws RecognitionException {
		Set_excep_exprContext _localctx = new Set_excep_exprContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_set_excep_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			match(KW_SETRAISES);
			setState(1214);
			exception_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_listContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public List<A_scoped_nameContext> a_scoped_name() {
			return getRuleContexts(A_scoped_nameContext.class);
		}
		public A_scoped_nameContext a_scoped_name(int i) {
			return getRuleContext(A_scoped_nameContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Exception_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_list; }
	}

	public final Exception_listContext exception_list() throws RecognitionException {
		Exception_listContext _localctx = new Exception_listContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_exception_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(LEFT_BRACKET);
			setState(1217);
			a_scoped_name();
			setState(1222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1218);
				match(COMMA);
				setState(1219);
				a_scoped_name();
				}
				}
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1225);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentContext extends ParserRuleContext {
		public Component_declContext component_decl() {
			return getRuleContext(Component_declContext.class,0);
		}
		public Component_forward_declContext component_forward_decl() {
			return getRuleContext(Component_forward_declContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_component);
		try {
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1227);
				component_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
				component_forward_decl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_forward_declContext extends ParserRuleContext {
		public TerminalNode KW_COMPONENT() { return getToken(IDLParser.KW_COMPONENT, 0); }
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public Component_forward_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_forward_decl; }
	}

	public final Component_forward_declContext component_forward_decl() throws RecognitionException {
		Component_forward_declContext _localctx = new Component_forward_declContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_component_forward_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			match(KW_COMPONENT);
			setState(1232);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_declContext extends ParserRuleContext {
		public Component_headerContext component_header() {
			return getRuleContext(Component_headerContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public Component_bodyContext component_body() {
			return getRuleContext(Component_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public Component_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_decl; }
	}

	public final Component_declContext component_decl() throws RecognitionException {
		Component_declContext _localctx = new Component_declContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_component_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			component_header();
			setState(1235);
			match(LEFT_BRACE);
			setState(1236);
			component_body();
			setState(1237);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_headerContext extends ParserRuleContext {
		public TerminalNode KW_COMPONENT() { return getToken(IDLParser.KW_COMPONENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Component_inheritance_specContext component_inheritance_spec() {
			return getRuleContext(Component_inheritance_specContext.class,0);
		}
		public Supported_interface_specContext supported_interface_spec() {
			return getRuleContext(Supported_interface_specContext.class,0);
		}
		public Component_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_header; }
	}

	public final Component_headerContext component_header() throws RecognitionException {
		Component_headerContext _localctx = new Component_headerContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_component_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			match(KW_COMPONENT);
			setState(1240);
			identifier();
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1241);
				component_inheritance_spec();
				}
			}

			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SUPPORTS) {
				{
				setState(1244);
				supported_interface_spec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Supported_interface_specContext extends ParserRuleContext {
		public TerminalNode KW_SUPPORTS() { return getToken(IDLParser.KW_SUPPORTS, 0); }
		public List<A_scoped_nameContext> a_scoped_name() {
			return getRuleContexts(A_scoped_nameContext.class);
		}
		public A_scoped_nameContext a_scoped_name(int i) {
			return getRuleContext(A_scoped_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Supported_interface_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supported_interface_spec; }
	}

	public final Supported_interface_specContext supported_interface_spec() throws RecognitionException {
		Supported_interface_specContext _localctx = new Supported_interface_specContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_supported_interface_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			match(KW_SUPPORTS);
			setState(1248);
			a_scoped_name();
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1249);
				match(COMMA);
				setState(1250);
				a_scoped_name();
				}
				}
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_inheritance_specContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public Component_inheritance_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_inheritance_spec; }
	}

	public final Component_inheritance_specContext component_inheritance_spec() throws RecognitionException {
		Component_inheritance_specContext _localctx = new Component_inheritance_specContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_component_inheritance_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			match(COLON);
			setState(1257);
			a_scoped_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_bodyContext extends ParserRuleContext {
		public List<Component_exportContext> component_export() {
			return getRuleContexts(Component_exportContext.class);
		}
		public Component_exportContext component_export(int i) {
			return getRuleContext(Component_exportContext.class,i);
		}
		public Component_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_body; }
	}

	public final Component_bodyContext component_body() throws RecognitionException {
		Component_bodyContext _localctx = new Component_bodyContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_component_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (AT - 35)) | (1L << (KW_EMITS - 35)) | (1L << (KW_PUBLISHES - 35)) | (1L << (KW_USES - 35)) | (1L << (KW_READONLY - 35)) | (1L << (KW_PROVIDES - 35)) | (1L << (KW_CONSUMES - 35)) | (1L << (KW_ATTRIBUTE - 35)))) != 0)) {
				{
				{
				setState(1259);
				component_export();
				}
				}
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_exportContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Provides_declContext provides_decl() {
			return getRuleContext(Provides_declContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public Uses_declContext uses_decl() {
			return getRuleContext(Uses_declContext.class,0);
		}
		public Emits_declContext emits_decl() {
			return getRuleContext(Emits_declContext.class,0);
		}
		public Publishes_declContext publishes_decl() {
			return getRuleContext(Publishes_declContext.class,0);
		}
		public Consumes_declContext consumes_decl() {
			return getRuleContext(Consumes_declContext.class,0);
		}
		public Attr_declContext attr_decl() {
			return getRuleContext(Attr_declContext.class,0);
		}
		public Component_exportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_export; }
	}

	public final Component_exportContext component_export() throws RecognitionException {
		Component_exportContext _localctx = new Component_exportContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_component_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			annapps();
			setState(1284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PROVIDES:
				{
				setState(1266);
				provides_decl();
				setState(1267);
				match(SEMICOLON);
				}
				break;
			case KW_USES:
				{
				setState(1269);
				uses_decl();
				setState(1270);
				match(SEMICOLON);
				}
				break;
			case KW_EMITS:
				{
				setState(1272);
				emits_decl();
				setState(1273);
				match(SEMICOLON);
				}
				break;
			case KW_PUBLISHES:
				{
				setState(1275);
				publishes_decl();
				setState(1276);
				match(SEMICOLON);
				}
				break;
			case KW_CONSUMES:
				{
				setState(1278);
				consumes_decl();
				setState(1279);
				match(SEMICOLON);
				}
				break;
			case KW_READONLY:
			case KW_ATTRIBUTE:
				{
				setState(1281);
				attr_decl();
				setState(1282);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Provides_declContext extends ParserRuleContext {
		public TerminalNode KW_PROVIDES() { return getToken(IDLParser.KW_PROVIDES, 0); }
		public Interface_typeContext interface_type() {
			return getRuleContext(Interface_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public Provides_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_provides_decl; }
	}

	public final Provides_declContext provides_decl() throws RecognitionException {
		Provides_declContext _localctx = new Provides_declContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_provides_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(KW_PROVIDES);
			setState(1287);
			interface_type();
			setState(1288);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_typeContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public TerminalNode KW_OBJECT() { return getToken(IDLParser.KW_OBJECT, 0); }
		public Interface_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_type; }
	}

	public final Interface_typeContext interface_type() throws RecognitionException {
		Interface_typeContext _localctx = new Interface_typeContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_interface_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			annapps();
			setState(1293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
			case ID:
				{
				setState(1291);
				scoped_name();
				}
				break;
			case KW_OBJECT:
				{
				setState(1292);
				match(KW_OBJECT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uses_declContext extends ParserRuleContext {
		public TerminalNode KW_USES() { return getToken(IDLParser.KW_USES, 0); }
		public Interface_typeContext interface_type() {
			return getRuleContext(Interface_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public TerminalNode KW_MULTIPLE() { return getToken(IDLParser.KW_MULTIPLE, 0); }
		public Uses_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uses_decl; }
	}

	public final Uses_declContext uses_decl() throws RecognitionException {
		Uses_declContext _localctx = new Uses_declContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_uses_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			match(KW_USES);
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MULTIPLE) {
				{
				setState(1296);
				match(KW_MULTIPLE);
				}
			}

			setState(1299);
			interface_type();
			setState(1300);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Emits_declContext extends ParserRuleContext {
		public TerminalNode KW_EMITS() { return getToken(IDLParser.KW_EMITS, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public Emits_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emits_decl; }
	}

	public final Emits_declContext emits_decl() throws RecognitionException {
		Emits_declContext _localctx = new Emits_declContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_emits_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			match(KW_EMITS);
			setState(1303);
			a_scoped_name();
			setState(1304);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Publishes_declContext extends ParserRuleContext {
		public TerminalNode KW_PUBLISHES() { return getToken(IDLParser.KW_PUBLISHES, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public Publishes_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publishes_decl; }
	}

	public final Publishes_declContext publishes_decl() throws RecognitionException {
		Publishes_declContext _localctx = new Publishes_declContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_publishes_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			match(KW_PUBLISHES);
			setState(1307);
			a_scoped_name();
			setState(1308);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Consumes_declContext extends ParserRuleContext {
		public TerminalNode KW_CONSUMES() { return getToken(IDLParser.KW_CONSUMES, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public Consumes_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consumes_decl; }
	}

	public final Consumes_declContext consumes_decl() throws RecognitionException {
		Consumes_declContext _localctx = new Consumes_declContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_consumes_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			match(KW_CONSUMES);
			setState(1311);
			a_scoped_name();
			setState(1312);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Home_declContext extends ParserRuleContext {
		public Home_headerContext home_header() {
			return getRuleContext(Home_headerContext.class,0);
		}
		public Home_bodyContext home_body() {
			return getRuleContext(Home_bodyContext.class,0);
		}
		public Home_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home_decl; }
	}

	public final Home_declContext home_decl() throws RecognitionException {
		Home_declContext _localctx = new Home_declContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_home_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			home_header();
			setState(1315);
			home_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Home_headerContext extends ParserRuleContext {
		public TerminalNode KW_HOME() { return getToken(IDLParser.KW_HOME, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_MANAGES() { return getToken(IDLParser.KW_MANAGES, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public Home_inheritance_specContext home_inheritance_spec() {
			return getRuleContext(Home_inheritance_specContext.class,0);
		}
		public Supported_interface_specContext supported_interface_spec() {
			return getRuleContext(Supported_interface_specContext.class,0);
		}
		public Primary_key_specContext primary_key_spec() {
			return getRuleContext(Primary_key_specContext.class,0);
		}
		public Home_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home_header; }
	}

	public final Home_headerContext home_header() throws RecognitionException {
		Home_headerContext _localctx = new Home_headerContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_home_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			match(KW_HOME);
			setState(1318);
			identifier();
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1319);
				home_inheritance_spec();
				}
			}

			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SUPPORTS) {
				{
				setState(1322);
				supported_interface_spec();
				}
			}

			setState(1325);
			match(KW_MANAGES);
			setState(1326);
			a_scoped_name();
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PRIMARYKEY) {
				{
				setState(1327);
				primary_key_spec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Home_inheritance_specContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public Home_inheritance_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home_inheritance_spec; }
	}

	public final Home_inheritance_specContext home_inheritance_spec() throws RecognitionException {
		Home_inheritance_specContext _localctx = new Home_inheritance_specContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_home_inheritance_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(COLON);
			setState(1331);
			a_scoped_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_key_specContext extends ParserRuleContext {
		public TerminalNode KW_PRIMARYKEY() { return getToken(IDLParser.KW_PRIMARYKEY, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public Primary_key_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_key_spec; }
	}

	public final Primary_key_specContext primary_key_spec() throws RecognitionException {
		Primary_key_specContext _localctx = new Primary_key_specContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_primary_key_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(KW_PRIMARYKEY);
			setState(1334);
			a_scoped_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Home_bodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<Home_exportContext> home_export() {
			return getRuleContexts(Home_exportContext.class);
		}
		public Home_exportContext home_export(int i) {
			return getRuleContext(Home_exportContext.class,i);
		}
		public Home_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home_body; }
	}

	public final Home_bodyContext home_body() throws RecognitionException {
		Home_bodyContext _localctx = new Home_bodyContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_home_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(LEFT_BRACE);
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_READONLY) | (1L << KW_FINDER) | (1L << KW_VOID) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_FACTORY - 64)) | (1L << (KW_EXCEPTION - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ONEWAY - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_TYPEPREFIX - 64)) | (1L << (KW_TYPEID - 64)) | (1L << (KW_ATTRIBUTE - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(1337);
				home_export();
				}
				}
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1343);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Home_exportContext extends ParserRuleContext {
		public Export_Context export_() {
			return getRuleContext(Export_Context.class,0);
		}
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public Factory_declContext factory_decl() {
			return getRuleContext(Factory_declContext.class,0);
		}
		public Finder_declContext finder_decl() {
			return getRuleContext(Finder_declContext.class,0);
		}
		public Home_exportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home_export; }
	}

	public final Home_exportContext home_export() throws RecognitionException {
		Home_exportContext _localctx = new Home_exportContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_home_export);
		try {
			setState(1353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1345);
				export_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				annapps();
				setState(1349);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_FACTORY:
					{
					setState(1347);
					factory_decl();
					}
					break;
				case KW_FINDER:
					{
					setState(1348);
					finder_decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1351);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factory_declContext extends ParserRuleContext {
		public TerminalNode KW_FACTORY() { return getToken(IDLParser.KW_FACTORY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public Init_param_declsContext init_param_decls() {
			return getRuleContext(Init_param_declsContext.class,0);
		}
		public Raises_exprContext raises_expr() {
			return getRuleContext(Raises_exprContext.class,0);
		}
		public Factory_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factory_decl; }
	}

	public final Factory_declContext factory_decl() throws RecognitionException {
		Factory_declContext _localctx = new Factory_declContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_factory_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			match(KW_FACTORY);
			setState(1356);
			identifier();
			setState(1357);
			match(LEFT_BRACKET);
			setState(1359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==KW_IN) {
				{
				setState(1358);
				init_param_decls();
				}
			}

			setState(1361);
			match(RIGHT_BRACKET);
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RAISES) {
				{
				setState(1362);
				raises_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finder_declContext extends ParserRuleContext {
		public TerminalNode KW_FINDER() { return getToken(IDLParser.KW_FINDER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public Init_param_declsContext init_param_decls() {
			return getRuleContext(Init_param_declsContext.class,0);
		}
		public Raises_exprContext raises_expr() {
			return getRuleContext(Raises_exprContext.class,0);
		}
		public Finder_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finder_decl; }
	}

	public final Finder_declContext finder_decl() throws RecognitionException {
		Finder_declContext _localctx = new Finder_declContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_finder_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			match(KW_FINDER);
			setState(1366);
			identifier();
			setState(1367);
			match(LEFT_BRACKET);
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==KW_IN) {
				{
				setState(1368);
				init_param_decls();
				}
			}

			setState(1371);
			match(RIGHT_BRACKET);
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RAISES) {
				{
				setState(1372);
				raises_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventContext extends ParserRuleContext {
		public Event_declContext event_decl() {
			return getRuleContext(Event_declContext.class,0);
		}
		public Event_abs_declContext event_abs_decl() {
			return getRuleContext(Event_abs_declContext.class,0);
		}
		public Event_forward_declContext event_forward_decl() {
			return getRuleContext(Event_forward_declContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1375);
				event_decl();
				}
				break;
			case 2:
				{
				setState(1376);
				event_abs_decl();
				}
				break;
			case 3:
				{
				setState(1377);
				event_forward_decl();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_forward_declContext extends ParserRuleContext {
		public TerminalNode KW_EVENTTYPE() { return getToken(IDLParser.KW_EVENTTYPE, 0); }
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public TerminalNode KW_ABSTRACT() { return getToken(IDLParser.KW_ABSTRACT, 0); }
		public Event_forward_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_forward_decl; }
	}

	public final Event_forward_declContext event_forward_decl() throws RecognitionException {
		Event_forward_declContext _localctx = new Event_forward_declContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_event_forward_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ABSTRACT) {
				{
				setState(1380);
				match(KW_ABSTRACT);
				}
			}

			setState(1383);
			match(KW_EVENTTYPE);
			setState(1384);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_abs_declContext extends ParserRuleContext {
		public TerminalNode KW_ABSTRACT() { return getToken(IDLParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_EVENTTYPE() { return getToken(IDLParser.KW_EVENTTYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Value_inheritance_specContext value_inheritance_spec() {
			return getRuleContext(Value_inheritance_specContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<Export_Context> export_() {
			return getRuleContexts(Export_Context.class);
		}
		public Export_Context export_(int i) {
			return getRuleContext(Export_Context.class,i);
		}
		public Event_abs_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_abs_decl; }
	}

	public final Event_abs_declContext event_abs_decl() throws RecognitionException {
		Event_abs_declContext _localctx = new Event_abs_declContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_event_abs_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			match(KW_ABSTRACT);
			setState(1387);
			match(KW_EVENTTYPE);
			setState(1388);
			identifier();
			setState(1389);
			value_inheritance_spec();
			setState(1390);
			match(LEFT_BRACE);
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_READONLY) | (1L << KW_VOID) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_EXCEPTION - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ONEWAY - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_TYPEPREFIX - 64)) | (1L << (KW_TYPEID - 64)) | (1L << (KW_ATTRIBUTE - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(1391);
				export_();
				}
				}
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1397);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_declContext extends ParserRuleContext {
		public Event_headerContext event_header() {
			return getRuleContext(Event_headerContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<Value_elementContext> value_element() {
			return getRuleContexts(Value_elementContext.class);
		}
		public Value_elementContext value_element(int i) {
			return getRuleContext(Value_elementContext.class,i);
		}
		public Event_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_decl; }
	}

	public final Event_declContext event_decl() throws RecognitionException {
		Event_declContext _localctx = new Event_declContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_event_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			event_header();
			setState(1400);
			match(LEFT_BRACE);
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_READONLY) | (1L << KW_VOID) | (1L << KW_PRIVATE) | (1L << KW_WCHAR) | (1L << KW_PUBLIC) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_FACTORY - 64)) | (1L << (KW_EXCEPTION - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ONEWAY - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_TYPEPREFIX - 64)) | (1L << (KW_TYPEID - 64)) | (1L << (KW_ATTRIBUTE - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(1401);
				value_element();
				}
				}
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1407);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_headerContext extends ParserRuleContext {
		public TerminalNode KW_EVENTTYPE() { return getToken(IDLParser.KW_EVENTTYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Value_inheritance_specContext value_inheritance_spec() {
			return getRuleContext(Value_inheritance_specContext.class,0);
		}
		public TerminalNode KW_CUSTOM() { return getToken(IDLParser.KW_CUSTOM, 0); }
		public Event_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_header; }
	}

	public final Event_headerContext event_header() throws RecognitionException {
		Event_headerContext _localctx = new Event_headerContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_event_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CUSTOM) {
				{
				setState(1409);
				match(KW_CUSTOM);
				}
			}

			setState(1412);
			match(KW_EVENTTYPE);
			setState(1413);
			identifier();
			setState(1414);
			value_inheritance_spec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnappsContext extends ParserRuleContext {
		public List<Annotation_applContext> annotation_appl() {
			return getRuleContexts(Annotation_applContext.class);
		}
		public Annotation_applContext annotation_appl(int i) {
			return getRuleContext(Annotation_applContext.class,i);
		}
		public AnnappsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annapps; }
	}

	public final AnnappsContext annapps() throws RecognitionException {
		AnnappsContext _localctx = new AnnappsContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_annapps);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1416);
					annotation_appl();
					}
					} 
				}
				setState(1421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_applContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(IDLParser.AT, 0); }
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public Annotation_appl_paramsContext annotation_appl_params() {
			return getRuleContext(Annotation_appl_paramsContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public Annotation_applContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_appl; }
	}

	public final Annotation_applContext annotation_appl() throws RecognitionException {
		Annotation_applContext _localctx = new Annotation_applContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_annotation_appl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			match(AT);
			setState(1423);
			scoped_name();
			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(1424);
				match(LEFT_BRACKET);
				setState(1425);
				annotation_appl_params();
				setState(1426);
				match(RIGHT_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_appl_paramsContext extends ParserRuleContext {
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public List<Annotation_appl_paramContext> annotation_appl_param() {
			return getRuleContexts(Annotation_appl_paramContext.class);
		}
		public Annotation_appl_paramContext annotation_appl_param(int i) {
			return getRuleContext(Annotation_appl_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Annotation_appl_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_appl_params; }
	}

	public final Annotation_appl_paramsContext annotation_appl_params() throws RecognitionException {
		Annotation_appl_paramsContext _localctx = new Annotation_appl_paramsContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_annotation_appl_params);
		int _la;
		try {
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1430);
				const_exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1431);
				annotation_appl_param();
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1432);
					match(COMMA);
					setState(1433);
					annotation_appl_param();
					}
					}
					setState(1438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_appl_paramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(IDLParser.EQUAL, 0); }
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public Annotation_appl_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_appl_param; }
	}

	public final Annotation_appl_paramContext annotation_appl_param() throws RecognitionException {
		Annotation_appl_paramContext _localctx = new Annotation_appl_paramContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_annotation_appl_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(ID);
			setState(1442);
			match(EQUAL);
			setState(1443);
			const_exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			annapps();
			setState(1446);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3v\u05ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\3\2\7\2\u0146\n\2\f\2\16\2\u0149"+
		"\13\2\3\2\6\2\u014c\n\2\r\2\16\2\u014d\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0177\n\3\3"+
		"\4\3\4\3\4\3\4\6\4\u017d\n\4\r\4\16\4\u017e\3\4\3\4\3\5\3\5\3\5\5\5\u0186"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\7\5\7\u018e\n\7\3\7\3\7\3\7\3\b\5\b\u0194\n"+
		"\b\3\b\3\b\3\b\5\b\u0199\n\b\3\t\7\t\u019c\n\t\f\t\16\t\u019f\13\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u01b7\n\n\3\13\3\13\3\13\3\13\7\13\u01bd\n\13\f\13"+
		"\16\13\u01c0\13\13\3\f\3\f\3\r\3\r\3\r\3\16\5\16\u01c8\n\16\3\16\3\16"+
		"\3\16\7\16\u01cd\n\16\f\16\16\16\u01d0\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u01d7\n\17\3\20\5\20\u01da\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01e9\n\22\f\22\16\22\u01ec\13"+
		"\22\3\22\3\22\3\23\3\23\3\23\7\23\u01f3\n\23\f\23\16\23\u01f6\13\23\3"+
		"\23\3\23\3\24\5\24\u01fb\n\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u0203"+
		"\n\25\3\25\3\25\3\25\7\25\u0208\n\25\f\25\16\25\u020b\13\25\5\25\u020d"+
		"\n\25\3\25\3\25\3\25\3\25\7\25\u0213\n\25\f\25\16\25\u0216\13\25\5\25"+
		"\u0218\n\25\3\26\3\26\3\27\3\27\3\27\5\27\u021f\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u0226\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0231\n\31\3\31\3\31\5\31\u0235\n\31\3\31\3\31\3\32\3\32\3\32\7"+
		"\32\u023c\n\32\f\32\16\32\u023f\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\5\36\u025b\n\36\3\37\3\37\3 \3 \3 \7 \u0262"+
		"\n \f \16 \u0265\13 \3!\3!\3!\7!\u026a\n!\f!\16!\u026d\13!\3\"\3\"\3\""+
		"\7\"\u0272\n\"\f\"\16\"\u0275\13\"\3#\3#\3#\7#\u027a\n#\f#\16#\u027d\13"+
		"#\3$\3$\3$\7$\u0282\n$\f$\16$\u0285\13$\3%\3%\3%\7%\u028a\n%\f%\16%\u028d"+
		"\13%\3&\3&\3&\3&\5&\u0293\n&\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u029d\n(\3)"+
		"\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02b1\n+\3,\3,"+
		"\3,\3-\3-\5-\u02b8\n-\3.\3.\3.\5.\u02bd\n.\3/\3/\3/\5/\u02c2\n/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u02cd\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u02d5\n\61\3\62\3\62\3\62\3\62\3\62\5\62\u02dc\n"+
		"\62\3\63\3\63\3\63\7\63\u02e1\n\63\f\63\16\63\u02e4\13\63\3\64\3\64\3"+
		"\64\7\64\u02e9\n\64\f\64\16\64\u02ec\13\64\3\65\3\65\3\65\5\65\u02f1\n"+
		"\65\3\66\3\66\3\67\3\67\38\38\38\38\58\u02fb\n8\39\39\59\u02ff\n9\3:\3"+
		":\3:\3:\5:\u0305\n:\3;\3;\3<\3<\3=\3=\3>\3>\3>\5>\u0310\n>\3?\3?\3?\3"+
		"?\5?\u0316\n?\3@\3@\3A\3A\3A\5A\u031d\nA\3B\3B\3B\5B\u0322\nB\3C\3C\3"+
		"C\3C\5C\u0328\nC\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\5J\u0338\n"+
		"J\3K\3K\3K\3K\3K\3L\3L\3L\5L\u0342\nL\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\7N\u0352\nN\fN\16N\u0355\13N\3O\3O\3O\3O\5O\u035b\nO\3O\3O"+
		"\3P\3P\3P\3Q\3Q\3Q\3Q\5Q\u0366\nQ\3Q\3Q\3Q\3Q\3R\3R\5R\u036e\nR\3R\3R"+
		"\6R\u0372\nR\rR\16R\u0373\3S\3S\3S\3S\3S\3S\5S\u037c\nS\3S\3S\3T\3T\3"+
		"T\3T\3T\3T\3U\3U\3U\7U\u0389\nU\fU\16U\u038c\13U\3V\3V\3V\3V\5V\u0392"+
		"\nV\3V\3V\3V\3V\3W\7W\u0399\nW\fW\16W\u039c\13W\3X\3X\3X\3X\3X\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u03b5\nZ\3[\6[\u03b8"+
		"\n[\r[\16[\u03b9\3\\\6\\\u03bd\n\\\r\\\16\\\u03be\3\\\3\\\3\\\3]\3]\3"+
		"]\3]\3]\3]\3]\5]\u03cb\n]\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\7_\u03d7\n_\f"+
		"_\16_\u03da\13_\3_\3_\3`\3`\3a\3a\3a\3a\3a\3a\5a\u03e6\na\3a\3a\3b\3b"+
		"\3b\3b\3b\5b\u03ef\nb\3b\3b\3c\3c\3c\3c\3c\3c\3c\5c\u03fa\nc\3c\3c\3d"+
		"\3d\3d\3d\3d\5d\u0403\nd\3e\3e\3e\3e\3e\5e\u040a\ne\3f\3f\6f\u040e\nf"+
		"\rf\16f\u040f\3g\3g\3g\3g\3h\3h\5h\u0418\nh\3i\3i\3i\3i\7i\u041e\ni\f"+
		"i\16i\u0421\13i\3i\3i\3j\5j\u0426\nj\3j\3j\3j\3j\5j\u042c\nj\3j\5j\u042f"+
		"\nj\3k\3k\3l\3l\3l\5l\u0436\nl\3m\3m\3m\3m\7m\u043c\nm\fm\16m\u043f\13"+
		"m\5m\u0441\nm\3m\3m\3n\3n\3n\3n\3n\3n\3n\3o\3o\3p\3p\3p\3p\3p\7p\u0453"+
		"\np\fp\16p\u0456\13p\3p\3p\3q\3q\3q\3q\3q\7q\u045f\nq\fq\16q\u0462\13"+
		"q\3q\3q\3r\3r\3r\3r\5r\u046a\nr\3s\3s\3s\3s\3s\3s\3s\3t\3t\3u\3u\3v\3"+
		"v\3v\3v\5v\u047b\nv\3w\3w\3w\3w\3w\3w\3x\3x\5x\u0485\nx\3y\3y\3y\3y\3"+
		"z\3z\3z\3z\3{\3{\3{\3{\3{\3{\3|\3|\3|\3|\3|\3|\3|\7|\u049c\n|\f|\16|\u049f"+
		"\13|\5|\u04a1\n|\3}\3}\3}\3}\3}\3~\3~\3~\3~\3~\3~\3~\7~\u04af\n~\f~\16"+
		"~\u04b2\13~\5~\u04b4\n~\3\177\3\177\5\177\u04b8\n\177\3\177\5\177\u04bb"+
		"\n\177\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\7\u0082\u04c7\n\u0082\f\u0082\16\u0082\u04ca\13\u0082"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\5\u0083\u04d0\n\u0083\3\u0084\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u04dd\n\u0086\3\u0086\5\u0086\u04e0\n\u0086\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\7\u0087\u04e6\n\u0087\f\u0087\16\u0087\u04e9\13\u0087\3"+
		"\u0088\3\u0088\3\u0088\3\u0089\7\u0089\u04ef\n\u0089\f\u0089\16\u0089"+
		"\u04f2\13\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u0507\n\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\3\u008c\5\u008c\u0510\n\u008c\3\u008d\3\u008d"+
		"\5\u008d\u0514\n\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\5\u0092\u052b\n\u0092"+
		"\3\u0092\5\u0092\u052e\n\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0533\n"+
		"\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095"+
		"\7\u0095\u053d\n\u0095\f\u0095\16\u0095\u0540\13\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0548\n\u0096\3\u0096\3\u0096"+
		"\5\u0096\u054c\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u0552\n"+
		"\u0097\3\u0097\3\u0097\5\u0097\u0556\n\u0097\3\u0098\3\u0098\3\u0098\3"+
		"\u0098\5\u0098\u055c\n\u0098\3\u0098\3\u0098\5\u0098\u0560\n\u0098\3\u0099"+
		"\3\u0099\3\u0099\5\u0099\u0565\n\u0099\3\u009a\5\u009a\u0568\n\u009a\3"+
		"\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\7\u009b\u0573\n\u009b\f\u009b\16\u009b\u0576\13\u009b\3\u009b\3\u009b"+
		"\3\u009c\3\u009c\3\u009c\7\u009c\u057d\n\u009c\f\u009c\16\u009c\u0580"+
		"\13\u009c\3\u009c\3\u009c\3\u009d\5\u009d\u0585\n\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009e\7\u009e\u058c\n\u009e\f\u009e\16\u009e\u058f"+
		"\13\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0597"+
		"\n\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u059d\n\u00a0\f\u00a0"+
		"\16\u00a0\u05a0\13\u00a0\5\u00a0\u05a2\n\u00a0\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\2\2\u00a3\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\2\13\4\2YYaa\3\2#$\3\2\33\34\5\2\27\27\32\32!!\4\2"+
		"\26\26\33\34\3\2\3\f\4\2??ll\4\2@@nn\5\2\'\'<<ZZ\2\u05ca\2\u0147\3\2\2"+
		"\2\4\u0151\3\2\2\2\6\u0178\3\2\2\2\b\u0182\3\2\2\2\n\u0187\3\2\2\2\f\u018d"+
		"\3\2\2\2\16\u0193\3\2\2\2\20\u019d\3\2\2\2\22\u01a0\3\2\2\2\24\u01b8\3"+
		"\2\2\2\26\u01c1\3\2\2\2\30\u01c3\3\2\2\2\32\u01c7\3\2\2\2\34\u01d1\3\2"+
		"\2\2\36\u01d9\3\2\2\2 \u01de\3\2\2\2\"\u01e2\3\2\2\2$\u01ef\3\2\2\2&\u01fa"+
		"\3\2\2\2(\u020c\3\2\2\2*\u0219\3\2\2\2,\u021e\3\2\2\2.\u0220\3\2\2\2\60"+
		"\u022b\3\2\2\2\62\u0238\3\2\2\2\64\u0240\3\2\2\2\66\u0247\3\2\2\28\u0249"+
		"\3\2\2\2:\u024f\3\2\2\2<\u025c\3\2\2\2>\u025e\3\2\2\2@\u0266\3\2\2\2B"+
		"\u026e\3\2\2\2D\u0276\3\2\2\2F\u027e\3\2\2\2H\u0286\3\2\2\2J\u0292\3\2"+
		"\2\2L\u0294\3\2\2\2N\u029c\3\2\2\2P\u029e\3\2\2\2R\u02a0\3\2\2\2T\u02b0"+
		"\3\2\2\2V\u02b2\3\2\2\2X\u02b7\3\2\2\2Z\u02bc\3\2\2\2\\\u02c1\3\2\2\2"+
		"^\u02cc\3\2\2\2`\u02d4\3\2\2\2b\u02db\3\2\2\2d\u02dd\3\2\2\2f\u02e5\3"+
		"\2\2\2h\u02ed\3\2\2\2j\u02f2\3\2\2\2l\u02f4\3\2\2\2n\u02fa\3\2\2\2p\u02fe"+
		"\3\2\2\2r\u0304\3\2\2\2t\u0306\3\2\2\2v\u0308\3\2\2\2x\u030a\3\2\2\2z"+
		"\u030f\3\2\2\2|\u0315\3\2\2\2~\u0317\3\2\2\2\u0080\u031c\3\2\2\2\u0082"+
		"\u0321\3\2\2\2\u0084\u0327\3\2\2\2\u0086\u0329\3\2\2\2\u0088\u032b\3\2"+
		"\2\2\u008a\u032d\3\2\2\2\u008c\u032f\3\2\2\2\u008e\u0331\3\2\2\2\u0090"+
		"\u0333\3\2\2\2\u0092\u0337\3\2\2\2\u0094\u0339\3\2\2\2\u0096\u033e\3\2"+
		"\2\2\u0098\u0343\3\2\2\2\u009a\u0353\3\2\2\2\u009c\u0356\3\2\2\2\u009e"+
		"\u035e\3\2\2\2\u00a0\u0361\3\2\2\2\u00a2\u0371\3\2\2\2\u00a4\u0375\3\2"+
		"\2\2\u00a6\u037f\3\2\2\2\u00a8\u0385\3\2\2\2\u00aa\u038d\3\2\2\2\u00ac"+
		"\u039a\3\2\2\2\u00ae\u039d\3\2\2\2\u00b0\u03a2\3\2\2\2\u00b2\u03b4\3\2"+
		"\2\2\u00b4\u03b7\3\2\2\2\u00b6\u03bc\3\2\2\2\u00b8\u03c3\3\2\2\2\u00ba"+
		"\u03cc\3\2\2\2\u00bc\u03d0\3\2\2\2\u00be\u03dd\3\2\2\2\u00c0\u03df\3\2"+
		"\2\2\u00c2\u03e9\3\2\2\2\u00c4\u03f2\3\2\2\2\u00c6\u03fd\3\2\2\2\u00c8"+
		"\u0404\3\2\2\2\u00ca\u040b\3\2\2\2\u00cc\u0411\3\2\2\2\u00ce\u0417\3\2"+
		"\2\2\u00d0\u0419\3\2\2\2\u00d2\u0425\3\2\2\2\u00d4\u0430\3\2\2\2\u00d6"+
		"\u0432\3\2\2\2\u00d8\u0437\3\2\2\2\u00da\u0444\3\2\2\2\u00dc\u044b\3\2"+
		"\2\2\u00de\u044d\3\2\2\2\u00e0\u0459\3\2\2\2\u00e2\u0469\3\2\2\2\u00e4"+
		"\u046b\3\2\2\2\u00e6\u0472\3\2\2\2\u00e8\u0474\3\2\2\2\u00ea\u047a\3\2"+
		"\2\2\u00ec\u047c\3\2\2\2\u00ee\u0484\3\2\2\2\u00f0\u0486\3\2\2\2\u00f2"+
		"\u048a\3\2\2\2\u00f4\u048e\3\2\2\2\u00f6\u0494\3\2\2\2\u00f8\u04a2\3\2"+
		"\2\2\u00fa\u04a7\3\2\2\2\u00fc\u04ba\3\2\2\2\u00fe\u04bc\3\2\2\2\u0100"+
		"\u04bf\3\2\2\2\u0102\u04c2\3\2\2\2\u0104\u04cf\3\2\2\2\u0106\u04d1\3\2"+
		"\2\2\u0108\u04d4\3\2\2\2\u010a\u04d9\3\2\2\2\u010c\u04e1\3\2\2\2\u010e"+
		"\u04ea\3\2\2\2\u0110\u04f0\3\2\2\2\u0112\u04f3\3\2\2\2\u0114\u0508\3\2"+
		"\2\2\u0116\u050c\3\2\2\2\u0118\u0511\3\2\2\2\u011a\u0518\3\2\2\2\u011c"+
		"\u051c\3\2\2\2\u011e\u0520\3\2\2\2\u0120\u0524\3\2\2\2\u0122\u0527\3\2"+
		"\2\2\u0124\u0534\3\2\2\2\u0126\u0537\3\2\2\2\u0128\u053a\3\2\2\2\u012a"+
		"\u054b\3\2\2\2\u012c\u054d\3\2\2\2\u012e\u0557\3\2\2\2\u0130\u0564\3\2"+
		"\2\2\u0132\u0567\3\2\2\2\u0134\u056c\3\2\2\2\u0136\u0579\3\2\2\2\u0138"+
		"\u0584\3\2\2\2\u013a\u058d\3\2\2\2\u013c\u0590\3\2\2\2\u013e\u05a1\3\2"+
		"\2\2\u0140\u05a3\3\2\2\2\u0142\u05a7\3\2\2\2\u0144\u0146\5\u00ecw\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014c\5\4\3\2\u014b"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\2\2\3\u0150\3\3\2\2\2\u0151\u0176"+
		"\5\u013a\u009e\2\u0152\u0153\5T+\2\u0153\u0154\7\r\2\2\u0154\u0177\3\2"+
		"\2\2\u0155\u0156\58\35\2\u0156\u0157\7\r\2\2\u0157\u0177\3\2\2\2\u0158"+
		"\u0159\5\u00d0i\2\u0159\u015a\7\r\2\2\u015a\u0177\3\2\2\2\u015b\u015c"+
		"\5\b\5\2\u015c\u015d\7\r\2\2\u015d\u0177\3\2\2\2\u015e\u015f\5\6\4\2\u015f"+
		"\u0160\7\r\2\2\u0160\u0177\3\2\2\2\u0161\u0162\5\34\17\2\u0162\u0163\7"+
		"\r\2\2\u0163\u0177\3\2\2\2\u0164\u0165\5\u00f0y\2\u0165\u0166\7\r\2\2"+
		"\u0166\u0177\3\2\2\2\u0167\u0168\5\u00f2z\2\u0168\u0169\7\r\2\2\u0169"+
		"\u0177\3\2\2\2\u016a\u016b\5\u0130\u0099\2\u016b\u016c\7\r\2\2\u016c\u0177"+
		"\3\2\2\2\u016d\u016e\5\u0104\u0083\2\u016e\u016f\7\r\2\2\u016f\u0177\3"+
		"\2\2\2\u0170\u0171\5\u0120\u0091\2\u0171\u0172\7\r\2\2\u0172\u0177\3\2"+
		"\2\2\u0173\u0174\5\u0092J\2\u0174\u0175\7\r\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0152\3\2\2\2\u0176\u0155\3\2\2\2\u0176\u0158\3\2\2\2\u0176\u015b\3\2"+
		"\2\2\u0176\u015e\3\2\2\2\u0176\u0161\3\2\2\2\u0176\u0164\3\2\2\2\u0176"+
		"\u0167\3\2\2\2\u0176\u016a\3\2\2\2\u0176\u016d\3\2\2\2\u0176\u0170\3\2"+
		"\2\2\u0176\u0173\3\2\2\2\u0177\5\3\2\2\2\u0178\u0179\7L\2\2\u0179\u017a"+
		"\5\u0142\u00a2\2\u017a\u017c\7\20\2\2\u017b\u017d\5\4\3\2\u017c\u017b"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0181\7\21\2\2\u0181\7\3\2\2\2\u0182\u0185\5\u013a"+
		"\u009e\2\u0183\u0186\5\n\6\2\u0184\u0186\5\f\7\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0184\3\2\2\2\u0186\t\3\2\2\2\u0187\u0188\5\16\b\2\u0188\u0189\7\20\2"+
		"\2\u0189\u018a\5\20\t\2\u018a\u018b\7\21\2\2\u018b\13\3\2\2\2\u018c\u018e"+
		"\t\2\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\7c\2\2\u0190\u0191\5\u0142\u00a2\2\u0191\r\3\2\2\2\u0192\u0194"+
		"\t\2\2\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0196\7c\2\2\u0196\u0198\5\u0142\u00a2\2\u0197\u0199\5\24\13\2\u0198"+
		"\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\17\3\2\2\2\u019a\u019c\5\22\n"+
		"\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\21\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01b6\5\u013a\u009e"+
		"\2\u01a1\u01a2\5T+\2\u01a2\u01a3\7\r\2\2\u01a3\u01b7\3\2\2\2\u01a4\u01a5"+
		"\58\35\2\u01a5\u01a6\7\r\2\2\u01a6\u01b7\3\2\2\2\u01a7\u01a8\5\u00d0i"+
		"\2\u01a8\u01a9\7\r\2\2\u01a9\u01b7\3\2\2\2\u01aa\u01ab\5\u00ceh\2\u01ab"+
		"\u01ac\7\r\2\2\u01ac\u01b7\3\2\2\2\u01ad\u01ae\5\u00d2j\2\u01ae\u01af"+
		"\7\r\2\2\u01af\u01b7\3\2\2\2\u01b0\u01b1\5\u00f0y\2\u01b1\u01b2\7\r\2"+
		"\2\u01b2\u01b7\3\2\2\2\u01b3\u01b4\5\u00f2z\2\u01b4\u01b5\7\r\2\2\u01b5"+
		"\u01b7\3\2\2\2\u01b6\u01a1\3\2\2\2\u01b6\u01a4\3\2\2\2\u01b6\u01a7\3\2"+
		"\2\2\u01b6\u01aa\3\2\2\2\u01b6\u01ad\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b6"+
		"\u01b3\3\2\2\2\u01b7\23\3\2\2\2\u01b8\u01b9\7\16\2\2\u01b9\u01be\5\26"+
		"\f\2\u01ba\u01bb\7\17\2\2\u01bb\u01bd\5\26\f\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\25\3\2\2"+
		"\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\5\30\r\2\u01c2\27\3\2\2\2\u01c3\u01c4"+
		"\5\u013a\u009e\2\u01c4\u01c5\5\32\16\2\u01c5\31\3\2\2\2\u01c6\u01c8\7"+
		"\"\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ce\7s\2\2\u01ca\u01cb\7\"\2\2\u01cb\u01cd\7s\2\2\u01cc\u01ca\3\2\2"+
		"\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\33"+
		"\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d6\5\u013a\u009e\2\u01d2\u01d7\5"+
		"$\23\2\u01d3\u01d7\5\"\22\2\u01d4\u01d7\5 \21\2\u01d5\u01d7\5\36\20\2"+
		"\u01d6\u01d2\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5"+
		"\3\2\2\2\u01d7\35\3\2\2\2\u01d8\u01da\7Y\2\2\u01d9\u01d8\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\7J\2\2\u01dc\u01dd\5\u0142"+
		"\u00a2\2\u01dd\37\3\2\2\2\u01de\u01df\7J\2\2\u01df\u01e0\5\u0142\u00a2"+
		"\2\u01e0\u01e1\5X-\2\u01e1!\3\2\2\2\u01e2\u01e3\7Y\2\2\u01e3\u01e4\7J"+
		"\2\2\u01e4\u01e5\5\u0142\u00a2\2\u01e5\u01e6\5(\25\2\u01e6\u01ea\7\20"+
		"\2\2\u01e7\u01e9\5\22\n\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ed\u01ee\7\21\2\2\u01ee#\3\2\2\2\u01ef\u01f0\5&\24\2\u01f0\u01f4"+
		"\7\20\2\2\u01f1\u01f3\5,\27\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2"+
		"\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4"+
		"\3\2\2\2\u01f7\u01f8\7\21\2\2\u01f8%\3\2\2\2\u01f9\u01fb\7/\2\2\u01fa"+
		"\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\7J"+
		"\2\2\u01fd\u01fe\5\u0142\u00a2\2\u01fe\u01ff\5(\25\2\u01ff\'\3\2\2\2\u0200"+
		"\u0202\7\16\2\2\u0201\u0203\7N\2\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0204\3\2\2\2\u0204\u0209\5*\26\2\u0205\u0206\7\17\2\2\u0206"+
		"\u0208\5*\26\2\u0207\u0205\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u0209\u020a\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020c"+
		"\u0200\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0217\3\2\2\2\u020e\u020f\7K"+
		"\2\2\u020f\u0214\5\26\f\2\u0210\u0211\7\17\2\2\u0211\u0213\5\26\f\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u020e\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218)\3\2\2\2\u0219\u021a\5\30\r\2\u021a+\3\2\2\2\u021b"+
		"\u021f\5\22\n\2\u021c\u021f\5.\30\2\u021d\u021f\5\60\31\2\u021e\u021b"+
		"\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021f-\3\2\2\2\u0220"+
		"\u0225\5\u013a\u009e\2\u0221\u0222\7>\2\2\u0222\u0226\5\u013a\u009e\2"+
		"\u0223\u0224\79\2\2\u0224\u0226\5\u013a\u009e\2\u0225\u0221\3\2\2\2\u0225"+
		"\u0223\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\5X-\2\u0228\u0229\5f\64"+
		"\2\u0229\u022a\7\r\2\2\u022a/\3\2\2\2\u022b\u022c\5\u013a\u009e\2\u022c"+
		"\u022d\7E\2\2\u022d\u022e\5\u0142\u00a2\2\u022e\u0230\7\22\2\2\u022f\u0231"+
		"\5\62\32\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2"+
		"\u0232\u0234\7\23\2\2\u0233\u0235\5\u00dep\2\u0234\u0233\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\7\r\2\2\u0237\61\3\2\2"+
		"\2\u0238\u023d\5\64\33\2\u0239\u023a\7\17\2\2\u023a\u023c\5\64\33\2\u023b"+
		"\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023e\63\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241\5\u013a\u009e\2"+
		"\u0241\u0242\5\66\34\2\u0242\u0243\5\u013a\u009e\2\u0243\u0244\5\u00e2"+
		"r\2\u0244\u0245\5\u013a\u009e\2\u0245\u0246\5j\66\2\u0246\65\3\2\2\2\u0247"+
		"\u0248\7<\2\2\u0248\67\3\2\2\2\u0249\u024a\7H\2\2\u024a\u024b\5:\36\2"+
		"\u024b\u024c\5\u0142\u00a2\2\u024c\u024d\7 \2\2\u024d\u024e\5<\37\2\u024e"+
		"9\3\2\2\2\u024f\u025a\5\u013a\u009e\2\u0250\u025b\5p9\2\u0251\u025b\5"+
		"\u0086D\2\u0252\u025b\5\u0088E\2\u0253\u025b\5\u008aF\2\u0254\u025b\5"+
		"n8\2\u0255\u025b\5\u00c6d\2\u0256\u025b\5\u00c8e\2\u0257\u025b\5\u00e6"+
		"t\2\u0258\u025b\5\32\16\2\u0259\u025b\5\u008cG\2\u025a\u0250\3\2\2\2\u025a"+
		"\u0251\3\2\2\2\u025a\u0252\3\2\2\2\u025a\u0253\3\2\2\2\u025a\u0254\3\2"+
		"\2\2\u025a\u0255\3\2\2\2\u025a\u0256\3\2\2\2\u025a\u0257\3\2\2\2\u025a"+
		"\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025b;\3\2\2\2\u025c\u025d\5> \2\u025d"+
		"=\3\2\2\2\u025e\u0263\5@!\2\u025f\u0260\7\37\2\2\u0260\u0262\5@!\2\u0261"+
		"\u025f\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2"+
		"\2\2\u0264?\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u026b\5B\"\2\u0267\u0268"+
		"\7\35\2\2\u0268\u026a\5B\"\2\u0269\u0267\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026cA\3\2\2\2\u026d\u026b\3\2\2\2"+
		"\u026e\u0273\5D#\2\u026f\u0270\7\36\2\2\u0270\u0272\5D#\2\u0271\u026f"+
		"\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"C\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u027b\5F$\2\u0277\u0278\t\3\2\2\u0278"+
		"\u027a\5F$\2\u0279\u0277\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2"+
		"\2\u027b\u027c\3\2\2\2\u027cE\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0283"+
		"\5H%\2\u027f\u0280\t\4\2\2\u0280\u0282\5H%\2\u0281\u027f\3\2\2\2\u0282"+
		"\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284G\3\2\2\2"+
		"\u0285\u0283\3\2\2\2\u0286\u028b\5J&\2\u0287\u0288\t\5\2\2\u0288\u028a"+
		"\5J&\2\u0289\u0287\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028cI\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u028f\5L\'\2\u028f"+
		"\u0290\5N(\2\u0290\u0293\3\2\2\2\u0291\u0293\5N(\2\u0292\u028e\3\2\2\2"+
		"\u0292\u0291\3\2\2\2\u0293K\3\2\2\2\u0294\u0295\t\6\2\2\u0295M\3\2\2\2"+
		"\u0296\u029d\5\32\16\2\u0297\u029d\5P)\2\u0298\u0299\7\22\2\2\u0299\u029a"+
		"\5<\37\2\u029a\u029b\7\23\2\2\u029b\u029d\3\2\2\2\u029c\u0296\3\2\2\2"+
		"\u029c\u0297\3\2\2\2\u029c\u0298\3\2\2\2\u029dO\3\2\2\2\u029e\u029f\t"+
		"\7\2\2\u029fQ\3\2\2\2\u02a0\u02a1\5<\37\2\u02a1S\3\2\2\2\u02a2\u02a3\7"+
		",\2\2\u02a3\u02a4\5\u013a\u009e\2\u02a4\u02a5\5V,\2\u02a5\u02b1\3\2\2"+
		"\2\u02a6\u02b1\5\u00aaV\2\u02a7\u02b1\5\u00b0Y\2\u02a8\u02b1\5\u00bc_"+
		"\2\u02a9\u02b1\5\u00a0Q\2\u02aa\u02b1\5\u00a6T\2\u02ab\u02ac\7\64\2\2"+
		"\u02ac\u02ad\5\u013a\u009e\2\u02ad\u02ae\5j\66\2\u02ae\u02b1\3\2\2\2\u02af"+
		"\u02b1\5\u00eav\2\u02b0\u02a2\3\2\2\2\u02b0\u02a6\3\2\2\2\u02b0\u02a7"+
		"\3\2\2\2\u02b0\u02a8\3\2\2\2\u02b0\u02a9\3\2\2\2\u02b0\u02aa\3\2\2\2\u02b0"+
		"\u02ab\3\2\2\2\u02b0\u02af\3\2\2\2\u02b1U\3\2\2\2\u02b2\u02b3\5X-\2\u02b3"+
		"\u02b4\5f\64\2\u02b4W\3\2\2\2\u02b5\u02b8\5Z.\2\u02b6\u02b8\5b\62\2\u02b7"+
		"\u02b5\3\2\2\2\u02b7\u02b6\3\2\2\2\u02b8Y\3\2\2\2\u02b9\u02bd\5^\60\2"+
		"\u02ba\u02bd\5`\61\2\u02bb\u02bd\5\32\16\2\u02bc\u02b9\3\2\2\2\u02bc\u02ba"+
		"\3\2\2\2\u02bc\u02bb\3\2\2\2\u02bd[\3\2\2\2\u02be\u02c2\5p9\2\u02bf\u02c2"+
		"\5\u008aF\2\u02c0\u02c2\5\u008cG\2\u02c1\u02be\3\2\2\2\u02c1\u02bf\3\2"+
		"\2\2\u02c1\u02c0\3\2\2\2\u02c2]\3\2\2\2\u02c3\u02cd\5n8\2\u02c4\u02cd"+
		"\5p9\2\u02c5\u02cd\5\u0086D\2\u02c6\u02cd\5\u0088E\2\u02c7\u02cd\5\u008a"+
		"F\2\u02c8\u02cd\5\u008cG\2\u02c9\u02cd\5\u008eH\2\u02ca\u02cd\5\u0090"+
		"I\2\u02cb\u02cd\5\u00e8u\2\u02cc\u02c3\3\2\2\2\u02cc\u02c4\3\2\2\2\u02cc"+
		"\u02c5\3\2\2\2\u02cc\u02c6\3\2\2\2\u02cc\u02c7\3\2\2\2\u02cc\u02c8\3\2"+
		"\2\2\u02cc\u02c9\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd"+
		"_\3\2\2\2\u02ce\u02d5\5\u00c0a\2\u02cf\u02d5\5\u00c2b\2\u02d0\u02d5\5"+
		"\u00c4c\2\u02d1\u02d5\5\u00c6d\2\u02d2\u02d5\5\u00c8e\2\u02d3\u02d5\5"+
		"\u00e4s\2\u02d4\u02ce\3\2\2\2\u02d4\u02cf\3\2\2\2\u02d4\u02d0\3\2\2\2"+
		"\u02d4\u02d1\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5a\3"+
		"\2\2\2\u02d6\u02dc\5\u00aaV\2\u02d7\u02dc\5\u00b0Y\2\u02d8\u02dc\5\u00bc"+
		"_\2\u02d9\u02dc\5\u00a0Q\2\u02da\u02dc\5\u00a6T\2\u02db\u02d6\3\2\2\2"+
		"\u02db\u02d7\3\2\2\2\u02db\u02d8\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02da"+
		"\3\2\2\2\u02dcc\3\2\2\2\u02dd\u02e2\5\u0142\u00a2\2\u02de\u02df\7\17\2"+
		"\2\u02df\u02e1\5\u0142\u00a2\2\u02e0\u02de\3\2\2\2\u02e1\u02e4\3\2\2\2"+
		"\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3e\3\2\2\2\u02e4\u02e2\3"+
		"\2\2\2\u02e5\u02ea\5h\65\2\u02e6\u02e7\7\17\2\2\u02e7\u02e9\5h\65\2\u02e8"+
		"\u02e6\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02ebg\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02f0\5\u013a\u009e\2\u02ee"+
		"\u02f1\5j\66\2\u02ef\u02f1\5l\67\2\u02f0\u02ee\3\2\2\2\u02f0\u02ef\3\2"+
		"\2\2\u02f1i\3\2\2\2\u02f2\u02f3\7s\2\2\u02f3k\3\2\2\2\u02f4\u02f5\5\u00ca"+
		"f\2\u02f5m\3\2\2\2\u02f6\u02fb\7V\2\2\u02f7\u02fb\7]\2\2\u02f8\u02f9\7"+
		"@\2\2\u02f9\u02fb\7]\2\2\u02fa\u02f6\3\2\2\2\u02fa\u02f7\3\2\2\2\u02fa"+
		"\u02f8\3\2\2\2\u02fbo\3\2\2\2\u02fc\u02ff\5r:\2\u02fd\u02ff\5|?\2\u02fe"+
		"\u02fc\3\2\2\2\u02fe\u02fd\3\2\2\2\u02ffq\3\2\2\2\u0300\u0305\5v<\2\u0301"+
		"\u0305\5x=\2\u0302\u0305\5z>\2\u0303\u0305\5t;\2\u0304\u0300\3\2\2\2\u0304"+
		"\u0301\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0303\3\2\2\2\u0305s\3\2\2\2"+
		"\u0306\u0307\7j\2\2\u0307u\3\2\2\2\u0308\u0309\t\b\2\2\u0309w\3\2\2\2"+
		"\u030a\u030b\t\t\2\2\u030by\3\2\2\2\u030c\u030d\7@\2\2\u030d\u0310\7@"+
		"\2\2\u030e\u0310\7p\2\2\u030f\u030c\3\2\2\2\u030f\u030e\3\2\2\2\u0310"+
		"{\3\2\2\2\u0311\u0316\5\u0080A\2\u0312\u0316\5\u0082B\2\u0313\u0316\5"+
		"\u0084C\2\u0314\u0316\5~@\2\u0315\u0311\3\2\2\2\u0315\u0312\3\2\2\2\u0315"+
		"\u0313\3\2\2\2\u0315\u0314\3\2\2\2\u0316}\3\2\2\2\u0317\u0318\7k\2\2\u0318"+
		"\177\3\2\2\2\u0319\u031a\7O\2\2\u031a\u031d\7?\2\2\u031b\u031d\7m\2\2"+
		"\u031c\u0319\3\2\2\2\u031c\u031b\3\2\2\2\u031d\u0081\3\2\2\2\u031e\u031f"+
		"\7O\2\2\u031f\u0322\7@\2\2\u0320\u0322\7o\2\2\u0321\u031e\3\2\2\2\u0321"+
		"\u0320\3\2\2\2\u0322\u0083\3\2\2\2\u0323\u0324\7O\2\2\u0324\u0325\7@\2"+
		"\2\u0325\u0328\7@\2\2\u0326\u0328\7q\2\2\u0327\u0323\3\2\2\2\u0327\u0326"+
		"\3\2\2\2\u0328\u0085\3\2\2\2\u0329\u032a\7T\2\2\u032a\u0087\3\2\2\2\u032b"+
		"\u032c\7;\2\2\u032c\u0089\3\2\2\2\u032d\u032e\7W\2\2\u032e\u008b\3\2\2"+
		"\2\u032f\u0330\7\60\2\2\u0330\u008d\3\2\2\2\u0331\u0332\7S\2\2\u0332\u008f"+
		"\3\2\2\2\u0333\u0334\7M\2\2\u0334\u0091\3\2\2\2\u0335\u0338\5\u0094K\2"+
		"\u0336\u0338\5\u009eP\2\u0337\u0335\3\2\2\2\u0337\u0336\3\2\2\2\u0338"+
		"\u0093\3\2\2\2\u0339\u033a\5\u0096L\2\u033a\u033b\7\20\2\2\u033b\u033c"+
		"\5\u009aN\2\u033c\u033d\7\21\2\2\u033d\u0095\3\2\2\2\u033e\u033f\7r\2"+
		"\2\u033f\u0341\5\u0142\u00a2\2\u0340\u0342\5\u0098M\2\u0341\u0340\3\2"+
		"\2\2\u0341\u0342\3\2\2\2\u0342\u0097\3\2\2\2\u0343\u0344\7\16\2\2\u0344"+
		"\u0345\5\32\16\2\u0345\u0099\3\2\2\2\u0346\u0352\5\u009cO\2\u0347\u0348"+
		"\5\u00bc_\2\u0348\u0349\7\r\2\2\u0349\u0352\3\2\2\2\u034a\u034b\58\35"+
		"\2\u034b\u034c\7\r\2\2\u034c\u0352\3\2\2\2\u034d\u034e\7,\2\2\u034e\u034f"+
		"\5V,\2\u034f\u0350\7\r\2\2\u0350\u0352\3\2\2\2\u0351\u0346\3\2\2\2\u0351"+
		"\u0347\3\2\2\2\u0351\u034a\3\2\2\2\u0351\u034d\3\2\2\2\u0352\u0355\3\2"+
		"\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u009b\3\2\2\2\u0355"+
		"\u0353\3\2\2\2\u0356\u0357\5:\36\2\u0357\u035a\5j\66\2\u0358\u0359\7="+
		"\2\2\u0359\u035b\5<\37\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"\u035c\3\2\2\2\u035c\u035d\7\r\2\2\u035d\u009d\3\2\2\2\u035e\u035f\7r"+
		"\2\2\u035f\u0360\5\32\16\2\u0360\u009f\3\2\2\2\u0361\u0362\7h\2\2\u0362"+
		"\u0365\5\u0142\u00a2\2\u0363\u0364\7\16\2\2\u0364\u0366\5\32\16\2\u0365"+
		"\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\7\20"+
		"\2\2\u0368\u0369\5\u00a2R\2\u0369\u036a\7\21\2\2\u036a\u00a1\3\2\2\2\u036b"+
		"\u036d\5\u00a4S\2\u036c\u036e\5d\63\2\u036d\u036c\3\2\2\2\u036d\u036e"+
		"\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\7\r\2\2\u0370\u0372\3\2\2\2\u0371"+
		"\u036b\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2"+
		"\2\2\u0374\u00a3\3\2\2\2\u0375\u0376\5\u013a\u009e\2\u0376\u0377\7g\2"+
		"\2\u0377\u0378\7\30\2\2\u0378\u037b\5R*\2\u0379\u037a\7\17\2\2\u037a\u037c"+
		"\5\\/\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d"+
		"\u037e\7\31\2\2\u037e\u00a5\3\2\2\2\u037f\u0380\7i\2\2\u0380\u0381\5\u0142"+
		"\u00a2\2\u0381\u0382\7\20\2\2\u0382\u0383\5\u00a8U\2\u0383\u0384\7\21"+
		"\2\2\u0384\u00a7\3\2\2\2\u0385\u038a\5\u0142\u00a2\2\u0386\u0387\7\17"+
		"\2\2\u0387\u0389\5\u0142\u00a2\2\u0388\u0386\3\2\2\2\u0389\u038c\3\2\2"+
		"\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u00a9\3\2\2\2\u038c\u038a"+
		"\3\2\2\2\u038d\u038e\7\63\2\2\u038e\u0391\5\u0142\u00a2\2\u038f\u0390"+
		"\7\16\2\2\u0390\u0392\5\32\16\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2"+
		"\2\u0392\u0393\3\2\2\2\u0393\u0394\7\20\2\2\u0394\u0395\5\u00acW\2\u0395"+
		"\u0396\7\21\2\2\u0396\u00ab\3\2\2\2\u0397\u0399\5\u00aeX\2\u0398\u0397"+
		"\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b"+
		"\u00ad\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039e\5\u013a\u009e\2\u039e\u039f"+
		"\5X-\2\u039f\u03a0\5f\64\2\u03a0\u03a1\7\r\2\2\u03a1\u00af\3\2\2\2\u03a2"+
		"\u03a3\7Q\2\2\u03a3\u03a4\5\u0142\u00a2\2\u03a4\u03a5\7*\2\2\u03a5\u03a6"+
		"\7\22\2\2\u03a6\u03a7\5\u013a\u009e\2\u03a7\u03a8\5\u00b2Z\2\u03a8\u03a9"+
		"\7\23\2\2\u03a9\u03aa\7\20\2\2\u03aa\u03ab\5\u00b4[\2\u03ab\u03ac\7\21"+
		"\2\2\u03ac\u00b1\3\2\2\2\u03ad\u03b5\5p9\2\u03ae\u03b5\5\u0086D\2\u03af"+
		"\u03b5\5\u0088E\2\u03b0\u03b5\5\u008cG\2\u03b1\u03b5\5\u008aF\2\u03b2"+
		"\u03b5\5\u00bc_\2\u03b3\u03b5\5\32\16\2\u03b4\u03ad\3\2\2\2\u03b4\u03ae"+
		"\3\2\2\2\u03b4\u03af\3\2\2\2\u03b4\u03b0\3\2\2\2\u03b4\u03b1\3\2\2\2\u03b4"+
		"\u03b2\3\2\2\2\u03b4\u03b3\3\2\2\2\u03b5\u00b3\3\2\2\2\u03b6\u03b8\5\u00b6"+
		"\\\2\u03b7\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u00b5\3\2\2\2\u03bb\u03bd\5\u00b8]\2\u03bc\u03bb"+
		"\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u03c0\3\2\2\2\u03c0\u03c1\5\u00ba^\2\u03c1\u03c2\7\r\2\2\u03c2\u00b7"+
		"\3\2\2\2\u03c3\u03ca\5\u013a\u009e\2\u03c4\u03c5\7U\2\2\u03c5\u03c6\5"+
		"<\37\2\u03c6\u03c7\7\16\2\2\u03c7\u03cb\3\2\2\2\u03c8\u03c9\7=\2\2\u03c9"+
		"\u03cb\7\16\2\2\u03ca\u03c4\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb\u00b9\3"+
		"\2\2\2\u03cc\u03cd\5\u013a\u009e\2\u03cd\u03ce\5X-\2\u03ce\u03cf\5h\65"+
		"\2\u03cf\u00bb\3\2\2\2\u03d0\u03d1\7A\2\2\u03d1\u03d2\5\u0142\u00a2\2"+
		"\u03d2\u03d3\7\20\2\2\u03d3\u03d8\5\u00be`\2\u03d4\u03d5\7\17\2\2\u03d5"+
		"\u03d7\5\u00be`\2\u03d6\u03d4\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6"+
		"\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03db\3\2\2\2\u03da\u03d8\3\2\2\2\u03db"+
		"\u03dc\7\21\2\2\u03dc\u00bd\3\2\2\2\u03dd\u03de\5\u0142\u00a2\2\u03de"+
		"\u00bf\3\2\2\2\u03df\u03e0\7\61\2\2\u03e0\u03e1\7\30\2\2\u03e1\u03e2\5"+
		"\u013a\u009e\2\u03e2\u03e5\5Z.\2\u03e3\u03e4\7\17\2\2\u03e4\u03e6\5R*"+
		"\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8"+
		"\7\31\2\2\u03e8\u00c1\3\2\2\2\u03e9\u03ea\7e\2\2\u03ea\u03eb\7\30\2\2"+
		"\u03eb\u03ee\5Z.\2\u03ec\u03ed\7\17\2\2\u03ed\u03ef\5R*\2\u03ee\u03ec"+
		"\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\7\31\2\2"+
		"\u03f1\u00c3\3\2\2\2\u03f2\u03f3\7f\2\2\u03f3\u03f4\7\30\2\2\u03f4\u03f5"+
		"\5Z.\2\u03f5\u03f6\7\17\2\2\u03f6\u03f9\5Z.\2\u03f7\u03f8\7\17\2\2\u03f8"+
		"\u03fa\5R*\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\3\2\2"+
		"\2\u03fb\u03fc\7\31\2\2\u03fc\u00c5\3\2\2\2\u03fd\u0402\7)\2\2\u03fe\u03ff"+
		"\7\30\2\2\u03ff\u0400\5R*\2\u0400\u0401\7\31\2\2\u0401\u0403\3\2\2\2\u0402"+
		"\u03fe\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u00c7\3\2\2\2\u0404\u0409\7B"+
		"\2\2\u0405\u0406\7\30\2\2\u0406\u0407\5R*\2\u0407\u0408\7\31\2\2\u0408"+
		"\u040a\3\2\2\2\u0409\u0405\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u00c9\3\2"+
		"\2\2\u040b\u040d\7s\2\2\u040c\u040e\5\u00ccg\2\u040d\u040c\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u00cb\3\2"+
		"\2\2\u0411\u0412\7\24\2\2\u0412\u0413\5R*\2\u0413\u0414\7\25\2\2\u0414"+
		"\u00cd\3\2\2\2\u0415\u0418\5\u00f4{\2\u0416\u0418\5\u00f8}\2\u0417\u0415"+
		"\3\2\2\2\u0417\u0416\3\2\2\2\u0418\u00cf\3\2\2\2\u0419\u041a\7F\2\2\u041a"+
		"\u041b\5\u0142\u00a2\2\u041b\u041f\7\20\2\2\u041c\u041e\5\u00aeX\2\u041d"+
		"\u041c\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2"+
		"\2\2\u0420\u0422\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0423\7\21\2\2\u0423"+
		"\u00d1\3\2\2\2\u0424\u0426\5\u00d4k\2\u0425\u0424\3\2\2\2\u0425\u0426"+
		"\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\5\u00d6l\2\u0428\u0429\5\u0142"+
		"\u00a2\2\u0429\u042b\5\u00d8m\2\u042a\u042c\5\u00dep\2\u042b\u042a\3\2"+
		"\2\2\u042b\u042c\3\2\2\2\u042c\u042e\3\2\2\2\u042d\u042f\5\u00e0q\2\u042e"+
		"\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u00d3\3\2\2\2\u0430\u0431\7R"+
		"\2\2\u0431\u00d5\3\2\2\2\u0432\u0435\5\u013a\u009e\2\u0433\u0436\5\u00e2"+
		"r\2\u0434\u0436\78\2\2\u0435\u0433\3\2\2\2\u0435\u0434\3\2\2\2\u0436\u00d7"+
		"\3\2\2\2\u0437\u0440\7\22\2\2\u0438\u043d\5\u00dan\2\u0439\u043a\7\17"+
		"\2\2\u043a\u043c\5\u00dan\2\u043b\u0439\3\2\2\2\u043c\u043f\3\2\2\2\u043d"+
		"\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u043d\3\2"+
		"\2\2\u0440\u0438\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442"+
		"\u0443\7\23\2\2\u0443\u00d9\3\2\2\2\u0444\u0445\5\u013a\u009e\2\u0445"+
		"\u0446\5\u00dco\2\u0446\u0447\5\u013a\u009e\2\u0447\u0448\5\u00e2r\2\u0448"+
		"\u0449\5\u013a\u009e\2\u0449\u044a\5j\66\2\u044a\u00db\3\2\2\2\u044b\u044c"+
		"\t\n\2\2\u044c\u00dd\3\2\2\2\u044d\u044e\7\67\2\2\u044e\u044f\7\22\2\2"+
		"\u044f\u0454\5\30\r\2\u0450\u0451\7\17\2\2\u0451\u0453\5\30\r\2\u0452"+
		"\u0450\3\2\2\2\u0453\u0456\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2"+
		"\2\2\u0455\u0457\3\2\2\2\u0456\u0454\3\2\2\2\u0457\u0458\7\23\2\2\u0458"+
		"\u00df\3\2\2\2\u0459\u045a\7C\2\2\u045a\u045b\7\22\2\2\u045b\u0460\7\13"+
		"\2\2\u045c\u045d\7\17\2\2\u045d\u045f\7\13\2\2\u045e\u045c\3\2\2\2\u045f"+
		"\u0462\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0463\3\2"+
		"\2\2\u0462\u0460\3\2\2\2\u0463\u0464\7\23\2\2\u0464\u00e1\3\2\2\2\u0465"+
		"\u046a\5^\60\2\u0466\u046a\5\u00c6d\2\u0467\u046a\5\u00c8e\2\u0468\u046a"+
		"\5\32\16\2\u0469\u0465\3\2\2\2\u0469\u0466\3\2\2\2\u0469\u0467\3\2\2\2"+
		"\u0469\u0468\3\2\2\2\u046a\u00e3\3\2\2\2\u046b\u046c\7P\2\2\u046c\u046d"+
		"\7\30\2\2\u046d\u046e\5R*\2\u046e\u046f\7\17\2\2\u046f\u0470\5R*\2\u0470"+
		"\u0471\7\31\2\2\u0471\u00e5\3\2\2\2\u0472\u0473\7P\2\2\u0473\u00e7\3\2"+
		"\2\2\u0474\u0475\7I\2\2\u0475\u00e9\3\2\2\2\u0476\u0477\7\63\2\2\u0477"+
		"\u047b\7s\2\2\u0478\u0479\7Q\2\2\u0479\u047b\7s\2\2\u047a\u0476\3\2\2"+
		"\2\u047a\u0478\3\2\2\2\u047b\u00eb\3\2\2\2\u047c\u047d\5\u013a\u009e\2"+
		"\u047d\u047e\7\62\2\2\u047e\u047f\5\u013a\u009e\2\u047f\u0480\5\u00ee"+
		"x\2\u0480\u0481\7\r\2\2\u0481\u00ed\3\2\2\2\u0482\u0485\5\32\16\2\u0483"+
		"\u0485\7\13\2\2\u0484\u0482\3\2\2\2\u0484\u0483\3\2\2\2\u0485\u00ef\3"+
		"\2\2\2\u0486\u0487\7_\2\2\u0487\u0488\5\30\r\2\u0488\u0489\7\13\2\2\u0489"+
		"\u00f1\3\2\2\2\u048a\u048b\7^\2\2\u048b\u048c\5\30\r\2\u048c\u048d\7\13"+
		"\2\2\u048d\u00f3\3\2\2\2\u048e\u048f\7\65\2\2\u048f\u0490\7`\2\2\u0490"+
		"\u0491\5\u013a\u009e\2\u0491\u0492\5\u00e2r\2\u0492\u0493\5\u00f6|\2\u0493"+
		"\u00f5\3\2\2\2\u0494\u0495\5\u013a\u009e\2\u0495\u04a0\5j\66\2\u0496\u04a1"+
		"\5\u00dep\2\u0497\u0498\7\17\2\2\u0498\u0499\5\u013a\u009e\2\u0499\u049a"+
		"\5j\66\2\u049a\u049c\3\2\2\2\u049b\u0497\3\2\2\2\u049c\u049f\3\2\2\2\u049d"+
		"\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a1\3\2\2\2\u049f\u049d\3\2"+
		"\2\2\u04a0\u0496\3\2\2\2\u04a0\u049d\3\2\2\2\u04a1\u00f7\3\2\2\2\u04a2"+
		"\u04a3\7`\2\2\u04a3\u04a4\5\u013a\u009e\2\u04a4\u04a5\5\u00e2r\2\u04a5"+
		"\u04a6\5\u00fa~\2\u04a6\u00f9\3\2\2\2\u04a7\u04a8\5\u013a\u009e\2\u04a8"+
		"\u04b3\5j\66\2\u04a9\u04b4\5\u00fc\177\2\u04aa\u04ab\7\17\2\2\u04ab\u04ac"+
		"\5\u013a\u009e\2\u04ac\u04ad\5j\66\2\u04ad\u04af\3\2\2\2\u04ae\u04aa\3"+
		"\2\2\2\u04af\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1"+
		"\u04b4\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04a9\3\2\2\2\u04b3\u04b0\3\2"+
		"\2\2\u04b4\u00fb\3\2\2\2\u04b5\u04b7\5\u00fe\u0080\2\u04b6\u04b8\5\u0100"+
		"\u0081\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04bb\3\2\2\2\u04b9"+
		"\u04bb\5\u0100\u0081\2\u04ba\u04b5\3\2\2\2\u04ba\u04b9\3\2\2\2\u04bb\u00fd"+
		"\3\2\2\2\u04bc\u04bd\7G\2\2\u04bd\u04be\5\u0102\u0082\2\u04be\u00ff\3"+
		"\2\2\2\u04bf\u04c0\7&\2\2\u04c0\u04c1\5\u0102\u0082\2\u04c1\u0101\3\2"+
		"\2\2\u04c2\u04c3\7\22\2\2\u04c3\u04c8\5\30\r\2\u04c4\u04c5\7\17\2\2\u04c5"+
		"\u04c7\5\30\r\2\u04c6\u04c4\3\2\2\2\u04c7\u04ca\3\2\2\2\u04c8\u04c6\3"+
		"\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cb\3\2\2\2\u04ca\u04c8\3\2\2\2\u04cb"+
		"\u04cc\7\23\2\2\u04cc\u0103\3\2\2\2\u04cd\u04d0\5\u0108\u0085\2\u04ce"+
		"\u04d0\5\u0106\u0084\2\u04cf\u04cd\3\2\2\2\u04cf\u04ce\3\2\2\2\u04d0\u0105"+
		"\3\2\2\2\u04d1\u04d2\7d\2\2\u04d2\u04d3\7s\2\2\u04d3\u0107\3\2\2\2\u04d4"+
		"\u04d5\5\u010a\u0086\2\u04d5\u04d6\7\20\2\2\u04d6\u04d7\5\u0110\u0089"+
		"\2\u04d7\u04d8\7\21\2\2\u04d8\u0109\3\2\2\2\u04d9\u04da\7d\2\2\u04da\u04dc"+
		"\5\u0142\u00a2\2\u04db\u04dd\5\u010e\u0088\2\u04dc\u04db\3\2\2\2\u04dc"+
		"\u04dd\3\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04e0\5\u010c\u0087\2\u04df\u04de"+
		"\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u010b\3\2\2\2\u04e1\u04e2\7K\2\2\u04e2"+
		"\u04e7\5\30\r\2\u04e3\u04e4\7\17\2\2\u04e4\u04e6\5\30\r\2\u04e5\u04e3"+
		"\3\2\2\2\u04e6\u04e9\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8"+
		"\u010d\3\2\2\2\u04e9\u04e7\3\2\2\2\u04ea\u04eb\7\16\2\2\u04eb\u04ec\5"+
		"\30\r\2\u04ec\u010f\3\2\2\2\u04ed\u04ef\5\u0112\u008a\2\u04ee\u04ed\3"+
		"\2\2\2\u04ef\u04f2\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1"+
		"\u0111\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3\u0506\5\u013a\u009e\2\u04f4\u04f5"+
		"\5\u0114\u008b\2\u04f5\u04f6\7\r\2\2\u04f6\u0507\3\2\2\2\u04f7\u04f8\5"+
		"\u0118\u008d\2\u04f8\u04f9\7\r\2\2\u04f9\u0507\3\2\2\2\u04fa\u04fb\5\u011a"+
		"\u008e\2\u04fb\u04fc\7\r\2\2\u04fc\u0507\3\2\2\2\u04fd\u04fe\5\u011c\u008f"+
		"\2\u04fe\u04ff\7\r\2\2\u04ff\u0507\3\2\2\2\u0500\u0501\5\u011e\u0090\2"+
		"\u0501\u0502\7\r\2\2\u0502\u0507\3\2\2\2\u0503\u0504\5\u00ceh\2\u0504"+
		"\u0505\7\r\2\2\u0505\u0507\3\2\2\2\u0506\u04f4\3\2\2\2\u0506\u04f7\3\2"+
		"\2\2\u0506\u04fa\3\2\2\2\u0506\u04fd\3\2\2\2\u0506\u0500\3\2\2\2\u0506"+
		"\u0503\3\2\2\2\u0507\u0113\3\2\2\2\u0508\u0509\7[\2\2\u0509\u050a\5\u0116"+
		"\u008c\2\u050a\u050b\7s\2\2\u050b\u0115\3\2\2\2\u050c\u050f\5\u013a\u009e"+
		"\2\u050d\u0510\5\32\16\2\u050e\u0510\7M\2\2\u050f\u050d\3\2\2\2\u050f"+
		"\u050e\3\2\2\2\u0510\u0117\3\2\2\2\u0511\u0513\7-\2\2\u0512\u0514\7X\2"+
		"\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0516"+
		"\5\u0116\u008c\2\u0516\u0517\7s\2\2\u0517\u0119\3\2\2\2\u0518\u0519\7"+
		"(\2\2\u0519\u051a\5\30\r\2\u051a\u051b\7s\2\2\u051b\u011b\3\2\2\2\u051c"+
		"\u051d\7+\2\2\u051d\u051e\5\30\r\2\u051e\u051f\7s\2\2\u051f\u011d\3\2"+
		"\2\2\u0520\u0521\7\\\2\2\u0521\u0522\5\30\r\2\u0522\u0523\7s\2\2\u0523"+
		"\u011f\3\2\2\2\u0524\u0525\5\u0122\u0092\2\u0525\u0526\5\u0128\u0095\2"+
		"\u0526\u0121\3\2\2\2\u0527\u0528\7D\2\2\u0528\u052a\5\u0142\u00a2\2\u0529"+
		"\u052b\5\u0124\u0093\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052d"+
		"\3\2\2\2\u052c\u052e\5\u010c\u0087\2\u052d\u052c\3\2\2\2\u052d\u052e\3"+
		"\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530\7b\2\2\u0530\u0532\5\30\r\2\u0531"+
		"\u0533\5\u0126\u0094\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0123"+
		"\3\2\2\2\u0534\u0535\7\16\2\2\u0535\u0536\5\30\r\2\u0536\u0125\3\2\2\2"+
		"\u0537\u0538\7.\2\2\u0538\u0539\5\30\r\2\u0539\u0127\3\2\2\2\u053a\u053e"+
		"\7\20\2\2\u053b\u053d\5\u012a\u0096\2\u053c\u053b\3\2\2\2\u053d\u0540"+
		"\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\3\2\2\2\u0540"+
		"\u053e\3\2\2\2\u0541\u0542\7\21\2\2\u0542\u0129\3\2\2\2\u0543\u054c\5"+
		"\22\n\2\u0544\u0547\5\u013a\u009e\2\u0545\u0548\5\u012c\u0097\2\u0546"+
		"\u0548\5\u012e\u0098\2\u0547\u0545\3\2\2\2\u0547\u0546\3\2\2\2\u0548\u0549"+
		"\3\2\2\2\u0549\u054a\7\r\2\2\u054a\u054c\3\2\2\2\u054b\u0543\3\2\2\2\u054b"+
		"\u0544\3\2\2\2\u054c\u012b\3\2\2\2\u054d\u054e\7E\2\2\u054e\u054f\5\u0142"+
		"\u00a2\2\u054f\u0551\7\22\2\2\u0550\u0552\5\62\32\2\u0551\u0550\3\2\2"+
		"\2\u0551\u0552\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0555\7\23\2\2\u0554"+
		"\u0556\5\u00dep\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u012d"+
		"\3\2\2\2\u0557\u0558\7\66\2\2\u0558\u0559\5\u0142\u00a2\2\u0559\u055b"+
		"\7\22\2\2\u055a\u055c\5\62\32\2\u055b\u055a\3\2\2\2\u055b\u055c\3\2\2"+
		"\2\u055c\u055d\3\2\2\2\u055d\u055f\7\23\2\2\u055e\u0560\5\u00dep\2\u055f"+
		"\u055e\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u012f\3\2\2\2\u0561\u0565\5\u0136"+
		"\u009c\2\u0562\u0565\5\u0134\u009b\2\u0563\u0565\5\u0132\u009a\2\u0564"+
		"\u0561\3\2\2\2\u0564\u0562\3\2\2\2\u0564\u0563\3\2\2\2\u0565\u0131\3\2"+
		"\2\2\u0566\u0568\7Y\2\2\u0567\u0566\3\2\2\2\u0567\u0568\3\2\2\2\u0568"+
		"\u0569\3\2\2\2\u0569\u056a\7:\2\2\u056a\u056b\7s\2\2\u056b\u0133\3\2\2"+
		"\2\u056c\u056d\7Y\2\2\u056d\u056e\7:\2\2\u056e\u056f\5\u0142\u00a2\2\u056f"+
		"\u0570\5(\25\2\u0570\u0574\7\20\2\2\u0571\u0573\5\22\n\2\u0572\u0571\3"+
		"\2\2\2\u0573\u0576\3\2\2\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u0577\3\2\2\2\u0576\u0574\3\2\2\2\u0577\u0578\7\21\2\2\u0578\u0135\3"+
		"\2\2\2\u0579\u057a\5\u0138\u009d\2\u057a\u057e\7\20\2\2\u057b\u057d\5"+
		",\27\2\u057c\u057b\3\2\2\2\u057d\u0580\3\2\2\2\u057e\u057c\3\2\2\2\u057e"+
		"\u057f\3\2\2\2\u057f\u0581\3\2\2\2\u0580\u057e\3\2\2\2\u0581\u0582\7\21"+
		"\2\2\u0582\u0137\3\2\2\2\u0583\u0585\7/\2\2\u0584\u0583\3\2\2\2\u0584"+
		"\u0585\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0587\7:\2\2\u0587\u0588\5\u0142"+
		"\u00a2\2\u0588\u0589\5(\25\2\u0589\u0139\3\2\2\2\u058a\u058c\5\u013c\u009f"+
		"\2\u058b\u058a\3\2\2\2\u058c\u058f\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e"+
		"\3\2\2\2\u058e\u013b\3\2\2\2\u058f\u058d\3\2\2\2\u0590\u0591\7%\2\2\u0591"+
		"\u0596\5\32\16\2\u0592\u0593\7\22\2\2\u0593\u0594\5\u013e\u00a0\2\u0594"+
		"\u0595\7\23\2\2\u0595\u0597\3\2\2\2\u0596\u0592\3\2\2\2\u0596\u0597\3"+
		"\2\2\2\u0597\u013d\3\2\2\2\u0598\u05a2\5<\37\2\u0599\u059e\5\u0140\u00a1"+
		"\2\u059a\u059b\7\17\2\2\u059b\u059d\5\u0140\u00a1\2\u059c\u059a\3\2\2"+
		"\2\u059d\u05a0\3\2\2\2\u059e\u059c\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a2"+
		"\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1\u0598\3\2\2\2\u05a1\u0599\3\2\2\2\u05a2"+
		"\u013f\3\2\2\2\u05a3\u05a4\7s\2\2\u05a4\u05a5\7 \2\2\u05a5\u05a6\5<\37"+
		"\2\u05a6\u0141\3\2\2\2\u05a7\u05a8\5\u013a\u009e\2\u05a8\u05a9\7s\2\2"+
		"\u05a9\u0143\3\2\2\2\177\u0147\u014d\u0176\u017e\u0185\u018d\u0193\u0198"+
		"\u019d\u01b6\u01be\u01c7\u01ce\u01d6\u01d9\u01ea\u01f4\u01fa\u0202\u0209"+
		"\u020c\u0214\u0217\u021e\u0225\u0230\u0234\u023d\u025a\u0263\u026b\u0273"+
		"\u027b\u0283\u028b\u0292\u029c\u02b0\u02b7\u02bc\u02c1\u02cc\u02d4\u02db"+
		"\u02e2\u02ea\u02f0\u02fa\u02fe\u0304\u030f\u0315\u031c\u0321\u0327\u0337"+
		"\u0341\u0351\u0353\u035a\u0365\u036d\u0373\u037b\u038a\u0391\u039a\u03b4"+
		"\u03b9\u03be\u03ca\u03d8\u03e5\u03ee\u03f9\u0402\u0409\u040f\u0417\u041f"+
		"\u0425\u042b\u042e\u0435\u043d\u0440\u0454\u0460\u0469\u047a\u0484\u049d"+
		"\u04a0\u04b0\u04b3\u04b7\u04ba\u04c8\u04cf\u04dc\u04df\u04e7\u04f0\u0506"+
		"\u050f\u0513\u052a\u052d\u0532\u053e\u0547\u054b\u0551\u0555\u055b\u055f"+
		"\u0564\u0567\u0574\u057e\u0584\u058d\u0596\u059e\u05a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}