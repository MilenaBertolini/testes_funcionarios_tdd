package empresa.funcionario;

public class FuncionarioTerceirizado {
    
    private Double despesasAdicionais;

    public FuncionarioTerceirizado(){

    }

    public FuncionarioTerceirizado(Double despesasAdicionais){
        this.despesasAdicionais = validaDespesas(despesasAdicionais);
    }

    public Double getDespesasAdicionais() {
        return despesasAdicionais;
    }

    public void setDespesasAdicionais(Double despesasAdicionais) {
        this.despesasAdicionais = validaDespesas(despesasAdicionais);
    }


    public Double validaDespesas(Double despesasAdicionais){

        if(despesasAdicionais<=1000){
            return despesasAdicionais;
        }else{
            throw new IllegalArgumentException();
        }
    }
}