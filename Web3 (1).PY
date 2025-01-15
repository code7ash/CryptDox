from web3 import Web3

w3 = Web3(Web3.HTTPProvider('http://localhost:8545'))
contract_address = '0xYourContractAddress'
abi = [...]  # Your contract ABI here

contract = w3.eth.contract(address=contract_address, abi=abi)

# Transfer tokens
tx_hash = contract.functions.transfer('0xRecipientAddress', 100).transact({'from': '0xYourAddress'})
print(f'Transaction hash: {tx_hash.hex()}')