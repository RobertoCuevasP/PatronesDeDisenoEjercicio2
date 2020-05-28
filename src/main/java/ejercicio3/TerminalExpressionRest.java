package ejercicio3;

public class TerminalExpressionRest extends AbstractExpression {

    private int tamanoAQuitar;

    public TerminalExpressionRest(int tamanoAQuitar) {
        this.tamanoAQuitar = tamanoAQuitar;
    }

    @Override
    public void interpreter(Context context) {
        context.output = context.output + context.input.substring(0,this.tamanoAQuitar) + " ";
        context.input = context.input.substring(this.tamanoAQuitar);
    }
}