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

    private Funcionario funcionario;

    public Funcionario getFuncionario() {
            return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }


    public Double calcularPagamento(int horasTrabalhadas, Double valorHora){
            
        Double pagamento = horasTrabalhadas * valorHora;

        if(pagamento>=1320){
            return pagamento;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
