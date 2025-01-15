import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;

public class CryptDox {
    public static void main(String[] args) throws Exception {
        Web3j web3j = Web3j.build(new HttpService("http://localhost:8545"));
        String contractAddress = "0xYourContractAddress";
        CryptDoxContract contract = CryptDoxContract.load(contractAddress, web3j, credentials, new DefaultGasProvider());

        // Transfer tokens
       