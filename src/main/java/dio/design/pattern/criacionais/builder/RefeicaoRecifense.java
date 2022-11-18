package dio.design.pattern.criacionais.builder;

public class RefeicaoRecifense implements RefeicaoBuilder{

    Refeicao refeicao;

    public RefeicaoRecifense() {
        refeicao = new Refeicao();
    }

    @Override
    public void buildPratoTipico() {
        refeicao.setPratoTipico("Prato típico de Recife");
    }

    @Override
    public void buildPratoPrincipal() {
        refeicao.setPratoPrincipal("Prato principal do cardápio de Recife");
    }

    @Override
    public void buildSobremesa() {
        refeicao.setSobremesa("Sobremesa típica de Recife");
    }

    @Override
    public Refeicao getRefeicao() {
        return refeicao;
    }
}
