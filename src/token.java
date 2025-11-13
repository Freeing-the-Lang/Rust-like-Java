package src;

public class Token {
    public enum Kind {
        IDENT, NUMBER, STRING,
        LBRACE, RBRACE, LPAREN, RPAREN,
        SEMI, COLON, ARROW,
        FUNC, CLASS,
        EOF
    }

    public final Kind kind;
    public final String text;

    public Token(Kind kind, String text) {
        this.kind = kind;
        this.text = text;
    }
}
