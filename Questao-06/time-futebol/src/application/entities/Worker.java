package application.entities;

import application.entities.enums.WorkerLevel;

public class Worker {

	private Double salary;
	private WorkerLevel workerLevel;
	
	public Worker() {
		
	}

	public Worker( WorkerLevel workerLevel) {
		this.workerLevel = workerLevel;
	}

	public Worker(Double salary, WorkerLevel workerLevel) {
		this.salary = salary;
		this.workerLevel = workerLevel;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public WorkerLevel getWorkerLevel() {
		return workerLevel;
	}

	public void setWorkerLevel(WorkerLevel workerLevel) {
		this.workerLevel = workerLevel;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Função: ");
		sb.append(workerLevel.getDescription());
		sb.append(" Salário: ");
		sb.append(String.format("%.2f", salary) + " R$");
		sb.append("\n");
		return sb.toString();
	}
}
