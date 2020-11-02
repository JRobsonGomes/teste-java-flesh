package application;

import application.entities.Team;
import application.entities.Worker;
import application.entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		Worker jogador = new Worker(WorkerLevel.JOGADOR);
		Worker capitao = new Worker(WorkerLevel.CAPITAO);
		Worker treinador = new Worker(WorkerLevel.TREINADOR);
		Team time = new Team();
		
		time.addJogadores(jogador);
		time.addJogadores(capitao);
		time.addJogadores(treinador);
		
		System.out.print("Sal�rio do t�cnico: ");
		System.out.println(String.format("%.2f", time.getTreinador().getSalary()) + " R$");
		System.out.println("-----------------------------------------");
		
		System.out.print("Sal�rio do capit�o: ");
		System.out.println(String.format("%.2f", time.getCapitao().getSalary()) + " R$");
		System.out.println("-----------------------------------------");

		System.out.print("Sal�rio total em um ano: ");
		System.out.println( String.format("%.2f", time.getTotalSalary()) + " R$");

	}

}
