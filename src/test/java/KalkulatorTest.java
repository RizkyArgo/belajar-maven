import org.junit.jupiter.api.Test;
import static
org.junit.jupiter.api.Assertions.*;

public class KalkulatorTest{

	@Test
	public void tesTambah() {
	Kalkulator kalku = new Kalkulator();
	assertEquals(5, kalku.tambah(2, 3));
	}

	@Test
	public void tesKurang() {
		Kalkulator kalku = new Kalkulator();
	assertEquals(1, kalku.kurang(3, 2));
	}

	@Test
	public void tesKali() {
                Kalkulator kalku = new Kalkulator();
        assertEquals(8, kalku.perkalian(4, 2));
        }

	@Test
	public void tesBagi() {
                Kalkulator kalku = new Kalkulator();

        assertThrows(IllegalArgumentException.class, () -> { 
		kalku.pembagian(10,0);
		});
        }

	@Test
	public void tesModulus() {
		Kalkulator kalku = new Kalkulator();
	assertEquals(1, kalku.modulus(3, 2));

	}
}
