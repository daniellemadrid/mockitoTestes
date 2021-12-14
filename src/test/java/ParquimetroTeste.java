import model.Parquimetro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.junit.jupiter.api.Assertions.*;

public class ParquimetroTeste {
    Parquimetro parquimetro;

    @BeforeEach
    void setup(){
        parquimetro = Mockito.mock(Parquimetro.class);
    }

    @Test
    void deveveriaInserirMoedaRetornarValorTotal(){
        Mockito.when(parquimetro.inserirMoeda(anyInt())).thenReturn(26);
        assertEquals(26, parquimetro.inserirMoeda(13));
    }

    @Test
    void deveriaRetornarSaldo(){
        Mockito.when(parquimetro.getSaldo()).thenReturn(26);
        assertEquals(26, parquimetro.getSaldo());
    }

    @Test
    void deveriaRestituirOValorERetornarSaldoAtual(){
        Mockito.when(parquimetro.devolve()).thenReturn(13);
        assertEquals(13, parquimetro.devolve());
    }

    @Test
    void deveriaRetornarOTicket(){
        Mockito.when(parquimetro.emiteTicket()).thenReturn("O ticket vale: 13");
        assertEquals("O ticket vale: 13", parquimetro.emiteTicket());
    }
}

