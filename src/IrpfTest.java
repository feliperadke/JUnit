import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IrpfTest {
    private Irpf irpf;

    @Before
    public void setUp() {
        irpf = new Irpf ("felipe", "038.330.000-23");
    }

    @Test
    public void impostoDevido() {
        irpf.setIdade(60);
        irpf.setContrPrev(2000);
        irpf.setNroDep(3);
        irpf.setTotRendimentos(22000);
        assertEquals(2500, irpf.impostoDevido(), 0.01);
    }
}