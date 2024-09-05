/**
 * Hello world!
 *
 */
package ICMS;

import java.math.BigDecimal;
import java.util.Scanner;

import PatternFactory.IcmsFactory;
import Model.Orcamento;

public class App
{
    public static void main( String[] args ){
        Orcamento orcamento = new Orcamento(new BigDecimal("1000.0"),"ICMS_RJ");
        IcmsFactory IcmsFactory = new IcmsFactory();
        BigDecimal resultado = IcmsFactory.getIcmsEstado("ICMS_RJ").calculoPorRegiao(orcamento);

        System.out.println(resultado);
    }
}
