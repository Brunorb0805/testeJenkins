package processos;


class Calculo {
	public static float executaCalculo(float valor1,float valor2){
		float soma = valor1+valor2;
		return soma;
	}
	
	public static float executaCalculoS(float valor1,float valor2){
		float sub = valor1-valor2;
		return sub;
	}
	
	public static boolean igualdade(String nome1,String nome2){
		boolean bool = nome1.equals(nome2);
		return bool;
	}
}
