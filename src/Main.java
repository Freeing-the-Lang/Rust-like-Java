package src;

public class Main {
    public static void main(String[] args) {
        String code = "func main:";
        Parser parser = new Parser(code);
        AST.Func f = parser.parseFunc();

        System.out.println("Parsed function: " + f.name);
    }
}
