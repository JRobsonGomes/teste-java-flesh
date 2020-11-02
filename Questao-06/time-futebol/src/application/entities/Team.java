package application.entities;

import java.util.ArrayList;
import java.util.List;

import application.entities.enums.WorkerLevel;

public class Team {

	private Worker jogador = new Worker(3500.00, WorkerLevel.JOGADOR);
	private Worker capitao = new Worker(WorkerLevel.CAPITAO);
	private Worker treinador = new Worker(WorkerLevel.TREINADOR);
	private List<Worker> jogadores = new ArrayList<>();

	public Team() {

	}

	public List<Worker> getJogadores() {
		return jogadores;
	}

	public void addJogadores(Worker jogador) {
		if (jogador.getWorkerLevel() == WorkerLevel.JOGADOR) {
			for (int i = 1; i <= 10; i++) {
				jogadores.add(this.jogador);
			}
		} else if (jogador.getWorkerLevel() == WorkerLevel.CAPITAO) {
			capitao.setSalary(this.jogador.getSalary() * 5);
			jogadores.add(capitao);
		} else {
			treinador.setSalary(this.jogador.getSalary() * 2);
			jogadores.add(treinador);
		}
	}

	public Worker getJogador() {
		return jogador;
	}

	public Worker getCapitao() {
		return capitao;
	}

	public Worker getTreinador() {
		return treinador;
	}

	public Double getTotalSalary() {
		double soma = getJogadores().stream().map(j -> j.getSalary()).reduce(0.0, (x, y) -> x + y);
		return soma * 12;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Worker worker : jogadores) {
			sb.append(worker);
		}
		return sb.toString();
	}
}
