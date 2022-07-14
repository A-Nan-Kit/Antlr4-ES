package com.power.es.AIQL;

import com.power.es.gen.EsInitLexer;
import com.power.es.gen.EsInitParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import com.power.es.gen.impl.*;
import java.util.Stack;

/**
 * @author A_Nan
 */
public class Utils {

    /**
     *
     * @return string
     */
    public static String getEsQuery(String code) {
        CodePointCharStream charStream = CharStreams.fromString(code);
        EsInitLexer lexer = new EsInitLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        EsInitParser parser = new EsInitParser(tokenStream);
        ParseTree tree = parser.parse();
        EsInitListenerImpl listener = new EsInitListenerImpl();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        Stack<Object> stack = listener.getStack();
        return stack.isEmpty() ? null : stack.pop().toString();
    }
}
