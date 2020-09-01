fun main() {
    val salaryAccount = Account()
    val savingAccount = Account(1000.0)

    println(savingAccount.balance)
    savingAccount.withdraw(2000.0)
    println(savingAccount.balance)

    var money = savingAccount.withdraw(100.0)
    salaryAccount.deposit(money)



    println("Saving balance: ${savingAccount.balance}")
    println("Salary balance: ${salaryAccount.balance}")

}