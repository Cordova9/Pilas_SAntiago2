
public class Cuadrado extends FiguraGeometrica {

	public Cuadrado(int medida) {
		super(medida, 4);// clase padre

	}

	public double ObtenerArea(){
		return medida_lado * medida_lado;
	}

}
