package life.maids.wrapper.api.type;

public enum EndPoints {

	LOCAL_MAID("http://localhost:8080/api/maid"),
	LOCAL_LEWD("http://localhost:8080/api/maid/lewd"),

	MAID("https://maids.life/api/maid"),
	LEWD("https://maids.life/api/maid/lewd"),

	;

	private String endpoint;
	public String getEndpoint() { return endpoint; }
	private EndPoints(String endpoint) { this.endpoint = endpoint; }

}
