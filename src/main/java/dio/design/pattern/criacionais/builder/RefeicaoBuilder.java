package dio.design.pattern.criacionais.builder;

public interface RefeicaoBuilder {
    public void buildPratoTipico();
    public void buildPratoPrincipal();
    public void buildSobremesa();

    public Refeicao getRefeicao();
}
