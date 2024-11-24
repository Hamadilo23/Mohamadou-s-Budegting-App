package com.example.Budget.App;

import org.hibernate.generator.BeforeExecutionGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;


@SpringBootApplication
public class BudgetAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetAppApplication.class, args);
	}

	private BudgetService  budgetService;


	public void init() {
		Budgets budget = new Budgets();
		budget.Income(2000);
		budget.fixedExpense(1000);
		budget.savings(400);
		budget.variable(390);
		budgetService.my_Budget(budget);
	}

}
