package ejercicio3;

public class TerminalExpressionGherkinsSintaxis extends AbstractExpression{

    private int tamanoAQuitar;

    public TerminalExpressionGherkinsSintaxis(int tamanoAQuitar) {
        this.tamanoAQuitar = tamanoAQuitar;
    }


    @Override
    public void interpreter(Context context){
        if(context.input.startsWith("Como")){
            context.output = context.output + "Given ";
            context.input = context.input.substring(this.tamanoAQuitar);
        } else if(context.input.startsWith("Quiero")){
            context.output = context.output + "When ";
            context.input = context.input.substring(this.tamanoAQuitar);
        } else if(context.input.startsWith("Para")){
            context.output = context.output + "Then ";
            context.input = context.input.substring(this.tamanoAQuitar);
        }
    }
}
