package pkg;

enum TipoEmpleado {
	Vendedor, 
	Encargado;
}

public class Empleado {
	float salario_base, primas, extras;
	
	float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		
		if (tipo == TipoEmpleado.Vendedor) {
			salario_base = 2000f;
		} else {
			salario_base = 2500f;
		}
		
		if (1000 >= ventasMes && ventasMes < 1500) {
			primas = 100f;
		}
		else if(1500 <= ventasMes) {
			primas = 200f;
		}
		
		extras = horasExtra * 30;
		
		return salario_base + primas + extras;
	}
}
