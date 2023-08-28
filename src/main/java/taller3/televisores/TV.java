package taller3.televisores;

public class TV {
	private static int numTV;
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void setCanal(int canal) {
		if(canal >= 1 && canal <= 120 && estado == true) {
			this.canal = canal;
		}
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(volumen <= 7 && estado == true) {
			this.volumen = volumen;
		}
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public int getCanal() {
		return canal;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public Control getControl() {
		return control;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if(1 <= this.canal && this.canal < 120 && this.estado == true) {
			canal++;
		}
	}
	
	public void canalDown() {
		if(1 < this.canal && this.canal <= 120 && this.estado == true) {
			canal--;
		}
	}

	
	public void volumenUp() {
		if(0 <= this.volumen && this.volumen < 7 && this.estado == true) {
			volumen++;
		}
	}

	
	public void volumenDown() {
		if(0 < this.volumen && this.volumen <= 7 && this.estado == true) {
			volumen--;
		}
	}

}
