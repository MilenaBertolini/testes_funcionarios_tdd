package empresa.funcionario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FuncionarioTests {
    
    private Funcionario funcionario;

    @BeforeEach
    public void instanciaFuncionario(){
        funcionario = new Funcionario();
    }

    @Test
    @DisplayName("Caso de teste para construtor em caso de entrada de hora inválida")
    public void testarConstrutorEntradaHoraInvalida(){
        
        String nomeValido = "Teste";
        Double valorHoraValido = 55.00;
        int horasTrabalhadasInvalidas = 45;

        assertThrows(IllegalArgumentException.class,
            () -> {
                funcionario = new Funcionario(nomeValido, valorHoraValido, horasTrabalhadasInvalidas);
            }
        ) ;
    }

    @Test
    @DisplayName("Caso de teste para construtor em caso de entrada de hora válida")
    public void testarConstrutorEntradaHoraValida(){
        
        String nomeValido = "Teste";
        Double valorHoraValido = 55.00;
        int horasTrabalhadasValidas = 40;
        int resultadoEsperado = 40;

        funcionario = new Funcionario(nomeValido, valorHoraValido, horasTrabalhadasValidas);
        int resultadoObtido = funcionario.getHorasTrabalhadas();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Caso de teste para construtor em caso de entrada de valor hora inválida, menor que o permitido")
    public void testarConstrutorEntradaValorHoraInvalidaLimiteInferior(){
        
        String nomeValido = "Teste";
        int horasTrabalhadasValidas = 40;
        // valor entre 52.8 e 132.00
        Double valorHoraTrabalhadaInvalida = 52.00;
        
        assertThrows(IllegalArgumentException.class,
            () -> {
                funcionario = new Funcionario(nomeValido, valorHoraTrabalhadaInvalida, horasTrabalhadasValidas);
            }
        ) ;
    }

    @Test
    @DisplayName("Caso de teste para construtor em caso de entrada de valor hora inválida, maior que o permitido")
    public void testarConstrutorEntradaValorHoraInvalidaLimiteSuperior(){
        
        String nomeValido = "Teste";
        int horasTrabalhadasValidas = 40;
        // valor entre 52.8 e 132.00
        Double valorHoraTrabalhadaInvalida = 133.00;
        
        assertThrows(IllegalArgumentException.class,
            () -> {
                funcionario = new Funcionario(nomeValido, valorHoraTrabalhadaInvalida, horasTrabalhadasValidas);
            }
        ) ;
    }

    @Test
    @DisplayName("Caso de teste para construtor em caso de entrada de valor hora válida")
    public void testarConstrutorEntradaValorHoraValida(){
        
        String nomeValido = "Teste";
        int horasTrabalhadasValidas = 40;
        // valor entre 52.8 e 132.00
        Double valorHoraTrabalhadaValida = 100.00;
        Double resultadoEsperado = 100.00;

        funcionario = new Funcionario(nomeValido, valorHoraTrabalhadaValida, horasTrabalhadasValidas);
        Double resultadoObtido = funcionario.getValorHora();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Caso de teste para verificar Nome inválido")
    public void testarConstrutorNomeInvalido(){
        
        int horasTrabalhadasValidas = 40;
        Double valorHoraTrabalhadaValida = 100.00;

        String nomeFuncionarioInvalido = "";

        assertThrows(IllegalArgumentException.class,
            () -> {
                funcionario = new Funcionario(nomeFuncionarioInvalido, valorHoraTrabalhadaValida, horasTrabalhadasValidas);
            }
        );
    }

    @Test
    @DisplayName("Caso de teste para verificar Nome válido")
    public void testarConstrutorNomeValido(){

        int horasTrabalhadasValidas = 40;
        Double valorHoraTrabalhadaValida = 100.00;

        String nomeFuncionario = "Teste";
        String resultadoEsperado = "Teste";


        funcionario = new Funcionario(nomeFuncionario, valorHoraTrabalhadaValida, horasTrabalhadasValidas);
        String resultadoObtido = funcionario.getNomeFuncionario();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

@Test
    @DisplayName("Casos de teste que verifica o nome válido do funcionário")
    public void testarModificarNomeValido() {

        String nomeValido = "Teste";
        String resultadoEsperado = "Teste";

        funcionario.setNomeFuncionario(nomeValido);
        String resultadoObtido = funcionario.getNomeFuncionario();

        assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    @DisplayName("Casos de teste que verifica horas trabalhadas inválidas")
    public void testarModificarHorasTrabalhadasInvalido() {

        int horasTrabalhadasInvalidas = 41;

        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.setHorasTrabalhadas(horasTrabalhadasInvalidas);
        });

    }

    @Test
    @DisplayName("Casos de teste que verifica horas trabalhadas válidas")
    public void testarModificarHorasTrabalhadasValido() {

        int horasTrabalhadasValidas = 37;
        int resultadoEsperado = 37;

        funcionario.setHorasTrabalhadas(horasTrabalhadasValidas);
        int resultadoObtido = funcionario.getHorasTrabalhadas();

        assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    @DisplayName("Casos de teste que verifica o valor hora inválido no limite inferior do funcionário")
    public void testarModificarValorHoraInvalidoLimiteInferior() {

        // valor entre 52.8 e 132.00
        Double valorHoraInvalida = 52.5;

        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.setValorHora(valorHoraInvalida);
        });

    }

    @Test
    @DisplayName("Casos de teste que verifica o valor hora inválido no limite superior do funcionário")
    public void testarModificarValorHoraInvalidoLimiteSuperior() {

        // valor entre 52.8 e 132.00
        Double valorHoraInvalida = 132.01;

        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.setValorHora(valorHoraInvalida);
        });

    }

    @Test
    @DisplayName("Casos de teste que verifica o valor hora válido do funcionário")
    public void testarModificarValorHoraValido() {

        // valor entre 52.8 e 132.00
        Double horasTrabalhadasValidas = 90.2;
        Double resultadoEsperado = 90.2;

        funcionario.setValorHora(horasTrabalhadasValidas);
        Double resultadoObtido = funcionario.getValorHora();

        assertEquals(resultadoEsperado, resultadoObtido);

    }




}
