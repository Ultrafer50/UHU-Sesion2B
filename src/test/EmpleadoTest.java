package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.TipoEmpleado;

class EmpleadoTest {
	
	private float ventasMes, horasExtra, expected, actual;
	private Empleado empleado;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
		empleado = new Empleado();
		ventasMes = 1450f;
		horasExtra = 2;
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}
	
	@Test
	void testCalculoNominaBruta_Encargado() {
		expected = 2660f;
		actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}	
	
	@Test
	void testCalculoNominaBruta_Vendedor() {
		expected = 2160f;
		actual = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}	
	
	@Test
	void testCalculoNominaBruta_Otro() {
		expected = 0;
		actual = empleado.calculoNominaBruta(TipoEmpleado.Otro, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}	
	
	@Test
	void testCalculoNominaBruta_VentaMesNegativa() {
		expected = 0;
		ventasMes = -5;
		actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBruta_Menor1000() {
		expected = 2560f;
		ventasMes = 500;
		actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}	
	
	@Test
	void testCalculoNominaBruta_Entre1000y1500() {
		expected = 2660f;
		ventasMes = 1250f;
		actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBruta_Mayor1500() {
		expected = 2760f;
		ventasMes = 1600;
		actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBruta_HorasPositivas() {
		expected = 2690f;
		horasExtra = 3;
		actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBruta_HorasNegativas() {
		expected = 0;
		horasExtra = -10;
		actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNeta_Negativa() {
		expected = -500;
		float nominaNeta = -500;
		actual = empleado.calculoNominaNeta(nominaNeta);
	}
	
	@Test
	void testCalculoNominaNeta_Menor2100() {
		expected = 1500;
		float nominaNeta = 1500;
		actual = empleado.calculoNominaNeta(nominaNeta);
		
	}
	
	@Test
	void testCalculoNominaNeta_Entre2100y2500() {
		expected = 1725;
		float nominaNeta = 2300;
		actual = empleado.calculoNominaNeta(nominaNeta);
	}
	
	@Test
	void testCalculoNominaNeta_Mayor2500() {
		expected = 2184;
		float nominaNeta = 2800;
		actual = empleado.calculoNominaNeta(nominaNeta);
	}

}
