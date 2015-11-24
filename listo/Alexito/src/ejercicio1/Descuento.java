package ejercicio1;

public class Descuento {
	private double descuento;
	private double totalcompra;
	public Descuento (double descuentoParam,double totalcompraParam) {
		this.descuento=descuentoParam;
		this.totalcompra=totalcompraParam;
	}
	public double getTotal(){
		return totalcompra-totalcompra*descuento;
	}
}
