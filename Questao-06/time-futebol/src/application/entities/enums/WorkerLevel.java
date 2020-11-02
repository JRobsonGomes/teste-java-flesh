package application.entities.enums;

public enum WorkerLevel {
	CAPITAO(1, "Capitão"),
	JOGADOR(2, "Jogador"),
	TREINADOR(3, "Treinador");

	private int code;
	private String description;
	
	private WorkerLevel(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	

	public static WorkerLevel valueOf(int code) {
		for (WorkerLevel value : WorkerLevel.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid TrackingStatus code");
	}
}
