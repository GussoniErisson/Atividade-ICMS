package PatternFactory;

public class IcmsFactory {
    public CalculoRegiao getIcmsEstado(String nomeEstado){
        if(nomeEstado.equalsIgnoreCase("ICMS_MG")){
            return new IcmsMG();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_RJ")){
            return new IcmsRJ();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_GO")){
            return new IcmsGO();
        }else{
            System.out.println("Valor invalido");
            return null;
        }
    }
}