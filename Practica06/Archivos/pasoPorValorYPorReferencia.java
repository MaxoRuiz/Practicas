public class pasoPorValorYPorReferencia{
    public static void main(String args[]){
	String p = "Hola";
	String q = "Mundo";
	String x;
	x = unionPorValores(p,q);
	System.out.println(x);
	
    }

    //M�todo que recibe dos par�metro por valor, en este caso dos strings
    public static String unionPorValores(String p, String q){
	String fraseUnida;
	//Aqu� une a los dos Strings en uno
	fraseUnida = p+" "+q;
	//Regresa el String que contiene a los dos strings unidos
	return fraseUnida;
    }
}
