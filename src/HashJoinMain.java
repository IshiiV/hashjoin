

public class HashJoinMain {

	public static void main(String[] args) {
		long tempoInicial = System.currentTimeMillis();
		
		HashJoinHeader Hjh1 = new HashJoinHeader();
		
		Hjh1.cs1.run();
		Hjh1.cs2.run();
		Hjh1.HashJoinFunction();
		System.out.println("Tarefe executada em " + (System.currentTimeMillis() - tempoInicial)+" milissegundos.");
}
}
