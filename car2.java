 class Ford extends Cars{
	private String model;

	public Ford(String name, double weight, String model){
		super(name, weight);
		this.model = model;
	}

	@Override
	public String makesound()
	{
		return "Broom! Broom!,";
	}

	public String getModel(){
		return model;
	}

	public void setModel(String model){
		this.model = model;
	}
}
