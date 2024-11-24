package com.example.Budget.App;

import jakarta.persistence.Id;




public class Budget {
    @Id
    private Long id;
    private double setIncome;
    private double fixedExpense;
    private double savings;
    private double variable;







    public void GeneratedIncom(double setIncome) {
        this.setIncome = setIncome;
    }
    public void FixedExpense(double fixedExpense){
        this.fixedExpense = fixedExpense;
    }
    public void Saving(double savings) {
        this.savings = savings;
    }
    public void Var(double variable) {
        this.variable = variable;
    }
    
}


