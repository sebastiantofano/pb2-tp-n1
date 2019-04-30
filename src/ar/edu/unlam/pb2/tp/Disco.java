package ar.edu.unlam.pb2.tp;

public class Disco {
	private Double radioInterno;
	private Double radioExterno;

	public Disco() {
	}

	public Double calcularPerimetroInterno(){
		Double perimetroInterno;
		perimetroInterno = 2 * radioInterno * Math.PI;
		return perimetroInterno;
	}
	
	public Double calcularPerimetroExterno() {
		Double perimetroExterno;
		perimetroExterno = 2 * radioExterno * Math.PI;
		return perimetroExterno;
	}
	
	public Double calcularSuperficie() {
		Double superficie;
		superficie = Math.PI * Math.pow(radioExterno, 2) - Math.PI * Math.pow(radioInterno, 2);
		return superficie;
	}

	public Double getRadioInterno() {
		return radioInterno;
	}

	public void setRadioInterno(Double radioInterno) {
		this.radioInterno = radioInterno;
	}

	public Double getRadioExterno() {
		return radioExterno;
	}

	public void setRadioExterno(Double radioExterno) {
		this.radioExterno = radioExterno;
	}
		
}
