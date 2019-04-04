const getCalc = () => new Calculation(
    123,
    934,
    45,
    56,
    67,
    "rer@sd.dd"
)

class Calculation {
    constructor(currentDebt, averageMonthlyIncome, averageMonthlyExpenses, monthlyPaymentsNumber,monthlyPaymentsAmount, email){
        this.currentDebt = currentDebt
        this.averageMonthlyIncome = averageMonthlyIncome
        this.averageMonthlyExpenses = averageMonthlyExpenses
        this.monthlyPaymentsNumber = monthlyPaymentsNumber
        this.monthlyPaymentsAmount = monthlyPaymentsAmount
        this.email = email

    }
}

const doFetch = () => fetch("http://localhost:8080/api/calculate", {
    method: 'POST',
    credentials: 'include',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    },
    body: JSON.stringify(getCalc())
})
.then(response => response.json())
.then(json => alert("Feasible Debt: " + json.feasibleDebt))