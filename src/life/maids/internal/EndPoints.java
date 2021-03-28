package life.maids.internal;

public enum EndPoints {
	
	LOCAL_MAID("http://localhost:8080/api/maid"),
	LOCAL_LEWD("http://localhost:8080/api/maid/lewd"),
	LOCAL_SUGGESTIVE("http://localhost:8080/api/maid/suggestive"),
	
	MAID("https://maids.life/api/maid"),
	LEWD("https://maids.life/api/maid/lewd"),
	SUGGESTIVE("https://maids.life/api/maid/suggestive"),
	
	;
	
	private String endpoint;
	public String getEndpoint() { return endpoint; }
	private EndPoints(String endpoint) { this.endpoint = endpoint; }
	
}