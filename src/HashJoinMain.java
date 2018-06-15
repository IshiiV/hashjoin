

public class HashJoinMain {

	public static void main(String[] args) {
		String tabela1 = "nation.csv";
		String tabela2 = "supplier.csv";
	
		HashJoin hj = new HashJoin(tabela1, tabela2);
		
		hj.run();
}
}