package demo;

public class Karyawan {
	
	private String id;
	
	private String nama;
	
	private String alamat;
	
	private String bagian;
	
	public Karyawan() {

	}

	public Karyawan(String id, String nama, String alamat, String bagian) {
		super();
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.bagian = bagian;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getBagian() {
		return bagian;
	}

	public void setBagian(String bagian) {
		this.bagian = bagian;
	}
	

}
