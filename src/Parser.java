package src;

public class Parser {
    private final Lexer lexer;
    private Token current;

    public Parser(String src) {
        this.lexer = new Lexer(src);
        this.current = lexer.next();
    }

    private void eat(Token.Kind k) {
        if (current.kind != k)
            throw new RuntimeException("expected " + k + " found " + current.kind);
        current = lexer.next();
    }

    public AST.Func parseFunc() {
        eat(Token.Kind.FUNC);
        String name = current.text;
        eat(Token.Kind.IDENT);
        eat(Token.Kind.COLON);
        return new AST.Func(name);
    }
}
