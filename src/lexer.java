package src;

public class Lexer {
    private final String src;
    private int pos = 0;

    public Lexer(String src) {
        this.src = src;
    }

    private char peek() {
        return pos < src.length() ? src.charAt(pos) : '\0';
    }

    private void advance() {
        pos++;
    }

    public Token next() {
        while (Character.isWhitespace(peek())) advance();

        char c = peek();

        if (c == '\0') return new Token(Token.Kind.EOF, "");

        if (Character.isLetter(c)) {
            StringBuilder sb = new StringBuilder();
            while (Character.isLetterOrDigit(peek()))
                sb.append(peek()), advance();

            String word = sb.toString();
            if (word.equals("func")) return new Token(Token.Kind.FUNC, word);
            if (word.equals("class")) return new Token(Token.Kind.CLASS, word);
            return new Token(Token.Kind.IDENT, word);
        }

        if (Character.isDigit(c)) {
            StringBuilder sb = new StringBuilder();
            while (Character.isDigit(peek()))
                sb.append(peek()), advance();
            return new Token(Token.Kind.NUMBER, sb.toString());
        }

        switch (c) {
            case '{': advance(); return new Token(Token.Kind.LBRACE, "{");
            case '}': advance(); return new Token(Token.Kind.RBRACE, "}");
            case '(': advance(); return new Token(Token.Kind.LPAREN, "(");
            case ')': advance(); return new Token(Token.Kind.RPAREN, ")");
            case ';': advance(); return new Token(Token.Kind.SEMI, ";");
            case ':': advance(); return new Token(Token.Kind.COLON, ":");
            case '-':
                advance();
                if (peek() == '>') {
                    advance();
                    return new Token(Token.Kind.ARROW, "->");
                }
        }

        advance();
        return next();
    }
}
