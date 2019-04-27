package ar.edu.unlam.pb2.tp;

public class Disco {
	private Double radioInterno;
	private Double radioExterno;
	

	public Disco(Double radioInterno, Double radioExterno) {
		this.radioInterno = radioInterno;
		this.radioExterno = radioExterno;
	}


	public Double getRadiointerno() {
		return radioInterno;
	}


	public void setRadioInterno(Double radioInterno) {
		this.radioInterno = radioInterno;
	}


	public Double getRadioExterno() {
		return radioExterno;
	}


	public void setRadioexterno(Double radioExterno) {
		this.radioExterno = radioExterno;
	}
	
	public Double getPerimetroInterno(Double radiointerno) {
		Double perimetrointerno = 2 * radiointerno * Math.PI;
		return perimetrointerno;
	}
	public Double getPerimetroExterno(Double radioExterno) {
		Double perimetroExterno = 2 * radioExterno * Math.PI;
		return perimetroExterno;
	}
	
	public Double getArea(Double radioInterno, Double radioExterno) {
		Double area = Math.PI*(Math.pow(radioExterno, 2)-Math.pow(radioInterno, 2));
		return area;
	}
	
	
}
