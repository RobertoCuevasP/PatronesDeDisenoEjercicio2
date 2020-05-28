package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    private List<AbstractExpression> expresiones = new ArrayList<>();
    private Context context;

    public Parser(String s){
        context= new Context(s.replace(" ",""));
        for (String token : s.split(" ")){
            switch (token){
                case "Como":
                    expresiones.add(new TerminalExpressionGherkinsSintaxis(token.length()));
                    break;
                case "Quiero":
                    expresiones.add(new TerminalExpressionGherkinsSintaxis(token.length()));
                    break;
                case "Para":
                    expresiones.add(new TerminalExpressionGherkinsSintaxis(token.length()));
                    break;
                default:
                    expresiones.add(new TerminalExpressionRest(token.length()));
                    break;
            }
        }
    }

    public String evaluate(){
        for(AbstractExpression e : expresiones){
            e.interpreter(context);
        }
        return context.output;
    }
}
