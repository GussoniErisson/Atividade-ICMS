package PatternFactory;

import java.math.BigDecimal;

import Model.Orcamento;

public class IcmsRJ implements CalculoRegiao{

    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.valorOrcamento.multiply(new BigDecimal("0.18"));
    }
}
