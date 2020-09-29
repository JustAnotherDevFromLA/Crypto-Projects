import java.util.Arrays;

public class Block{
	
	private int previousHash;
	private String[] transactions;
	
	private int blockHash;
	
	public Block(int previousHash, String[] transactions) {
		this.previousHash = previousHash;
		this.transactions = transactions;
		
		Object[] contents = {Arrays.hashCode(transactions), previousHash};
		this.blockHash = Arrays.hashCode(contents);
		
	}
	
	public int getPreviousHash() {
		return previousHash;
	}
	
	public String[] getTransactions() {
		return transactions;
	}

	public int getBlockHash() {
		return blockHash;
	}		
	
}