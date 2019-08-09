
public class Triangulo extends FiguraGeometrica{

	public Triangulo(int medida) {
		super(medida, 3);
		
	}
	public double ObtenerArea(){
		return medida_lado*
				Math.sqrt(
				Math.pow(medida_lado,2)
				-Math.pow(medida_lado/2,2))
				/2;
	}
	
}
