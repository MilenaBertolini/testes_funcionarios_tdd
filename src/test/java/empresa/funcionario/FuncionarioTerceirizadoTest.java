package empresa.funcionario;

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

}
