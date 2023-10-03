package pkg;

enum TipoEmpleado {
	Vendedor, Encargado;
}

public class Empleado {
	public float salario_base, primas, extras;

	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {

		if (tipo == TipoEmpleado.Vendedor) {
			salario_base = 2000f;
		} else {
			salario_base = 2500f;
		}

		if (ventasMes >= 1500) {
			primas = 200f;
		} else if (ventasMes >= 1000) {
			primas = 100f;
		}

		extras = horasExtra * 30;

		return salario_base + primas + extras;
	}

	public float calculoNominaNeta(float nominaBruta) {
		return 0;
	}
	
	/*
	 * Testear:
	 * 1 Test Encargado
	 * 1 Test Vendedor
	 * 1 Test Otro
	 * 
	 * Con el rango de 1000 y 1500:
	 * 1 Test con la mediana:
	 * 1 Test con valor menor a 1000
	 * 1 Test con valor mayor a 1500
	 * 1 Test con valor negativo
	 * 
	 * Con las horas extras
	 * 1 Test con horas positivas
	 * 1 Test con horas negativas
	 * 
	 * Con el valor de nominaBruta (2100 - 2500)
	 * 1 Test con valor menor a 2100
	 * 1 Test con mediana
	 * 1 Test con valor mayor a 2500
	 */
}
