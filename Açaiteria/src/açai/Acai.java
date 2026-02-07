package açai;

public class Acai {
	
	public static double getPreco(String tamanho) {
		switch (tamanho) {
		
		case "P": return 11.0;
			
		case "M": return 16.0;
			
		case "G": return 20.0;
			
		default:  return 0;
		}
	}

}
