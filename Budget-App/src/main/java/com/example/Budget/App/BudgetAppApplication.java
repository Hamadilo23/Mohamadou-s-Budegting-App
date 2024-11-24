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

	@Autowired
	private BudgetService  budgetService;

	@PostConstruct
	Budget budget = new Budget();
	budget.setIncome(2000);
	budget.setFixedExpenses(1000);
	budget.setSavings(400);
	budget.setVariableExpenses(390);
	budgetService.createBudget(budget);

}
