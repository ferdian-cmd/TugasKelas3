/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author ferdian
 */
// Nama: Ferdian Wahyu Nabillah
// NIM: (09040623059)

//Penjelasan:
//Kita dapat membuat kelas abstrak Vehicle yang berfungsi sebagai blueprint untuk semua jenis kendaraan.
//Kelas ini akan memiliki metode dan atribut umum yang dapat digunakan oleh semua jenis kendaraan.
abstract class Vehicle {
    String registrationNumber;
    String brand;
    String model;
    int year;

    Vehicle(String registrationNumber, String brand, String model, int year) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    abstract void displayInfo();
    abstract int getNumberOfWheels();

    void scheduleMaintenance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

//Penjelasan:
//Interface Maintenance digunakan untuk mendefinisikan kontrak untuk layanan perawatan kendaraan.
// Semua jenis kendaraan yang perlu perawatan harus mengimplementasikan metode scheduleMaintenance().
// Ini memastikan bahwa setiap kendaraan dapat dijadwalkan untuk perawatan tanpa mempedulikan jenis kendaraan.

interface Maintenance {
    void scheduleMaintenance();
}
