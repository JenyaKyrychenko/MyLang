// Generated from D:/Код/Compilers/MyLanguage/src/main/java\Hello.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#programHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeading(HelloParser.ProgramHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(HelloParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HelloParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsesUnitsPart(HelloParser.UsesUnitsPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDeclarationPart(HelloParser.LabelDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(HelloParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinitionPart(HelloParser.ConstantDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(HelloParser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#constantChr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantChr(HelloParser.ConstantChrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(HelloParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(HelloParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(HelloParser.UnsignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#unsignedReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedReal(HelloParser.UnsignedRealContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(HelloParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(HelloParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(HelloParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionPart(HelloParser.TypeDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(HelloParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(HelloParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#procedureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureType(HelloParser.ProcedureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HelloParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(HelloParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#scalarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(HelloParser.ScalarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#subrangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrangeType(HelloParser.SubrangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(HelloParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#structuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredType(HelloParser.StructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpackedStructuredType(HelloParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stringtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringtype(HelloParser.StringtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(HelloParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(HelloParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(HelloParser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#componentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentType(HelloParser.ComponentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(HelloParser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(HelloParser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#fixedPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedPart(HelloParser.FixedPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#recordSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordSection(HelloParser.RecordSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#variantPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantPart(HelloParser.VariantPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(HelloParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant(HelloParser.VariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#setType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(HelloParser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(HelloParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#fileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileType(HelloParser.FileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(HelloParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationPart(HelloParser.VariableDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(HelloParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAndFunctionDeclarationPart(HelloParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureOrFunctionDeclaration(HelloParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(HelloParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(HelloParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#formalParameterSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterSection(HelloParser.FormalParameterSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(HelloParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(HelloParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstList(HelloParser.ConstListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(HelloParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(HelloParser.ResultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HelloParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlabelledStatement(HelloParser.UnlabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(HelloParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(HelloParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(HelloParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#relationaloperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationaloperator(HelloParser.RelationaloperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(HelloParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#additiveoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveoperator(HelloParser.AdditiveoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(HelloParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeoperator(HelloParser.MultiplicativeoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(HelloParser.SignedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(HelloParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(HelloParser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#functionDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDesignator(HelloParser.FunctionDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(HelloParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(HelloParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(HelloParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(HelloParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(HelloParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(HelloParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#parameterwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterwidth(HelloParser.ParameterwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(HelloParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(HelloParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(HelloParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(HelloParser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(HelloParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(HelloParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(HelloParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(HelloParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(HelloParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#caseListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseListElement(HelloParser.CaseListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetetiveStatement(HelloParser.RepetetiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(HelloParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(HelloParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(HelloParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(HelloParser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(HelloParser.InitialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(HelloParser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(HelloParser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#recordVariableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordVariableList(HelloParser.RecordVariableListContext ctx);
}