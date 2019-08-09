import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		FiguraGeometrica c = new Cuadrado(5);
//		System.out.println(f.ObtenerPerimetro());
//		System.out.println(f.ObtenerArea());

		FiguraGeometrica t = new Triangulo(5);
//		System.out.println(t.ObtenerPerimetro());
//		System.out.println(t.ObtenerArea());

	ArrayList<FiguraGeometrica> lista=new ArrayList<FiguraGeometrica>();
	lista.add(c);
	lista.add(t);
	
	for(FiguraGeometrica f: lista) {
		System.out.println(f.ObtenerArea());
	}
	
	
	}

}
