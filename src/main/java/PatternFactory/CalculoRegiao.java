package PatternFactory;

import java.math.BigDecimal;

import Model.Orcamento;

public interface CalculoRegiao {

    public BigDecimal calculoPorRegiao(Orcamento orcamento);
}
