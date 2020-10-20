import java.util.ArrayList;

public class Main {
	
	ArrayList<Block> blockchain = new ArrayList<>();	//create the blockchain arraylist 
	
	public static void main(String[] args){
		
		//initalize var
		int previousHash = 0;	
		String[] genesisTransactions = {"CoinBase: 10 BTC is sent to Tash","Binance: 10 BTC sent to Tash"};	// hard coding the genesis block 
		Block genesisBlock = new Block(previousHash, genesisTransactions);
		
		String[] block2Transactions = {"Tash sent 5 BTC to Coinbase","Tash sent 5 BTC to Binance"};	// creating the next block in the blockchain 
		Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
		
		System.out.println("Hash of the GenesisBlock");		// some output for visually seeing the transactions 
		System.out.println(genesisBlock.getBlockHash());
		System.out.println("Hash of Block2");
		System.out.println(block2.getBlockHash()); 
		
	}

}
