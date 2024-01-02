/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jawab_1;

/**
 *
 * @author MataNet
 */
public class Main {

	public static void main(String[] args) {
		
		Mahasiswa mahasiswa = new Mahasiswa("Adip", 24);
		MahasiswaLama mahasiswaLama = new MahasiswaLama("Dhayat", 25, 2021);
		MahasiswaBaru mahasiswaBaru = new MahasiswaBaru("Aenun", 22, 22205047);
		
		System.out.println("===== Objek Mahasiswa =====");
		mahasiswa.displayInfo();
		System.out.print("\n");
		
		System.out.println("===== Objek Mahasiswa Lama =====");
		mahasiswaLama.displayInfo();
		System.out.print("\n");
		
		System.out.println("===== Objek Mahasiswa Baru =====");
		mahasiswaBaru.displayInfo();
		System.out.print("\n");
	}

}
