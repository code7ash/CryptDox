#include <web3cpp/Web3.h>

int main() {
    Web3 web3("http://localhost:8545");
    std::string contractAddress = "0xYourContractAddress";
    std::string abi = "..."; // Your contract ABI here

    // Create contract instance
    auto contract = web3.eth.contract(abi, contractAddress);

    // Transfer tokens
    auto txHash = contract["transfer"]("0xRecipientAddress", 100);
    std::cout << "Transaction hash: " << txHash << std::endl;

    return 0;
}