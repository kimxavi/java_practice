package design_pattern_practice.prototype;

abstract class Shape implements Cloneable {
	private String id;
	protected String type;
	
	abstract void draw();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		
	}

	@Override
	protected Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return clone;
	}
	
	

}
