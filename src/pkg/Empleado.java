package pkg;

public class Empleado {
	public float salario_base, primas, extras, retencion;
	
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		
		if (ventasMes < 0 || horasExtra < 0 || tipo == TipoEmpleado.Otro) {
			return 0;
		}
		
		if (tipo == TipoEmpleado.Vendedor) {
			salario_base = 2000f;
		} else if (tipo == TipoEmpleado.Encargado){
			salario_base = 2500f;
		}
		
		if (ventasMes >= 1500) {
			primas = 200f;
		} else if (ventasMes >= 1000) {
			primas = 100f;
		} else {
			primas = 0;
		}
		
		extras = horasExtra * 30;

		return salario_base + primas + extras;
	}

	public float calculoNominaNeta(float nominaBruta) {
		
		if (nominaBruta > 2500) {
			retencion = 0.18f;		
		} else if (nominaBruta > 2100) {
			retencion = 0.15f;		
		} else {
			retencion = 0;
		}
		
		return nominaBruta * (1 - retencion);
	}
	
}
