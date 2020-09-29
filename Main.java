import java.util.ArrayList;

public class Main {
	
	ArrayList<Block> blockchain = new ArrayList<>();
	
	public static void main(String[] args){
		
		
		int previousHash = 0;
		String[] genesisTransactions = {"CoinBase: 10 BTC is sent to Tash","Binance: 10 BTC sent to Tash"};
		Block genesisBlock = new Block(previousHash, genesisTransactions);
		
		String[] block2Transactions = {"Tash sent 5 BTC to Coinbase","Tash sent 5 BTC to Binance"};
		Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
		
		System.out.println("Hash of the GenesisBlock");
		System.out.println(genesisBlock.getBlockHash());
		System.out.println("Hash of Block2");
		System.out.println(block2.getBlockHash()); 
		
	}

}