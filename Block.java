import java.util.Arrays;

public class Block{
	//initiating variables 
	private int previousHash;	
	private String[] transactions;
	private int blockHash;
	
	public Block(int previousHash, String[] transactions) {		
		// create local variables 
		this.previousHash = previousHash;	
		this.transactions = transactions;	
		
		Object[] contents = {Arrays.hashCode(transactions), previousHash};	
		this.blockHash = Arrays.hashCode(contents);
		
	}
	
	public int getPreviousHash() {	//function to retrieve previous block hash number 	
		return previousHash;
	}
	
	public String[] getTransactions() {	//function to retrieve all the tranasction in the block
		return transactions;
	}

	public int getBlockHash() {	//function to return the hash number of a block
		return blockHash;
	}		
	
}
