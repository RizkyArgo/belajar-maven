public class Kalkulator{
  public static void main(String[] args){
}
	public int tambah(int a, int b){
		return a + b;
	}

	public int kurang(int a,int b){
		return a - b;
	}

	public int perkalian(int a,int b){
		return a * b;
	}

	public int pembagian(int a,int b){
		if (b == 0){
			throw new IllegalArgumentException("Tidak bisa membagi dengan nol");
		}else{
			return a / b;
		}
	}

}

