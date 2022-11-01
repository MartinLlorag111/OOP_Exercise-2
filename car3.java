 class Toyota extends Cars{
	private String releasedate;

	public Toyota(String name, double weight, String releasedate){
		super (name, weight);
		this.releasedate = releasedate;
	}

	@Override
	public String makesound()
	{
		return "broomm! broomm!,";
	}

	public String getReleasedate(){
		return releasedate;
	}

	public void SetReleasedate(String releasedate){
		this.releasedate = releasedate;
	}
}
