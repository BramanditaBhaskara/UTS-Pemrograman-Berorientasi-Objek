public abstract class Kendaraan{
    private String nopol;
    private String merk;
    private boolean tersedia;

    public Kendaraan(String nopol, String merk){
        this.nopol = nopol;
        this.merk = merk;
        this.tersedia = true;
    }

    public String getNopol(){
        return nopol;
    }

    public String getMerk(){
        return merk;
    }

    public boolean isTersedia(){
        return tersedia;
    }

    public void setTersedia(boolean tersedia){
        this.tersedia = tersedia;
    }

    public abstract void tampilkanInfo();
}