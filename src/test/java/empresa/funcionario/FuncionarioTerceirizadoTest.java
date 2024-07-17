package empresa.funcionario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FuncionarioTerceirizadoTest {
    
    private FuncionarioTerceirizado funcTerceirizado;

    @BeforeEach
    public void instanciaFuncionarioTerceirizado(){
        funcTerceirizado = new FuncionarioTerceirizado();
    }

    @Test
    @DisplayName("Caso de teste para construtor em caso de entrada de despesas inválidas")
    public void testarConstrutorEntradaDespesaInválida(){

        Double despesasAdicionaisInvalidas = 1001.00;

        assertThrows(IllegalArgumentException.class,
            () -> {
                funcTerceirizado = new FuncionarioTerceirizado(despesasAdicionaisInvalidas);
            }
        );

    }

    @Test
    @DisplayName("Caso de teste para construtor em caso de entrada de despesas válidas")
    public void testarConstrutorEntradaDespesaVálida(){

        Double despesasAdicionaisValidas = 1000.00;
        Double resultadoEsperado = 1000.00;
        
        funcTerceirizado = new FuncionarioTerceirizado(despesasAdicionaisValidas);
        Double resultadoObtido = funcTerceirizado.getDespesasAdicionais();

        assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    @DisplayName("Caso de teste em caso de entrada de despesas inválidas")
    public void testarModificarEntradaDespesaInválida(){

        Double despesasAdicionaisInvalidas = 1001.00;

        assertThrows(IllegalArgumentException.class,
            () -> {
                funcTerceirizado.setDespesasAdicionais(despesasAdicionaisInvalidas);
            }
        );

    }

    @Test
    @DisplayName("Caso de teste em caso de entrada de despesas válidas")
    public void testarModificarEntradaDespesaVálida(){

        Double despesasAdicionaisValidas = 1000.00;
        Double resultadoEsperado = 1000.00;
        
        funcTerceirizado.setDespesasAdicionais(despesasAdicionaisValidas);
        Double resultadoObtido = funcTerceirizado.getDespesasAdicionais();

        assertEquals(resultadoEsperado, resultadoObtido);

    }
}
