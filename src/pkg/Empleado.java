package pkg;

enum TipoEmpleado {
	Vendedor, 
	Encargado;
}

public class Empleado {
	public float salario_base, primas, extras;
	
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		
		if (tipo == TipoEmpleado.Vendedor) {
			salario_base = 2000f;
		} else {
			salario_base = 2500f;
		}
		
		if(ventasMes >= 1500) {
			primas = 200f;
		}
		else if (ventasMes >= 1000) {
			primas = 100f;
		}
		
		extras = horasExtra * 30;
		
		return salario_base + primas + extras;
	}
	
	public float calculoNominaNeta(float nominaBruta) {
		return 0;
	}
}
