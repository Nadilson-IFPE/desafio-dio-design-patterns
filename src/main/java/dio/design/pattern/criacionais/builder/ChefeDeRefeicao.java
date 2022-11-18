package dio.design.pattern.criacionais.builder;

public class ChefeDeRefeicao {

    private RefeicaoBuilder refeicaoBuilder = null;

    public ChefeDeRefeicao(RefeicaoBuilder refeicaoBuilder) {
        this.refeicaoBuilder = refeicaoBuilder;
    }

    public void criarRefeicao() {
        refeicaoBuilder.buildPratoTipico();
        refeicaoBuilder.buildPratoPrincipal();
        refeicaoBuilder.buildSobremesa();
    }

    public Refeicao getRefeicao() {
        return refeicaoBuilder.getRefeicao();
    }
}
