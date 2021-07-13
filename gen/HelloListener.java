// Generated from D:/Код/Compilers/MyLanguage/src/main/java\Hello.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(HelloParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(HelloParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(HelloParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(HelloParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HelloParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HelloParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void enterUsesUnitsPart(HelloParser.UsesUnitsPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void exitUsesUnitsPart(HelloParser.UsesUnitsPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterLabelDeclarationPart(HelloParser.LabelDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitLabelDeclarationPart(HelloParser.LabelDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(HelloParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(HelloParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(HelloParser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(HelloParser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(HelloParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(HelloParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void enterConstantChr(HelloParser.ConstantChrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void exitConstantChr(HelloParser.ConstantChrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(HelloParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(HelloParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(HelloParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(HelloParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(HelloParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(HelloParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(HelloParser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(HelloParser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(HelloParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(HelloParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(HelloParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(HelloParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(HelloParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(HelloParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionPart(HelloParser.TypeDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionPart(HelloParser.TypeDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(HelloParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(HelloParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(HelloParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(HelloParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureType(HelloParser.ProcedureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureType(HelloParser.ProcedureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HelloParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HelloParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(HelloParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(HelloParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(HelloParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(HelloParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(HelloParser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(HelloParser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(HelloParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(HelloParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(HelloParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(HelloParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedStructuredType(HelloParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedStructuredType(HelloParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void enterStringtype(HelloParser.StringtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void exitStringtype(HelloParser.StringtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(HelloParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(HelloParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(HelloParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(HelloParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(HelloParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(HelloParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(HelloParser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(HelloParser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(HelloParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(HelloParser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(HelloParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(HelloParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void enterFixedPart(HelloParser.FixedPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void exitFixedPart(HelloParser.FixedPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void enterRecordSection(HelloParser.RecordSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void exitRecordSection(HelloParser.RecordSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void enterVariantPart(HelloParser.VariantPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void exitVariantPart(HelloParser.VariantPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(HelloParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(HelloParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(HelloParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(HelloParser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(HelloParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(HelloParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(HelloParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(HelloParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#fileType}.
	 * @param ctx the parse tree
	 */
	void enterFileType(HelloParser.FileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#fileType}.
	 * @param ctx the parse tree
	 */
	void exitFileType(HelloParser.FileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(HelloParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(HelloParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(HelloParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(HelloParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(HelloParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(HelloParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(HelloParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(HelloParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(HelloParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(HelloParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(HelloParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(HelloParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(HelloParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(HelloParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(HelloParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(HelloParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(HelloParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(HelloParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(HelloParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(HelloParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(HelloParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(HelloParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(HelloParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(HelloParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(HelloParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(HelloParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(HelloParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(HelloParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(HelloParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(HelloParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(HelloParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(HelloParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(HelloParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(HelloParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(HelloParser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(HelloParser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(HelloParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(HelloParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(HelloParser.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(HelloParser.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(HelloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(HelloParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(HelloParser.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(HelloParser.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(HelloParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(HelloParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(HelloParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(HelloParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(HelloParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(HelloParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(HelloParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(HelloParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(HelloParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(HelloParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(HelloParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(HelloParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(HelloParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(HelloParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HelloParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HelloParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(HelloParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(HelloParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(HelloParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(HelloParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void enterParameterwidth(HelloParser.ParameterwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void exitParameterwidth(HelloParser.ParameterwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(HelloParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(HelloParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(HelloParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(HelloParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(HelloParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(HelloParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(HelloParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(HelloParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(HelloParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(HelloParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(HelloParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(HelloParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(HelloParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(HelloParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(HelloParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(HelloParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(HelloParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(HelloParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(HelloParser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(HelloParser.CaseListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(HelloParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(HelloParser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(HelloParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(HelloParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(HelloParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(HelloParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(HelloParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(HelloParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(HelloParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(HelloParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(HelloParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(HelloParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(HelloParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(HelloParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(HelloParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(HelloParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void enterRecordVariableList(HelloParser.RecordVariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void exitRecordVariableList(HelloParser.RecordVariableListContext ctx);
}