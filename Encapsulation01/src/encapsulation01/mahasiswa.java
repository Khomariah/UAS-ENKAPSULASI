/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation01;

/**
 *
 * @author acer
 */
public class mahasiswa {
    private String Jurusan;
    private String matkul;
    private String nama;
    private String npm;
    public void setJurusan(String newValue) {
        Jurusan = newValue;
    }
    public void setmatkul(String newValue) {
        matkul = newValue;
    }
    public void setnama(String newValue) {
        nama = newValue;  
    }
    public void setnpm(String newValue) {
        npm = newValue;
    }
    public String getJurusan() {
        return Jurusan;
    }
    public String getmatkul() {
        return matkul;
    }
    public String getnama() {
        return nama;
    }
    public String getnpm() {
        return npm;
    }
}
