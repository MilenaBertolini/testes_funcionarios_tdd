package empresa.funcionario;

public class Funcionario {

    private String nomeFuncionario;
    private Double valorHora;
    private int horasTrabalhadas;

    public Funcionario() {
        
    }

    public Funcionario(String nome, Double valorHora, int horasTrabalhadas){
        this.nomeFuncionario = validaNome(nome);
        this.valorHora = validaValorHora(valorHora);
        this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nome) {
        this.nomeFuncionario = validaNome(nome);
    }
    
    public Double getValorHora() {
        return valorHora;
    }
    
    public void setValorHora(Double valorHora) {
        this.valorHora = validaValorHora(valorHora);
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
    }

    public String validaNome(String nome){

        if(nome.length()>= 2 && nome.length()<=100){
            return nome;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int validaHorasTrabalhadas(int horasTrabalhadas){

        if(horasTrabalhadas<=40){
            return horasTrabalhadas;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public Double validaValorHora(Double valorHora){

        if(valorHora>=52.8 && valorHora<=132.00){
            return valorHora;
        }else{
            throw new IllegalArgumentException();
        }
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
