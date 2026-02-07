package açai;

public class Cupacu {
	
	public static double getPreco(String tamanho) {
		switch (tamanho) {
		case "P": return 9.0;
		case "M": return 14.0;
		case "G": return 18.0;
		default:  return 0;
		
		}
	}

}
