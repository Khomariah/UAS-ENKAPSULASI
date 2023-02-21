/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation01;

/**
 *
 * @author acer
 */
public class jurusan {
    public static void main(String[]args) {
        mahasiswa wie = new mahasiswa();
        wie.setJurusan("Rekayasa Perangkat Lunak");
        wie.setmatkul("Program Beriorentasi Objek");
        wie.setnama("Khomariah");
        wie.setnpm("21090085");
        
        System.out.println("Jurusan:"+wie.getJurusan());
        System.out.println("matkul:"+ wie.getmatkul());
        System.out.println("nama:"+wie.getnama());
        System.out.println("npm:"+wie.getnpm());
    }
    
}
