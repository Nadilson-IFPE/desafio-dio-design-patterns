package dio.design.pattern.criacionais.builder;

public class RefeicaoMineira implements RefeicaoBuilder {

    Refeicao refeicao;

    public RefeicaoMineira() {
        refeicao = new Refeicao();
    }

    @Override
    public void buildPratoTipico() {
        refeicao.setPratoTipico("Prato típico de Minas Gerais");
    }

    @Override
    public void buildPratoPrincipal() {
        refeicao.setPratoPrincipal("Prato principal do cardápio de Minas Gerais");
    }

    @Override
    public void buildSobremesa() {
        refeicao.setSobremesa("Sobremesa típica de Minas Gerais");
    }

    @Override
    public Refeicao getRefeicao() {
        return refeicao;
    }
}
