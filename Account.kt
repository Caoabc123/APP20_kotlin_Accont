class Account(var balance  : Double = 0.0) {

    fun withdraw(amount : Double) : Double {
        if( balance >= amount && amount > 0) {
            balance -= amount
            return amount
        }
        return 0.0
    }

    fun deposit(amount: Double) {
        balance += amount
    }

}